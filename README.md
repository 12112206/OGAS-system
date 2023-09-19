# OGAS-system

//20230911更新
一个实验性的经济规划系统，在7月份开始开发，刚刚起步。正在更新ver0.3
以下是我的构建思路：

先构建静态的系统，让系统的框架清晰。

首先，要明白经济在交流中运行。货币。商品。不同岗位的劳动者。从一个城市流动到另一个城市，从一个工厂流动到另一个工厂。这就包含了最基本的五个类：

1 worker 即工人，这里泛指工业，农业，商业各个岗位的劳动者。每个人都有string名字，boolean性别，age年龄，int存款。
2 work 岗位。原料经过加工变成成品，也就是说我们需要三个参数：原料material work工作 product成品。
3 City 城市。人口 经纬度 海拔 三个参数足矣。
4 工厂 在自动化社会中，金融业不需要存在。所有产业围绕商品价值的实现来布局：只有负责生产的工农业和负责商品周转的商业单位。因此我们建立company类，下设工厂factory和经销商seller类。

五个基本类说完，现在我们已经实现了系统的基本功能：统计城市，人口和工厂，并实现交易，雇佣，转移支付。
我们的近期目标，是建立一个app，允许用户申报自己所在的工厂，岗位和产品，并利用算法加以规划。这将会用到html和sql，我还在学（对不起我好菜啊）

下面需要让这个系统运动起来：我们让它运动，是为了观察这个系统的
先不考虑work类。work类会复杂化程序。worker直接为factory工作。
建立三个产品：煤 钢 机器 它们互为原料。建立三个工厂：煤矿，钢厂，机器厂。只有这些还不够。在现实中，工厂会自己去交易，但是在模拟系统中不会。如果我们不设置一些规则，程序会放任空着的仓库和停滞的机器不动。
这个系统已经得到了很大程度的简化：这三个工厂没有任何原料来源就能产出，仓库也没有容量限制，产品运输不需要时间也没有损耗。



//20230912更新
我们来理一下这个系统的逻辑关系：
城市 工厂 工人 岗位 商品。
//20230919更新
由于我要做创新实践，这个项目停止到2024年1月15日，在此之后我会继续发布更新