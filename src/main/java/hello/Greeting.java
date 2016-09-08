package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

    private final String content;
    private final long greetingId;

    @JsonCreator
    public Greeting(@JsonProperty("id") long id,
            @JsonProperty("content") String content) {

        this.greetingId = id;
        this.content = content;
    }

    @JsonProperty("id")
    public long getGreetingId() {
        return greetingId;
    }

    public String getContent() {
        return content;
    }
}
