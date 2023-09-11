package 工具类;
/*分工*/
public class Work {
String name;
int basicwage;
int levelwage;    
int level;
int wage = level * levelwage + basicwage; /*工资*/
Product product;/*产品 */
    Work(String name,int hiswage){wage=hiswage;}
}
