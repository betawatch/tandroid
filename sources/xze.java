// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class xze {
    public static final Object a(Task task, nq5 nq5Var) {
        if (!task.isComplete()) {
            va1 va1Var = new va1(1, xpe.a(nq5Var));
            va1Var.s();
            task.addOnCompleteListener(no3.b, new j09(va1Var, (byte) 18));
            return va1Var.q();
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
