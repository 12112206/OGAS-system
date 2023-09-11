package 工具类;import java.util.ArrayList;
public class City {


/* 基本数据 用于定位和路程计算 */   
String name;  
double jingdu;/* */
double weidu;/* */
double height;/*基准海拔 */

City(String thisname){name=thisname;}


private ArrayList<Worker> population;
void setpopulationlist(ArrayList<Worker> population){this.population=population;}
ArrayList<Worker> getpopulationlist(City city){return this.population;}

void born(Worker worker){getpopulationlist(this).add(worker);}
void dead(Worker worker){getpopulationlist(this).remove(worker);}



}
