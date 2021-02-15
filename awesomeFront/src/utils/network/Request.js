import axios from 'axios'

var config = require('../../static/config.js')
/**
 * 登录
 * @param {string} username 
 * @param {string} password 
 */
function login(username, password){
    
}
/**
 * 进行post请求
 * @param {string} url 
 * @param {object} body 
 * @param {function} callback 
 */
function performPost(url, body, callback) {
    axios.post(url, body).then(callback).catch(function (error){
        if(error.response){
            console.log(error.response.data)
        }else if(error.request){
            console.log(error.request)
        }else{
            console.log('ERROR', error.message);
        }
    })
}

export{
    login
}