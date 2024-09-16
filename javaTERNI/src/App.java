public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Ola , fui executado no terminal!");
        String nome = args[0];
        String Sobrenome = args[1];

        int idade = Integer.valueOf(args[2]);
        int ano = Integer.valueOf(args[3]);

        System.out.println("Ola me chamo "+ nome + Sobrenome +" nasci em "+ ano + " portanto tenho "+ idade + " anos ");


    }
}
