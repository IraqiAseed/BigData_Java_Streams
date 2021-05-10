package stream.lab02;


import stream.lab02.service.FileLab;

public class FileManager {

    public static void main(String[] args) {

        FileLab file = FileLab.builder().path("data/quotes.txt").build();

        int numberOfWords = file.countWords();

        System.out.println("number of words in file = " + numberOfWords);

        double averageLengthOfWords = file.getWordsAverageLength();

        System.out.println("average length of words in file = " + averageLengthOfWords);
    }
}
