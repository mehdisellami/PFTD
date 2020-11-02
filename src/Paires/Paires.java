package Paires;

import javax.xml.crypto.Data;
import java.util.LinkedList;

public class Paires <A,B> {




   private A fst;
   private B snd;


    public Paires(final A fst, final B snd) {
        this.fst = fst;
        this.snd = snd;
    }


    public A fst () {
        return fst;
    }

    public B snd() {
        return snd;
    }



    public <C>  Paires <C,B>  changeFst(C val) {
        return new Paires <> (val,snd);
    }


    public <C> Paires <B,C> changeSnd(C val) {
        return new Paires  (fst,val);
    }

    @Override
    public String toString(){
        return "("+ fst+","+snd+")"+ "::"+    "PAIRE[" +fst.getClass().getSimpleName()+","  +""+snd.getClass().getSimpleName() +"]" ;
    }





}
