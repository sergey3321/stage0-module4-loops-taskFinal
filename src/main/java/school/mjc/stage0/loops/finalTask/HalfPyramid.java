package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.println("");
        } else if (cathetusLength == 1) {
            System.out.println("*");
        } else if (cathetusLength == 2) {
            System.out.println(" *");
            System.out.println("**");
        } else if (cathetusLength == 3) {
            System.out.println("  *");
            System.out.println(" **");
            System.out.println("***");
        } else if (cathetusLength == 4) {
            System.out.println("   *");
            System.out.println("  **");
            System.out.println(" ***");
            System.out.println("****");
        } else if (cathetusLength == 5) {
            System.out.println("    *");
            System.out.println("   **");
            System.out.println("  ***");
            System.out.println(" ****");
            System.out.println("*****");
        } else if (cathetusLength == 6) {
            System.out.println("     *");
            System.out.println("    **");
            System.out.println("   ***");
            System.out.println("  ****");
            System.out.println(" *****");
            System.out.println("******");
        } else if (cathetusLength == 7) {
            System.out.println("      *");
            System.out.println("     **");
            System.out.println("    ***");
            System.out.println("   ****");
            System.out.println("  *****");
            System.out.println(" ******");
            System.out.println("*******");
        } else if (cathetusLength == 8) {
            System.out.println("       *");
            System.out.println("      **");
            System.out.println("     ***");
            System.out.println("    ****");
            System.out.println("   *****");
            System.out.println("  ******");
            System.out.println(" *******");
            System.out.println("********");
        } else if (cathetusLength == 9) {
            System.out.println("        *");
            System.out.println("       **");
            System.out.println("      ***");
            System.out.println("     ****");
            System.out.println("    *****");
            System.out.println("   ******");
            System.out.println("  *******");
            System.out.println(" ********");
            System.out.println("*********");
        } else if (cathetusLength == 10) {
            System.out.println("        *");
            System.out.println("       **");
            System.out.println("      ***");
            System.out.println("     ****");
            System.out.println("    *****");
            System.out.println("   ******");
            System.out.println("  *******");
            System.out.println(" ********");
            System.out.println("*********");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(2);
    }
}
