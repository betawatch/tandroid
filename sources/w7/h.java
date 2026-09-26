package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class h {
    public static final Object a(Task task, kd.c cVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, g.b(cVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new a6.i(mVar, 28));
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
