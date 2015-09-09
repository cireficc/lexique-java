import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javalite.activejdbc.Base;

import java.util.List;

/**
 * TODO.
 */
public final class LexiqueQuerier implements  ILexiqueQuerier {

    /**
     * TODO.
     */
    private static LexiqueQuerier lex = new LexiqueQuerier();

    /**
     * TODO.
     */
    private static final Logger log = LogManager.getLogger(Main.class);
    /**
     * TODO.
     */
    private static final String DB_NAME = "Lexique380.db";

    /**
     * TODO.
     */
    private LexiqueQuerier() { }

    /**
     * TODO.
     */
    public static LexiqueQuerier getInstance() {
        return lex;
    }

    @Override
    public List<Word> findAll(final String term, final boolean accents) {
        List<Word> results = null;
        String likeString = "%" + term + "%";
        if (accents) {
            results = Word.find(Word.SPELLING + " like ?", likeString);
        } else {
            results = Word.find(Word.TRANSLITERATED_SPELLING + " like ?", likeString);
        }
        return results;
    }

    @Override
    public Word findFirst(final String term, final boolean accents) {
        Word result = null;
        String likeString = "%" + term + "%";
        if (accents) {
            result = Word.findFirst(Word.SPELLING + " like ?", likeString);
        } else {
            result = Word.findFirst(Word.TRANSLITERATED_SPELLING + " like ?", likeString);
        }
        return result;
    }

    @Override
    public Long count() {
        return Word.count();
    }

    @Override
    public void initialize() {
        if (!Base.hasConnection()) {
            log.error("No open connection yet... opening");
            Base.open("org.sqlite.JDBC", "jdbc:sqlite::resource:" + DB_NAME, "root", "password");
        }
    }

    @Override
    public void close() {
        log.error("Closing connection");
        Base.close();
    }
}
