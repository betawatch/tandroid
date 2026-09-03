package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
