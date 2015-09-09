import org.javalite.activejdbc.Model;

/*
 * This class exists because the ActiveJDBC framework needs a class to which
 * it can cast database table rows.
 */
public class Word extends Model {

    // Define all of the Lexique column names
    public static final String SPELLING = "ortho";
    public static final String PHONETIC_TRANSCRIPTION = "phon";
    public static final String LEMMA = "lemme";
    public static final String GRAMMATICAL_CATEGORY = "cgram";
    public static final String GENDER = "genre";
    public static final String PLURALITY = "nombre";
    public static final String LEMMA_FILM_FREQUENCY = "freqlemfilms";
    public static final String LEMMA_BOOK_FREQUENCY = "freqlemlivres";
    public static final String FILM_FREQUENCY = "freqfilms";
    public static final String BOOK_FREQUENCY = "freqlivres";
    public static final String VERB_INFORMATION = "infover";
    public static final String HOMOGRAPH_COUNT = "nbhomogr";
    public static final String HOMOPHONE_COUNT = "nbhomoph";
    public static final String IS_LEMMA = "islem";
    public static final String LETTER_COUNT = "nblettres";
    public static final String PHONEME_COUNT = "nbphons";
    public static final String SPELLING_STRUCTURE = "cvcv";
    public static final String PHONOLOGICAL_STRUCTURE = "p_cvcv";
    public static final String SPELLING_NEIGHBOR_COUNT = "voisorth";
    public static final String PHONOLOGICAL_NEIGHBOR_COUNT = "voisphon";
    public static final String UNIQUENESS_LETTER_COUNT = "puorth";
    public static final String UNIQUENESS_PHONEME_COUNT = "puphon";
    public static final String SYLLABIC_STRUCTURE = "syll";
    public static final String SYLLABLE_COUNT = "nbsyll";
    public static final String SYLLABIFIED_SPELLING_STRUCTURE = "cv_cv";
    public static final String REVERSED_SPELLING = "orthrenv";
    public static final String REVERSED_PHONETIC_TRANSCRIPTION = "phonrenv";
    public static final String SYLLABIFIED_SPELLING = "orthosyll";
    public static final String POSSIBLE_GRAMMATICAL_CATEGORIES = "cgramortho";
    public static final String LEMMA_COMPREHENSION_PERCENTAGE = "deflem";
    public static final String LEMMA_COMPREHENSION_COUNT = "defobs";
    public static final String SPELLING_LEVENSHTEIN_DISTANCE = "old20";
    public static final String PHONOLOGICAL_LEVENSHTEIN_DISTANCE = "pld20";
    public static final String MORPHOLOGICAL_STRUCTURE = "morphoder";
    public static final String MORPHEME_COUNT = "nbmorph";
    public static final String TRANSLITERATED_SPELLING = "ortho_sa";
    public static final String REVERSED_TRANSLITERATED_SPELLING = "orthrenv_sa";

    public String getSpelling() {
        return this.getString(SPELLING);
    }

    public String getPhoneticTranscription() {
        return this.getString(PHONETIC_TRANSCRIPTION);
    }

    public String getLemma() {
        return this.getString(LEMMA);
    }

    public String getGrammaticalCategory() {
        return this.getString(GRAMMATICAL_CATEGORY);
    }

    public String getGender() {
        return this.getString(GENDER);
    }

    public String getPlurality() {
        return this.getString(PLURALITY);
    }

    public String getLemmaFilmFrequency() {
        return this.getString(LEMMA_FILM_FREQUENCY);
    }

    public String getLemmaBookFrequency() {
        return this.getString(LEMMA_BOOK_FREQUENCY);
    }

    public String getFilmFrequency() {
        return this.getString(FILM_FREQUENCY);
    }

    public String getBookFrequency() {
        return this.getString(BOOK_FREQUENCY);
    }

    public String getVerbInformation() {
        return this.getString(VERB_INFORMATION);
    }

    public int getHomographCount() {
        return this.getInteger(HOMOGRAPH_COUNT);
    }

    public int getHomophoneCount() {
        return this.getInteger(HOMOPHONE_COUNT);
    }

    public boolean isLemma() {
        return this.getBoolean(IS_LEMMA);
    }

    public int getLetterCount() {
        return this.getInteger(LETTER_COUNT);
    }

    public int getPhonemeCount() {
        return this.getInteger(PHONEME_COUNT);
    }

    public String getSpellingStructure() {
        return this.getString(SPELLING_STRUCTURE);
    }

    public String getPhonologicalStructure() {
        return this.getString(PHONOLOGICAL_STRUCTURE);
    }

    public int getSpellingNeighborCount() {
        return this.getInteger(SPELLING_NEIGHBOR_COUNT);
    }

    public int getPhonologicalNeighborCount() {
        return this.getInteger(PHONOLOGICAL_NEIGHBOR_COUNT);
    }

    public int getUniquenessLetterCount() {
        return this.getInteger(UNIQUENESS_LETTER_COUNT);
    }

    public int getUniquenessPhonologicalCount() {
        return this.getInteger(UNIQUENESS_PHONEME_COUNT);
    }

