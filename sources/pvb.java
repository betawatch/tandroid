// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
