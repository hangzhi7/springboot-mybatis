# SpringBoot集成MyBatis集合

## 方式
### 方式一：SpringBoot集成通用mapper
#### 1、MyBatis 通用 Mapper4

- [MyBatis 通用 Mapper4 文档](https://gitee.com/free/Mapper/wikis/Home)
- [Gitee源码地址](https://gitee.com/free/Mapper/wikis/Home)

#### 2、通用Mapper4的升级版：mybatis-mapper
- [MyBatis Mapper 文档](https://mapper.mybatis.io/)
- [Gitee源码地址](https://gitee.com/mybatis-mapper/mapper)
- [GitHub源码地址](https://github.com/mybatis-mapper/mapper)

#### 示例：[SpringBoot集成通用mapper Demo]()

### 方式二：SpringBoot集成mybatis-plus

- [MyBatis-Plus 文档](https://baomidou.com)
- [GitHub源码地址](https://github.com/baomidou/mybatis-plus)

#### 示例：[SpringBoot集成mybatis-plus Demo]()

### 方式三：SpringBoot集成fluent-mybatis

- [Fluent MyBatis 文档](https://gitee.com/fluent-mybatis/fluent-mybatis-docs)
- [Gitee源码地址](https://gitee.com/fluent-mybatis/fluent-mybatis)
- [GitHub源码地址](https://github.com/atool/fluent-mybatis)

#### 示例：[SpringBoot集成fluent-mybatis Demo]()

## 对比

|      |mybatis-plus|fluent-mybatis|
|------|------|------|
|代码生成|生成 Entity, Mapper, Wrapper等文件, 并且Generator很好用|只生成Entity, 再通过编译生成 Mapper, Query, Update 和 SqlProvider|
|Generator易用性|低|高|
|和Mybatis的共生关系|需替换原有的SqlSessionFactoryBean|对Mybatis没有任何修改,原来怎么用还是怎么用|
|动态SQL构造方式|应用启动时, 根据Entity注解信息构造动态xml片段，注入到Mybatis解析器|应用编译时，根据Entity注解，编译生成对应方法的SqlProvider，利用mybatis的Mapper上@InsertProvider @SelectProvider @UpdateProvider注解关联|
|动态SQL结果是否容易DEBUG跟踪|不容易debug|容易，直接定位到SQLProvider方法上，设置断点即可|
|动态SQL构造|通过硬编码字段名称, 或者利用Entity的get方法的lambda表达式|通过编译手段生成对应的方法名，直接调用方法即可|
|字段变更后的错误发现|通过get方法的lambda表达的可以编译发现，通过字段编码的无法编译发现|编译时便可发现|
|不同字段动态SQL构造方法|通过接口参数方式|通过接口名称方式, FluentAPI的编码效率更高|
|语法渲染特点|无|通过关键变量select, update, set, and, or可以利用IDE语法渲染, 可读性更高|

- 其他框架，比如TkMybatis在封装和易用性上比mybatis plus要弱，就不再比较了。
- [Fluent Mybatis, 原生Mybatis, Mybatis Plus三者功能对比](https://gitee.com/fluent-mybatis/fluent-mybatis-docs/blob/master/00-docs/06-other/compare-mybatis.md#%E4%B8%89%E8%80%85%E5%AF%B9%E6%AF%94%E6%80%BB%E7%BB%93)

	
		
		
		
		
		
		