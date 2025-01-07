# UnitTest-L1
## Dưới đây là một bài tập kiểm thử nâng cao với JUnit, áp dụng cho một số thuật toán thông dụng với các cấu trúc điều khiển và kiểu dữ liệu phong phú.

**Đề bài:**
Viết một lớp Java có tên StringUtils với các phương thức sau:

reverse(String input): Trả về chuỗi đảo ngược của chuỗi đầu vào.

isPalindrome(String input): Kiểm tra xem chuỗi đầu vào có phải là palindrome hay không (bỏ qua khoảng trắng, chữ hoa và chữ thường).

countVowels(String input): Trả về số lượng nguyên âm (a, e, i, o, u) trong chuỗi đầu vào.

Tiếp theo, viết các bài kiểm thử đơn vị cho lớp StringUtils.

**Yêu cầu:**
Viết lớp StringUtils với các phương thức trên.
Viết lớp kiểm thử đơn vị StringUtilsTest sử dụng JUnit để kiểm tra:
Các trường hợp thông thường.
Các trường hợp đặc biệt (chuỗi rỗng, chuỗi chỉ chứa ký tự đặc biệt, v.v.).

---

**Hướng dẫn giải:**
Lớp StringUtils:
```java
public class StringUtils {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("[\\W_]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public int countVowels(String input) {
        if (input == null) return 0;
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
```

---

Lớp kiểm thử StringUtilsTest:
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", utils.reverse("abcd"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null));
        assertEquals("!dlroW ,olleH", utils.reverse("Hello, World!"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(utils.isPalindrome("Noon"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome(null));
        assertTrue(utils.isPalindrome("  "));
    }

    @Test
    void testCountVowels() {
        assertEquals(5, utils.countVowels("Educative"));
        assertEquals(0, utils.countVowels(""));
        assertEquals(0, utils.countVowels("1234"));
        assertEquals(4, utils.countVowels("aeiou"));
        assertEquals(0, utils.countVowels(null));
    }
}
```

---

**Hướng dẫn chạy:**
Cài đặt JUnit 5 trong dự án của bạn.
Tạo hai tệp Java:
StringUtils.java chứa các phương thức.
StringUtilsTest.java chứa các bài kiểm thử đơn vị.
Sử dụng IDE hoặc công cụ dòng lệnh để chạy kiểm thử.

---

**Kết quả:**

![image](https://github.com/user-attachments/assets/b8971180-f167-451c-b226-ab0dc1d85bc0)

![image](https://github.com/user-attachments/assets/d129eea3-b570-454a-b9e1-c2be416d177f)

---

**Link Chat GPT tham khảo:**

[ChatGPT](https://chatgpt.com/share/677c9a33-ff38-8013-abb5-adc782195e8c)
