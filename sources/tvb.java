// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum tvb extends rwb {
    public tvb() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        int[] c = bubVar.c(null, false);
        if (c == null) {
            bubVar.f('&');
        } else {
            bubVar.h(new String(c, 0, c.length));
        }
        bubVar.c = rwb.c;
    }
}
