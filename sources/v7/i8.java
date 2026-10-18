package v7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
