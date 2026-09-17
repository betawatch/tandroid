package v7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class u8 {
    public static final Object a(Task task, kd.c cVar) {
        if (!task.isComplete()) {
            zd.m mVar = new zd.m(1, t8.b(cVar));
            mVar.s();
            task.addOnCompleteListener(je.a.a, new a4.m(mVar, 27));
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
