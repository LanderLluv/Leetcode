/*
 * Dado un array arr de integers, devolver true si es un array valido "de montaña"
 * Un array "de montaña" es valido sii:
 *  arr.length >= 3
 *  Existe un i con 0<i<arr.length-1 que:
 *      arr[0]<arr[1]<...<arr[i-1]<arr[1]
 *      arr[i]>arr[i+1]>...>arr[length-1]
 * 
 * Ej1:
 *  Input: arr = [2,1]
 *  Output: false
 * 
 * Ej2:
 *  Input: arr = [3,5,5]
 *  Output: false
 * 
 * Ej3:
 *  Input: arr = [0,3,2,1]
 *  Output: true
 */
class validMountainArray {
    public static boolean validMountainArrayFuncion(int[] arr) {
        //Caso demasiado corto
        if(arr.length < 3){
            return false;
        //Caso sea solo descendente
        }else if(arr[0] > arr[1]){
            return false;
        }
        boolean crece = true;

        for(int i=1;i<arr.length;i++){
            //Caso crece y sigue creciendo
            if(crece && arr[i] > arr[i-1]){
                continue;
            //Caso crece y deja de crecer
            }else if(crece && arr[i] < arr[i-1]){
                crece = false;
            //Caso decrece y sigue decreciendo
            }else if(!crece && arr[i] < arr[i-1]){
                continue;
            //No cumple las condiciones
            }else{
                return false;
            }
        }
        
        //Debemos devolver !crece dado que hay que comprobar que crece y decrece
        return !crece;
        
    }

    public static void main(String[] args){
        int[] nums1 = {2,1};
        int[] nums2 = {3,5,5};
        int[] nums3 = {0,3,2,1};

        System.out.println(validMountainArrayFuncion(nums1));
        System.out.println(validMountainArrayFuncion(nums2));
        System.out.println(validMountainArrayFuncion(nums3));
    }
}