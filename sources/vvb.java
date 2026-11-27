// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum vvb extends rwb {
    public vvb() {
        super("Doctype", 50);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        wvb wvbVar = rwb.p0;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = wvbVar;
            return;
        }
        if (d != '>') {
            if (d != 65535) {
                bubVar.m(this);
                bubVar.c = wvbVar;
                return;
            }
            bubVar.l(this);
        }
        bubVar.m(this);
        bubVar.m.s();
        bubVar.j();
        bubVar.c = rwb.a;
    }
}
