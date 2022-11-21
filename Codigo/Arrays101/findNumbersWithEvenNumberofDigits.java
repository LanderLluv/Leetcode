/**
 * Dado un array nums de integers, devolver cuantos contienen un numero par de digitos.
 * Ej1:
 *  Input: nums = [12,345,2,6,7896]
 *  Output = 2
 *  12 -> 2 digitos(par)
 *  345 -> 3 digitos(impar)
 *  ...
 * Ej2:
 *  Input: nums = [555,901,482,1771]
 *  Output: 1 
 */
public class findNumbersWithEvenNumberofDigits {
    public static  int findNumbers(int[] nums) {
        //Debemos llevar la cuenta de el numero total de numeros que tiene una cantidad de digitos par(counter),
        // asi como de cuantos digitos tiene el numero actual sobre el que estamos iterando(acum)
        int counter = 0;
        int acum = 0;
        for(int i=0;i<nums.length;i++){
            //Dividimos el numero entre 10 mientras sea mayor de 0 (cualquier numero de un solo digito /10 da 0)
            //lo cual nos va a servir para contar el numero de digitos
            while(nums[i] > 0){
                nums[i] = nums[i]/10;
                acum++;
            }
            //En caso de que el numero de digitos sea par sumamos a nuestro contador
            if(acum%2 == 0){
                counter++;
            }
            //Reiniciamos el contador de digitos para el siguiente numero
            acum = 0;
        }

        return counter;
    }

    public static void main(String[] args){
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};

        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }
}