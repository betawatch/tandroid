package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
