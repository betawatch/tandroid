package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.C0);
        if (g10.length() > 0) {
            kVar.i.k(g10);
        } else {
            kVar.i.n = true;
        }
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.j((char) 65533);
            return;
        }
        if (d == '\"') {
            kVar.c = a2.a0;
            return;
        }
        if (d != '&') {
            if (d != 65535) {
                kVar.i.j(d);
                return;
            } else {
                kVar.l(this);
                kVar.c = a2.a;
                return;
            }
        }
        int[] c3 = kVar.c('\"', true);
        if (c3 != null) {
            kVar.i.m(c3);
        } else {
            kVar.i.j('&');
        }
    }
}
