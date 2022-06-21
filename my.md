1. 先使用 2.有哪些配置 3.猜如何实现
源码: 1.看启动 先看主流程 再看细节      看注释

自定义标签:      selftag
自定义属性解析器: selfEditor
自定义aware   : selfAware

获取类加载器方法: ClassUtils
反射生成对象     BeanUtils   
AnnotationUtils

对象创建方式: 
1.自定义BeanPostProcessor InstantiationAwareBeanPostProcessor   
示例: com.mashibing.resolveBeforeInstantiation
2.factory-method  标签
示例: com.mashibing.factoryMethod
3.supplier
示例: com.mashibing.supplier
4.FactoryBean
5.反射    cglib + 反射
构造函数选择:  获取所有构造参数,通过参数个数,参数定义类型顺序 与 配置文件中配置参数做匹配
             无参数,调动无参构造


赋值测试: com.mashibing.populateBean