import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    public void exportarArchivo(LinkedList<Animal> animales) {
        if (animales.isEmpty()) {
            Metodos ll = new Metodos();
            animales = ll.LLenarlista();
        } else {
            try (FileWriter escriba = new FileWriter("ListaAnimales.txt")) {
                for (Animal item : animales) {
                    escriba.write("Categoria: " + item.getCategoria() + "\n");
                    escriba.write("Nombre: " + item.getNombre() + "\n");
                    escriba.write("Color: " + item.getColor() + "\n");
                    escriba.write("Edad: " + item.getEdad() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
