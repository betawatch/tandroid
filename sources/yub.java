// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
