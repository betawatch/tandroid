package v7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class e5 {
    public static c0.l a(c0.j jVar) {
        c0.i iVar = new c0.i();
        iVar.c = new c0.m();
        c0.l lVar = new c0.l(iVar);
        iVar.b = lVar;
        iVar.a = jVar.getClass();
        try {
            iVar.a = jVar.d(iVar);
            return lVar;
        } catch (Exception e) {
            lVar.b.l(e);
            return lVar;
        }
    }
}
