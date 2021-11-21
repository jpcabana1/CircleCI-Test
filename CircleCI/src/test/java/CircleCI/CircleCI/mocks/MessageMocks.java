package CircleCI.CircleCI.mocks;

import CircleCI.CircleCI.model.MessageDTO;


import java.util.ArrayList;
import java.util.List;

public class MessageMocks {

    private static final String MESSAGE = "MESSAGE ";


    public static List<MessageDTO> stubMessages(){
        List<MessageDTO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(MessageDTO.builder().id(Long.valueOf(i)).message(MESSAGE + i).build());
        }
        return list;
    }

}
