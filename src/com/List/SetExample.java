package com.List;

import java.io.*;
import java.util.*;

public class SetExample {
    static FileReader fr;
    static StringTokenizer st;
    static BufferedReader br;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        try {
            fr = new FileReader(".\\File1\\count.txt");
            br = new BufferedReader(fr);
            String data;
            while ((data=br.readLine()) != null) {
                String readLine = data;
                st = new StringTokenizer(readLine);
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Total count" + count);
        } catch (Throwable t) {

        } finally {
            fr.close();
            br.close();
        }
    }
}






