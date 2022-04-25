package String;

public class HomeWork {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        System.out.println("length    " + a.length());
        System.out.println(a.charAt(a.length() - 1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.contains("Java"));
        System.out.println(a.lastIndexOf("Java"));
        System.out.println(a.replace("a", "o"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0, 7));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        HomeWork vivod = new HomeWork();
        vivod.smallWord();
    }

    private void Polydrome() {
        String a = "манекенам украл одежду";
        String[] words = a.split(" ");
        for (String word : words) {
            int c = 0 ;
            int b = word.length();
            for (int i = 0; i < (b / 2); i++) {
                if(word.charAt(i) != word.charAt(b - 1 - i)){
                    break;
                } else {
                    c ++ ;
                }
                if (c+1 > b/2) {
                    System.out.println("слово полиндром   " + word);
                }
            }
        }
    }

    private void second() {
        String a = "манекенам укр одежду";
        String[] words = a.split(" ");
        for (String word : words) {
            int b = word.length();
                if (3 <= b && b <= 5) {
                    System.out.println(word);
                }
            }
        }

    private void smallWord() {
        String a = "манекенам укр одежду";
        String[] words = a.split(" ");
        int numberLetters = 100 ;
        for (String word : words) {
            if (word.length() < numberLetters) {
                numberLetters = word.length();
            }
            return ;
        }
    }
}


