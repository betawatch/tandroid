package xc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.o()) {
            kVar.h("</");
            kVar.c = a2.c;
            return;
        }
        kVar.d(false);
        j jVar = kVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.h(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.x);
    }
}
