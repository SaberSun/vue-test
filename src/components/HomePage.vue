<template>
  <div>
    <div class="red">姓名: <span> <input v-model="name" @change="changeName"/></span> </div>
    <div>性别: <span><input type="radio" name="radio" value="1" @click="changeValue">男
                    <input type="radio" name="radio" value="2" @click="changeValue">女
                    </span></div>
    <div>年龄: <span><input v-model="age"></span></div>
  </div>
</template>
<script>
export default {
  name: 'HomePage',
  data() {
    return {
      name: '孙大圣',
      sex: 0,
      age: 18

    }
  },
  computed: {

  },
  mounted() {
    console.log(this.name)
  },
  methods: {
    changeValue: function(event) {
      console.log(event.target.value)
    },
    changeName:function (name) {
      console.log(this.name)
    }
  }
}
</script>
<<style>
.red{
  color: red
}
</style>
