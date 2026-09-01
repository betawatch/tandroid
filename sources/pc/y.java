package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public enum y extends a2 {
    public y() {
        super("ScriptDataEscaped", 21);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.j()) {
            kVar.l(this);
            kVar.c = a2.a;
            return;
        }
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else if (i10 == '-') {
            kVar.f('-');
            kVar.a(a2.I);
        } else if (i10 != '<') {
            kVar.g(aVar.g('-', '<', 0));
        } else {
            kVar.a(a2.K);
        }
    }
}
