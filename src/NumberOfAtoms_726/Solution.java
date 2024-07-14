package NumberOfAtoms_726;

public class Solution {
    public static void main(String[] args) {
        //Testcase 1
        String formula = "H2O";
        System.out.println(countOfAtoms(formula));

        //Testcase 2
        formula = "Mg(OH)2";
        System.out.println(countOfAtoms(formula));

        //Testcase 3
        formula = "K4(ON(SO3)2)2";
        System.out.println(countOfAtoms(formula));
    }

    public static String countOfAtoms(String formula) {
        return formula;
    }
}
