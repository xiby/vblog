<template>
    <div>
        <wb-nav></wb-nav>
        <div class="container" id="detail">
            <el-row :gutter="30">
                <el-col :sm="24" :md="16" style="transition:all .5s ease-out;margin-bottom:30px;">
                        <div class="blankBlock"></div>
                    <wb-detail></wb-detail>
                </el-col>
            </el-row>
        </div>
    </div>
</template>

<script>
import Navigation from '../layout/components/Navigation.vue'
import ArticalDetail from '../layout/components/ArticalDetail.vue'
export default {
    name: "Detail",
    data(){
        return{

        };
    },
    components:{
        'wb-nav': Navigation,
        'wb-detail': ArticalDetail
    },
    mounted(){
        var anchor = document.querySelector("#detail");
            // console.log(anchor,anchor.offsetTop);
            var top = anchor.offsetTop-60;
            document.body.scrollTop = top;
             // Firefox
             document.documentElement.scrollTop = top;
             // Safari
             window.pageYOffset = top;
    }
}
</script>