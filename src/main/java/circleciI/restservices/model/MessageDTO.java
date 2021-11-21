package circleciI.restservices.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("message")
    private String message;

    @JsonProperty("validated")
    private Boolean validated;

}
