package homework2;

public class CheckWinTest {
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static char[][] maps = {
            {'0','0','X'},
            {'0','X','0'},
            {'0','X','X'},
    };

    public static void main(String[] args) {

        //System.out.println(checkingDiag(DOT_X));
        System.out.println(checkingHorizAndVert(DOT_O));
    }


    private static boolean checkingDiag(char crossOrZero) {

            boolean leftToRight = true;
            boolean rightToLeft = true;
            for (int i = 0; i < maps.length; i++) {
                leftToRight = leftToRight & (maps[i][i] == crossOrZero);
                rightToLeft = rightToLeft & (maps[i][maps.length - i - 1] == crossOrZero);
            }
        return leftToRight || rightToLeft;
    }

    private static boolean checkingHorizAndVert(char crossOrZero) {
        boolean horiz = true;
        boolean vert = true;
        for (int i = 0; i < maps.length; i++) {
            horiz = true;
            vert = true;
            for (int j = 0; j < maps.length; j++) {
                horiz = horiz & (maps[i][j] == crossOrZero );
                vert = vert & (maps[j][i] == crossOrZero);
            }if (horiz || vert) return true;
        }  return false;
    }

    {

    }
}
