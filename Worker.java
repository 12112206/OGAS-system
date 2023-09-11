package 工具类;import java.util.*;

public class Worker {
    
public String name;
public boolean gender;/*true为男 false为女*/
public int age;

public City settle;
public Factory factory;
public Work work;

/*初始化 */
Worker(String name){this.name=name;}
Worker(String name,Work work){this.name=name;this.work=work;}
Worker(String name,boolean gender,int age,Work work){this.name=name;this.gender=gender;this.age=age;this.work=work;}



/*货币与生活资料*/
private int deposits;/*存款 */
int getdeposits(){return this.deposits;}
void setdeposits(int x){this.deposits+=x;}
private ArrayList<Product> hisproduct/*生活资料*/;
ArrayList<Product>gethisProducts(){return this.hisproduct;}

/*劳动 */
void labor(boolean check)  { if(check=true)deposits+=work.wage; }


/*购买物品 */
void purchase(Product product) { this.deposits -= product.price; hisproduct.add(product); }


/* 转账 */
void tran (Worker him,int money,boolean check) {if(check==true){him.deposits+=money;this.deposits-=money;}}









}
