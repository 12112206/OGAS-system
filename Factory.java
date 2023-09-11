package 工具类;
//工厂类的结构：工厂有名字，有自己的工种和工人（工人的职业要符合工厂工种）具体方法有：成立/注销工厂，员工入职/离职/领取薪水，生产产品/和其他工厂交易
import java.util.ArrayList;
public class Factory{
    String name;
    City location;/*所在城市 */
    ArrayList<Worker> numbers;/*职员名单*/
    ArrayList<Work> works;
    ArrayList<Product> garage;/*仓库 */
    int public_fund;/* 公共基金 */   

/*工厂成立 */

public Factory(){}
public Factory(String name){
this.name=name;
}


/*员工入职 */public void employ(Worker worker){numbers.add(worker);}

/*员工离职 */public void fire(Worker worker){numbers.remove(worker);}


//give wage 
public void givewage(Worker worker){worker.setdeposits(worker.work.wage);public_fund-=worker.work.wage;}


/*生产产品 */
void produce(Product product){ garage.add(product);garage.remove(null); }


/* 与其他工厂交易 */

void deal(Product product,Factory buy){
this.public_fund+=product.price;
this.garage.remove(product);
buy.garage.add(product);
buy.public_fund-=product.price;
}


}
