package yoon.tdd;


import lottoNumber.LottoNumber;
import lottoNumber.LottoNumbers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    void lottoNumbersTest() {
        //given
        LottoNumbers numbers = new LottoNumbers(List.of(
                new LottoNumber(1),
                new LottoNumber(8),
                new LottoNumber(42),
                new LottoNumber(9),
                new LottoNumber(23),
                new LottoNumber(11)
        ));
        //when
        List<LottoNumber> lottoNumbers = numbers.toLottoNumbers();
        //then
        assertThat(lottoNumbers).isEqualTo(List.of(
                new LottoNumber(1),
                new LottoNumber(8),
                new LottoNumber(42),
                new LottoNumber(9),
                new LottoNumber(23),
                new LottoNumber(11)
        ));
    }

    @Test
    void lottoRankingTest() {
        //given
        int bonus = 1;
        LottoNumbers me = new LottoNumbers(List.of(
                new LottoNumber(1),
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6)
        ));
        LottoNumbers winingNumbers = new LottoNumbers(List.of(
                new LottoNumber(1),
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6)
        ));
        //when
        int rank = me.checkLottoRank(winingNumbers);
        //then
        assertThat(rank).isEqualTo(1);
    }

}