    public String getSyllabicStructure() {
        return this.getString(SYLLABIC_STRUCTURE);
    }

    public int getSyllableCount() {
        return this.getInteger(SYLLABLE_COUNT);
    }

    public String getSyllabifiedSpellingStructure() {
        return this.getString(SYLLABIFIED_SPELLING_STRUCTURE);
    }

    public String getReversedSpelling() {
        return this.getString(REVERSED_SPELLING);
    }

    public String getReversedPhoneticTranscription() {
        return this.getString(REVERSED_PHONETIC_TRANSCRIPTION);
    }

    public String getSyllabifiedSpelling() {
        return this.getString(SYLLABIFIED_SPELLING);
    }

    public String getPossibleGrammaticalCategories() {
        return this.getString(POSSIBLE_GRAMMATICAL_CATEGORIES);
    }

    public String getLemmaComprehensionRate() {
        return this.getString(LEMMA_COMPREHENSION_PERCENTAGE);
    }

    public String getLemmaComprehensionCount() {
        return this.getString(LEMMA_COMPREHENSION_COUNT);
    }

    public String getSpellingLevenshteinDistance() {
        return this.getString(SPELLING_LEVENSHTEIN_DISTANCE);
    }

    public String getPhonologicalLevenshteinDistance() {
        return this.getString(PHONOLOGICAL_LEVENSHTEIN_DISTANCE);
    }

    public String getMorphologicalStructure() {
        return this.getString(MORPHOLOGICAL_STRUCTURE);
    }

    public String getMorphemeCount() {
        return this.getString(MORPHEME_COUNT);
    }

    public String getTransliteratedSpelling() {
        return this.getString(TRANSLITERATED_SPELLING);
    }

    public String getReversedTransliteratedSpelling() {
        return this.getString(REVERSED_TRANSLITERATED_SPELLING);
    }

    @Override
    public String toString() {
        String s = "Word [" + getLongId() +"] | [" + getSpelling() + "]:\n";
        s += "getPhoneticTranscription --> " + getPhoneticTranscription() + "\n";
        s += "getLemma --> " + getLemma() + "\n";
        s += "getGrammaticalCategory --> " + getGrammaticalCategory() + "\n";
        s += "getGender --> " + getGender() + "\n";
        s += "getPlurality --> " + getPlurality() + "\n";
        s += "getLemmaFilmFrequency --> " + getLemmaFilmFrequency() + "\n";
        s += "getLemmaBookFrequency --> " + getLemmaBookFrequency() + "\n";
        s += "getFilmFrequency --> " + getFilmFrequency() + "\n";
        s += "getBookFrequency --> " + getBookFrequency() + "\n";
        s += "getVerbInformation --> " + getVerbInformation() + "\n";
        s += "getHomographCount --> " + getHomographCount() + "\n";
        s += "getHomophoneCount --> " + getHomophoneCount() + "\n";
        s += "isLemma --> " + isLemma() + "\n";
        s += "getLetterCount --> " + getLetterCount() + "\n";
        s += "getPhonemeCount --> " + getPhonemeCount() + "\n";
        s += "getSpellingStructure --> " + getSpellingStructure() + "\n";
        s += "getPhonologicalStructure --> " + getPhonologicalStructure() + "\n";
        s += "getSpellingNeighborCount --> " + getSpellingNeighborCount() + "\n";
        s += "getPhonologicalNeighborCount --> " + getPhonologicalNeighborCount() + "\n";
        s += "getUniquenessLetterCount --> " + getUniquenessLetterCount() + "\n";
        s += "getUniquenessPhonologicalCount --> " + getUniquenessPhonologicalCount() + "\n";
        s += "getSyllabicStructure --> " + getSyllabicStructure() + "\n";
        s += "getSyllableCount --> " + getSyllableCount() + "\n";
        s += "getSyllabifiedSpellingStructure --> " + getSyllabifiedSpellingStructure() + "\n";
        s += "getReversedSpelling --> " + getReversedSpelling() + "\n";
        s += "getReversedPhoneticTranscription --> " + getReversedPhoneticTranscription() + "\n";
        s += "getSyllabifiedSpelling --> " + getSyllabifiedSpelling() + "\n";
        s += "getPossibleGrammaticalCategories --> " + getPossibleGrammaticalCategories() + "\n";
        s += "getLemmaComprehensionRate --> " + getLemmaComprehensionRate() + "\n";
        s += "getLemmaComprehensionCount --> " + getLemmaComprehensionCount() + "\n";
        s += "getSpellingLevenshteinDistance --> " + getSpellingLevenshteinDistance() + "\n";
        s += "getPhonologicalLevenshteinDistance --> " + getPhonologicalLevenshteinDistance() + "\n";
        s += "getMorphologicalStructure --> " + getMorphologicalStructure() + "\n";
        s += "getMorphemeCount --> " + getMorphemeCount() + "\n";
        s += "getTransliteratedSpelling --> " + getTransliteratedSpelling() + "\n";
        s += "getReversedTransliteratedSpelling --> " + getReversedTransliteratedSpelling() + "\n";

        return s;
    }
}
