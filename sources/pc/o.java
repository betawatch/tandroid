package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum o extends a2 {
    public o() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(k kVar, a aVar) {
        kVar.g("</" + kVar.h.toString());
        aVar.q();
        kVar.c = a2.c;
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            String e6 = aVar.e();
            kVar.i.n(e6);
            kVar.h.append(e6);
            return;
        }
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (kVar.n()) {
                kVar.c = a2.T;
                return;
            } else {
                e(kVar, aVar);
                return;
            }
        }
        if (d == '/') {
            if (kVar.n()) {
                kVar.c = a2.b0;
                return;
            } else {
                e(kVar, aVar);
                return;
            }
        }
        if (d != '>') {
            e(kVar, aVar);
        } else if (!kVar.n()) {
            e(kVar, aVar);
        } else {
            kVar.k();
            kVar.c = a2.a;
        }
    }
}
