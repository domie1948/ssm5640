var projectName = '游戏售卖商城网站'


/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '游戏库',
	url: './pages/youxiku/list.html'
}, 
{
	name: '游戏攻略',
	url: './pages/youxigonglve/list.html'
}, 
{
	name: '游戏补丁',
	url: './pages/youxibuding/list.html'
}, 
{
	name: '热门游戏排行榜',
	url: './pages/remenyouxipaixingbang/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmu71x7/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"游戏分类","menuJump":"列表","tableName":"youxifenlei"}],"menu":"游戏分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","攻略","补丁","购买"],"menu":"游戏库","menuJump":"列表","tableName":"youxiku"}],"menu":"游戏库管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"游戏攻略","menuJump":"列表","tableName":"youxigonglve"}],"menu":"游戏攻略管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"游戏补丁","menuJump":"列表","tableName":"youxibuding"}],"menu":"游戏补丁管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"热门游戏排行榜","menuJump":"列表","tableName":"remenyouxipaixingbang"}],"menu":"热门游戏排行榜管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"kefuguanli"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"游戏库列表","menuJump":"列表","tableName":"youxiku"}],"menu":"游戏库模块"},{"child":[{"buttons":["查看"],"menu":"游戏攻略列表","menuJump":"列表","tableName":"youxigonglve"}],"menu":"游戏攻略模块"},{"child":[{"buttons":["查看"],"menu":"游戏补丁列表","menuJump":"列表","tableName":"youxibuding"}],"menu":"游戏补丁模块"},{"child":[{"buttons":["查看"],"menu":"热门游戏排行榜列表","menuJump":"列表","tableName":"remenyouxipaixingbang"}],"menu":"热门游戏排行榜模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"游戏库列表","menuJump":"列表","tableName":"youxiku"}],"menu":"游戏库模块"},{"child":[{"buttons":["查看"],"menu":"游戏攻略列表","menuJump":"列表","tableName":"youxigonglve"}],"menu":"游戏攻略模块"},{"child":[{"buttons":["查看"],"menu":"游戏补丁列表","menuJump":"列表","tableName":"youxibuding"}],"menu":"游戏补丁模块"},{"child":[{"buttons":["查看"],"menu":"热门游戏排行榜列表","menuJump":"列表","tableName":"remenyouxipaixingbang"}],"menu":"热门游戏排行榜模块"}],"roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
