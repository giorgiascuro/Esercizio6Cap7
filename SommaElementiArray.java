public class SommaElementiArray {
    public static int sommaElementiArray(int[] array) {
        int somma;
        int arrayCorto[];
        if(array.length > 1) {
            arrayCorto = new int[array.length - 1];
            for(int i = 0; i < arrayCorto.length; i++) {
                arrayCorto[i] = array[i];
            }
           
            somma = sommaElementiArray(arrayCorto) + array[array.length - 1]; 
        }
        else 
            somma = array[array.length - 1];
            return somma; 
        }
    }