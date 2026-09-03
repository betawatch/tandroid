package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum l0 extends a2 {
    public l0() {
        super("BeforeAttributeName", 33);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.U;
        if (d == 0) {
            kVar.m(this);
            kVar.i.p();
            aVar.q();
            kVar.c = m0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    kVar.c = a2.b0;
                    return;
                }
                v vVar = a2.a;
                if (d == 65535) {
                    kVar.l(this);
                    kVar.c = vVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        kVar.k();
                        kVar.c = vVar;
                        break;
                    default:
                        kVar.i.p();
                        aVar.q();
                        kVar.c = m0Var;
                        break;
                }
                return;
            }
            kVar.m(this);
            kVar.i.p();
            kVar.i.j(d);
            kVar.c = m0Var;
        }
    }
}
