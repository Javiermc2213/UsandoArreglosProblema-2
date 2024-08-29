import java.util.Arrays;

public class FusionarYOrdenarArreglos {

    public static int[] mergeAndSort(int[] nums1, int[] nums2) {
        // Crear un nuevo arreglo que tenga el tamaño de la suma de ambos arreglos
        int[] resultado = new int[nums1.length + nums2.length];
        
        // Copiar los elementos de nums1 y nums2 en el nuevo arreglo
        System.arraycopy(nums1, 0, resultado, 0, nums1.length);
        System.arraycopy(nums2, 0, resultado, nums1.length, nums2.length);
        
        // Ordenar el nuevo arreglo
        Arrays.sort(resultado);
        
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] resultado = mergeAndSort(nums1, nums2);
        
        // Imprimir el arreglo resultante
        System.out.println(Arrays.toString(resultado));  // Salida: [1, 2, 3, 4, 5, 6]
    }
}
