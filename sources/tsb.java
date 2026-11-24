// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum tsb extends rub {
    public tsb() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        if (!hl1Var.o()) {
            bsbVar.h("</");
            bsbVar.c = rub.L;
            return;
        }
        bsbVar.d(false);
        wrb wrbVar = bsbVar.i;
        char i = hl1Var.i();
        wrbVar.getClass();
        wrbVar.y(String.valueOf(i));
        bsbVar.h.append(hl1Var.i());
        bsbVar.a(rub.Q);
    }
}
