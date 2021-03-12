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

        //Narroiwing casting jāveic ir manuāli ieliekot iekavās data type pirms vērtības
        //Narrowing casting veic, ja vēlies konvertēt no lielāka uz mazāku data type
        //Secība - double->float->long->int->char->short->byte
        double lielakaLieluma = 12.234d;
        int mazakaLieluma = (int) lielakaLieluma;

        System.out.println(lielakaLieluma);
        System.out.println(mazakaLieluma);

        //Operatori
        /* Aritmētiskie operatori ir:
            + Saskaita kopā divas vērtības (arī mainīgos)
            - Atņem vērtību no cita
            * Sareizina divas vērtības kopā
            / Sadala vērtības
            % Modulis - attēlo dalījuma atlikuma vērtību. Piemēram 7 % 2 = 1 (jo atlikums ir 1)
            ++ Inkrements - palielina vērtību pa 1
            -- Dekrements - samazina vērtību pa 1
         */

        /* Assignment operatori
            = Iedod attiecīgo vērtību mainīgajam. Piemērs, x = 10
            += Pieskaita attiecīgo vērtību mainīgajam. Piemērs, ja x=10, un pēc tam x+=5, tad x būs 15
            -= Atņam attiecīgo vērtību mainīgajam. Piemērs, ja x=10, un x-=5, tad x būs 5
            *= Piereizina attiecīgo vērtību mainīgajam. Piemērs, x=10, un x*=5, tad x būs 50
            /= Sadala attiecīgo vērtību mainīgajam. Piemērs, x=10, un x/=5, tad x būs 2
            %= Sadala un attēlo dalījuma atlikuma vērtību. Piemērs, x=10, un x%=3, tad x būs 1
         */

        /* Bitwise Assignment Operatori
            &= Pievieno AND operāciju pie vērtības
            |= Pievieno OR operāciju pie vērtības
            ^= Pievieno XOR operāciju pie vērtības
            <<= Pievieno Left Shift pie vērtības
            >>= Pievieno Right Shift pie vērtības
         */

        /* Salīdzināšanas Operatori
            == Vienāds ar
            != Nav vienāds ar
            > Lielāks par
            < Mazāks par
            >= Lielāks vai vienāds ar
            <= Mazāks vai vienāds ar
         */

        /* Loģiskie Operatori
            && Loģiskā AND funkcija. Atgriež true vērtību, ja abas puses ir patiesas
            || Loģiskā OR funkcija. Atgriež true vērtību, ja vismaz viena puse ir patiesa
            ! Loģiskā NOT funkcija. Apgriež vērtības pretējā virzienā. Atgriež false vērtību, ja rezultāts ir patiess
         */

        //String garumu var noteikt ar metodi length()
        String teksts = "Šis ir string teksts ar attiecīgu garumu";
        System.out.print("Šī teksta garums ir: " + teksts.length() + " rakstzīmes\n");

        String mainigiBurti = "Šis teksts tiks izmainīts.";

        System.out.println(mainigiBurti.toUpperCase());
        System.out.println(mainigiBurti.toLowerCase());

        String lokacija = "Noteiksim, cik tālu no sākuma atrodas vārds Gatis";
        System.out.println(lokacija.indexOf("Gatis"));  //Java skaita sākot no 0. 0 ir pirmā pozīcija, 1 ir otrā utt

        //Concatenation - Tas ir kad savieno divus vai vairāk String ar +
        String mansVards = "Gatis ";
        String mansUzvards = "Ķevans";
        System.out.println(mansVards + mansUzvards);

        //Concat() funkcija arī savieno divus String. Attiecīgi vārds concatination
        System.out.println(mansVards.concat(mansUzvards));

        //Speciālās rakstzīmes var izmantot, ja izmanto Escape character \
        //Java uzskatīs nākamo rakstzīmi pēc \ kā daļu no string teksta nevis kā speciālo programmēšanas rakstzīmi
        String rakstzimes = "Es varu ielikt \"Pēdiņas\" savā tekstā, neliekot programmai domāt, ka vēlos beigt string";
        System.out.println(rakstzimes);

        /* Citi Escape varianti Java valodā
            \n Jauna rinda
            \r Carriage Return.
            \t Tab atkāpe
            \b Backspace - nodzēš iepriekšējo rakstzīmi
            \f Form Feed
         */

        //Ja ar + savieno integer un string, tad rezultāts būs concatenation un String (integer daļa pārtaps string)
        String savieno = "20";
        int pievieno = 10;
        String kopa = savieno + pievieno;
        System.out.println(kopa);

        //Math funkcija - Math();
        System.out.println(Math.max(5,10));     //Math.max - maksimālā vērtība
        System.out.println(Math.min(5,10));     //Math.min - minimālā vērtība
        System.out.println(Math.sqrt(25));      //Math.sqrt - Kvadrātsakne no vērtības. Attēlos ar decimālskaitli
        System.out.println(Math.abs(-4.8));     //Math.abs - absolūtā pozitīvā skaitļa vērtība
        System.out.println(Math.random());      //Math.random - random skaitlis no 0.0 - 1.0 (1.0 neieskaitot)

        //Math.random skaitli var kontrolēt
        int randomSkaitlis = (int)(Math.random() * 101);    //(int) vajadzīgs, jo random attēlo decimālskaitli nevis int
        System.out.println(randomSkaitlis);                 //Attēlos skaitli no 0 līdz 100

        //Boolean ir vai nu true vai false
        int a = 4;
        int b = 9;
        System.out.println(a<b);    //Boolean atgriezīs vērtību true
        System.out.println(a==4);   //Boolean atgriezīs vērtību true
        System.out.println(10==4);  //Boolean atgriezīs vērtību false

        //if - else statements
        if(10>9){
            System.out.println("Desmit ir lielāks par deviņi");
        } else {System.out.println("Kaut kas nogāja greizi");}

        //if else if statement
        int laiks = 20;
        if(laiks < 10){
            System.out.println("Labrīt");
        } else if(laiks < 20){
            System.out.println("Labdien");
        } else {System.out.println("Labvakar"); }

        //Ternary operators OOP variants if else statementam
        //mainīgais = (nosacījums) ? true rezultāts : false rezultāts;

        String rezultats = (laiks < 18) ? "Labdien" : "Labvakar";
        System.out.println(rezultats);

        //Switch
        int diena = 4;
        switch(diena){

            case 1:
                System.out.println("Pirmdiena");    //Pirmais gadījuma
                break;                              //break; aptur bloka turpmāku izpildi
                //Gadījumā ja case 1 ir true, tad break ietaupīs laiku igonērot pārējos cases

            case 2:
                System.out.println("Otrdiena");     //Otrais gadījums
                break;
            case 3:
                System.out.println("Trešdiena");    //Trešais gadījums
                break;
            case 4:
                System.out.println("Ceturtdiena");  //Ceturtais gadījums
                break;
            case 5:
                System.out.println("Piektdiena");   //Piektais gadījums
                break;
            case 6:
                System.out.println("Sestdiena");    //Sestais gadījums
                break;
            case 7:
                System.out.println("Svētdiena");    //Septītais gadījums
                break;
            default:
                System.out.println("Kaut kas nogāja greizi");   //Ja neviens no iepriekšējiem gadījumiem nenostrādā

        }

        //while cikls
        int sk = 1;
        while(sk <= 5) {
            System.out.println(sk);
            sk++;
        }

        //do/while cikls vispirms izpilda koda bloku, kas atrodas do sadaļā, un tikai pēc tam pārbauda while sadaļu
        int skaitlis = 1;
        do{
            System.out.println("Skaitlis ir: " + skaitlis);
            skaitlis++;
        } while(skaitlis <= 5);

        //for cikls tiek izmantots, ja zini konkrēti cik daudz reizes vēlies izlaist ciklu
        //for(statement1, statement2, statement3){}
        //Statement1 tiek izpildīts vienu reizi pirms cikls sākas (i=0)
        //Statement2 definē nosacījumus ciklam (cik daudz reizes; robeža, kur beigties utml) (i<5)
        //Statement3 tiek izpildīts katru reizi, kad koda bloks tiek izpildīts. Parasti liek inkrementu i++
        for(int i=1; i<=5; i++) {
            System.out.println("For cikla vērtība: " + i);
        }

        //Attēlos tikai pāra skaitļus
        for(int i=2; i<=10; i=i+2) {
            System.out.println("Pāra skaitlis: " + i);
        }

        //for-each ciklu izmanto, lai veiktu ciklus masīvos
        //for(tips mainīgāNosaukums : masīvaNosaukums) {}
        String[] detalas = {"RAM", "HDD", "Motherboard", "PSU", "Case", "CPU", "GPU", "Monitor"};  //Šis ir masīvs
        for(String i : detalas) {
            System.out.println(i);          //Attālos katru ierakstu masīvā jaunā rindā
        }

        //break noder arī ne tikai switch statement, bet arī lai izbēgtu no cikliem
        for(int i=1; i<10; i++){
            if(i == 4){
                break;
            }
            System.out.println("Break pie skaitļa 4: " + i);
        }

        //continue izlaiž vienu cikla notikumu.
        //Ja konkrētais gadījums notiek, tad ar continue to izlaidīs un cikls turpināsies tālāk.
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            } System.out.println("Continue izlaidīs skaitli 3: " + i);
        }

        //Masīvi tiek izmantoti, lai turētu vairākus elementus vienā mainīgajā
        //Masīvi sākas ar skaitli 0 un tos deklarē ar kvadrātiekavām []
        String[] edieni = {"Saldējums", "Popkorns", "Šokolāde", "Torte", "Kartupeļi"};
        System.out.println(edieni[0]);  //Attēlos elementu Saldējums

        //Mainīs pirmo masīva elementu ar [0]
        edieni[0] = "Karamele";
        System.out.println(edieni[0]);

        //ar parametru length var noskaidrot cik daudz elementi ir masīvā
        System.out.println(edieni.length);  //Attēlos 5

        //length ir labs veids kā ciklos norādīt cik daudz reizes iet cauri, lai attēlotu visus elementus
        for(int i=0; i < edieni.length; i++){
            System.out.println(edieni[i]);
        }

        //Multidimensionāls masīvs ir masīvs, kur katrā elementā ir iekšā masīvs.
        //Divdimensionālu masīvu attēlo ar divām kvadrātiekavām [][], trīsdimensionālu ar trīs utt
        int skaitli[][] = {{1,2,3,4},{5,6,7}};
        System.out.println(skaitli[0][2]);  //Attēlos pirmā elementa trešo elementu

        //Arī divdimensionālu masīvu var attēlot ar for ciklu
        for(int i = 0; i < skaitli.length; i++){
            for(int j = 0; j < skaitli[i].length; j++){
                System.out.println("Divdimensionālais masīvs for ciklā: " + skaitli[i][j]);
            }
        }

        manaMetode();
        manaMetode();
        manaMetode();

    }

    //Method ir koda bloks, kurš izpildās tikai tad, kad metode tiek izsaukta
    //ManaMetode() ir metodes nosaukums
    //static nozīmē to, ka metode pieder MyClass klasei nevis MyClass objektam
    //void nozīmē to, ka šai metodei nav return vērtība
    static void manaMetode(){
        System.out.println("Mana Metode");
    }



}
