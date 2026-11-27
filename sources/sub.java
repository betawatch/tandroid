// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
