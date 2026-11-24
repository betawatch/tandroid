// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum pub extends rub {
    public pub() {
        super("TagOpen", 7);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        char i = hl1Var.i();
        if (i == '!') {
            bsbVar.a(rub.h0);
            return;
        }
        if (i == '/') {
            bsbVar.a(rub.n);
            return;
        }
        if (i == '?') {
            bsbVar.a(rub.g0);
            return;
        }
        if (hl1Var.o()) {
            bsbVar.d(true);
            bsbVar.c = rub.r;
        } else {
            bsbVar.m(this);
            bsbVar.f('<');
            bsbVar.c = rub.a;
        }
    }
}
