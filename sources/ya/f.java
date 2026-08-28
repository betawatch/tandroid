package ya;

import android.os.HandlerThread;
import android.os.Looper;
import c2.u0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import org.telegram.ui.fm;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public static final Object b = new Object();
    public static f c;
    public final u0 a;

    public f(Looper looper) {
        u0 u0Var = new u0(looper);
        Looper.getMainLooper();
        this.a = u0Var;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.a.execute(new fm(callable, taskCompletionSource, false, 10));
        return taskCompletionSource.getTask();
    }
}
