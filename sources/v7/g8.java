package v7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class g8 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.i.e(th2, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = pd.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = od.a.a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }
}
