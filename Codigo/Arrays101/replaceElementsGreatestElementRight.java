/*
 * Dado un array arr, reemplaza cada elemento con el mayor a su derecha, y
 * reemplaza el ultimo elemento con -1
 * 
 * Ej1:
 *  Input: arr = [17,18,5,4,6,1]
 *  Output: [18,6,6,6,1,-1]
 * 
 * Ej2:
 *  Input: arr = [400]
 *  Output: [-1]
 */

class replaceElementsGreatestElementRight {
    public int[] replaceElements(int[] arr) {
        int mayor = 0;
        for(int i=0;i<arr.length-1;i++){
            mayor = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > mayor){
                    mayor = arr[j];
                }
            }
            arr[i] = mayor;
        }
        arr[arr.length-1] = -1;
        
        return arr;
    }
}