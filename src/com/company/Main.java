package com.company;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();

        File engText = new File("sampleEng.txt");
        File translateToMorze = new File("engToMorze.txt");
        File translateToEng = new File("morzeToEng.txt");

        String engTextFromFile = translator.readFromFile(engText);
        translator.englishToMorze(engTextFromFile, translateToMorze);
        String engMorzeString = translator.readFromFile(translateToMorze);
        translator.morzeToEnglish(engMorzeString, translateToEng);


    }
}
