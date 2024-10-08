import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opt = 0;
        System.out.println("Escoja la opcion");
        System.out.println("1: llenar lista");
        System.out.println("2: Mostrar Lista");
        System.out.println("3: Importar archivo");
        System.out.println("4: exportar archivo");
        opt = sc.nextInt();
        LinkedList<Animal> lista = new LinkedList<>();
        ImportarArchivoTxt i = new ImportarArchivoTxt();
        switch (opt) {
            case 1:
                lista = m.LLenarlista();
                break;
            case 2:
                m.MostrarLista(lista);
                break;
            case 3:
                m.ImportarArchivoTxt();
                break;
            case 4:
                m.ExportarArchivo(lista);
                break;

            default:
                break;
        }

    }
}
