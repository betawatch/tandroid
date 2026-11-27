// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum zvb extends rwb {
    public zvb() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = rwb.t0;
            return;
        }
        if (d == '\"') {
            bubVar.m(this);
            bubVar.c = rwb.u0;
            return;
        }
        if (d == '\'') {
            bubVar.m(this);
            bubVar.c = rwb.v0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.m(this);
            bubVar.j();
            bubVar.c = mubVar;
        } else if (d != 65535) {
            bubVar.m(this);
            bubVar.c = rwb.D0;
        } else {
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
