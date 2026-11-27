// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
