<!--文章详情模块-->
<template>
  <div class="detailBox tcommonBox">
    <span class="s-round-date">
      <span
        class="month"
        v-html="showInitDate(detail.createTime, 'month') + '月'"
      ></span>
      <span
        class="date"
        v-html="showInitDate(detail.createTime, 'day') + '日'"
      ></span>
    </span>
    <header>
      <h1>
        <a :href="'#/artical?id=?' + detail.id" target="_blank">
          {{ detail.title }}
        </a>
      </h1>
      <h2>
        <i class="fa fa-fw fa-user"></i>发表于
        <i class="fa fa-fw fa-clock-o"></i
        ><span v-html="showInitDate(detail.createTime, 'all')">{{
          showInitDate(detail.createTime, "all")
        }}</span>
        <i class="fa fa-fw fa-eye"></i>{{ detail.reviewed }} 次浏览 •
        <span class="rateBox">
          <i class="fa fa-fw fa-heart"></i
          >{{ detail.liked ? detail.liked : 0 }}点赞
        </span>
      </h2>
      <div class="ui label">
        <a :href="'#/artical?tag=' + detail.tagId">{{ detail.tagName }}</a>
      </div>
    </header>
    <div class="artical-content" v-html="detail.content"></div>
  </div>
</template>

<script>
import { processDate } from "../../utils/TimeUtil";
import { getArticalInfo } from "../../utils/network/Request";
import { renderMarkdown } from "../../utils/MarkdownUtils"
export default {
  data() {
    return {
      id: "",
      detail: {},
      liked: false,
      hasLogin: false,
      userId: "",
    };
  },
  methods: {
    doRender: function(content){
      return renderMarkdown(content)
    },
    showInitDate: function (oldDate, full) {
      return processDate(oldDate, full);
    },
    getArticalDetail: function (id) {
      var that = this;
      getArticalInfo(that.id, (result) => {
        var ret = result.data;
        if (ret.code != 0) {
          alert(ret.message);
        } else {
          that.detail = result.data.body;
          that.detail.content = this.doRender(that.detail.content)
        }
      });
    },
    routeChange: function () {
      var that = this;
      that.id =
        that.$route.query.id == undefined ? 1 : parseInt(that.$route.query.id);
      this.getArticalDetail(that.id);
    },
  },
  watch: {
    $route: "routeChange",
  },
  components: {},
  created() {
    var that = this;
    this.routeChange();
  },
};
</script>

<style lang="less">
@import 'highlight.js/styles/dracula.css';
.detailBox .article-content {
  font-size: 15px;
  white-space: normal;
  word-wrap: break-word;
  word-break: break-all;
  overflow-x: hidden;
}
.detailBox .article-content p {
  margin: 10px 0;
  line-height: 24px;
  word-wrap: break-word;
  word-break: break-all;
  overflow-x: hidden;
}
.detailBox .article-content pre {
  word-wrap: break-word;
  word-break: break-all;
  overflow-x: hidden;
}
.detailBox .article-content img {
  max-width: 100% !important;
  height: auto !important;
  overflow-x: hidden;
}
.detailBox .article-content a {
  color: #df2050 !important;
}
.detailBox .article-content a:hover {
  text-decoration: underline;
  color: #f00 !important;
}
.detailBox .article-content i {
  font-style: italic;
}
.detailBox .article-content strong {
  font-weight: bold;
}
.detailBox .article-content ul {
  list-style-type: disc !important;
  list-style: disc !important;
  padding-left: 40px !important;
  li {
    list-style-type: disc !important;
    list-style: disc !important;
  }
}
.detailBox .article-content h1,
.detailBox .article-content h2,
.detailBox .article-content h3 {
  font-size: 200%;
  font-weight: bold;
}
.detailBox .article-content h4,
.detailBox .article-content h5,
.detailBox .article-content h6 {
  font-size: 150%;
  font-weight: bold;
}
.detailBox .viewdetail {
  margin: 10px 0;
  line-height: 24px;
  text-align: center;
}
</style>