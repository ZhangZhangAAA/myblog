import Vue from 'vue'
import Router from 'vue-router'
import Home from '../components/person/Home'
import BlogMain from '../components/blog/BlogMain'
import BlogDetail from '../components/blog/BlogDetail'
import PersonCenter from '../components/person/PersonCenter'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/blog',
      name: 'BlogMain',
      component: BlogMain
    },
    {
      path: '/blog/detail/:id',
      name: 'BlogDetail',
      component: BlogDetail
    },
    {
      path: '/center',
      name: 'PersonCenter',
      component: PersonCenter
    }
  ]
})
