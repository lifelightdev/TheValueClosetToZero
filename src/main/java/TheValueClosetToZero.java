import java.util.Arrays;

public class TheValueClosetToZero {


    public static int find(int[] tableau) {
        int size = tableau.length;
        if (tableau.length != 0) {
            Arrays.sort(tableau);
            int valeurPositive = Integer.MAX_VALUE;
            int valeurNegative = Integer.MIN_VALUE;
            for (int valeur : tableau){
                if (valeur < valeurPositive && valeur > 0) {
                    valeurPositive = valeur;
                }
                if(valeur > valeurNegative && valeur < 0){
                    valeurNegative = valeur;
                }
                if (valeur == 0){
                    return 0;
                }
            }
            if ((valeurNegative * -1) > valeurPositive){
                return valeurPositive;
            }
            return valeurNegative;
        }
        return 0;
    }
}
