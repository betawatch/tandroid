package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.D0);
        j jVar = kVar.i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.j((char) 65533);
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
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    switch (d) {
                        case '<':
                            break;
                        case '=':
                            kVar.c = a2.W;
                            break;
                        case '>':
                            kVar.k();
                            kVar.c = vVar;
                            break;
                        default:
                            kVar.i.j(d);
                            break;
                    }
                    return;
                }
            }
            kVar.m(this);
            kVar.i.j(d);
            return;
        }
        kVar.c = a2.V;
    }
}
