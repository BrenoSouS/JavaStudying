package STREAM;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;


public class Rapp {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> imprimirNumeroPar = numero->{
            if(numero % 2 == 0 ){
                System.out.println(numero); //como estamos sõ imprimindo nada esta sendo alterado
            }

        };

        numeros.stream().forEach(imprimirNumeroPar);//usamos stream()para transformar em um stream e usamos o medoto forEach para inteirar
    }
}
