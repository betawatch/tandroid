package sb;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import k9.u;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f {
    public static final Object b = new Object();
    public static f c;
    public final y a;

    public f(Looper looper) {
        y yVar = new y(looper);
        Looper.getMainLooper();
        this.a = yVar;
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
        m.a.execute(new u(27, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
