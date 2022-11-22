
/**
 * Dado dos arrays nums1 y nums2, ordenados en orden no-decreciente,
 * añade dos integers m y n, representando el numero de elementos en nums1 y nums2 que se quieren unir.
 * Se deben unir nums1 y nums2 en un solo array en orden no-decreciente.
 * El array final no debe ser devuelto, si no almacenado en el array nums1.
 * nums1 tiene un tamaño de m+n.
 * 
 * Ej1:
 *  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 *  Output: [1,2,2,3,5,6]
 * Ej2:
 *  Input: nums1 = [1], m = 1, nums2 = [], n = 0
 *  Output: [1]
 * Ej3:
 *  Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 *  Output: [1]
 */
class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Solucion con 2 punteros
        //El primero se coloca al final de nums1
        int p1 = m-1;
        //El segundo se coloca al final de nums2
        int p2 = n-1;
        int i = m+n-1;

        //Mientras el segundo tenga valores(ya que vamos a introducir el segundo en el primero)
        while(p2 >=0 ){
            //En caso de que el primero tenga valores y ademas este sea mayor que el valor de nums2
            //se le asigna el valor de nums1
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            //En caso contrario se le asigna el valor de nums2
            }else{
                nums1[i--] = nums2[p2--];
            }
        }
        //NOTA: fijarse que aunque se introduzca siempre en nums1[i--], los valores que se cogen
        //respectivamente son nums1[p1--] y nums2[p2--], donde se van reduciendo los punteros de los
        //dos arrays para recorrerlos

        for(int x=0;x<nums1.length;x++){
            System.out.print(nums1[x] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);

        int[] nums3 = {1};
        int[] nums4 = {};
        merge(nums3, 1, nums4, 0);

        int[] nums5 = {0};
        int[] nums6 = {1};
        merge(nums5, 0, nums6, 1);
    }
}