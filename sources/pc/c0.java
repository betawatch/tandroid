package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public enum c0 extends a2 {
    public c0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.o()) {
            kVar.g("</");
            kVar.c = a2.H;
            return;
        }
        kVar.d(false);
        j jVar = kVar.i;
        char i10 = aVar.i();
        jVar.getClass();
        jVar.n(String.valueOf(i10));
        kVar.h.append(aVar.i());
        kVar.a(a2.M);
    }
}
