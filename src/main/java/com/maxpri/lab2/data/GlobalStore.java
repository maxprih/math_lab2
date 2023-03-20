package com.maxpri.lab2.data;

import com.maxpri.lab2.dto.BigInterval;
import com.maxpri.lab2.dto.InputData;
import com.maxpri.lab2.equation.Equation;
import com.maxpri.lab2.math.EquationSolutionMethod;
import com.maxpri.lab2.system.SystemTask;

import java.util.List;

/**
 * @author max_pri
 */
public class GlobalStore {
    public static Equation equation;
    public static InputData data;
    public static EquationSolutionMethod method;
    public static DataWorker dataWorker;
    public static BigInterval interval;
    public static List<InputData> intervals;
    public static SystemTask system;
    public static boolean isSystem;
}
