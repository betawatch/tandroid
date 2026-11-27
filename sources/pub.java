// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
