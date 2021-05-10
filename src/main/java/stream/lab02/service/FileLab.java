package stream.lab02.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

@Data
@Builder
@AllArgsConstructor
public class FileLab {

    private String path;

    /*
        Write method which will receive a file and return number of words
     */
    @SneakyThrows
    public int countWords() {
        return new BufferedReader(new FileReader(path))
                .lines()
                .mapToInt(line -> (int) Arrays.stream(line.split("\\s+")).count())
                .sum();
    }

    /*
        Write method which will receive a file and return average length of the word
    */
    @SneakyThrows
    public double getWordsAverageLength() {
        return new BufferedReader(new FileReader(path))
                .lines()
                .flatMapToInt(line -> Arrays.stream(line.split("\\s+")).mapToInt(String::length))
                .average()
                .getAsDouble();

    }
}
