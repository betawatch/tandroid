// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum qub extends rub {
    public qub() {
        super("EndTagOpen", 8);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        boolean j = hl1Var.j();
        msb msbVar = rub.a;
        if (j) {
            bsbVar.l(this);
            bsbVar.h("</");
            bsbVar.c = msbVar;
        } else if (hl1Var.o()) {
            bsbVar.d(false);
            bsbVar.c = rub.r;
        } else if (hl1Var.m('>')) {
            bsbVar.m(this);
            bsbVar.a(msbVar);
        } else {
            bsbVar.m(this);
            bsbVar.a(rub.g0);
        }
    }
}
