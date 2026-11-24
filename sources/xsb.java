// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum xsb extends rub {
    public xsb() {
        super("CharacterReferenceInData", 1);
    }

    @Override // rub
    public final void c(bsb bsbVar, hl1 hl1Var) {
        int[] c = bsbVar.c(null, false);
        if (c == null) {
            bsbVar.f('&');
        } else {
            bsbVar.h(new String(c, 0, c.length));
        }
        bsbVar.c = rub.a;
    }
}
