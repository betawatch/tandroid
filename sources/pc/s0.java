package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.E0);
        if (h.length() > 0) {
            kVar.i.l(h);
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.k((char) 65533);
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '`') {
                v vVar = a2.a;
                if (d == 65535) {
                    kVar.l(this);
                    kVar.c = vVar;
                    return;
                }
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    if (d == '&') {
                        int[] c3 = kVar.c('>', true);
                        if (c3 != null) {
                            kVar.i.m(c3);
                            return;
                        } else {
                            kVar.i.k('&');
                            return;
                        }
                    }
                    if (d != '\'') {
                        switch (d) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                kVar.k();
                                kVar.c = vVar;
                                break;
                            default:
                                kVar.i.k(d);
                                break;
                        }
                        return;
                    }
                }
            }
            kVar.m(this);
            kVar.i.k(d);
            return;
        }
        kVar.c = a2.T;
    }
}
