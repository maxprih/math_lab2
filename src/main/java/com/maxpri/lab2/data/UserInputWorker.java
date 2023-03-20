package com.maxpri.lab2.data;

import com.maxpri.lab2.console.Messages;
import com.maxpri.lab2.dto.BigInterval;
import com.maxpri.lab2.exception.BadValueException;
import com.maxpri.lab2.exception.DumbException;
import com.maxpri.lab2.exception.ParsingException;

import java.util.Scanner;

public class UserInputWorker implements DataWorker {
    private Scanner in = new Scanner(System.in);
    private double left;
    private double right;

    @Override
    public BigInterval readInterval() {

        boolean flag = false;

        do {
            try {
                readLeftInterval();
                readRightInterval();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Messages.tryAgainMessage();
                continue;
            }
            flag = true;

        } while (!flag);

        return new BigInterval(left, right);
    }

    private void readLeftInterval() throws ParsingException, BadValueException {

        Messages.inputLeftIntervalMessage();

        String answer = in.nextLine().trim();
        try {
            left = Double.parseDouble(answer);
        } catch (Exception e) {
            throw new ParsingException();
        }

        if (left > 100 || left < -100) {
            throw new BadValueException();
        }

    }

    private void readRightInterval() throws ParsingException, DumbException, BadValueException {

        Messages.inputRightIntervalMessage();

        String answer = in.nextLine().trim();
        try {
            right = Double.parseDouble(answer);
        } catch (Exception e) {
            throw new ParsingException();
        }

        if (right <= left) {
            throw new DumbException();
        }

        if (right > 100 || right < -100) {
            throw new BadValueException();
        }

    }
}
