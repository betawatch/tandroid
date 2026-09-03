package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum g0 extends a2 {
    public g0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        int[] c3 = kVar.c(null, false);
        if (c3 == null) {
            kVar.f('&');
        } else {
            kVar.g(new String(c3, 0, c3.length));
        }
        kVar.c = a2.a;
    }
}
