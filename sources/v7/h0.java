package v7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
