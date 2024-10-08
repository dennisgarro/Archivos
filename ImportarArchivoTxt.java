import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxt {
    public LinkedList<Animal> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<Animal> Animales = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            Animal animal = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Categoria: ")) {
                    if (animal != null) {
                        Animales.add(animal);
                    }
                    animal = new Animal();
                    animal.setCategoria(line.substring(8)); // Remover "Nombre: "
                } else if (line.startsWith("Nombre: ")) {
                    if (animal != null) {
                        animal.setNombre(line.substring(8)); // Remover ": "
                    }
                } else if (line.startsWith("Color: ")) {
                    if (animal != null) {
                        animal.setColor(line.substring(10));

                    } else if (line.startsWith("Cantidad: ")) {
                        if (animal != null) {
                            animal.setEdad(Integer.parseInt(line.substring(10))); // Remover "Cantidad: "
                            Animales.add(animal); // Añadir el producto al final del archivo
                            animal = null; // Reiniciar para el siguiente producto
                        }
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Animales;

    }

}
