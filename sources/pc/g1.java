package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        if (aVar.o()) {
            fVar.c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.c.append((char) 65533);
            return;
        }
        if (d != ' ') {
            v vVar = a2.a;
            if (d == '>') {
                kVar.j();
                kVar.c = vVar;
                return;
            }
            if (d == 65535) {
                kVar.l(this);
                fVar.getClass();
                kVar.j();
                kVar.c = vVar;
                return;
            }
            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                fVar.c.append(d);
                return;
            }
        }
        kVar.c = a2.n0;
    }
}
