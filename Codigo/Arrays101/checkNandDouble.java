/*
 * Dado un array arr de integers, comprobar que existen dos indice i y j que:
 *  i != j
 *  0<= i, j < arr.length
 *  arr[i] == 2 * arr[j]
 * Ej1:
 *  Input: arr = [10,2,5,3]
 *  Output: true
 * 
 * Ej2:
 *  Input: arr = [3,1,7,11]
 *  Output: false
 */

class checkNandDouble {
    public boolean checkIfExist(int[] arr) {
        //Condicion 0<=i
        for(int i=0;i<arr.length;i++){
            //Condiciones i!=j y j<arr.length
            for(int j=i+1;j<arr.length;j++){
                //Se debe tener en cuenta el orden, por lo que es necesario las dos condiciones
                //Imaginemos el array [7,1,14,11], con la primera condicion unicamente el resultado seria false
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]){
                    return true;
                }
            }
        }

        return false;
    }
}