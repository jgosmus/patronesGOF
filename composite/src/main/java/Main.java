public class Main {
    public static void main(String[] args) {

        Ataque ataqueDerecho = new AtaqueSimpleDerecho();
        Ataque ataqueIzquierdo = new AtaqueSimpleIzquierdo();
        Ataque ataquePatada = new AtaqueSimplePatada();

        Ataque ataqueCompuesto2 = new AtaqueCompuesto();
        ataqueCompuesto2.add(ataqueIzquierdo);
        ataqueCompuesto2.add(ataquePatada);


        Ataque ataqueCompuesto1 = new AtaqueCompuesto();
        ataqueCompuesto1.add(ataqueDerecho);
        ataqueCompuesto1.add(ataqueIzquierdo);

        ataqueCompuesto1.add(ataqueCompuesto2);

        ataqueCompuesto1.execute();


        /*
        Ataque ataqueCompuesto3 = new AtaqueCompuesto();
        ataqueCompuesto3.add(ataqueCompuesto1);
        ataqueCompuesto3.add(ataqueCompuesto2);

        ataqueCompuesto3.execute();

         */

    }
}
