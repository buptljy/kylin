package com.kylinolap.job2;

import com.kylinolap.job2.dao.JobOutputPO;
import com.kylinolap.job2.dao.JobPO;
import com.kylinolap.job2.exception.ExecuteException;
import com.kylinolap.job2.execution.ExecutableContext;
import com.kylinolap.job2.execution.ExecuteResult;

/**
 * Created by qianzhou on 12/22/14.
 */
public class FailedTestExecutable extends BaseTestExecutable {

    public FailedTestExecutable() {
    }

    public FailedTestExecutable(JobPO job) {
        super(job);
    }

    @Override
    protected ExecuteResult doWork(ExecutableContext context) throws ExecuteException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return new ExecuteResult(ExecuteResult.State.FAILED, "failed");
    }
}
