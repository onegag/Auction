package by.tamkovich.epam.auction.parser;

import by.tamkovich.epam.auction.entity.Lot;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class LotParser {
    private static Logger logger = LogManager.getLogger();

    public List<Lot> readJson(String jsonLocation) {
        ObjectMapper mapper = new ObjectMapper();
        List<Lot> lots = Collections.emptyList();
        try {
            lots = mapper.readValue(new File(jsonLocation), new TypeReference<List<Lot>>() {
            });
        } catch (IOException e) {
            logger.error("Reading exception "+jsonLocation+" file", e);
        }
        return lots;
    }
}
