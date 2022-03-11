import com.zgf.pojo.Books;
import com.zgf.service.BooksService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyTest {
    @Autowired
    private BooksService booksService;
    @Test
    public void MyTest(){
        List<Books> all = booksService.getAll();
        for (Books books : all) {
            System.out.println(books);
        }
    }
}
