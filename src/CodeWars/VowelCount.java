package CodeWars;

public class VowelCount {

    public static int vowelCount(String str) {

        int counter = 0;
        String string = str.toLowerCase();


        for (int i = 0; i < string.length(); i++) {

            switch (string.charAt(i)) {

                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
            }

        }

        return counter;
    }


    public static void main(String[] args) {


        System.out.println(vowelCount("o a kak ushakov lil vo kashu kakao"));

    }

}
