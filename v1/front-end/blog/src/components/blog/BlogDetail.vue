<template>
  <div id="main">
    <div id="catalog">
      <Anchor :affix="false" show-ink>
        <AnchorLink title="Basic Usage"/>
        <AnchorLink title="Static Position"/>
        <AnchorLink title="API">
          <AnchorLink title="Anchor props"/>
          <AnchorLink title="Anchor events"/>
          <AnchorLink title="AnchorLink props"/>
        </AnchorLink>
      </Anchor>
    </div>
    <div id="detail">
      {{}}
    </div>
    <div id="rightcard">
      右边卡片
      <BackTop></BackTop>
    </div>
  </div>

</template>

<script>

  export default {
    name: "BlogDetail",
    data() {
      return {
        arr: ['qq', 'qweqw', 'eqw', 'tryt', 'fdsg', 'fdsfhfgjghkhgkgh', 'yy']
      }

    },
    mounted() {
      var url = 'http://localhost:9081/blog/test';
      var data = {
        name: '测试数据'
      };
      this.$axios({
        method: 'post',
        url: url,
        data: data
      }).then(resp => {
        console.log('请求成功:' + resp.data);
      }).catch(err => {
        console.log('出错了:' + JSON.stringify(err));
      });

    },
    methods: {},

  }
</script>

<style>
  #main {
    width: 100%;
    height: 100%;
  }

  #catalog {
    width: 15%;
    height: 100%;
    float: left;
    margin-left: 10px;
    margin-top: 10px;
    background-color: honeydew;
    position: fixed;
  }

  #detail {
    width: 60%;
    float: left;
    margin-left: 17%;
    margin-top: 10px;
  }

  #rightcard {
    float: right;
    background-color: #d7dde4;
    height: 100%;
    margin-left: 20px;
    margin-right: 10px;
    width: 10%;
  }

</style>
