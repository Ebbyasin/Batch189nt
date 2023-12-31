package day18oop;

public class Student {
    /*
    Encapsulation ==>Kapsulleme
    Encapsulation Nedir? Data hiding (veri saklama)
    Data nasil saklanir?
    Acces Modifierlarini private yaparak datayi diğer class lardan görünmez hale getirerek saklarım.

    Encapsulation yaptigimiz data yi istersek diğer classlardan okuyabilirz
    Nasil okuyabiliriz?
    get method olusturarak encapsulate edilmis datanin degerini okuyabiliriz

    1)get methodlar public olur
    2)get methodun return type i okudugu variable in return type i ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi is ile baslar
     Encapsulation yaptigimiz data yi istersek diğer classlardan degistirebiliriz
    Nasil degistirebiliriz?
    1)set methodlari hep public olur
    2)set methodunun return type i hep void olur
    3)set method parametre kullanir,parametre nin data type i variable la ayni olur

    set method kullanarak varolan object üzerinde degisiklikler yaparak o objecti sanki
    yeni bir object miş gibi kullanabiliriz

    // getter ve setter larin ikisine birden "java beans" denir.(beans=fasulye demek)



    */
    public String stdName="Ali Can";
    public int age=15;
    private String stdId="AC20231212121";
    private double notOrt=3.13;
    private boolean succesful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) { //burda durumu sormuyorum sonucu degistiriyorum,
                                           // o yuzden setle baslar,get te is ile basliyordu.parametre
                                           //girmek zorundayiz,cünkü kullanacak.
        this.succesful = succesful;
    }
}
