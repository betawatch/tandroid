package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum z0 extends a2 {
    public z0() {
        super("Comment", 46);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        e eVar = kVar.n;
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            eVar.c.append((char) 65533);
        } else if (i10 == '-') {
            kVar.a(a2.k0);
        } else {
            if (i10 != 65535) {
                eVar.c.append(aVar.g('-', 0));
                return;
            }
            kVar.l(this);
            kVar.i();
            kVar.c = a2.a;
        }
    }
}
