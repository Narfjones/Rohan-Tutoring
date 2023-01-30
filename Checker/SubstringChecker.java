class SubstringChecker implements Checker {
    
    String subString;

    public SubstringChecker(String word) {
        subString = word;
    }

    public boolean accept(String text){
        String wholeString = text;

        boolean acc = wholeString.contains(subString);

        System.out.println(acc);

        return true;
    }
}
