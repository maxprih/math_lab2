package com.maxpri.lab2.graphic;

import com.maxpri.lab2.data.GlobalStore;
import com.maxpri.lab2.dto.AnswerEquation;
import com.maxpri.lab2.dto.AnswerSystem;
import com.maxpri.lab2.math.NewtonSystemMethod;

import javax.swing.*;

/**
 * @author max_pri
 */
public class AnsEqFrame extends JFrame{
    private JPanel panel1;
    private JLabel ansLabel;

    public AnsEqFrame() {
        setContentPane(panel1);
        setTitle("Ответ");
        setSize(700, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        if (GlobalStore.isSystem) {
            NewtonSystemMethod newtonSystemMethod = new NewtonSystemMethod();
            AnswerSystem answerSystem = newtonSystemMethod.proceed(GlobalStore.interval, GlobalStore.system);
            ansLabel.setText(answerSystem.toString());
            setVisible(true);
            GraphicWorker.showSystem(answerSystem);
        }
        else {
            AnswerEquation answer = GlobalStore.method.solveEquation(GlobalStore.equation, GlobalStore.data);

            ansLabel.setText(answer.toString());

            setVisible(true);

            GraphicWorker.showEquation(answer);

        }

    }
}
