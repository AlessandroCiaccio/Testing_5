import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    private final Main testing=new Main();

    @Test
    void changeData1() {
        String data = testing.changeData(OffsetDateTime.parse("2012-06-30T13:00:00Z"));
        assertEquals("giovedì 6 giugno 2013",data);
    }
    @Test
    void changeData2() {
        String data = testing.changeData(OffsetDateTime.parse("1999-12-20T13:00:00Z"));
        assertEquals("lunedì 27 novembre 2000",data);
    }
    @Test
    void changeData3() {
        String data = testing.changeData(OffsetDateTime.parse("1999-01-24T13:00:00Z"));
        assertEquals("venerdì 31 dicembre 1999",data);
    }
    @Test
    void changeData4() {
        String data = testing.changeData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("giovedì 8 febbraio 2024",data);
    }
    @Test
    void nullCase(){
        String data=null;
        assertNull(data,"La data è null");
    }
}