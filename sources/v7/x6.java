package v7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class x6 {
    public static final Object a(Task task, ed.c cVar) {
        if (!task.isComplete()) {
            td.m mVar = new td.m(1, w6.b(cVar));
            mVar.s();
            task.addOnCompleteListener(de.a.a, new a6.i(mVar, 19));
            Object r10 = mVar.r();
            dd.a aVar = dd.a.a;
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
