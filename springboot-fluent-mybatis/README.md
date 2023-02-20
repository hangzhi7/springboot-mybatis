## fluent-mybatis项目使用说明

### 项目结构说明

```
com.hh.fluent.mybatis       # 基础包名
  > config                  # 配置文件
  > dao                     # dao自动生成的
  > entity                  # entity自动生成的
```
- 生成说明：在测试包下有一个AppEntityGenerator类，是用于代码自动生成的

  - 1、先生成dao和entity包下的内容,运行AppEntityGenerator里面的`generate()`方法
  - 2、然后还有部分代码是在java编译时生成，目录在`target/generated-sources/annotations`目录下