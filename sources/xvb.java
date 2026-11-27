// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
