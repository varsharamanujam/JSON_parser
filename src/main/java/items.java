import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "etag",
        "id",
        "snippet"
})
public class items {
    @JsonProperty("kind")
    public String kind;
    @JsonProperty("etag")
    public String etag;
    @JsonProperty("id")
    public String id;
    @JsonProperty("snippet")
    public snippet snippet;

    public String toString(){
        return "{kind:"+kind+"\netag:"+etag+"\nid:"+id+"\nsnippet:\n"+snippet+"\n}";
    }
}
