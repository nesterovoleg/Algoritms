import org.example.Regex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRegex {
    @Test
    public void testPhone() {
        Regex number = new Regex();
        Assertions.assertTrue(number.telephoneNumber("(+380)98-434-04-64"));
        Assertions.assertTrue(number.telephoneNumber("(+380)14-617-46-55"));
        Assertions.assertFalse(number.telephoneNumber("(+380)342342343"));
        Assertions.assertFalse(number.telephoneNumber("0152352355"));
        Assertions.assertTrue(number.telephoneNumber("(+380)31-525-17-00"));
        Assertions.assertFalse(number.telephoneNumber("ssfsdfsdbs"));
        Assertions.assertFalse(number.telephoneNumber(" 380 50 531 13 44"));
        Assertions.assertTrue(number.telephoneNumber("(+380)55-555-55-55"));
    }

    @Test
    public void testBlank() {
        Regex str = new Regex();
        Assertions.assertEquals("Я хочу бути програмістом",str.replaceBlanks("Я хочу  бути     програмістом"));
    }

    @Test
    public void testHtml() {
        Regex str = new Regex();
        String correctStr = "\n" + "Символы круглых скобок '(' и ')'. Эти символы\n" + "позволяют получить из искомой строки дополнительную информацию.\n"
                + "Обычно, если парсер регулярных выражений ищет в тексте информацию\n" + "по заданному выражению и находит ее - он просто возвращает\n"
                + "найденную строку.\n" + "А вот тут ссылка, чтоб жизнь медом не казалась.\n" + "";
        Assertions.assertEquals(correctStr,str.replaceHtml("<div>\n" +
                "<p>Символы круглых скобок <code>'('</code> и <code>')'</code>. Эти символы\n" +
                "позволяют получить из искомой строки дополнительную информацию.\n" +
                "<br/>Обычно, если парсер регулярных выражений ищет в тексте информацию\n" +
                "по заданному выражению и находит ее - он просто возвращает\n" +
                "найденную строку.</p>\n" +
                "<p align=\"right\">А вот тут <a href=\"google.com\">ссылка</a>, чтоб жизнь медом не казалась.</p>\n" +
                "</div>"));
    }
}
