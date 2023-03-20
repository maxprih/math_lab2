package com.maxpri.lab2.math;

import com.maxpri.lab2.dto.AnswerSystem;
import com.maxpri.lab2.dto.BigInterval;
import com.maxpri.lab2.system.SystemTask;

public interface SystemSolutionMethod {
    AnswerSystem proceed(BigInterval interval, SystemTask system);
}
