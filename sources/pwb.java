// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum pwb extends rwb {
    public pwb() {
        super("TagOpen", 7);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char i = ik1Var.i();
        if (i == '!') {
            bubVar.a(rwb.h0);
            return;
        }
        if (i == '/') {
            bubVar.a(rwb.n);
            return;
        }
        if (i == '?') {
            bubVar.a(rwb.g0);
            return;
        }
        if (ik1Var.o()) {
            bubVar.d(true);
            bubVar.c = rwb.r;
        } else {
            bubVar.m(this);
            bubVar.f('<');
            bubVar.c = rwb.a;
        }
    }
}
