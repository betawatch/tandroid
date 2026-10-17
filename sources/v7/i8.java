package v7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
