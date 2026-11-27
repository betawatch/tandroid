// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum wvb extends rwb {
    public wvb() {
        super("BeforeDoctypeName", 51);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        boolean o = ik1Var.o();
        xvb xvbVar = rwb.q0;
        if (o) {
            stbVar.s();
            bubVar.c = xvbVar;
            return;
        }
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            stbVar.s();
            stbVar.e.append((char) 65533);
            bubVar.c = xvbVar;
            return;
        }
        if (d != ' ') {
            if (d == 65535) {
                bubVar.l(this);
                stbVar.s();
                bubVar.j();
                bubVar.c = rwb.a;
                return;
            }
            if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                return;
            }
            stbVar.s();
            stbVar.e.append(d);
            bubVar.c = xvbVar;
        }
    }
}
