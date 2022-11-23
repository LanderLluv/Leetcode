/**
 * Dado un array nums de integers y un integer val, elimina todas las ocurrencias de val en nums.
 * El array debe contener la solucion final, pero se devolvera k, que es el numero de elementos despues
 * del borado.
 * Se debe hacer modificando el propio array, no se puede crear otro.
 * Juez:
 *  int[] nums = [...]; // Input array
 *  int val = ...; // Value to remove
 *  int[] expectedNums = [...]; // The expected answer with correct length.
                                // It is sorted with no values equaling val.
 *  int k = removeElement(nums, val); // Calls your implementation

 *  assert k == expectedNums.length;
 *  sort(nums, 0, k); // Sort the first k elements of nums
 *  for (int i = 0; i < actualLength; i++) {
 *      assert nums[i] == expectedNums[i];
 *  }
 *
 * Ej1:
 *  Input: nums = [3,2,2,3], val = 3
 *  Output: 2, nums = [2,2,_,_] Siendo _ cualquier valor
 * 
 * Ej2:
 *  Input: nums = [0,1,2,2,3,0,4,2], val = 2
 *  Output: 5, nums = [0,1,4,0,3,_,_,_]
 */

class removeElement {
    public int removeElement(int[] nums, int val) {
        //Lo vamos a enfocar de tal manera que "pasaremos hacia delante" los valores que son distintos de val
        // por lo que cada vez que no coincida, lo pasaremos a la primera posicion de alante disponible (elements)
        int elements = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[elements] = nums[i];
                elements++;
            }
        }

        return elements;
    }
}