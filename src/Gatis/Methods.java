package Gatis;

public class Methods {
    public static void main(String[] args) {

        vardi("Jānis");
        vardi("Pēteris");
        vardi("Armands");
        vardi("Edgars");

        vardsVecums("Jānis", 27);
        vardsVecums("Raivis", 46);
        vardsVecums("Artūrs", 15);

        System.out.println(citaMetode(3));
        System.out.println(nakamaMetode(9, 12));

        int metode = mainigaMetode(3,4);
        System.out.print(metode);

        vecums(19);

        int integers = vienads(4, 9);
        double dubults = vienads(4, 9);
        System.out.println("Int: " + integers);
        System.out.println("Double: " + dubults);

        //Rekursija
        int rezultats = summa(10);
        System.out.println(rezultats);

        int result = sum(5, 10);
        System.out.print(result);

    }

    //Parametri ir mainīgie iekš method. Tie ir jāievada iekavās ().
    //Metodē var pievienot tik daudz parametrus cik vēlas. Galvenais tos atdalīt ar komatu
    static void vardi(String names){        //parametrs names ir kā String datu tips
        System.out.println(names + " Bērziņš");
    }

    //Kad parametrs tiem attēlots metodē, tad tas tiek saukts par argumentu.
    //No piemēra izriet, ka 'names' ir parametrs, bet Jānis, Pēteris, Armands un Edgars ir argumenti

    //Var pievienot cik daudz parametrus vēlas
    static void vardsVecums(String vards, int vecums){
        System.out.println(vards + " ir " + vecums + " gadus vecs.");
    }

    //void nozīmē, ka metode neizpilda return vērtību.
    //Ja vēlies, ka metode izpilda return vērtību, tu vari izmantot primitīvos datu tipus (int, char utt) void vietā,
    //un izmantot return atslēgasvārdu metodē
    static int citaMetode(int x){
        return 5 + x;
    }

    //Šajā piemērā return būs divu parametru summa
    static int nakamaMetode(int x, int y){
        return x + y;
    }

    //metodi var arī uzglabāt kā mainīgo. Tas pat ir ieteicams, jo ir vieglāk lasāms un uzturams kods.
    static int mainigaMetode(int x, int y){
        return x + y;
    }

    //if..else statement metodē
    static void vecums(int age){

        if(age<18){
            System.out.println("\nTu neesi pietiekami vecs");
        } else {
            System.out.println("\nIeeja atļauta");
        }

    }

    //method overloading ir, kad vairākām metodēm var būt vienāds nosaukums ar savāākiem parametriem
    //vairākām metodēm var būt tāds pats nosaukums tiklīdz skaits un/vai datu tips ir savādāks
    static int vienads(int x, int y){
        return x + y;
    }
    static double vienads(double x, double y){
        return x + y;
    }

    //method scope - mainīgie ir pieejami jebkur metodē uzreiz pēc koda, kad tie bijuši izveidoti
    //mainīgos nevar tikt izmantot pirms metodē tie bijuši izveidoti. Proti:
    /*  public static void main(String[] args){

            mainīgais x nevar tikt izmantots šajā koda daļā

            int x = 5;      Mainīgais tiek izveidots

            Mainīgais x var tikt izmantots šajā koda daļā
            System.out.prinln(x);
        }
     */

    //Block scope norāda uz visu kodu, kas atrodas {} iekavās. Mainīgie var tikt izmantoti tikai iekšā šajās iekavās
    //Ārpus {} mainīgais nevar tikt izmantot

    //Rekursija ir tehnika, kura liek funkcijai izsaukt pašai sevi
    //Rekursija var būt grūti saprotama. Vislabākais veids kā to iemācīties ir eksperimentējot ar to.
    //Piemērā tiek saskaitīti visi skaitļi kopā no 1 līz 10
    public static int summa(int k){
        if(k>0){

            return k + summa(k - 1);    //atgriež 10 + summa(10-1), tad 9 + summa(9-1)...tā līdz 0

        } else {return 0;}
    }

    //Rekursijai būtiski ir norādīt halting condition, pretējā gadījumā, līdzigi kā cikli, tā var būt bezgalīga
    //Augšējā piemērā halting condition bija k=0. Kad parametrs sasniedza 0 vērtību, tad rekursija apstājās
    //Vēlviens rekursija piemērs:
    public static int sum(int start, int end){
        if(end > start){            //tad kad beigu skaitlis ir lielāks par starta skaitli, tad rekursija turpinās
            return end + sum(start, end - 1);       //ar katru rekursijas reizi end skaitlis tiek samazināts par 1
        } else {
            return end;
        }
    }

}
