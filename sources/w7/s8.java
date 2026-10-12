package w7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class s8 {
    public static final Exception a(x0.a aVar, String str, Exception exc) {
        if (exc instanceof y0.a) {
            return new y0.a(aVar, str);
        }
        if (exc instanceof y0.b) {
            return new y0.b(aVar, str);
        }
        throw new z0.a();
    }
}
