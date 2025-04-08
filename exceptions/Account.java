package exceptions;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }

    public void withdraw(float value) {
          if (value > this.balance)
              System.out.printf("");
    }
}
