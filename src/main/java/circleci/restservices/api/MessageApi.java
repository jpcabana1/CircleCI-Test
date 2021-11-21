package circleci.restservices.api;

import circleci.restservices.model.MessageDTO;
import circleci.restservices.model.StatusDTO;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@RequestMapping(value = "/message")
public interface MessageApi {

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created", response = StatusDTO.class),
            @ApiResponse(code = 400, message = "Bad Request", response = StatusDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = StatusDTO.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = StatusDTO.class)
    })
    @PostMapping(value = "/new", produces = {"application/json"})
    ResponseEntity<StatusDTO> createMessage(@RequestParam("message") @NotNull @Validated String message);


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = StatusDTO.class),
            @ApiResponse(code = 400, message = "Bad Request", response = StatusDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = StatusDTO.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = StatusDTO.class)
    })
    @GetMapping(value = "/", produces = {"application/json"})
    ResponseEntity<List<MessageDTO>> getAllMessages();

}
