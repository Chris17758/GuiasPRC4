
import java.util.Scanner;

/**
 *
 * @author Christofer
 */
public class Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cN = scanner.nextInt();
        int nM=0;
        int nMayor=0;
        int nP =0;
        for (int i=0; i < cN; i++){
            System.out.println("Digite cantidad de numeros a evaluar "+(i+1));
            int tmp=scanner.nextInt();
            if (i==0){
                nM=tmp;
                nMayor=tmp;
                nP=tmp;
            }else if (tmp<nM){
                nM=tmp;
            }
            if (tmp>nMayor){
                nMayor=tmp;
            }
            if (nP %2 == 0){
                nP=tmp;
            }
        }
        System.out.println("El numero menor es "+nM);
        System.out.println("El numero mayor es "+nMayor);
         System.out.println("El numero es par "+nP);
    }
}
