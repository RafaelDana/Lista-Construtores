package RDC.apptelevisao.televisao;


import java.util.Scanner;

/**
 *
 * @author Rafael Dana
 */
public class Televisao {
    private Boolean ligada;
    private int volume;
    private int canal;
    private Boolean silencioso;
    
    public Televisao(Boolean ligada, int volume, int canal, Boolean silencioso){
        this.ligada = ligada;
        this.volume = volume;
        this.canal = canal;
        this.silencioso = silencioso;
    }
    
    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }
    public Boolean getLigada() {
        return this.ligada;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getCanal() {
        return this.canal;
    }
    public void setSilencioso(Boolean silencioso) {
        this.silencioso = silencioso;
    }
    public Boolean getSilencioso() {
        return this.silencioso;
    }
    
    
    
    
    
    
    public static void botaoligarDesligar(Televisao tv){
        if (tv.getLigada() == null){tv.setLigada(true);return;}
        if (tv.getLigada() == true){tv.setLigada(false);return;}
        if (tv.getLigada() == false){tv.setLigada(true);return;}
    }
    public static void mudarCanal(Televisao tv){
        Scanner teclado = new Scanner(System.in); 
        System.out.println("\nPara qual o canal deseja mudar?: "); 
        tv.setCanal(teclado.nextInt());
        verificar:
        if (tv.getCanal() >99 || tv.getCanal()<0){
            System.out.println("Os canais so vao de 0 a 99 escolha outro: "); 
            tv.setCanal(teclado.nextInt());
            if (tv.getCanal() <=99 && tv.getCanal()>=0){break verificar;}
        }
    }
    public static void canalAnterior(Televisao tv){
        int troca = tv.getCanal();
        troca -= 1;
        tv.setCanal(troca);
        verificar:{
            if (tv.getCanal() >=99){
                tv.setCanal(99);
                break verificar;
            }
            if (tv.getCanal() <= 0){
                tv.setCanal(0);
                break verificar;
            }
        }
    }
    public static void proximoCanal(Televisao tv){
        int troca = tv.getCanal();
        troca += 1;
        tv.setCanal(troca);
        verificar:{
            if (tv.getCanal() >= 99){
                tv.setCanal(99);
                break verificar;
            }
            if (tv.getCanal() <= 0){
                tv.setCanal(0);
                break verificar;
            }
        }
    }
    public static void botaoSilenciarDesilenciar(Televisao tv){
        if (tv.getSilencioso() == null){tv.setSilencioso(true);return;}
        if (tv.getSilencioso() == true){tv.setSilencioso(false);return;}
        if (tv.getSilencioso() == false){tv.setSilencioso(true);return;}
    }
}
