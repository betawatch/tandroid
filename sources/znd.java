// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
