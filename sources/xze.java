// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class xze {
    public static final Object a(Task task, nq5 nq5Var) {
        if (!task.isComplete()) {
            va1 va1Var = new va1(1, xpe.a(nq5Var));
            va1Var.s();
            task.addOnCompleteListener(no3.b, new i09(va1Var, (byte) 18));
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
