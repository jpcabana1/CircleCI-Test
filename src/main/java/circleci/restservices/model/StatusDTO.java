package circleci.restservices.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusDTO implements Serializable {

    @JsonProperty("code")
    private Integer code;

    @JsonProperty("message")
    private String message;

}
