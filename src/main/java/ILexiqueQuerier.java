import java.util.List;

/**
 * TODO.
 */
public interface ILexiqueQuerier {

    /**
     * TODO.
     */
    void initialize();
    /**
     * TODO.
     */
    void close();
    /**
     * TODO.
     */
    List<Word> findAll(String term, boolean accents);
    /**
     * TODO.
     */
    Word findFirst(String term, boolean accents);
    /**
     * TODO.
     */
    Long count();
}
