package qb;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class f {
    public static final Object b = new Object();
    public static f c;
    public final c0 a;

    public f(Looper looper) {
        c0 c0Var = new c0(looper);
        Looper.getMainLooper();
        this.a = c0Var;
    }

    public static f a() {
        f fVar;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new f(handlerThread.getLooper());
                }
                fVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.a.execute(new i9.s(25, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
