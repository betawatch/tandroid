package ud;

import ad.f;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            a2 = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            a2 = l9.b.a(th2);
        }
        if (a2 instanceof f) {
            a2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
