package Gatis;

//Šis ir vienas rindas komentārs

/*Šis ir bloka komentārs,
kuru var rakstīt vairākās rindās,
līdz pievieno beigu komandu.
 */

public class MyClass {

    public static void main(String[] args) {

        System.out.println("""     
                Hello world!\s
                Mani sauc Gatis Ķevans!\s
                Bye bye hehe!!""");

        String pirmais = "Šis ir";
        String otrais = " mans teksts!";

        System.out.println(pirmais + otrais);

        //Mainīgos var arī savienot kopā.
        String vards = "Gatis ";
        String uzvards = "Ķevans";
        String pilnaisVards = vards + uzvards;

        System.out.println(pilnaisVards);

        //int ir vesels skaitlis
        int pirmaisInteger;
        pirmaisInteger = 27;

        System.out.println(pirmaisInteger);

        //Tagad pirmaisInteger mainīs vērtību
        pirmaisInteger = 30;
        System.out.println(pirmaisInteger);

        //komanda final pataisa vērtību nemainīgu,
        // pat ja vēlāk kodā nomaini mainīgā vērtību, tas saglabāsies kāds ir final.
        final int otraisInteger = 45;

        System.out.println(otraisInteger);

        /* Šī koda daļa metīs error, jo otraisInteger definēts kā final

        otraisInteger = 12;
        System.out.println(otraisInteger);

        */

        //Boolean vērtība ir vai nu true vai false jeb 1 vai 0
        //Ieraksti pareizs vērtību kā false un if statement attēlos else sadaļu
        boolean pareizs = true;

        if(pareizs){

            System.out.println("Pareizā vērtība");

        } else {System.out.println("Nepareizā vērtība");}

        //char ir mainīgais, kur ir tikai viens burts vai skaitlis
        char burts = 'Ķ';
        System.out.println(burts);

        //float ir skaitlis ar decimāldaļu. Burts f skaitļa galā norāda uz to, ka tas ir float skaitlis
        //Ja skaitli atstās bez burta f, tad programma uzskatīs, ka datu tips ir double, un pie float metīs error.
        float dala = 10.34f;
        System.out.println(dala);

        //double ir tas pats floating point tips, tikai izmanto 8 bitus nevis 4 kā to dara komanda float
        //lielākajā daļā gadījumu nākas izmantot double. Arī Double skaitlim beigās var likt burtu d, kas
        //norādīs, ka tā ir double vērtība, bet var arī nelikt, jo programma vērtību pēc noklusējuma uztvers kā double
        double otraDala = 12.234d;
        System.out.println(otraDala);

        //Var arī savienot vairākus mainīgos ar vienādu datu tipu rindiņā pēc kārtas.
        int viens = 1, divi = 2, tris = 3, cetri = 4, pieci = 5;
        System.out.println((divi + tris + pieci)/cetri + viens);

        byte bits = 127; //Bita vērtība ir -128 līdz 127, izmanto 1 bitu atmiņu
        short mazs = 32767; //Short vērtība ir -32768 līdz 32767, izmanto 2 bitus atmiņas
        int integeris = 2147; //Int uzglabā 4 bitu lielu skaitli
        long lielais = 922337203685477580L; //Long uzglabā 8 bitu lielu skaitli. Long skaitļa beigās jānorāda burts L

        System.out.println(bits+mazs+integeris+lielais);

        //Float un double var tikt izmantots arī kā zinātniskais skaitlis, ar e norādot 10 pakāpi
        double zinatniskais = 12e12d;
        System.out.println(zinatniskais);

        //char var izmantot arī ASCII vērtībās. Proti, char ar vērtību 66 attēlos kā B, char = 98 būs b
        //Pilna vērtību informācija jāmeklē ASCII tables
        char asciichar = 66;
        System.out.println(asciichar);

        //Type casting var konvertēt data type citā
        //Widening casting notiek automātiski, ja konvertē no mazāka lieluma type uz lielāku
        //Secība - byte->short->char->int->long->float->double
        byte mainities = 12;
        float jaunsTips = mainities;

        System.out.println(mainities);
        System.out.println(jaunsTips);

        //Narroiwing casting jāveic ir manuālu ieliekot iekavās data type pirms vērtības
        //Narrowing casting veic, ja vēlies konvertēt no lielāka uz mazāku data type
        //Secība - double->float->long->int->char->short->byte
        double lielakaLieluma = 12.234d;
        int mazakaLieluma = (int) lielakaLieluma;

        System.out.println(lielakaLieluma);
        System.out.println(mazakaLieluma);

        

    }

}
