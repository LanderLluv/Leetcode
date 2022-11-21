/**
 * Dado un array binario nums, devuelve el numero maximo consecutivo de 1's en el array
 * Ej1:
 *  Input: nums = [1,1,0,1,1,1]
 *  Output: 3
 * Ej2:
 *  Input: nums = [1,0,1,1,0,1]
 *  Output: 2
 */

public class maxConsecutiveOnes {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        //Debemos llevar la cuenta del numero maximo de 1s asi como la cantidad 1s consecutivos por ahora
        int max = 0;
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            //En caso de que el numero sea 1, añadimos al contador
            if(nums[i] == 1){
                counter++;
            //En caso de que no sea 1
            }else{
                //Si el contador es mayor del maximo registrado lo actualizamos
                if(counter > max){
                    max = counter;
                }
                //Siempre queremos devolver el contador a 0
                counter = 0;
            }
        }
        //En caso de que acabe en 1s y sea el maximo
        if(counter > max){
            max = counter;
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}