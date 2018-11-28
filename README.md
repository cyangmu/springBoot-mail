# 使用SpringBoot发送邮件

## 使用场景

1. 注册验证
2. 网站营销
3. 找回账户密码
4. **提醒，监控告警**
5. 触发机制

## 邮件发送原理

+ 邮件传输协议
+ 1. SMTP协议
  2. POP3协议
+ 内容不断发展
+ 1. IMAP协议
  2. Mime协议



## Excel介绍

### 读写Excel三种常用技术

1. POI    效率高，操作复杂，支持公式，宏，图像图标
   - POI提供API给Java程序对Microsoft Office格式档案读和写的功能
   - HSSF即Horrible SpreadSheet Format缩写，通过HSSF,你可以用纯Java代码读取，写入，修改Excel文件
   - XSSF-读写Excel OOXML格式档案的功能
   - 通过iTEXT不仅可以生成PDF或rtf的文档，而且可以将XML,Html文件转化为PDF文件
2. JXL  效率低，操作简单，格式支持不如POI强大
   - Java Excel是一个开放源码项目，可以读取Excel文件的内容，创建新的Excel文件，更新已经存在的Excel文件
3. FASTEXCEL
   - FastExcel是一个采用纯Java开发的excel文件读写组建，支持Excel 97-2003文件格式
   - FastExcel只能读取单元格的字符信息，颜色和字体等就不支持，因此只需很小的内存
4. [更加详细的可以参考我的另一个项目的工具类](https://github.com/cyangmu/springboot-cli/tree/master/src/main/java/com/cyj/common/utils/poi)
## 使用方法

1. 申请邮箱

2. 邮箱申请之后需要在设置中开通协议，并获取授权码


## 遇到的问题

1. [官方原因解答](http://help.163.com/09/1224/17/5RAJ4LMH00753VB8.html)
2. 一般554 DT:SPM发送的邮件中不能有“test”,"测试"的字符，否则会被认为垃圾邮件发不出去
3. 绝大多数问题基本是邮件地址或者授权码的问题
4. 有其他的问题可以多多交流，继续补充

## 参考资料

1. 主要参考[慕课网的免费课程](https://www.imooc.com/learn/1036)，这真是一个好网站~。~
2. 上面的免费课程可以多多学习，运用于实践中

#### 欢迎光临我的博客：

+ CSDN：[央小木](https://blog.csdn.net/c_ym_ww)
