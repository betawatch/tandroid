package v7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static c0.l a(c0.j jVar) {
        c0.i iVar = new c0.i();
        iVar.c = new c0.m();
        c0.l lVar = new c0.l(iVar);
        iVar.b = lVar;
        iVar.a = jVar.getClass();
        try {
            iVar.a = jVar.a(iVar);
            return lVar;
        } catch (Exception e) {
            lVar.b.l(e);
            return lVar;
        }
    }
}
