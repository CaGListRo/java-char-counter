# README: Letter Counter Program

## Overview

The LetterCounter program is a Java-based application that reads a text file and counts the occurrences of each character within the file. It handles special characters like newline (\n) and carriage return (\r) explicitly, storing their counts alongside regular characters in a TreeMap.

## How It Works

1. File Reading:
   The program reads the entire content of the file Java The Coffee of Programming Languages.txt using Files.readString().

2. Character Analysis:
   Each character is converted into a String key and stored in a TreeMap<String, Integer>.

- Special handling is implemented for newline (\n) and carriage return (\r) characters.
- Keys are assigned readable representations for \n ("\\n") and \r ("\\r").

3. Counting Logic:
   The program checks if the character (as a string key) already exists in the TreeMap:

- If it exists, the value (count) is incremented by 1.
- If it does not exist, the key is added with an initial value of 1.

4. Output:
   The TreeMap is printed to the console, showing each character and its corresponding count.

Special Features
Handles Special Characters:
Counts \n (newline) and \r (carriage return) distinctly or allows you to ignore \r based on system requirements.
Provides a readable representation for special characters in the output.
Sorted Output:
The TreeMap automatically sorts the keys alphabetically or by character code.
Requirements
Java Version: Java 11 or higher (to support Files.readString()).
Text File:
A valid text file named Java The Coffee of Programming Languages.txt should exist in the same directory as the program or the path should be updated in the Paths.get() method.

How to Run

Compile the program:
javac LetterCounter.java

Run the program:
java LetterCounter

The program will output a sorted list of characters with their counts to the console.

Output Example
For a file containing:
Hello
World
The output might look like:

java
Code kopieren
{ =1, H=1, W=1, \n=2, d=1, e=1, l=3, o=2, r=1}
Customization
Modify the File Path:
Update the Paths.get() method to point to a different text file.
Ignore Carriage Returns:
Uncomment the continue; line in the if (c == '\r') block to skip counting \r.
Known Limitations
File Size:
The entire file content is read into memory. Very large files may cause memory issues.
Encoding:
Assumes the file uses a compatible character encoding (e.g., UTF-8).
Feel free to extend or adapt the program as needed!
