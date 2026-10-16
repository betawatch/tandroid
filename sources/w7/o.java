package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class o {
    public static final Object a(Task task, md.c cVar) {
        if (!task.isComplete()) {
            be.m mVar = new be.m(1, n.b(cVar));
            mVar.s();
            task.addOnCompleteListener(le.a.a, new ji.h5(mVar, 4));
            Object r10 = mVar.r();
            ld.a aVar = ld.a.a;
            return r10;
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
