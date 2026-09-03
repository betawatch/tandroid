package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum l extends a2 {
    public l() {
        super("TagName", 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r0 = pc.a.c(r2, r14.h, r0, r3 - r0);
     */
    @Override // pc.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(k kVar, a aVar) {
        char c3;
        aVar.b();
        int i10 = aVar.e;
        int i11 = aVar.c;
        char[] cArr = aVar.a;
        while (true) {
            int i12 = aVar.e;
            if (i12 >= i11 || (c3 = cArr[i12]) == '\t' || c3 == '\n' || c3 == '\r' || c3 == '\f' || c3 == ' ' || c3 == '/' || c3 == '>' || c3 == 0) {
                break;
            } else {
                aVar.e = i12 + 1;
            }
        }
        String str = "";
        kVar.i.n(str);
        char d = aVar.d();
        if (d == 0) {
            kVar.i.n(a2.F0);
            return;
        }
        if (d != ' ') {
            if (d == '/') {
                kVar.c = a2.b0;
                return;
            }
            v vVar = a2.a;
            if (d == '>') {
                kVar.k();
                kVar.c = vVar;
                return;
            }
            if (d == 65535) {
                kVar.l(this);
                kVar.c = vVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                j jVar = kVar.i;
                jVar.getClass();
                jVar.n(String.valueOf(d));
                return;
            }
        }
        kVar.c = a2.T;
    }
}
