package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Test verification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
        
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int length) {
//    	The total length should be < or = the total of small+long bricks && should either be <= the total nb of small bricks, or partially build with the long bricks and the remaining length should be < or = to the nb of small bricks. 
        boolean result = (nbSmall + (nbBig * 5) >= length) && (length % 5 <= nbSmall || length == nbSmall);
        return result;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean expectedResult) {
        if (fabriquerMur(nbSmall, nbBig, longueur) != expectedResult) {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}
