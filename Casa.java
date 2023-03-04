/**
 * Casa
 */
public class Casa {

    String endereco;
    double area;
    public Casa(){
        this.area = 0;
        this.endereco = "Nenhum";
        System.out.println("Sem parâmetros!");
    }

    public Casa(double a){
        this.area = a;
        this.endereco = "Nenhum";
        System.out.println(this.area+" mts quadrados de área.");
    }

    public Casa(String e){
        this.area = 0;
        this.endereco = e;
        System.out.println("O endereço é "+ this.endereco);
    }

    public Casa(double a, String e){
        this.area = a;
        this.endereco = e;
        System.out.println("A área é "+ this.area +"mts quadrados e o endereço "+ this.endereco);
    }
}