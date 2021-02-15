<template>
  <div>
    <div class="container">
      <h1 class="loginTitle">
        <a href="#/">vBlog</a>
      </h1>
      <div class="">
        <div v-if="login == 1" class="loginBox">
          <div class="lr-title">
            <h1>登录</h1>
            <p>新用户<a href="#/login?login=0" class="tcolors">注册</a></p>
          </div>
          <el-alert
            v-show="loginErr"
            :title="loginTitle"
            type="error"
            show-icon
            :closable="false"
          >
          </el-alert>

          <el-input type="email" placeholder="abc@def.com" v-model="email">
          </el-input>
          <el-alert
            v-show="emailErr"
            title="请输入正确的邮箱地址"
            type="error"
            show-icon
            :closable="false"
          >
          </el-alert>

          <el-input
            type="password"
            placeholder="密码"
            @keyup.enter.native="loginEnterFun"
            v-model="password"
          >
          </el-input>
          <el-alert
            v-show="passwordErr"
            title="请输入密码"
            type="error"
            show-icon
            :closable="false"
          >
          </el-alert>

          <h3><a href="">忘记密码？</a></h3>
          <div class="lr-btn tcolors-bg" @click="gotoHome">登录</div>
          <!-- end of login -->
          <div class="loginFooter">
            </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "login",
  data() {
    return {
      username: "",
      email: "",
      password: "",
      regUserName: "",
      regEmail: "",
      regPassword: "",
      regPasswordRep: "",
      login: 0,
      emailErr: false,
      passwordErr: false,
      loginErr: false,
      loginTitle: "用户名或密码错误",
      regUserNameErr: false,
      regEmailErr: false,
      regPasswordErr: false,
      regPasswordRepErr: false,
      registerTitle: "该邮箱已注册",
      err2005: false,
      step: 1,
      urlState: 0,
    };
  },
  methods: {
    routeChange: function () {
      var that = this;
      that.login =
        that.$route.query.login == undefined
          ? a
          : parseInt(that.$route.query.login);
      if (that.urlState == 0) {
        that.err2005 = false;
        that.step = 1;
      } else if (that.urlstate == "urlInvalid") {
        that.err2005 = true;
        that.step = 2;
      } else if (that.urlstate == "urlErr") {
        that.err2005 = true;
        that.step = 1;
      }
    },
    loginEnterFun: function (e) {
      var keyCode = window.event ? e.keyCode : e.which;
      if (keyCode == 13) {
        this.gotoHome();
      }
    },

    gotoHome: function () {
      var that = this;
      var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
      var preg = /^(\w){6,12}$/;
      if (reg.test(that.email)) {
        that.emailErr = false;
      } else {
        that.emailErr = true;
      }
      if (that.password && preg.test(that.password)) {
        that.passwordErr = false;
      } else {
        that.passwordErr = true;
      }
      if (!that.emailErr && !that.passwordErr) {
        //调用登录接口
      }
    },
  },
  components: {},
  watch: {},
  created() {
    var that = this;
    that.routeChange();
  },
};
</script>

<style>
.loginTitle {
  text-align: center;
  font-size: 26px;
  padding-top: 50px;
  margin-bottom: 20px;
}
.loginBox {
  background: #fff;
  padding: 40px;
  max-width: 320px;
  margin: 0 auto;
}
.loginBox {
  padding-bottom: 0;
}

.lr-title {
  position: relative;
  height: 32px;
  line-height: 32px;
  margin-bottom: 20px;
}
.lr-title h1 {
  font-size: 24px;
  color: #666;
  font-weight: bold;
}
.lr-title p {
  font-size: 12px;
  color: #999;
  position: absolute;
  right: 0;
  top: 0;
}
.lr-btn {
  color: #fff;
  text-align: center;
  letter-spacing: 5px;
  padding: 8px;
  border-radius: 5px;
  cursor: pointer;
  margin-bottom: 30px;
}

.loginBox .el-input {
  margin-bottom: 20px;
}
.loginBox .el-alert {
  top: -18px;
  background: #888;
}
.loginBox .el-input input {
  border-radius: 4px;
}
.loginBox h3 {
  text-align: right;
  margin-bottom: 20px;
}
.loginBox h3 a {
  font-size: 13px;
  color: #999;
}

.loginBox .loginFooter {
  max-width: 320px;
  padding: 30px 40px;
  background: #ddd;
  text-align: center;
  margin-left: -40px;
  margin-right: -40px;
  visibility: hidden;
}
</style>