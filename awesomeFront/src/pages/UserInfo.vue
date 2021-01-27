<template>
    <div>
        <wb-nav></wb-nav>
        <div class="container"></div>
    </div>
</template>

<script>
import Navigation from "../layout/components/Navigation.vue"
export default {
    name: "UserInfo",
    data(){
        return{}
    },
    components:{
        'wb-nav': Navigation
    },
    created(){

    }
}
</script>