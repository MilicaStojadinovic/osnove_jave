package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.userPosted = "Milica Stojadinovic";
        post1.userPostPublished = "Miljana Nikolic";
        post1.text = "Srecan ti rodjendan!";
        for (int i = 0; i <125 ; i++) {
            post1.like();
        }
        for (int i = 0; i < 20; i++) {
            post1.share();
        }
        for (int i = 0; i <5 ; i++) {
            post1.dislikes();
        }
        post1.print();

    }
}
