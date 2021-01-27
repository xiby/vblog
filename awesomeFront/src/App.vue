<template>
  <div id="app">
    <keep-alive>
      <router-view/>
    </keep-alive>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style lang="less">
@tcolors:#97dffd;//按钮和标签颜色
@tcolorm:#64609E;//分类的选中的颜色
@tcolord:#48456D;//按钮hover 的颜色
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  width:100%;
  overflow-x: hidden;
  -webkit-overflow-x: hidden;
  color: #444;
}
.container{
    max-width: 80%;
    margin:0 auto;
    padding:0 10px;
    // overflow-x: hidden;
    // -webkit-overflow-x: hidden;
}
.tcolors{
    color:@tcolors;
}
.tcolors-bg{
    background: @tcolors;
    transition: all .3s ease-in-out;
}
</style>
