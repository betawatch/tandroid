// default package

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
