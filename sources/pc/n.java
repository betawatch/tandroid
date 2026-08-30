package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        jVar.o(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.w);
    }
}
