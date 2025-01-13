项目笔记：

//20250112 更新：

本项目正在转向Python开发，将包含机器学习内容和numpy。
代码恢复更新。

重构一下：
首先是仍然面向对象。

company和product两个基本类，分别描述商品和企业。

我们先从基本商品交换开始。（这里先不考虑货币）
设定两个企业：农场 工厂 代表一二产业
分别对应food machine 产品。
以月为单位，每月各生产一个单位该产品。


这时，这个系统中，最简单的，不依赖货币的商品交换形成了。两个company每月各消耗一单位对方的产品，没有扩大生产，也没有货币参与。



接下来，我们开始讨论扩大生产。将运行逻辑改为：这两个company每月每消耗一单位对方产品，生产1.1单位自己的产品。两个company每月都取走对方的全部出产产品，然后生产一单位自己的产品。这样，扩大生产就发展起来。G-W-G'.

但我们没有考虑产品无法实现的问题，而是假定所有产品都能被交易。（这个问题后面有解决办法）

另外，修补一下代码：我们需要知道企业现有多少产品。为company类添加一个product字典：storage。字典中的键为product，值为float（不可以是int）。


接下来，让我们运行起来.我们观察到，仓储一直为0，因为产品全部消耗了，但是，产量一直在增加。这是理想情况，接下来我们要进一步完善系统。

仍然是people（name，company），company（name，people_list列表，product），product（name，company，material_list字典）三个类。
现在，
为people类加入货币：deposit（存款） 和 wage（工资），以及需求：product字典need。
company类加入货币：float变量 deposit（存款）。
为product类加入货币：float变量 price（单价）。
而material字典中所有元素的price*值之和＋people列表中所有元素wage之和，就是product的成本cost。

people（name，company，deposit，wage，need），
company（name，people_list列表，deposit，product，storage），
product（name，company，material_list字典，price）

这时候，职工可以加入/离开系统，入职/离职，出卖劳动力获得工资，从公司购买产品获得劳动力（只有need清空时发挥全部劳动力）。
公司可以创建/关闭，招聘/裁员，制造商品，交易仓库中的product，发放工资。
产品可以被公司注册/下架，更改售价。（这时不考虑更新原料组成）
（各类改名方法自己实现即可）

开始试运行。设置几家公司及其商品，注册一批员工以及劳动力商品，员工批量入职公司，开始生产，每个时间周期print storage。


完善exception handle：
company：produce和交易时检测storage是否充足，（把劳动力和货币作为商品，都放进storage，不要deposit了）
people：交易时检测有无劳动力/货币/需求，入职/离职时检测有无公司归属

接下来：
设置profit calculate方法计算剩余价值率和利润率

设置Government类继承company，声明新的商品defense和education（这个不必须）。
设置Bank和Seller类继承company（不必须），只涉及商品交易（Seller）和货币的交易（bank），和地租有关的farm类先不管。

为company类添加两个float：经纬度，以便计算流通成本。



