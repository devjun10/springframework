package com.example.randompick.view;

import com.example.randompick.ErrorMessage;
import com.example.randompick.Message;
import com.example.randompick.model.Members;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class InputConsoleView implements InputView {
    private final Logger logger = Logger.getLogger(String.valueOf(InputConsoleView.class));
    Input input = new Input();

    class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }

    @Override
    public void printStartManual() {
        System.out.println(Message.QUESTION);
    }

    @Override
    public int inputGameCount() throws Exception {
        int value = Integer.MAX_VALUE;
        while (true) {
            try {
                value = input.integer();
                validateIndexRange(value);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.INVALID_TYPE);
                logger.info(e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println(ErrorMessage.INVALID_RANGE);
                logger.info(e.getMessage());
            }
        }
        return value;
    }

    public void validateIndexRange(int value) {
        if ((isInvalidRange(value))) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isInvalidRange(int value) {
        return value < 1 || value > Members.list.size();
    }
}
