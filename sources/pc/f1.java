package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.m0;
        if (o10) {
            fVar.h();
            kVar.c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            fVar.h();
            fVar.c.append((char) 65533);
            kVar.c = g1Var;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                kVar.l(this);
                fVar.h();
                fVar.getClass();
                kVar.j();
                kVar.c = a2.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            fVar.h();
            fVar.c.append(d);
            kVar.c = g1Var;
        }
    }
}
