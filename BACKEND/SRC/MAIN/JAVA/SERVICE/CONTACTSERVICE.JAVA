package SERVICE;

import MODEL.CONTACTMESSAGE;
import REPOSITORY.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public CONTACTMESSAGE saveMessage(CONTACTMESSAGE message) {
        return contactMessageRepository.save(message);
    }

    public List<CONTACTMESSAGE> getAllMessages() {
        return contactMessageRepository.findAll();
    }
}
