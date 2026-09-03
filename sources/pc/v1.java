package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        String c3;
        StringBuilder sb = kVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (p10 != -1) {
            c3 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c3 = a.c(cArr, strArr, i10, aVar.c - i10);
            aVar.e = aVar.c;
        }
        sb.append(c3);
        if (aVar.k("]]>") || aVar.j()) {
            String sb2 = sb.toString();
            c cVar = new c(5, 1);
            cVar.c = sb2;
            kVar.h(cVar);
            kVar.c = a2.a;
        }
    }
}
