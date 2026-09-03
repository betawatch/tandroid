package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
