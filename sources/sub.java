// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum sub extends rwb {
    public sub() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.e();
            bubVar.h.append(ik1Var.i());
            bubVar.h("<" + ik1Var.i());
            bubVar.a(rwb.R);
            return;
        }
        if (ik1Var.m('/')) {
            bubVar.e();
            bubVar.a(rwb.P);
        } else {
            bubVar.f('<');
            bubVar.c = rwb.L;
        }
    }
}
