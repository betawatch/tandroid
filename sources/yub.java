// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum yub extends rwb {
    public yub() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wub wubVar = rwb.S;
        if (d == 0) {
            bubVar.m(this);
            bubVar.f((char) 65533);
            bubVar.c = wubVar;
        } else if (d == '-') {
            bubVar.f(d);
            bubVar.c = rwb.U;
        } else if (d == '<') {
            bubVar.f(d);
            bubVar.c = rwb.V;
        } else if (d != 65535) {
            bubVar.f(d);
            bubVar.c = wubVar;
        } else {
            bubVar.l(this);
            bubVar.c = rwb.a;
        }
    }
}
