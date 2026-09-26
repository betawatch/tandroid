package v7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
