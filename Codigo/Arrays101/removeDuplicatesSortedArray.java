/*
 * Dado un array nums de integers en orden no decreciente, eliminar los duplicados de tal forma que
 * cada elemento unico solo aparezca una vez. Se debe mantener el orden de los elementos.
 * El array debe contener la solucion final, pero se devolvera k, que es el numero de elementos despues
 * del borado.
 * Se debe hacer modificando el propio array, no se puede crear otro.
 * Juez:
 *  int[] nums = [...]; // Input array
 *  int[] expectedNums = [...]; // The expected answer with correct length
 *
 *  int k = removeDuplicates(nums); // Calls your implementation
 *
 *  assert k == expectedNums.length;
 *  for (int i = 0; i < k; i++) {
 *      assert nums[i] == expectedNums[i];
 *  }
 * 
 * Ej1:
 *  Input: nums = [1,1,2]
 *  Output: 2, nums = [1,2,_]
 * Ej2:
 *  Input: nums = [0,0,1,1,1,2,2,3,3,4]
 *  Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
class removeDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        //Comprobamos si el numero en el que estamos es mayor que el anterior(hemos cambiado de numero)
        // en caso de ser asi, movemos el nuevo numero hacia delante(counter)
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}