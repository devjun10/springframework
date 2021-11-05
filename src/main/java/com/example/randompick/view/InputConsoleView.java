package com.example.randompick.view;

import com.example.randompick.Message;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputConsoleView implements InputView {
    static Input input = new Input();
    static StringBuilder sb = new StringBuilder();
    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        public int integer() throws Exception{
            if(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }

    @Override
    public void printStartManual() {
        System.out.println(Message.QUESTION);
    }

    @Override
    public int inputGameCount() throws Exception {
        return input.integer();
    }


}
