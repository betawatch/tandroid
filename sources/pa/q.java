package pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends ma.u {
    public static final p b = new p(new q(ma.t.b), 0);
    public final ma.t a;

    public q(ma.t tVar) {
        this.a = tVar;
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
        int x8 = aVar.x();
        int b10 = m1.j.b(x8);
        if (b10 == 5 || b10 == 6) {
            return this.a.a(aVar);
        }
        if (b10 == 8) {
            aVar.t();
            return null;
        }
        throw new ma.j("Expecting number, got: " + s3.c.n(x8) + "; at path " + aVar.h());
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
