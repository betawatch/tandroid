package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum p1 extends a2 {
    public p1() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = a2.y0;
            return;
        }
        if (d == '\"') {
            kVar.m(this);
            kVar.c = a2.z0;
            return;
        }
        if (d == '\'') {
            kVar.m(this);
            kVar.c = a2.A0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (d != 65535) {
            kVar.m(this);
            fVar.getClass();
            kVar.j();
        } else {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
        }
    }
}
