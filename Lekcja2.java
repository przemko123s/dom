import java.sql.SQLOutput;

public class Lekcja2 {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;

        float f;
        double d;

        boolean aBoolean;
        char c = 'r';
        testByte(); //-ea trzeba dodac bo zle pokazuje

    }

    private static void test1() {
        //given
        int int1 = 1;
        int int2 = 2;
        int expectedResult = 3;
        //when
        int result = int1 + int2;
        //then
        assert result == expectedResult;
        //gdy nic nam nie wyswietla tzn ze test przeszedl i jest super
    }

    private static void test4() { // test stringow
        //given
        String s = "kupa";
        int b = 0;
        String expectedresult = "=-15";
        //when
        String result = s + b;
        //then
        assert result == expectedresult : "Error! result+ " + result + " is not equal to expected:" + expectedresult;

    }

    private static void test2() {
        //given
        int int1 = 1;
        int int2 = -2;
        int expectedResult = 322;
        //when
        int result = int1 + int2;
        //then
        assert result == expectedResult;
        //gdy nic nam nie wyswietla tzn ze test przeszedl i jest super
    }

    private static void testByte() {
        //given
        byte byte1 = 127;
        byte byte2 = 1;
        int expectedResult = 133;
        //when
        int result = byte1 + byte2;
        //then
        assert result == expectedResult;
        //gdy nic nam nie wyswietla tzn ze test przeszedl i jest super
    }
}
