package d20_05_2022;
//1.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
// postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
// Konstruktore:
//difoltni konstuktor
//konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je
// profilu objavnljen i tekst objave
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

public class FacebookPost {
    public String userPosted;
    public String userPostPublished;
    public String text;
    public int likes;
    public int shares;

    public void like(){
        this.likes = this.likes + 1;
    }

    public FacebookPost (){
    }
    public FacebookPost (String userPosted,String userPostPublished){
        this.userPosted = userPosted;
        this.userPostPublished = userPostPublished;
    }

    public void dislikes(){
        if (this.likes>=0){
            this.likes = this.likes - 1;
        }else {
            this.likes = 0;
        }
    }
    public void share () {
        this.shares = this.shares + 1;
    }
    public void print (){
        System.out.println(this.userPosted + " >>> " + this.userPostPublished);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | " + "Shares " +this.shares);
    }
}
