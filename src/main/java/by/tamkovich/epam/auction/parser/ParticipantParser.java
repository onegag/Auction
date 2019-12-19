package by.tamkovich.epam.auction.parser;

import by.tamkovich.epam.auction.entity.Participant;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ParticipantParser {
    private static Logger logger = LogManager.getLogger();

    public List<Participant> readJson(String jsonLocation) {
        ObjectMapper mapper = new ObjectMapper();
        List<Participant> participants = Collections.emptyList();
        try {
            participants = mapper.readValue(new File(jsonLocation), new TypeReference<List<Participant>>() {
            });
        } catch (IOException e) {
            logger.error("Reading exception "+jsonLocation+" file", e);
        }
        return participants;
    }
}
