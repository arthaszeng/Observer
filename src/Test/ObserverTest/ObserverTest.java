package ObserverTest;

public class ObserverTest {

//    因为方法是命令行输出 可以用中间量来mock，但是并没有测， 感觉用main更简单
//    结果如下：
//    Yuan said to Zeng: Go to the class.
//    Yuan said to Water: Go to take a lecture.
//    Fang said to Water: Go to take a lecture.
//    Fang said to Zeng: Go to the class.
//    Fang said to Water: Go to take a lecture.

//    其中Yuan 和 Fang 是实现了Notifier的Hr实现类，用于发出消息；
//    Zeng 是实现了Observer接口的Student实现类 ,Water 是实现了Observer接口的Coach实现类
//    该demo主要模拟了观察者通过实现observer类来接受通知并执行相应的操作，用接口而不用抽象类是模拟多个观察者是不关联的情况。
}
