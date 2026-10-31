package xc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.d.append((char) 65533);
            return;
        }
        if (d == '\'') {
            kVar.c = a2.v0;
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
            fVar.d.append(d);
            return;
        }
        kVar.l(this);
        fVar.getClass();
        kVar.j();
        kVar.c = vVar;
    }
}
