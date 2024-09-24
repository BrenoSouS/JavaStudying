public class App {
    public static void main(String[] args) throws Exception {
        double valor_necessario = 17.0;
        double salario = 22.0;

        if(valor_necessario < salario){
            salario = salario - valor_necessario;
            System.out.println("salario atual: " + salario);
        }else{
            System.out.println("Error");
        }
    }
}
