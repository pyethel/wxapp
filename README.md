# wxapp
微信小程序仿拼多多后端
springboot springdatajpa h2

前端连接 https://github.com/pyethel/wxminiprogram

h2控制台 localhost:8080/console

    url: jdbc:h2:mem:wxapp
    username: sa
    password:
    
运行注意清除前端缓存
内存数据库中没有token可能导致订单发送失败