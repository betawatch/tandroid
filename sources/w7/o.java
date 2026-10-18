package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class o {
    public static final Object a(Task task, md.c cVar) {
        if (!task.isComplete()) {
            be.m mVar = new be.m(1, n.b(cVar));
            mVar.s();
            task.addOnCompleteListener(le.a.a, new le.b(mVar, 0));
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
