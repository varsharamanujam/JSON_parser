import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class complex_jackson_copy {
    public static void main(String[] args) {
        {
            try{
                final ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                File file = new File("D:\\Users\\vsuresh\\Desktop\\New folder\\src\\main\\resources\\CA_category_id.json");
                category_copy category_copy = objectMapper.readValue(file, category_copy.class);

                //System.out.println(category_copy.items.get(0).snippet.title);
                category_copy.itemarr.stream().map(x->x).forEach(y->System.out.println(y.snippet.title+"\n"));

                //System.out.println(category_copy.itemarr.get(0).snippet.title);




            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

