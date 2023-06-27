import java.util.HashMap;

class RnaTranscription {

    private HashMap<Character, Character> transcribeDictionary;

    public RnaTranscription() {
        this.transcribeDictionary = new HashMap<>();
        this.setTranscribeDictionary();
    }

    String transcribe(String dnaStrand) {

        if(dnaStrand.isEmpty()) {
            return "";
        }
        StringBuilder transcribed = new StringBuilder();

        for (int index = 0; index < dnaStrand.length(); index++) {
            char dnaKey = dnaStrand.charAt(index);
            Character rnaKey = transcribeDictionary.get(dnaKey);
            appendTranscribedKey(transcribed, rnaKey);
        }

        String transcribedString = transcribed.toString();
        return transcribedString;
    }

    private static void appendTranscribedKey(StringBuilder transcribed, Character rnaKey) {
        transcribed.append(rnaKey);
    }

    private void setTranscribeDictionary() {
        transcribeDictionary.put('G', 'C');
        transcribeDictionary.put('C', 'G');
        transcribeDictionary.put('T', 'A');
        transcribeDictionary.put('A', 'U');
    }


}
