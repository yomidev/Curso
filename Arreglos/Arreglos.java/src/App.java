import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de tipos de arrays
        //Ejemplos
        Scanner teclado = new Scanner(System.in);
        int [] numeros = {123, 342, 20, 10, 23, 19, 69, 72, 1000};
        System.out.println(Arrays.toString(numeros));
        /*String [] anime;
        anime = new String[10];
        String caricatura;  	    
        for (int i = 0; i < anime.length; i++) {
            System.out.println(" ingresa tu anime favorito: ");
            caricatura=teclado.nextLine();
            anime[i]=caricatura; 
        }
        System.out.println(Arrays.toString(anime));*/
        /*String [] kpop = {"BLACKPINK", "STRAY KIDS", "TWICE", "(G)I-DLE", "NEWJEANS","TOMORROW x TOGETHER", "ENHYPEN", "BTS", " ", "SEVENTEEN", " ", " ", "REDVELVET"," ","LE SSERAFIM"
        };
        String grupo;
        for (int i = 0; i < kpop.length; i++) {
            if(kpop[i].equals(" ")){
                System.out.println("Ingresa un grupo de Kpop: ");
                grupo = teclado.nextLine();
                kpop[i] = grupo;
            }
        }
        System.out.println(Arrays.toString(kpop));
        String cancion;
        for (int i = 0; i < kpop.length; i++) {
            System.out.println("Ingresa tu canción fav de "+kpop[i]+": ");
            cancion  = teclado.nextLine();
            kpop[i] = kpop[i].concat("-").concat(cancion);
        }

        for (int i = 0; i < kpop.length; i++) {
            System.out.println(kpop[i]);
        }*/

        
        /*int[] lados;
        int l;
        do { 
            System.out.println("ingrese el numero de lados: " );
            l= teclado.nextInt();
        } while (l<=0);
        
        lados= new int[l];
        int medida;
        for (int i = 0; i < lados.length; i++) {
            do { 
                System.out.println("Ingrese el lado "+(i+1)+": ");
                medida = teclado.nextInt();
            } while (medida <= 0);
            lados[i] = medida;
        }
        System.out.println(Arrays.toString(lados));
        int suma = 0;
        for (int idx = 0; idx < lados.length; idx++) {
            suma = suma +lados[idx];   
        }
        System.out.println("El perimetro de tu figura es: "+suma);

        for (int idx = lados.length-1; idx >= 0; idx--) {
        System.out.println(lados[idx]);
        }*/

        /*String [] actores = { "Timothée Chalamet", "Florence Pugh", "Margot Robin",
            "Cate Blanchet", "Jennifer Lawrence", " ", "Anna Taylor Joy", " ", " ", "Ryan Gosling"
        };

        String a;
        for (int i = 0; i < actores.length; i++) {
            if(actores[i].equals(" ")){
                System.out.println("Ingrese un actor: ");
                a = teclado.nextLine();
                actores[i] = a;
            }
            
           
        }
        System.out.println(Arrays.toString(actores));
         //Invertir nombres dentro del array
         String b="";
         for (int i = 0; i < actores.length; i++) {
                for (int j = actores[i].length()-1; j >=0; j--) {
                    b = b+actores[i].charAt(j);
                }
                actores[i] = b;
                b="";
         }
         System.out.println(Arrays.toString(actores));*/
        


        /*String[] songs;

        String [] actores = { "Timothée Chalamet", "Florence Pugh", "Margot Robin",
            "Cate Blanchet", "Jennifer Lawrence", " ", "Anna Taylor Joy", " ", " ", "Ryan Gosling"
        };
        Scanner teclado = new Scanner(System.in);
        int[] lados;
        System.out.println("ingrese el numero de lados: " );
        int l= teclado.nextInt();
        lados= new int[l];
        for (int idx = 0; idx < lados.length; idx++) {
            System.out.println("ingresa el valor de lado");
            int l1= teclado.nextInt();
            lados[idx]=l1;

        }

        System.out.println(Arrays.toString(lados));
        int suma=0;
        for (int i = 0; i < lados.length; i++) {
            suma=suma+lados[i];
            
        }
        System.out.println(suma);
        
        
        
        String [] cantantes;
        cantantes = new String[10];
        String C;
        for (int i = 0; i < cantantes.length; i++) {
            System.out.println("Ingresa un cantante");
            C=teclado.nextLine();
            cantantes[i]=C;

            
        }

            System.out.println(Arrays.toString(cantantes));


        String actor;
        for (int idx = 0; idx < actores.length; idx++) {
            if (actores[idx].equals(" ")) {
                System.out.println("Ingresa un actor");
                actor= teclado.nextLine().toUpperCase();
                actores[idx]=actor;
            }
        }
        System.out.println(Arrays.toString(actores).toUpperCase());
        
        for (int idx = 0; idx < actores.length; idx++) {
            String invertida="";
            String palabra = actores[idx];
            for (int i =palabra.length()-1; i >=0; i--) {
                    invertida=invertida+palabra.charAt(i);
            }
            actores[idx] = invertida;  
        }
        
        System.out.println(Arrays.toString(actores).toUpperCase());
        
        int n;
        System.out.println("ingrese la cantidad de canciones");
        n=teclado.nextInt();
        songs=new String[n];
        String cancion;
        for (int idx = 0; idx < songs.length; idx++) {
        System.out.println("Ingresa una cancion");
        cancion= teclado.nextLine();
        songs[idx]= cancion;
        }

        System.out.println(Arrays.toString(songs));
        
        
        
        
        
        
        
        
        
        
        
        
        //String
        String other;
        for (int i = 0; i < kpop.length; i++) {
            String grupoActual = kpop[i];
            if (grupoActual.equals(" ")) {
                System.out.println("Ingrese otro grupo: ");
                other = teclado.nextLine();
                kpop[i] = other;
            }   
        }
        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        String integrantes;
        String canciones;

        for (int i = 0; i < kpop.length; i++) {
            System.out.println("Ingresa tu bias " + kpop[i]+ ": ");
            integrantes = teclado.nextLine();
            System.out.println("Ingresa tu cancion favorita de " + kpop[i]+ ": ");
            canciones = teclado.nextLine();
            kpop[i] = kpop[i].concat(" - ").concat(integrantes);
            kpop[i] = kpop[i].concat(" - ").concat(canciones);

        }
        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        System.out.println("Buscador");
        System.out.println("Ingresa el nombre de un grupo para conocer la información");
        String search = teclado.nextLine().toUpperCase();
        boolean found = false;
        for (int idx = 0; idx < kpop.length; idx++) {
            if (kpop[idx].contains(search)) {
               System.out.println("Informacion del grupo buscado" + "\n" + kpop[idx]);
               found=true;
               break;
            }else{
                System.out.println("Lo sentimos no tenemos información de este grupo "+ search);
                found = false;
                break;
            }
            
        }
        
        //Numero menor
        int minimo = numeros[0];
        for (int i = 0; i< numeros.length; i++) {
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }
        }
        int suma2 = 0;
        for(int j = 0; j< numeros.length; j++){
            suma = suma + numeros[j];
        }
        int [] invertido = new int[numeros.length];
        for (int k = 0; k < numeros.length; k++) {
            invertido[k] = numeros[numeros.length -1 -k];
        }

        double promedio = suma/numeros.length;
        System.out.println("El promedio es: "+ promedio);
        System.out.println("El numero menor: " + minimo);
        System.out.println("Array Invertido: "+ Arrays.toString(invertido));
    }*/
    }
}
