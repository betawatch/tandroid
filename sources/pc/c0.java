package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
