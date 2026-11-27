// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
