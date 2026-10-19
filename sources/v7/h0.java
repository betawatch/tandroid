package v7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
