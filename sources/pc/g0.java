package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
