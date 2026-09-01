package sa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q extends pa.u {
    public static final p b = new p(new q(pa.t.b), 0);
    public final pa.t a;

    public q(pa.t tVar) {
        this.a = tVar;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        int c3 = m1.j.c(x10);
        if (c3 == 5 || c3 == 6) {
            return this.a.a(aVar);
        }
        if (c3 == 8) {
            aVar.t();
            return null;
        }
        throw new pa.j("Expecting number, got: " + w.c.m(x10) + "; at path " + aVar.h());
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
