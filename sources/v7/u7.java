package v7;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
