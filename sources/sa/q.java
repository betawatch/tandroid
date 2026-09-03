package sa;

import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        throw new pa.j("Expecting number, got: " + w2.m(x10) + "; at path " + aVar.h());
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
