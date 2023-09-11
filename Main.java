package 工具类;


public class Main {



    public static void main(String[] args) {}


private int centralbank;//central bank
int getbank(){return centralbank;}
void setbank(int test){centralbank+=test;}

//ver0.1：仅实现最基本类的功能，工人/工厂/工种/产品/城市。目前以工厂为基本单位运行，以月为基本时间单位。20230911
//实验：煤矿，钢铁厂和机器厂；煤，钢铁和机器


Product steel  =new Product("steel",5000);
Product coal   =new Product("coal",5);
Product machine=new Product("machine",150000);

Factory mine=new Factory("mine");
Factory steelFactory=new Factory("steelfactory");
Factory machineFactory=new Factory("machinefactory");








}















/*
基础语法注释：



下面简要介绍下类、对象、方法和实例变量的概念。
对象：对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。
类：类是一个模板，它描述一类对象的行为和状态。
方法：方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的。
实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。


基本语法
编写 Java 程序时，应注意以下几点：

大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。

Java 标识符
Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。
关于 Java 标识符，有以下几点需要注意：
所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
关键字不能用作标识符
标识符是大小写敏感的
合法标识符举例：age、$salary、_value、__1_value
非法标识符举例：123abc、-salary

Java修饰符
像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：
访问控制修饰符 : default, public , protected, private
非访问控制修饰符 : final, abstract, static, synchronized
在后面的章节中我们会深入讨论 Java 修饰符。

Java 变量
Java 中主要有如下几种类型的变量
局部变量
类变量（静态变量）
成员变量（非静态变量）

Java 数组
数组是储存在堆上的对象，可以保存多个同类型变量。在后面的章节中，我们将会学到如何声明、构造以及初始化一个数组。











*/