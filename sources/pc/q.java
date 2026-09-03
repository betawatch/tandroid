package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
