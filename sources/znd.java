// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class znd {
    public static final znd c;
    public static final znd d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (rod.f) {
            d = null;
            c = null;
        } else {
            d = new znd(false, null);
            c = new znd(true, null);
        }
    }

    public znd(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
