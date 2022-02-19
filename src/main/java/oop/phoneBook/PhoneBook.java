package oop.phoneBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PhoneBook {
    protected String owner;
    protected String[] lineNumbers;
    protected int numOfLines=0;
    private final int maxLineNumbers;

    public PhoneBook(String owner, int maxLineNumbers) {
        this.owner = owner;
        this.lineNumbers = new String[this.maxLineNumbers = maxLineNumbers];
    }

    public PhoneBook(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        this.owner = scanner.nextLine();
        this.maxLineNumbers = scanner.nextInt();

    }

    public void add(String lineNumber) {
        this.lineNumbers[numOfLines++] = lineNumber;
    }

    public void save(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(fileName));
        pw.println(this.owner);
        pw.println(this.maxLineNumbers);
        pw.println(numOfLines);
        for (int i =0 ; i < numOfLines; i++) {
            pw.println(lineNumbers[i]);
        }
        pw.close();
    }
}
