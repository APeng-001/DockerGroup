# 基于 Ubuntu
FROM ubuntu:latest

# 更新系统
RUN apt-get update && apt-get upgrade -y

# 安装 wget
RUN apt-get install -y wget

# 下载并安装 JDK 21
RUN wget https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.tar.gz && \
    tar -zxvf jdk-21_linux-x64_bin.tar.gz -C /opt && \
    rm jdk-21_linux-x64_bin.tar.gz

# 设置环境变量
ENV JAVA_HOME /opt/jdk-21.0.7
ENV PATH $JAVA_HOME/bin:$PATH

# 暴露端口
EXPOSE 8080


# docker build -t myjdk21.0.7:1.0 .