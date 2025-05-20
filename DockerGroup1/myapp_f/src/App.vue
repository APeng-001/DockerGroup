<template>
  <div id="container">
    <form @submit.prevent="handleSubmit" method="get">
      <div class="form-group">
        <label for="name">用户查询</label>
        <input type="text" id="name" v-model.number="userId" class="form-control" placeholder="请输入用户id" />
      </div>
      <button type="submit" class="btn btn-primary">查询</button>
    </form>
    <br>
    <table class="table table-striped" style="text-align: center;">
      <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
      </tr>
      <tr v-for="(item, index) in user" :key="index">
        <td>{{ item.id }}</td>
        <td>{{ item.name }}</td>
        <td>{{ item.email }}</td>
      </tr>
    </table>
  </div>
</template>

<script setup>
import { ref, inject, reactive } from 'vue'
let axios = inject('axios')
let userId = ref('')
let user = reactive({}) // 创建响应式对象，用于查询结果
let handleSubmit = async () => {
  try {
    if (!userId.value) { // 判断用户id是否为空
      alert('请输入用户id!!!!!')
      return
    }
    const res = await axios.get('/api/user/' + userId.value) // 使用代理路径
    if (res.data.data === null) { // 判断用户是否存在
      alert('用户不存在!!!!!')
      return
    }
    user = res.data
    userId.value = '' // 清空输入框
  } catch (error) {
    console.error('Error fetching user data:', error)
  }
}
</script>

<style scoped>
div {
  background-color: aqua;
}
</style>