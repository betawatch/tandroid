// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum pvb extends rwb {
    public pvb() {
        super("CommentStartDash", 45);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char d = ik1Var.d();
        qvb qvbVar = rwb.k0;
        if (d == 0) {
            bubVar.m(this);
            rtbVar.e.append((char) 65533);
            bubVar.c = qvbVar;
            return;
        }
        if (d == '-') {
            bubVar.c = rwb.j0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.m(this);
            bubVar.i();
            bubVar.c = mubVar;
        } else if (d != 65535) {
            rtbVar.e.append(d);
            bubVar.c = qvbVar;
        } else {
            bubVar.l(this);
            bubVar.i();
            bubVar.c = mubVar;
        }
    }
}
