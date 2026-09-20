package w7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class x8 {
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
