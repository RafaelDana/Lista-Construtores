package rdc.appdata.data;

/**
 *
 * @author Rafael Dana
 */
public class Data {
    private int dia;
    private String mesEscrito;
    private int mes;
    private int ano;
    private int diasAno;
    
    public  Data(int dia, int mes, int ano){
        if (dia>0 && dia<31){this.dia = dia;}
        if (mes>0 && mes<=12){this.mes = mes;}
	this.ano = ano;
        String data = String.format("%02d/%02d/%d", mes, dia, ano);
        
    }
    public  Data(String mes, int dia, int ano){
        this.mesEscrito = mes;
        this.dia = dia;
        this.ano = ano;
        String data = String.format("%s %02d, %d", mesEscrito, dia, ano);   
    }
    public  Data(int dias, int ano){
        this.diasAno = dias;
	this.ano = ano;
        String data = String.format("%03d %d", diasAno, ano);
    }  
    
    
    public String diaMesAno(){
	return String.format("%02d/%02d/%d", this.mes, this.dia, this.ano);
	}		
    public String diaAno(){
	return String.format("%03d %d", diasAno, ano);
    }
    public String mesDiaAno(){
	return String.format("%s %02d, %d", mesEscrito, dia, ano);
    }
}
