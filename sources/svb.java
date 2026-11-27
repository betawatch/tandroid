// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum svb extends rwb {
    public svb() {
        super("CommentEnd", 48);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char d = ik1Var.d();
        qvb qvbVar = rwb.k0;
        if (d == 0) {
            bubVar.m(this);
            StringBuilder sb = rtbVar.e;
            sb.append("--");
            sb.append((char) 65533);
            bubVar.c = qvbVar;
            return;
        }
        if (d == '!') {
            bubVar.m(this);
            bubVar.c = rwb.n0;
            return;
        }
        if (d == '-') {
            bubVar.m(this);
            rtbVar.e.append('-');
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.i();
            bubVar.c = mubVar;
        } else if (d == 65535) {
            bubVar.l(this);
            bubVar.i();
            bubVar.c = mubVar;
        } else {
            bubVar.m(this);
            StringBuilder sb2 = rtbVar.e;
            sb2.append("--");
            sb2.append(d);
            bubVar.c = qvbVar;
        }
    }
}
