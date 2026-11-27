// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum pub extends rwb {
    public pub() {
        super("ScriptDataEscaped", 21);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.j()) {
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        char i = ik1Var.i();
        if (i == 0) {
            bubVar.m(this);
            ik1Var.a();
            bubVar.f((char) 65533);
        } else if (i == '-') {
            bubVar.f('-');
            bubVar.a(rwb.M);
        } else if (i != '<') {
            bubVar.h(ik1Var.g('-', '<', 0));
        } else {
            bubVar.a(rwb.O);
        }
    }
}
