package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum w0 extends a2 {
    public w0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        if (aVar.k("--")) {
            kVar.n.h();
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
