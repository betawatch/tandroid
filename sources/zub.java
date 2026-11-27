// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum zub extends rwb {
    public zub() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wub wubVar = rwb.S;
        if (d == 0) {
            bubVar.m(this);
            bubVar.f((char) 65533);
            bubVar.c = wubVar;
            return;
        }
        if (d == '-') {
            bubVar.f(d);
            return;
        }
        if (d == '<') {
            bubVar.f(d);
            bubVar.c = rwb.V;
        } else if (d == '>') {
            bubVar.f(d);
            bubVar.c = rwb.f;
        } else if (d != 65535) {
            bubVar.f(d);
            bubVar.c = wubVar;
        } else {
            bubVar.l(this);
            bubVar.c = rwb.a;
        }
    }
}
