import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "channelId",
        "title",
        "assignable",
})
public class snippet {
    @JsonProperty("channelId")
    public String channelID;
    @JsonProperty("title")
    public String title;
    @JsonProperty("assignable")
    public boolean assignable;

    public String toString(){
        return "{channel ID:"+channelID+"\nTitle:"+title+"\nAssignable:"+assignable+"}";

    }
}
