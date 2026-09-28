package v7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class u7 {
    public static final gd.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new gd.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof gd.e) {
            throw ((gd.e) obj).a;
        }
    }
}
