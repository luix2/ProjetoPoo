public class ProjetoPraia {
        public static void main(String args[]){
            crianca c1 = new crianca();
            c1.altura = 1.6;
            c1.corCabelo = "loiro";
            c1.corPele = "Branca";
            c1.idade = 10;
            c1.brincar();
            c1.correr( 100);
            String sorriso = c1.sorrir();

            Prancha p1 = new Prancha();
            p1.corPrancha = "laranjada ";
            p1.peso = "1 kg ";
            p1.tamanho = 1.5;

            p1.boiar();
            p1.quebrar();
            System.out.println(p1.peso);
            System.out.println(p1.tamanho);
            System.out.println(p1.corPrancha);

        }

    }

