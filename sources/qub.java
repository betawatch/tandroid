// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum qub extends rwb {
    public qub() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.j()) {
            bubVar.l(this);
            bubVar.c = rwb.a;
            return;
        }
        char d = ik1Var.d();
        pub pubVar = rwb.L;
        if (d == 0) {
            bubVar.m(this);
            bubVar.f((char) 65533);
            bubVar.c = pubVar;
        } else if (d == '-') {
            bubVar.f(d);
            bubVar.c = rwb.N;
        } else if (d == '<') {
            bubVar.c = rwb.O;
        } else {
            bubVar.f(d);
            bubVar.c = pubVar;
        }
    }
}
