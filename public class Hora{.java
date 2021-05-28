public class Hora{
    private int horas;
    private int minuto;
    private int segundo;

    public Hora(int h, int m, int s){
        horas= h;
        minuto= m;
        segundo= s;
    }
    
    public int getHora(){
        return horas;
    }
    public void setHora(int hora){
        this.horas=hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setMinuto(int mins){
        minuto=mins;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int seg){
        segundo=seg;
    }
    
}