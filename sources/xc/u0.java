package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.a;
        if (d == '>') {
            kVar.i.j = true;
            kVar.k();
            kVar.c = vVar;
        } else if (d == 65535) {
            kVar.l(this);
            kVar.c = vVar;
        } else {
            kVar.m(this);
            aVar.q();
            kVar.c = a2.W;
        }
    }
}
