# Spring-Boot-Project
为严格执行防疫安全登记，对不同的区域入口实行健康码登记，进入校区，若健康码为绿色(以字符Y表示)，学生信息方可提
交健康系统；若健康码为非绿色(以字符N表示)，学生信息不能提交健康系统。
我通过如下手段进行此系统的实现：
1.利用 SpringBoot 搭建的后台系统，利用 ORM SpringData Jpa 进行对象关系映射，实现录入信息。
2.对于健康码的设置是用 aop 面向切面的编程手段对于健康码是否为绿码进行拦截交由后台判断完成最后的录入，若为绿码，
则录入；若非绿码，则保存至 redis ，以三个为一组进行核酸检测，绿码则保存至 mysql 并删除在 redis 的数据，不为绿码则不
上交至 mysql ，继续留在 redis。
