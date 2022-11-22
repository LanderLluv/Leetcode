/**
 * Dado un array arr de tamaño fijo, duplica cada ocurrencia de 0,
 * desplazando a la derecha el valor siguiente
 * Ej1:
 *  Input: arr = [1,0,2,3,0,4,5,0]
 *  Output: [1,0,0,2,3,0,0,4]
 * Ej2:
 *  Input: arr = [1,2,3]
 *  Output: [1,2,3]
 */
class duplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            //Comprobamos si el valor en el que estamos es 0
            if(arr[i] == 0){
                //Movemos todos los valores desde donde esta el 0 a la derecha
                for(int j=arr.length-2;j>=i;j--){
                    arr[j+1] = arr[j];
                }
                //Asignamos el valor 0 en la posicion actual para duplicarlo
                arr[i] = 0;
                //Nos saltamos la siguiente posicion dado que es el 0 que acabamos de introducir
                i++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,0,2,3,0,4,5,0};
        int[] nums2 = {1,2,3};

        duplicateZeros(nums1);
        duplicateZeros(nums2);
    }
}