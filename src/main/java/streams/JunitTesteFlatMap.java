package streams;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class JunitTesteFlatMap {
    @Test
    public void testeMapComOptional(){
        Optional<String> s = Optional.of("test");
        assertEquals(Optional.of("TEST"), s.map(String::toUpperCase));
    }

    @Test
    public void testeMapComOptionalDentroDeOprtional(){
        assertEquals(Optional.of(Optional.of("STRING")),
                Optional.of("string")
                        .map(s -> Optional.of("STRING")));
    }

    @Test
    public void testeFlatMapComOptionalDentroDeOprtional(){
        assertEquals(Optional.of("string"), Optional
                .of("string")
                .flatMap(s -> Optional.of("string")));
    }
}
