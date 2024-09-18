public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        System.out.println("Tamaño de la cadena: " + cadena.length());
        System.out.println(cadena.split(" ")[1]);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.length()-1==i){
                System.out.println(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i) + "-");
            }
        }        
        int palabras = (cadena.split(" ")).length;
        System.out.println("Numero de Palabras: " + palabras);
        String union = cadena.replace(" ", "");
        System.out.println("Numero de letras: " + union.length());
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)=='a') {
                contador++;
            }
        }
        System.out.println("La cadena tiene una cantidad de letras A: " + contador);
    }
}
