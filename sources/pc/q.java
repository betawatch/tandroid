package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum q extends a2 {
    public q() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            kVar.c = a2.B;
        } else {
            kVar.g("</");
            kVar.c = a2.e;
        }
    }
}
