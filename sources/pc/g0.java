package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
