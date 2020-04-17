<template>
  <div id="home">
    <div class="layout">
      <Layout>
        <Header :style="header">
          <Menu mode="horizontal" theme="dark" active-name="1">
            <div class="layout-logo">
              <Dropdown>
                <a href="javascript:void(0)">
                  <Avatar src="https://i.loli.net/2017/08/21/599a521472424.jpg" size="large"/>
                </a>
                <DropdownMenu slot="list">
                  <DropdownItem @click.native="toCenter">个人中心</DropdownItem>
                </DropdownMenu>
              </Dropdown>
            </div>
            <div class="layout-nav">
              <MenuItem name="1">
                <Icon type="ios-navigate"></Icon>
                <Dropdown>
                  <a href="javascript:void(0)">
                    技术分享
                    <Icon type="ios-arrow-down"></Icon>
                  </a>
                  <DropdownMenu slot="list">
                    <DropdownItem @click.native="toBlog">全部</DropdownItem>
                    <DropdownItem>Java</DropdownItem>
                    <DropdownItem>JavaScript</DropdownItem>
                    <DropdownItem>VUE</DropdownItem>
                    <DropdownItem>数据库</DropdownItem>
                    <DropdownItem>NoSQL</DropdownItem>
                    <DropdownItem>Linux</DropdownItem>
                    <DropdownItem>容器</DropdownItem>
                  </DropdownMenu>
                </Dropdown>
              </MenuItem>
              <MenuItem name="2">
                <Icon type="ios-keypad"></Icon>
                <Dropdown>
                  <a href="javascript:void(0)">
                    我的作品
                    <Icon type="ios-arrow-down"></Icon>
                  </a>
                  <DropdownMenu slot="list">
                    <DropdownItem>全部</DropdownItem>
                    <DropdownItem>Android</DropdownItem>
                    <DropdownItem>Web</DropdownItem>
                    <DropdownItem>练习Demo</DropdownItem>
                  </DropdownMenu>
                </Dropdown>
              </MenuItem>
              <MenuItem name="3">
                <Icon type="ios-keypad"></Icon>
                <Dropdown>
                  <a href="javascript:void(0)">
                    资源推荐
                    <Icon type="ios-arrow-down"></Icon>
                  </a>
                  <DropdownMenu slot="list">
                    <DropdownItem>镜像</DropdownItem>
                    <DropdownItem>开发工具</DropdownItem>
                    <DropdownItem>学习网站</DropdownItem>
                  </DropdownMenu>
                </Dropdown>
              </MenuItem>
              <MenuItem name="4">
                <Icon type="ios-analytics"></Icon>
                <Dropdown>
                  <a href="javascript:void(0)">
                    Contact Me
                    <Icon type="ios-arrow-down"></Icon>
                  </a>
                  <DropdownMenu slot="list">
                    <DropdownItem>ALL</DropdownItem>
                    <DropdownItem>WeChat</DropdownItem>
                    <DropdownItem>Email</DropdownItem>
                    <DropdownItem>QQ</DropdownItem>
                    <DropdownItem>GitHub</DropdownItem>
                    <DropdownItem>我要建站</DropdownItem>
                  </DropdownMenu>
                </Dropdown>
              </MenuItem>
              <MenuItem name="5">
                <Icon type="ios-paper"></Icon>
                <Dropdown>
                  <a href="javascript:void(0)">
                    关于
                    <Icon type="ios-arrow-down"></Icon>
                  </a>
                  <DropdownMenu slot="list">
                    <DropdownItem>网站技术</DropdownItem>
                    <DropdownItem>作者简介</DropdownItem>
                    <DropdownItem>源码分享</DropdownItem>
                  </DropdownMenu>
                </Dropdown>
              </MenuItem>
            </div>
          </Menu>
        </Header>
        <Content :style="content">
          Content
        </Content>
        <Footer class="layout-footer-center">2011-2016 &copy; TalkingData</Footer>
      </Layout>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Home",
    data() {
      return {
        header: {
          position: 'fixed',
          width: '100%'
        },
        content: {
          margin: '88px 20px 0',
          background: '#fff',
          minHeight: '690px',
          height: '80%',
          width: '100%'
        },
        footer: {
          margin: 0,
          marginBottom: 0
        }
      }

    },
    methods: {
      toBlog: function () {
        this.$router.push({path: '/blog'})
      },
      toCenter: function () {
        this.$router.push({path: '/center'})
      }
    }
  }
</script>

<style scoped>
  .layout {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: fixed;
    border-radius: 4px;
    overflow: hidden;
    height: 100%;
    width: 100%;
    margin: 0;
    margin-top: 0px;
  }

  .layout-logo {
    width: 5%;
    height: 30px;
    float: left;
    position: absolute;
    top: 5px;
    left: 20px;
  }

  .layout-nav {
    width: 70%;
    margin: 0 auto;
    margin-right: 100px;
    height: 10%;
  }

  .layout-footer-center {
    text-align: center;
    height: 10%;
    margin-bottom: 0;
  }

  #home {
    height: 100%;
    width: 100%;

  }
</style>
