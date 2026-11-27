// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
