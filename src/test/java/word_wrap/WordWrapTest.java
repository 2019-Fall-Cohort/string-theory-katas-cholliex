package word_wrap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class WordWrapTest {
  @Test
  public void wrapTextTest() throws Exception {
    WordWrap underTest = new WordWrap();
    String result = underTest.wrapText(4, "Cat in a hat");
    assertThat(result, equalTo("Cat \nin a\nhat"));
  }
}
