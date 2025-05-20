import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios'

const app = createApp(App)
app.provide('axios', axios) // 全局挂载axios
app.mount('#app')
