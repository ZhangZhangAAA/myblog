<template>
  <div id="main">
    <div id="content">
      <div class="header">
        <Header>
          <Menu mode="horizontal" theme="dark" active-name="1">
            <div class="layout-logo"></div>
            <div class="layout-nav">
              <Input v-model="value1" size="default" placeholder="Java" style="width: 200px"/>
              <Button type="text" ghost>搜索</Button>
            </div>
          </Menu>
        </Header>
      </div>
      <div id="leftcard">
        <Card>
          <p slot="title">
            <Icon type="ios-film-outline"></Icon>
            技术标签
          </p>
          <Tag checked color="default">default</Tag>
          <Tag checked color="primary">primary</Tag>
          <Tag checked color="success">success</Tag>
          <Tag checked color="error">error</Tag>
          <Tag checked color="warning">warning</Tag>
          <Tag checked color="magenta">magenta</Tag>
          <Tag checked color="red">red</Tag>
          <Tag checked color="volcano">volcano</Tag>
          <Tag checked color="orange">orange</Tag>
          <Tag checked color="gold">gold</Tag>
        </Card>
      </div>
      <div id="list">
        <List item-layout="vertical">
          <ListItem v-for="item in data" :key="item.title">
            <ListItemMeta :avatar="item.avatar" :title="item.title" :description="item.description" :style="{cursor:'pointer'}" @click.native="toDetail(item.blogid)"/>
            {{ item.content }}
          </ListItem>
        </List>
      </div>
      <div id="right-card">
        <Card :bordered="false">
          <p slot="title">Borderless card</p>
          <p>Content of card</p>
          <p>Content of card</p>
          <p>Content of card</p>
        </Card>
      </div>
    </div>
  </div>

</template>

<script>
  export default {
    name: "BlogMain",
    data() {
      return {
        value1: '',
        movieList: [
          {
            name: 'The Shawshank Redemption',
            url: 'https://movie.douban.com/subject/1292052/',
            rate: 9.6
          },
          {
            name: 'Leon:The Professional',
            url: 'https://movie.douban.com/subject/1295644/',
            rate: 9.4
          },
          {
            name: 'Farewell to My Concubine',
            url: 'https://movie.douban.com/subject/1291546/',
            rate: 9.5
          },
          {
            name: 'Forrest Gump',
            url: 'https://movie.douban.com/subject/1292720/',
            rate: 9.4
          },
          {
            name: 'Life Is Beautiful',
            url: 'https://movie.douban.com/subject/1292063/',
            rate: 9.5
          },
          {
            name: 'Spirited Away',
            url: 'https://movie.douban.com/subject/1291561/',
            rate: 9.2
          },
          {
            name: 'Schindler' + 's List',
            url: 'https://movie.douban.com/subject/1295124/',
            rate: 9.4
          },
          {
            name: 'The Legend of 1900',
            url: 'https://movie.douban.com/subject/1292001/',
            rate: 9.2
          },
          {
            name: 'WALL·E',
            url: 'https://movie.douban.com/subject/2131459/',
            rate: 9.3
          },
          {
            name: 'Inception',
            url: 'https://movie.douban.com/subject/3541415/',
            rate: 9.2
          }
        ],
        randomMovieList: [],
        data: [
          {
            blogid: '1',
            title: 'This is title 1',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          },
          {
            blogid: '2',
            title: 'This is title 2',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          },
          {
            blogid: '3',
            title: 'This is title 3',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          },
          {
            blogid: '4',
            title: 'This is title 3',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          },
          {
            blogid: '5',
            title: 'This is title 3',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          },
          {
            blogid: '6',
            title: 'This is title 3',
            description: 'This is description, this is description, this is description.',
            avatar: 'https://dev-file.iviewui.com/userinfoPDvn9gKWYihR24SpgC319vXY8qniCqj4/avatar',
            content: 'This is the content, this is the content, this is the content, this is the content.'
          }
        ]

      }

    },
    methods: {
      changeLimit() {
        function getArrayItems(arr, num) {
          const temp_array = [];
          for (let index in arr) {
            temp_array.push(arr[index]);
          }
          const return_array = [];
          for (let i = 0; i < num; i++) {
            if (temp_array.length > 0) {
              const arrIndex = Math.floor(Math.random() * temp_array.length);
              return_array[i] = temp_array[arrIndex];
              temp_array.splice(arrIndex, 1);
            } else {
              break;
            }
          }
          return return_array;
        }

        this.randomMovieList = getArrayItems(this.movieList, 5);
      },
      toDetail(id) {
        this.$router.push({path: '/blog/detail/' + id});

      }
    }
  }
</script>

<style scoped>
  .header {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: fixed;
    border-radius: 4px;
    overflow: hidden;
    height: 65px;
    width: 100%;
    margin: 0 auto;
    margin-top: 0px;
  }

  .layout-logo {
    width: 5%;
    height: 100%;
    float: left;
    position: absolute;
    top: 5px;
    left: 20px;
  }

  .layout-nav {
    width: 60%;
    height: 100%;
    position: fixed;
    margin: 0 auto;
  }

  #content {
    width: 100%;
    height: 100%;
    position: fixed;

  }

  #leftcard {
    float: left;
    width: 15%;
    height: 100%;
    margin-top: 68px;
    margin-left: 5px;
    background-color: cadetblue;
  }

  #list {
    margin-top: 68px;
    width: 66%;
    height: 80%;
    float: left;
    margin-left: 10px;
    margin-right: 10px;
  }

  #right-card {
    float: right;
    width: 15%;
    height: 100%;
    margin-left: 25px;
    background-color: cornflowerblue;
    margin-top: 68px;
    margin-right: 5px;
  }

</style>
