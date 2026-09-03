package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.d.append((char) 65533);
            return;
        }
        if (d == '\'') {
            kVar.c = a2.s0;
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
