import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args){
        Clientes cl1 = new Clientes("Mario", true, "123", 1000);
        Clientes cl2 = new Clientes("Maria", true, "123", 50);
        Clientes cl3 = new Clientes("João", true, "123", 10);
        Clientes cl4 = new Clientes("Fernando", true, "123", 100);
        Clientes cl5 = new Clientes("Abel", true, "123", 105);
        Clientes cl6 = new Clientes("Beltrano", true, "123", 110);
        Clientes cl7 = new Clientes("BEL", true, "123", 1110);
        Clientes cl8 = new Clientes("Manoel", true, "123", 1021);
        Clientes cl9 = new Clientes("Julio", true, "123", 107);
        Clientes cl10 = new Clientes("Ana", true, "123", 1074);
        Clientes cl11 = new Clientes("Sergio", true, "123", 25);
        Clientes cl12 = new Clientes("Gilo", true, "123", 13);

        List<Clientes> clientes = Arrays.asList(cl1, cl2, cl3, cl4, cl5, cl6,cl7, cl8, cl9, cl10, cl11, cl12);
        Stream<Clientes> maisCompras = clientes.stream().filter((clientes -> clientes.getCompras() == nome)).max(Comparator.comparing(getCompras()))

        System.out.println("Qual foi o cliente que fez mais compras?");
        System.out.println("Qual foi o cliente que fez menos compras?");
        System.out.println("Qual foi a media de compras dos clientes da lista?");

    }

}
