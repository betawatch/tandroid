package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.o()) {
            kVar.g("</");
            kVar.c = a2.c;
            return;
        }
        kVar.d(false);
        j jVar = kVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.n(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.w);
    }
}
