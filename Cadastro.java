import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.HashSet;

public class Ingresso {
    private String CPF;
    private String Nome;
    private double Valor;
    
    public void ingressos(){

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    public void Vip(){
        this.Valor = (Valor*0.3)+Valor;
    }
    public void Camarote(){
        this.Valor = (Valor*0.6)+Valor;
    }
}


public class Evento {
    private String NomeEvento;
    private String Data;
    private int Capacidade;
    private List<Ingresso> ingresso;
    
    public Evento(){
        this.ingresso = new ArrayList<Ingresso>();
    }

    public String getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(String NomeEvento) {
        this.NomeEvento = NomeEvento;
    }


    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public List<Ingresso> getIngresso() {
        return ingresso;
    }

    public void setIngresso(List<Ingresso> ingresso) {
        this.ingresso = ingresso;
    }
    public void venda(Ingresso Ingressos){
        if(ingresso.size() < getCapacidade()){
            ingresso.add(Ingressos);
        }else{
            String erro = "Não foi possivel vender este ingresso";
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    public void vendidos(){
        String msg = this.NomeEvento + "\n";
        msg += "Data: " + this.Data + "\n";
        msg += "Capacidade: " + this.Capacidade + "\n";
        for(int i=0; i < ingresso.size(); i++){
            String Ingresso = ingresso.get(i).getNome() + "\n";
            Ingresso += "CPF: " + ingresso.get(i).getCPF() + "\n";
            Ingresso += "Preço: " + ingresso.get(i).getValor() + "\n";
            msg += "Ingressos:\n" + Ingresso + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
         int restante = getCapacidade() - ingresso.size();
        String vendidos = "Foram Vendidos " + ingresso.size() + " Ingressos\n";
        vendidos += "Faltam " + restante;
        JOptionPane.showMessageDialog(null, vendidos);
    }
}

public class MAPA {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.setNome("Felipe Zanoti Sloniak");
        ingresso.setCPF("095.624.459-09");
        ingresso.setValor(50.00);
        
        Ingresso Vip = new Ingresso();
        Vip.setNome("Lanna Gabriela");
        Vip.setCPF("423.448.322-78");
        Vip.setValor(50.00);
        Vip.Vip();
        
        Ingresso Camarote = new Ingresso();
        Camarote.setNome("Maurício Pires Carqueijeiro");
        Camarote.setCPF("984.538.049-23");
        Camarote.setValor(50.00);
        Camarote.Camarote();
        
        Evento evento = new Evento();
        evento.setNomeEvento("Rock in Rio 2022");
        evento.setData("09/09/2022");
        evento.setCapacidade(10000);
        evento.venda(ingresso);
        evento.vendidos();
        evento.venda(Vip);
        evento.vendidos();
        evento.venda(Camarote);
        evento.vendidos();
    }

}
