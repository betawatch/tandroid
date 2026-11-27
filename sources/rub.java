// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum rub extends rwb {
    public rub() {
        super("ScriptDataEscapedDashDash", 23);
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
        } else {
            if (d == '-') {
                bubVar.f(d);
                return;
            }
            if (d == '<') {
                bubVar.c = rwb.O;
            } else if (d != '>') {
                bubVar.f(d);
                bubVar.c = pubVar;
            } else {
                bubVar.f(d);
                bubVar.c = rwb.f;
            }
        }
    }
}
