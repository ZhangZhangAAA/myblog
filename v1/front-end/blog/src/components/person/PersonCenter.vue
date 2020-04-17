<template>
  <div id="main">
    <div id="header">

    </div>
    <div id="navi">
      <Row>
        <Col span="8">
          <Menu :theme="theme2" :open-names="['1']" accordion>
            <Submenu name="1">
              <template slot="title">
                <Icon type="ios-paper"/>
                博客管理
              </template>
              <MenuItem name="1-1">博客列表</MenuItem>
              <MenuItem @click.native="toEdit('12')" name="1-2">编写博客</MenuItem>
            </Submenu>
            <Submenu name="2">
              <template slot="title">
                <Icon type="ios-people"/>
                用户管理
              </template>
              <MenuItem name="2-1">新增用户</MenuItem>
              <MenuItem name="2-2">活跃用户</MenuItem>
            </Submenu>
            <Submenu name="3">
              <template slot="title">
                <Icon type="ios-stats"/>
                统计分析
              </template>
              <MenuGroup title="使用">
                <MenuItem name="3-1">新增和启动</MenuItem>
                <MenuItem name="3-2">活跃分析</MenuItem>
                <MenuItem name="3-3">时段分析</MenuItem>
              </MenuGroup>
              <MenuGroup title="留存">
                <MenuItem name="3-4">用户留存</MenuItem>
                <MenuItem name="3-5">流失用户</MenuItem>
              </MenuGroup>
            </Submenu>
          </Menu>
        </Col>
      </Row>
      <br>
      <p>Change theme</p>
      <RadioGroup v-model="theme2">
        <Radio label="light"></Radio>
        <Radio label="dark"></Radio>
      </RadioGroup>
    </div>
    <div id="content">
      <tr v-for="index in 100">
        {{index}}
      </tr>
    </div>
  </div>
</template>

<script>
  export default {
    name: "PersonCenter",
    data() {
      return {
        theme2: 'light'
      }
    },
    methods: {
      toEdit: function (id) {
        this.$router.push({
          name: 'EditBlog',
          params: {
            id: id
          }
        });
      }
    }
  }
</script>

<style scoped>
  #main {
    position: absolute;
    width: 100%;
    height: 100%;
  }

  #header {
    height: 60px;
    position: fixed;
    width: 100%;
    background-color: cornflowerblue;

  }

  #navi {
    float: left;
    margin-top: 60px;
    margin-left: 3px;
    position: fixed;
    width: 20%;
    height: 100%;
  }

  #content {
    height: auto;
    width: 75%;
    float: left;
    margin-left: 18%;
    margin-top: 65px;
  }
</style>
