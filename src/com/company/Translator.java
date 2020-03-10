package com.company;

import java.io.*;

public class Translator {
    public String readFromFile(File ToTranslate) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ToTranslate));
            String text = reader.readLine();

            while (text != null) {
                sb.append(text).append("\n");
                text = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void englishToMorze(String text, File translated) {
        String[] morzeList = Alphabet.getMorse();
        char[] engList = Alphabet.getEnglish();
        char[] letters = text.toLowerCase().toCharArray();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(translated));
            for (char symbols : letters) {
                for (int i = 0; i < engList.length; i++) {
                    if (symbols == engList[i]) {
                        writer.write(morzeList[i] + "/");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void morzeToEnglish(String text, File decodedFile) {
        String[] morzeList = Alphabet.getMorse();
        char[] alphabet = Alphabet.getEnglish();
        String[] letters = text.split("/");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(decodedFile))){
            for (String symbol : letters) {
                for (int i = 0; i < morzeList.length; i++) {
                    if (symbol.equals(morzeList[i])) {
                        writer.write(alphabet[i]);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
