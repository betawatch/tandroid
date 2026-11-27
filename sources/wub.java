// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
