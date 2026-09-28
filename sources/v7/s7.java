package v7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class s7 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.i.e(th2, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = md.a.a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }
}
