package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.n.g();
            kVar.c = a2.e0;
        } else if (aVar.l("DOCTYPE")) {
            kVar.c = a2.k0;
        } else if (aVar.k("[CDATA[")) {
            kVar.e();
            kVar.c = a2.A0;
        } else {
            kVar.m(this);
            kVar.a(a2.c0);
        }
    }
}
