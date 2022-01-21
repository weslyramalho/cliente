import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args){
        Cliente cl1 = new Cliente("Mario", true, "123", 1000);
        Cliente cl2 = new Cliente("Maria", true, "123", 50);
        Cliente cl3 = new Cliente("João", true, "123", 10);
        Cliente cl4 = new Cliente("Fernando", true, "123", 100);
        Cliente cl5 = new Cliente("Abel", true, "123", 105);
        Cliente cl6 = new Cliente("Beltrano", true, "123", 110);
        Cliente cl7 = new Cliente("BEL", true, "123", 1110);
        Cliente cl8 = new Cliente("Manoel", true, "123", 1021);
        Cliente cl9 = new Cliente("Julio", true, "123", 107);
        Cliente cl10 = new Cliente("Ana", true, "123", 1074);
        Cliente cl11 = new Cliente("Sergio", true, "123", 25);
        Cliente cl12 = new Cliente("Gilo", true, "123", 13);

        List<Cliente> clientes = Arrays.asList(cl1, cl2, cl3, cl4, cl5, cl6,cl7, cl8, cl9, cl10, cl11, cl12);
        Cliente maisCompras = clientes.stream().max(Comparator.comparingInt(Cliente::getCompras)).get();
        Cliente menosCompras = clientes.stream().min(Comparator.comparingInt(Cliente::getCompras)).get();

        double media = clientes.stream().mapToInt(Cliente::getCompras).average().getAsDouble();




        System.out.println("Qual foi o cliente que fez mais compras?");
        System.out.println(maisCompras.getNome());
        System.out.println("Qual foi o cliente que fez menos compras?");
        System.out.println(menosCompras.getNome());
        System.out.println("Qual foi a media de compras dos clientes da lista?");
        System.out.println(media);

    }

}
