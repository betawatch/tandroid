package v7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
