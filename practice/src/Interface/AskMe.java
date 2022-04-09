/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interface;

import java.util.Random;

class Question implements SharedConstants {

    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        } else {
            return NEVER;
        }
    }
}

public class AskMe implements SharedConstants {

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }

    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
        }
    }
}
