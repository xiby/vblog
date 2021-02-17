import axios from 'axios'

/**
 * 登录
 * @param {string} username 
 * @param {string} password
 * @param {function} callback function
 */
const login = (email, password, callback) => {
    var param = new Object()
    param.email = email
    param.password = password
    var url = '/user/login'
    performPost(url, param, callback)
}

const  getArticalList = (param, callback) => {
    var url = '/artical/list'
    performPost(url, param, callback)
}

const getArticalInfo = (id, callback) => {
    var url = '/artical/' + id
    performGet(url,null,  callback)
}

const errorProcess = (error) => {
    if(error.response){
        console.log(error.response.data)
    }else if(error.request){
        console.log(error.request)
    }else{
        console.log('ERROR', error.message);
    }
}
/**
 * 进行post请求
 * @param {string} url 
 * @param {object} body 
 * @param {function} callback 
 */
function performPost(url, body, callback) {
    axios.post(url, body).then(callback).catch(errorProcess)
}

function performGet(url, params, callback){
    if(params == null){
        axios.get(url).then(callback).catch(errorProcess)
    }else{
        
    }
}
export{
    login,
    getArticalList,
    getArticalInfo
}