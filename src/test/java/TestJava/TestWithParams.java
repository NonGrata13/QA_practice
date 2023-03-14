package TestJava;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestWithParams {
    @ParameterizedTest
    @MethodSource("provideStringForIsBlank")
    public void someTest(String args){
        System.out.println("Testing passwords " + args);
    }
    private static Stream<Arguments> provideStringForIsBlank(){
        return Stream.of(
                Arguments.of("test "),
                Arguments.of("test 2"),
                Arguments.of("test 3")
        );
    }
}
