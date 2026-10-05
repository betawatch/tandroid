package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class h {
    public static final Object a(Task task, kd.c cVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, g.b(cVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new je.b(mVar));
            Object r10 = mVar.r();
            jd.a aVar = jd.a.a;
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
