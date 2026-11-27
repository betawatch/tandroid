// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum wub extends rwb {
    public wub() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i == 0) {
            bubVar.m(this);
            ik1Var.a();
            bubVar.f((char) 65533);
        } else if (i == '-') {
            bubVar.f(i);
            bubVar.a(rwb.T);
        } else if (i == '<') {
            bubVar.f(i);
            bubVar.a(rwb.V);
        } else if (i != 65535) {
            bubVar.h(ik1Var.g('-', '<', 0));
        } else {
            bubVar.l(this);
            bubVar.c = rwb.a;
        }
    }
}
