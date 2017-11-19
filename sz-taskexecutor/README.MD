# TaskExecutor 子模块

使用`@EnableAsync` 开启异步任务处理，方法上增加`@Async` 注解进行标注此方法为异步方法。

> 可使用测试类`AsyncTaskTest` 进行测试.

## 方法``AsyncTaskTest.test1()``
使用继承`AsyncConfigurer`接口的默认线程池实现。

## 方法``AsyncTaskTest.test2()``
使用自定义`Bean` 完成线程池创建。