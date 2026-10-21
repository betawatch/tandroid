package v7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
