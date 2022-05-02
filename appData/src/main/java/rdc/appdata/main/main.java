package rdc.appdata.main;
import rdc.appdata.data.Data;
/**
 *
 * @author Rafael Dana
 */
public class main {

    public static void main(String[] args) {
        Data data1 = new Data(1, 1, 2000);
        Data data2 = new Data(15, 7, 2002);
        System.out.println(data1.diaMesAno());
        System.out.println(data2.diaMesAno());
        System.out.println("------------------------------------------------------------------------");
        Data data3 = new Data("Janeiro", 4, 1998);
        Data data4 = new Data("Fevereiro", 15, 2001);
        System.out.println(data3.mesDiaAno());
        System.out.println(data4.mesDiaAno());
        System.out.println("------------------------------------------------------------------------");
        Data data5 = new Data(365, 1998);
        Data data6 = new Data(365, 2002);
        System.out.println(data5.diaAno());
        System.out.println(data6.diaAno());
        
    }
}
