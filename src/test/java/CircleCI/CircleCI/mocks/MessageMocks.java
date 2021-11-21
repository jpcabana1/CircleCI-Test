package CircleCI.CircleCI.mocks;

import CircleCI.CircleCI.model.MessageDTO;
import CircleCI.CircleCI.repository.dao.MessageDAO;


import java.util.ArrayList;
import java.util.List;

public class MessageMocks {

    public static final String MESSAGE = "MESSAGE ";


    public static List<MessageDTO> stubMessagesDTOs() {
        List<MessageDTO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(MessageDTO.builder().id((long) i).message(MESSAGE + i).build());
        }
        return list;
    }

    public static List<MessageDAO> stubMessagesEntity() {
        List<MessageDAO> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(MessageDAO.builder()
                    .id((long) i)
                    .message(MESSAGE)
                    .verified(true)
                    .build());
        }

        return list;
    }


}
