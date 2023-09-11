package 工具类;  

public class Product {  
    public String name;  
    public double price;  // 单价  
    public Factory factory;
  
    // 产品原料  
    public Product material; 
    



       Product(){}
    Product(String name,int price){this.name=name;this.price=price;}
    Product(String name,int price,Product material){this.material=material;this.name=name;this.price=price;}


}






/*product类的结构：
 * 
 * 
 * 1.基本民生产品： 衣服 食物 住房 公共交通 
 * 
 * 2.基础工农业产品： 煤 石油（汽柴煤油重油）电力 钢 水泥 酸 碱 化肥 
 *                 粮食 棉花 肉类 木材
 * 
 * 3.主要工业产品： 家用电器（冰箱 洗衣机 空调） 微型计算机（手机电脑） 交通工具（汽车 火车 船 飞机）  发电机  集成电路  工业机器人
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */