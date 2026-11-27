// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
