/**
 * Dado un arrays nums de integers ordenado de forma creciente, 
 * devuelve un array de los cuadrados de cada numero en orden creciente
 * Ej1:
 *  Input: nums = [-4,-1,0,3,10]
 *  Output: [0,1,9,16,100]
 * Ej2:
 *  Input: nums = [-7,-3,2,3,11]
 *  Output: [4,9,9,49,121]
 */
public class squaresofSortedArray {
    public static int[] sortedSquares(int[] nums){
        int[] toRet = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            toRet[i] = nums[i]*nums[i];
        }

        //Se podria hacer con esta llamada en caso de importar java.util.Arrays
        //Array.sort(toRet);

        //Ordenamos el array usando dos fors para comprobar un elemento con los siguientes,
        // asi como una variable temporal para poder hacer el cambio
        for(int i=0;i<toRet.length;i++){
            for(int j=i+1;j<toRet.length;j++){
                int temp = 0;
                if(toRet[i] > toRet[j]){
                    temp = toRet[i];
                    toRet[i] = toRet[j];
                    toRet[j] = temp;
                }
            }
        }

        return toRet;
    }

    public static void main(String[] args){
        int[] nums1 = {-4,-1,0,3,10};
        int[] nums2 = {-7,-3,2,3,11};
        
        nums1 = sortedSquares(nums1);
        nums2 = sortedSquares(nums2);

        System.out.println("RESULTADO NUMS1:");
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i] +" ");
        }

        System.out.println("\nRESULTADO NUMS2:");
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i] +" ");
        }
    }
}