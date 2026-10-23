package v7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
