
package s9_listas_carlosespinal;

import java.util.*;

public class S9_Listas_CarlosEspinal {

    static Scanner read = new Scanner(System.in);
    static Libro l = new Libro();
    
    public static void Menu(){
        System.out.println("--- MENU ---");
        System.out.println("1. Agregar libro");
        System.out.println("2. Modificar libro");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Listar todos los libros");
    }
    
    public static void addBook(){
        System.out.println("Ingrese el nombre del libro");
        String bname = read.next();
        System.out.println("Ingrese el nombre del Autor del libro: ");
        String bauthor = read.next();
        System.out.println("Ingrese el numero de paginas del libro: ");
        int bpages = read.nextInt();
        System.out.println("Ingrese el genero del libro: ");
        String bgenre = read.next();
        
        l.registro.add(new Libro(bname,bauthor,bpages,bgenre));
    }
    
    public static void modBook(){
        char resp1 = 's';
        char resp2 = 's';
        do{
            System.out.println("Ingrese el indice del libro a modificar: ");
            int ind = read.nextInt()-1;
            Libro libselected = l.registro.get(ind);
            do{
                System.out.println("Que desea modificar del libro \n");
                System.out.println("1. Titulo");
                System.out.println("2. Autor");
                System.out.println("3. Numero de Paginas");
                System.out.println("4. Genero del libro");
                int opc = read.nextInt();

                switch (opc){
                    case 1:
                        System.out.println("Ingrese el nuevo titulo: ");
                        String newtit = read.next();
                        libselected.setTitulo(newtit);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo autor: ");
                        String newaut = read.next();
                        libselected.setAutor(newaut);
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo numero de paginas: ");
                        int newnum = read.nextInt();
                        libselected.setNumPaginas(newnum);
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo genero:");
                        String newgen = read.next();
                        libselected.setGenero(newgen);
                       break;
                }
                System.out.println("Desea modificar algo mas?: ");
                resp1 = read.next().charAt(0);
            }while(resp1 == 's' || resp1 == 'S');
            System.out.println("Desea modificar otro libro?: ");
            resp2 = read.next().charAt(0);
        }while(resp2 == 's' || resp2 == 'S');
    }
    
    public static void delBook(){
        char r = 's';
        do{
            System.out.println("Ingrese el indice del libro que desea eliminar: ");
            int index = read.nextInt()-1;
            Libro lib = l.registro.remove(index);
            System.out.println("Desea borrar otro libro?:[S/N]");
            r = read.next().charAt(0);
            
        }while(r == 's'|| r == 'S');
    }
    
    public static void listBook(){
        char r = 's';
        do{
            System.out.println("Lista de Libros: ");
            System.out.println(l.registro.toString());
            System.out.println("Ingrese [n] para regresar al menu principal: ");
            r = read.next().charAt(0);
        }while(r == 's'|| r == 'S');
    }
    
    public static void main(String[] args) {
        char resp = 's';
        do{
        Menu();
        int opcion = read.nextInt();
        
        switch(opcion){
            case 1:
                addBook();
                break;
            case 2:
                modBook();
                break;
            case 3:
                delBook();
                break;
            case 4:
                listBook();
                break;
            case 0:
                resp = 'n';
                break;
        }
        }while(resp == 's' || resp == 'S');
    }
    
}
