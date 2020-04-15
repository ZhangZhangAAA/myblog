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
      <tr v-for="count in 150">
        {{count}}
      </tr>
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
    created: function () {
      console.log(window.location.href);
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
