package Main;

import Paires.Paires;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Paires x = new Paires(1,"un");
        System.out.println(x.toString());
        Paires x2 = x.changeFst(1.0);
        System.out.println(x2);
        Paires x3 = x.changeSnd(1+"n");
        x.changeFst(x2);
        System.out.println(x3);

    }
}
