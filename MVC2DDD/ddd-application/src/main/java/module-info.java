/**
 * @ClassName : module-info
 * @author : HK意境
 * @date : 2023/10/8 15:50
 * @description : 应用层：
 * 应用层连接用户接口层和领域层，主要协调领域层，面向用例和业务流程，协调多个聚合完成服务的组合和编排，在这一层不实现任何业务逻辑，只是很薄的一层。
 * 应用层的核心类：
 *
 * ApplicationService应用服务：最核心的类，负责业务流程的编排，但本身不负责任何业务逻辑。有时会简写为“AppService”。一个ApplicationService类是一个完整的业务流程，其中每个方法负责处理一个Use Case，比如订单的各种用例（下单、支付成功、发货、收货、查询）。
 * DTO Assembler：负责将内部领域模型转化为可对外的DTO。
 * 返回的DTO：作为ApplicationService的出参。
 * Command指令：指调用方明确想让系统操作的指令，其预期是对一个系统有影响，也就是写操作。通常来讲指令需要有一个明确的返回值（如同步的操作结果，或异步的指令已经被接受）。
 * Query查询：指调用方明确想查询的东西，包括查询参数、过滤、分页等条件，其预期是对一个系统的数据完全不影响的，也就是只读操作。
 * Event事件：指一件已经发生过的既有事实，需要系统根据这个事实作出改变或者响应的，通常事件处理都会有一定的写操作。事件处理器不会有返回值。这里需要注意一下的是，Application层的Event概念和Domain层的DomainEvent是类似的概念，但不一定是同一回事，这里的Event更多是外部一种通知机制而已。
 *
 * ApplicationService的接口入参只能是一个Command、Query或Event对象，CQE对象需要能代表当前方法的语意。这样的好处是提升了接口的稳定性、降低低级的重复，并且让接口入参更加语意化。
 *
 * 作者：狼爷
 * 链接：https://juejin.cn/post/7040826223500967972
 * 来源：稀土掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
module ddd.application {
}