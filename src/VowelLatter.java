public enum VowelLatter {
    VowelA('a'),
    VowelE('e'),
    VowelI('i'),
    VowelO('o'),
    VowelU('u');


    private final Character valueOfLatter;

    VowelLatter(Character valueOfLatter) {
        this.valueOfLatter = valueOfLatter;
    }

    public Character getVowelLatter() {
        return valueOfLatter;
    }
}
