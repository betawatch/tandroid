package v7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
