import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javalite.activejdbc.Base;

import java.util.List;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        LexiqueQuerier lex = LexiqueQuerier.getInstance();
        List<Word> words = lex.findAll("abaissement", false);
        log.error(lex.count() + " words in the Lexicon");
        for (Word w: words) {
            log.error(w.toString());
        }

        Word w = lex.findFirst("personne", false);
        log.error(w.toString());
        lex.close();
    }
}
