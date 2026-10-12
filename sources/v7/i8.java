package v7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class i8 {
    public static final id.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new id.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof id.e) {
            throw ((id.e) obj).a;
        }
    }
}
