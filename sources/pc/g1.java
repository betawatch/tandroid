package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
