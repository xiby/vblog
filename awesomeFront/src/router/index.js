import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
// import navigation from '@/components/public/navigation'
// import Home from '../pages/Home.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: resolve => require(['../pages/Home.vue'], resolve),
			meta: {
				auth: true
			},
    },
    {
      path: '/login',
      component: resolve => require(['../pages/Login.vue'], resolve),
			meta: {
				auth: false
			},
			name: 'login'
    }
  ]
})
