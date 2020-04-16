<template>
  <div id="main">
    <div id="navi">
      <Row>
        <Col span="8">
          <Menu :theme="theme2" :open-names="['1']" accordion>
            <Submenu name="1">
              <template slot="title">
                <Icon type="ios-paper"/>
                内容管理
              </template>
              <MenuItem name="1-1">文章管理</MenuItem>
              <MenuItem name="1-2">评论管理</MenuItem>
              <MenuItem name="1-3">举报管理</MenuItem>
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
      Content
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
    }
  }
</script>

<style scoped>
  #main {
    position: fixed;
    width: 100%;
    height: 100%;
  }

  #navi {
    float: left;
    margin-left: 3px;
    position: fixed;
    width: 20%;
    height: 100%;
  }

  #content {
    position: fixed;
    height: 100%;
    width: 75%;
    float: left;
    margin-left: 18%;
  }
</style>
