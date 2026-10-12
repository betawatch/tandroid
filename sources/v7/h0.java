package v7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class h0 {
    public static c0.l a(c0.j jVar) {
        c0.i iVar = new c0.i();
        iVar.c = new c0.m();
        c0.l lVar = new c0.l(iVar);
        iVar.b = lVar;
        iVar.a = jVar.getClass();
        try {
            iVar.a = jVar.b(iVar);
            return lVar;
        } catch (Exception e) {
            lVar.b.l(e);
            return lVar;
        }
    }
}
