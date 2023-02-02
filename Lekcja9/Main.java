package Lekcja9;

public class Main {
    public static void main(String[] args) {
        //stringPoolExample();
        //compareToExample();
        //concatExample();
        //contatinsExample();
        //endsWithExample();
        //equalsExample();
        //indexOfExample();
        //blankEmptyExample();
        //repeatExample();
        //replaceExample();
        //splitExample();
        //substringExample();
        //caseExample();
        //trimExample();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        System.out.println(stringBuilder);
        stringBuilder.append("b");
        System.out.println(stringBuilder);
        stringBuilder.append("c");
        System.out.println(stringBuilder);
        stringBuilder.append("de");
        System.out.println(stringBuilder);

    }


    private static void trimExample() {
        String s = "    Lol    ";
        String s1 = "    L  o  l    ";
        String s2 = "    L \n o  l    ";
        System.out.println("'" + s.trim() + "'");
        System.out.println("'" + s1.trim() + "'");
        System.out.println("'" + s2.trim() + "'");
    }

    private static void caseExample() {
        String s = "PaSiBuS";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }

    private static void splitExample() {

        String string = "lol,xD,rofl,lmao";
        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

    private static void replaceExample() {
        System.out.println("Boom".replace('o', 'u'));
        System.out.println("Boom".replace("oo", "u"));
        System.out.println("Boomoo".replace("oo", "u"));

    }

    private static void repeatExample() {
        System.out.println("XD".repeat(3));
    }

    private static void blankEmptyExample() {
        String blank = "   \n ";
        String empty = "";
        String notBlank = "XD";

        System.out.println("String: '" + blank + "' is empty:" + blank.isEmpty());
        System.out.println("String: '" + blank + "' is blank:" + blank.isBlank());
        System.out.println("String: '" + empty + "' is empty:" + empty.isEmpty());
        System.out.println("String: '" + empty + "' is blank:" + empty.isBlank());
        System.out.println("String: '" + notBlank + "' is empty:" + notBlank.isEmpty());
        System.out.println("String: '" + notBlank + "' is blank:" + notBlank.isBlank());
    }

    private static void indexOfExample() {
        System.out.println("abcdddef".indexOf('d'));
    }

    private static void equalsExample() {
        System.out.println("nanana".equals("NANANA"));
        System.out.println("naNana".equalsIgnoreCase("NaNANA"));
    }

    private static void endsWithExample() {
        String string = "NANANAfinish";
        System.out.println(string.endsWith("finish"));
        System.out.println(string.endsWith("Finish"));
        System.out.println(string.endsWith("fish"));
    }


    private static void stringPoolExample() {
        String string1 = "A";
        String string2 = new String("A");
        System.out.println(string1 == "A");
        System.out.println(string1 == string2);


    }


    private static void compareToExample() {
        System.out.println("c".compareTo("b"));
        System.out.println("a".compareTo("c"));
    }

    private static void concatExample() {
        String string = "Conti";
        string.concat("nue");
        System.out.println(string);
        String concatenatedString = string.concat("nue");
        System.out.println(concatenatedString);
    }

    private static void contatinsExample() {
        String string = "nananaxDnana";
        System.out.println(string.contains("lol"));
        System.out.println(string.contains("nax"));
        System.out.println(string.contains("naX".toLowerCase()));
        System.out.println(string.contains("naX"));
    }

    private static void substringExample() {
        String s = "0123456789";
        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9));
        System.out.println(s.substring(4, 11));
    }
}