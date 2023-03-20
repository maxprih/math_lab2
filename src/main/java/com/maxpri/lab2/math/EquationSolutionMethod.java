package com.maxpri.lab2.math;

import com.maxpri.lab2.dto.AnswerEquation;
import com.maxpri.lab2.dto.InputData;
import com.maxpri.lab2.equation.Equation;

public interface EquationSolutionMethod {

    AnswerEquation solveEquation(Equation equation, InputData interval);

}
