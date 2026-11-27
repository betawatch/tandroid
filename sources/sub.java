// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
