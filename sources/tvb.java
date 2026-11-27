// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
