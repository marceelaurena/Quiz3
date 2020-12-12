
package quiz3;
import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {
Scanner pizza = new Scanner(System.in);

Ingredientes queso = new Ingredientes ();
queso.setNombre("Queso");
queso.setCodigo(1234);
queso.setDescripcion("Mozarella");
queso.setPrecio(1000);

Ingredientes pepperoni = new Ingredientes ();
pepperoni.setNombre("Pepperoni");
pepperoni.setDescripcion("Carne roja");
pepperoni.setCodigo(12345);
pepperoni.setPrecio(1100);

Ingredientes jamon = new Ingredientes();
jamon.setNombre("Jamon");
jamon.setDescripcion("De pavo");
jamon.setCodigo(123456);
jamon.setPrecio(700);

Ingredientes tomate = new Ingredientes ();
tomate.setNombre("Tomate");
tomate.setDescripcion("Rojo");
tomate.setCodigo(1234567);
tomate.setPrecio(500);

Ingredientes pizza1 = new Ingredientes();
int precioPizza1 = tomate.precio+jamon.precio+pepperoni.precio+queso.precio;
int precioPizza2 = tomate.precio+jamon.precio+pepperoni.precio;
int precioPizza3 = tomate.precio+jamon.precio+queso.precio;
int precioPizza4 = jamon.precio+queso.precio+pepperoni.precio;
int precioPizza5 = queso.precio+pepperoni.precio+tomate.precio;
int precioPizza6 = queso.precio+jamon.precio;
int precioPizza7 = tomate.precio+jamon.precio;
int precioPizza8 = pepperoni.precio+jamon.precio;
int precioPizza9 = tomate.precio+queso.precio;
int precioPizza10 = tomate.precio+pepperoni.precio;
int precioPizza11 = queso.precio+pepperoni.precio;

System.out.println("Digite los ingredientes de su pizza(Puede elegir de 2 a 4 ingredientes): 1==Queso, 2==Pepperoni, 3==Jamon o 4==Tomate, si desea menos de 4 ingredientes, marque 0 para continuar");
int ingredientesPizza = pizza.nextInt();
int ingredientesPizza2 = pizza.nextInt();
int ingredientesPizza3 = pizza.nextInt();
int ingredientesPizza4 = pizza.nextInt();

if (ingredientesPizza==1 && ingredientesPizza2==2 && ingredientesPizza3==3 && ingredientesPizza4==4){
System.out.println("El precio de su pizza es: " + precioPizza1);
}
else if (ingredientesPizza==1 && ingredientesPizza2==2 && ingredientesPizza3==3 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza4);
}
else if (ingredientesPizza==1 && ingredientesPizza2==2 && ingredientesPizza3==4 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza5);
}
else if (ingredientesPizza==1 && ingredientesPizza2==3 && ingredientesPizza3==4 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza3);
}
else if (ingredientesPizza==2 && ingredientesPizza2==3 && ingredientesPizza3==4 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza2);
}
else if (ingredientesPizza==1 && ingredientesPizza2==2 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza11);
}
else if (ingredientesPizza==1 && ingredientesPizza2==3 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza6);
} 
else if (ingredientesPizza==1 && ingredientesPizza2==4 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza9);
}
else if (ingredientesPizza==2 && ingredientesPizza2==3 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza8);
}
else if (ingredientesPizza==2 && ingredientesPizza2==4 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza10);
}
else if (ingredientesPizza==3 && ingredientesPizza2==4 && ingredientesPizza3==0 && ingredientesPizza4==0){
System.out.println("El precio de su pizza es: " + precioPizza7);
}
    }
}


    

