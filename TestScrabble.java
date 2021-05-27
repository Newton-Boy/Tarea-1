import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.asserEquals;
public class TestScrabble {
    private StringScrabble sType;
    private BoolScrabble bType;
    private NumberScrabble fType;
    private NumberScrabble iType;
    private NumberScrabble biType;
    @BeforeEach
    public void setUp(){
        sType=new StringScrabble("Hola");
        bType= new BoolScrabble(true);
        fType= new FloatScrabble(2.4);
        iType= new IntScrabble(23);
        biType= new BinaryScrabble("00000010");
    }
    public boolean assertEquals(String l1, String l2){
        return(l1.equals(l2));
    }

    @Test
    void TestString(){
        String expected="Hola";
        assertEquals(expected,sType.toString());
    }
    @Test public void TestBool(){
        String expected="true";
        assertEquals(expected,bType.toString());
    }
    @Test public void TestFloat(){
        String expected="2.4";
        assertEquals(expected,fType.toString());
    }
    @Test public void TestInteger(){
        String expected="23";
        assertEquals(expected,iType.toString());
    }
    @Test public void TestBinary(){
        String expected="00000010";
        assertEquals(expected,biType.toString());
    }
    @Test public void TestStringScToStringSc(){
        StringScrabble expected= new StringScrabble("Hola");
        StringScrabble newString= toStringSc(sType);
        assertEquals(expected,newString);
    }
    @Test public void TestBoolToStringSc(){
        StringScrabble expected= new StringScrabble("true");
        StringScrabble newString= toStringSc(bType);
        assertEquals(expected,newString);
    }
    @Test public void TestFloatToStringSc(){
        StringScrabble expected= new StringScrabble("2.4");
        StringScrabble newString= toStringSc(fType);
        assertEquals(expected,newString);
    }
    @Test public void TestIntScToStringSc(){
        StringScrabble expected= new StringScrabble("23");
        StringScrabble newString= toStringSc(iType);
        assertEquals(expected,newString);
    }
    @Test public void TestBinaryToStringSc(){
        StringScrabble expected= new StringScrabble("00000010");
        StringScrabble newString= toStringSc(biType);
        assertEquals(expected,newString);
    }
    @Test public void TestBoolToBool(){
        BoolScrabble expected= new BoolScrabble(true);
        BoolScrabble newBool= new toBool(bType);
        assertEquals(expected,newBool);
    }

    @Test public void TestFloatToFloat(){
        FloatScrabble expected= new FloatScrabble(2.4);
        FloatScrabble newFloat= new toFloat(fType);
        assertEquals(expected,newFloat);
    }
    @Test public void TestIntScToFloat(){
        FloatScrabble expected= new FloatScrabble(23.0);
        FloatScrabble newFloat= new toFloat(iType);
        assertEquals(expected,newFloat);
    }
    @Test public void TestBinaryToFloat(){
        FloatScrabble expected= new FloatScrabble(2.0);
        FloatScrabble newFloat= new toFloat(biType);
        assertEquals(expected,newFloat);
    }
    @Test public void TestIntScToIntSc(){
        IntScrabble expected= new IntScrabble(23);
        IntScrabble newInt= new toIntSc(iType);
        assertEquals(expected,newInt);
    }
    @Test public void TestBinaryToIntSc(){
        IntScrabble expected= new IntScrabble(2);
        IntScrabble newInt= new toIntSc(biType);
        assertEquals(expected,newInt);
    }
    @Test public void TestIntScToBinary(){
        BinaryScrabble expected= new BinaryScrabble("00010111");
        BinaryScrabble newBinary= new toBinary(iType);
        assertEquals(expected,newBinary);
    }
    @Test public void TestBinaryToBinary(){
        BinaryScrabble expected= new BinaryScrabble("00000010");
        BinaryScrabble newBinary= new toBinary(biType);
        assertEquals(expected,newBinary);
    }
}