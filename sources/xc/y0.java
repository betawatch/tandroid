package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char d = aVar.d();
        z0 z0Var = a2.j0;
        if (d == 0) {
            kVar.m(this);
            eVar.c.append((char) 65533);
            kVar.c = z0Var;
            return;
        }
        if (d == '-') {
            kVar.c = a2.i0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.m(this);
            kVar.i();
            kVar.c = vVar;
        } else if (d != 65535) {
            eVar.c.append(d);
            kVar.c = z0Var;
        } else {
            kVar.l(this);
            kVar.i();
            kVar.c = vVar;
        }
    }
}
