package qa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q extends na.u {
    public static final p b = new p(new q(na.t.b), 0);
    public final na.t a;

    public q(na.t tVar) {
        this.a = tVar;
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        int x4 = aVar.x();
        int b10 = m1.j.b(x4);
        if (b10 == 5 || b10 == 6) {
            return this.a.a(aVar);
        }
        if (b10 == 8) {
            aVar.t();
            return null;
        }
        throw new na.j("Expecting number, got: " + u3.c.m(x4) + "; at path " + aVar.h());
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
