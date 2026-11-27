// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum xvb extends rwb {
    public xvb() {
        super("DoctypeName", 52);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        if (ik1Var.o()) {
            stbVar.e.append(ik1Var.e());
            return;
        }
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            stbVar.e.append((char) 65533);
            return;
        }
        if (d != ' ') {
            mub mubVar = rwb.a;
            if (d == '>') {
                bubVar.j();
                bubVar.c = mubVar;
                return;
            } else if (d == 65535) {
                bubVar.l(this);
                bubVar.j();
                bubVar.c = mubVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                stbVar.e.append(d);
                return;
            }
        }
        bubVar.c = rwb.r0;
    }
}
