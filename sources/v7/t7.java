package v7;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class t7 {
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
