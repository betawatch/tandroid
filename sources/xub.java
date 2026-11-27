// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum xub extends rwb {
    public xub() {
        super("CharacterReferenceInData", 1);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        int[] c = bubVar.c(null, false);
        if (c == null) {
            bubVar.f('&');
        } else {
            bubVar.h(new String(c, 0, c.length));
        }
        bubVar.c = rwb.a;
    }
}
