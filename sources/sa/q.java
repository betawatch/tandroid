package sa;

import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int b10 = m1.j.b(x10);
        if (b10 == 5 || b10 == 6) {
            return this.a.a(aVar);
        }
        if (b10 == 8) {
            aVar.t();
            return null;
        }
        throw new pa.j("Expecting number, got: " + v2.m(x10) + "; at path " + aVar.h());
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
