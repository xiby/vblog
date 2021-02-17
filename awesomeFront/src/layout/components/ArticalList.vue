<!-- 文章列表-->
<template>
  <el-row class="listBox">
    <div class="blankBlock"></div>
    <el-col
      :span="24"
      class="s-item tcommonBox"
      v-for="(item, index) in articalList"
      :key="'artical' + index"
    >
      <span class="s-round-date">
        <span
          class="month"
          v-html="showInitDate(item.createTime, 'month') + '月'"
        ></span>
        <span
          class="day"
          v-html="showInitDate(item.createTime, 'day') + '日'"
        ></span>
      </span>
      <header>
        <h1>
          <a :href="'#/detail?id=' + item.id" target="_blank">{{
            item.title
          }}</a>
        </h1>
        <h2>
          <i class="fa fa-fw fa-user"></i>发表于
          <i class="fa fa-fw fa-clock-o"></i
          ><span v-html="showInitDate(item.createTime, 'all')">{{
            showInitDate(item.createTime, "all")
          }}</span>
          <i class="fa fa-fw fa-eye"></i>{{ item.reviewed }} 次浏览 •
          <span class="rateBox">
            <i class="fa fa-fw fa-heart"></i
            >{{ item.liked ? item.liked : 0 }}点赞
          </span>
        </h2>
        <div class="ui label">
          <a :href="'#/artical?tag=' + item.tagId">{{ item.tagName }}</a>
        </div>
      </header>
      <div class="artical-content">
        <p style="text-indent: 2em">
          {{ item.summary }}
        </p>
        <p style="max-height: 300px; overflow: hiden; text-align: center">
          <img :src="item.image" alt="" class="maxW" />
        </p>
      </div>
      <div class="viewdetail">
        <a
          class="tcolors-bg"
          :href="'#/detail?id=' + item.id"
          target="_blank"
        >
          阅读全文>>
        </a>
      </div>
    </el-col>
    <el-col class="viewmore">
      <a v-show="hasMore" class="tcolors-bg" href="javascript:void(0);" @click="addMoreFun"
        >点击加载更多</a
      >
      <a v-show="!hasMore" class="tcolors-bg" href="javascript:void(0);"
        >暂无更多数据</a
      >
    </el-col>
  </el-row>
</template>

<script>
import { processDate } from "../../utils/TimeUtil";
import {getArticalList} from "../../utils/network/Request"
export default {
  data() {
    return {
      articalId: 0,
      articalList: [],
      hasMore: false,
      nextPage: 0
    };
  },
  methods: {
    showInitDate: function (oldDate, full) {
      return processDate(oldDate, full);
    },
    showArticalList: function () {
        var param = new Object();
        param.pageNum = this.nextPage + 1
        param.pageSize = 5
        getArticalList(param, (result) => {
            var ret = result.data
            if(ret.code != 0){
                alert(ret.message)
            }else{
                debugger
                this.hasMore = ret.body.hasNextPage
                if(this.nextPage == 0){
                    debugger
                    this.articalList = ret.body.list
                }else{
                    this.articalList = this.articalList.concat(ret.body.list)
                }
                this.nextPage = this.nextPage + 1
            }
        })
    },
    addMoreFun: function () {
      //查看更多
      this.showArticalList();
    },
    routeChange: function () {
      var that = this;
      this.nextPage = 0
      this.articalList = new Array()
      this.showArticalList();
    },
  },
  components: {},
  watch: {
    // 如果路由有变化，会再次执行该方法
    $route: "routeChange",
    "$store.state.keywords": "routeChange",
  },
  created() {
    //生命周期函数
    // console.log(this.$route);
    var that = this;
    this.articalList = new Array()
    that.routeChange();
  },
};
</script>

<style>
.shareTitle {
  margin-bottom: 40px;
  position: relative;
  border-radius: 5px;
  background: #fff;
  padding: 15px;
}
.shareclassTwo {
  width: 100%;
}
.shareclassTwo li {
  display: inline-block;
}
.shareclassTwo li a {
  display: inline-block;
  padding: 3px 7px;
  margin: 5px 10px;
  color: #fff;
  border-radius: 4px;
  background: #64609e;
  border: 1px solid #64609e;
  transition: transform 0.2s linear;
  -webkit-transition: transform 0.2s linear;
}
.shareclassTwo li a:hover {
  transform: translate(0, -3px);
  -webkit-transform: translate(0, -3px);
}
.shareclassTwo li a.active {
  background: #fff;
  color: #64609e;
}
.listBox {
  transition: all 0.5s ease-out;
  font-size: 15px;
}
</style>