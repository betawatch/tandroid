package v7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class i7 {
    public static void a(rd.p pVar, zd.a aVar, zd.a aVar2) {
        try {
            ee.a.g(gd.i.a, w7.g.b(w7.g.a(aVar, aVar2, pVar)));
        } catch (Throwable th2) {
            aVar2.resumeWith(u7.a(th2));
            throw th2;
        }
    }
}
