package v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class a8 {
    public static final hd.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new hd.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof hd.e) {
            throw ((hd.e) obj).a;
        }
    }
}
