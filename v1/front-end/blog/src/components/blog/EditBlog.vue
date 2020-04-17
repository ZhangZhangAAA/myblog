<template>
  <div>
    <div class="mavonEditor">
      <no-ssr>
        <mavon-editor v-model="handbook" @save="saveMavon"/>
      </no-ssr>
    </div>
  </div>
</template>

<script>
  export default {
    name: "EditBlog",
    data() {
      return {
        markdownOption: {
          bold: true, // 粗体
        },
        handbook: ""
      }
    },
    methods: {
      saveMavon(value, render) {

        console.log(render);
      }
    },
    created: function () {
      var param = this.$route.params;
      console.log(param);
    }
  }
</script>

<style scoped>
  .mavonEditor {
    width: 100%;
    height: 100%;
  }
</style>
