// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum qwb extends rwb {
    public qwb() {
        super("EndTagOpen", 8);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        boolean j = ik1Var.j();
        mub mubVar = rwb.a;
        if (j) {
            bubVar.l(this);
            bubVar.h("</");
            bubVar.c = mubVar;
        } else if (ik1Var.o()) {
            bubVar.d(false);
            bubVar.c = rwb.r;
        } else if (ik1Var.m('>')) {
            bubVar.m(this);
            bubVar.a(mubVar);
        } else {
            bubVar.m(this);
            bubVar.a(rwb.g0);
        }
    }
}
