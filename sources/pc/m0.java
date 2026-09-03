package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            kVar.i.i((char) 65533);
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
                            kVar.i.i(d);
                            break;
                    }
                    return;
                }
            }
            kVar.m(this);
            kVar.i.i(d);
            return;
        }
        kVar.c = a2.V;
    }
}
