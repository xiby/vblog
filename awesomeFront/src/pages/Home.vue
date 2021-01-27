<template>
    <div>
        <wb-nav></wb-nav>
        <div class="container">
            <!-- <el-row  :gutter="30">
                <el-col :sm="24" :md="16" style="transition:all .5s ease-out;margin-bottom:30px;">
                    <sharelist></sharelist>
                </el-col>
                <el-col :sm="24"  :md="8" >
                    <rightlist></rightlist>
                </el-col>
            </el-row> -->
        </div>
    </div>

</template>
<script>
import Navigation from '../layout/components/Navigation.vue'
export default {
    name: 'Home',
    data(){
        return{

        }
    },
    methods: {

    },
    components:{
        'wb-nav': Navigation
    },
    created(){

    }
}
</script>

<style scoped>

</style>