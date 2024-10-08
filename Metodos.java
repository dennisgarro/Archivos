import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    public LinkedList<Animal> LLenarlista() {
        LinkedList<Animal> lista = new LinkedList<>();
        boolean bandera = true;
        int opt = 0;
        Scanner sc = new Scanner(System.in);
        while (bandera) {
            Animal a = new Animal();
            System.out.println("Ingrese categoria");
            a.setCategoria(sc.next());
            System.out.println("ingrese el nombre");
            a.setNombre(sc.next());
            System.out.println("Ingrese color");
            a.setColor(sc.next());
            System.out.println("Ingrese la edad del animal");
            a.setEdad(sc.nextInt());
            lista.add(a);
            System.out.println("desea seguir agregando 1: si, 2: No");
            opt = sc.nextInt();
            sc.next();
            if (opt == 2) {
                bandera = false;
            }

        }
        return lista;
    }

    public void MostrarLista(LinkedList<Animal> lista) {
        for (Animal animal : lista) {
            System.out.println("Categoria" + animal.getCategoria());
            System.out.println("Nombre" + animal.getNombre());
            System.out.println("Color" + animal.getColor());
            System.out.println("Edad" + animal.getEdad());
        }
    }

    public void ExportarArchivo(LinkedList<Animal> lista) {
        ExportarArchivo(lista);
    }

    public LinkedList<Animal> ImportarArchivoTxt() {
        ImportarArchivoTxt t = new ImportarArchivoTxt();
        LinkedList<Animal> lista = t.leerArchivo("ListaAnimales");
        return lista;
    }
}
