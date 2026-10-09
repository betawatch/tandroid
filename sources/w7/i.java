package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class i {
    public static final Object a(Task task, ld.c cVar) {
        if (!task.isComplete()) {
            ae.m mVar = new ae.m(1, h.b(cVar));
            mVar.s();
            task.addOnCompleteListener(ke.a.a, new pb.c(mVar, 28));
            Object r10 = mVar.r();
            kd.a aVar = kd.a.a;
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
