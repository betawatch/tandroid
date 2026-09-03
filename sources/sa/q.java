package sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
