import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import news from '@/views/modules/news/list'
    import youxigonglve from '@/views/modules/youxigonglve/list'
    import youxifenlei from '@/views/modules/youxifenlei/list'
    import kefuguanli from '@/views/modules/kefuguanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import remenyouxipaixingbang from '@/views/modules/remenyouxipaixingbang/list'
    import youxibuding from '@/views/modules/youxibuding/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import youxiku from '@/views/modules/youxiku/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
          ,{
	path: '/youxigonglve',
        name: '游戏攻略',
        component: youxigonglve
      }
          ,{
	path: '/youxifenlei',
        name: '游戏分类',
        component: youxifenlei
      }
          ,{
	path: '/kefuguanli',
        name: '客服管理',
        component: kefuguanli
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
          ,{
	path: '/remenyouxipaixingbang',
        name: '热门游戏排行榜',
        component: remenyouxipaixingbang
      }
          ,{
	path: '/youxibuding',
        name: '游戏补丁',
        component: youxibuding
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/youxiku',
        name: '游戏库',
        component: youxiku
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
