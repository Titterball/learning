----learn python----
#!/usr/bin/env python3        """告诉Linux/OS/X系统这是可执行的python程序"""
# -*- coding: utf-8 -*-          """让解释器按UTF-8编码读取"""
---------------------分 割 线-------------------------------------------------

字符串： ord()获取字符的整数表示,chr()把编码转换为对应字符,len()获取长度，encode（）获取对应字符编码，decode（）将编码转为对应字符
list和tuple：list——[ ]      #类似数组，可变，append()在结尾附加元素
								#pop()删除最后元素，pop(i)删除指定位置元素
             tuple——( )     #不可变，要初始化，其它类似list
dict和set:
dict——{ }   #key-value存储，key为常量，一个key对应一个value
                   #get(key)返回value，pop(key)删除
set——([ ])  #类似dict，但没有value只有key，需要一个list作为输入
                   #重复元素会过滤，add(key)添加元素，remove（key）删除元素
                   #可看作集合，并、交集：s1&s2、s1 | s2……
切片：list[0:3]、list[:3]、list[-2:]、list[0:10:2]、list[::2]等
	  （tuple、字符串也适用）
生成器(generator):  ①L=(iterable)   ②关键字yield  生成器可迭代，next()获得下一个结果
迭代器(iterator)：  iter() 生成可迭代序列

函数参数:  func(*args,**kwargs) *args为可变参数  **kwargs为关键字参数
高阶函数：
    map():将传入的函数依次作用到序列的每个元素并返回新的iterator。
	  #map(f,序列)
    reduce():把一个函数作用到序列上，把结果继续和序列的下一个元素做累积计算。            
	  #reduce(f,序列)
    filter():接收一个函数和一个序列，函数依次作用到每个元素并根据返回值是True还是False决定保留还是丢弃该元素。
	  #filter(f,序列)
    sorted():排序    
	  #sorted(序列,key,reverse)。
返回函数：
	不立即执行，局部变量有“闭包属性”。
匿名函数:
	lambda argument_list:expression (lambda 参数列表:表达式)