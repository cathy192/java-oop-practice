package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DealerTest {

    @Test
    @DisplayName("카드 합에 따라 뽑을 지 안뽑을지 테스트")
    @ParameterizedTest
    @ValueSource(ints= {13,34,543,534,5,43})
    public void pickTest(int sum){

    }
}
