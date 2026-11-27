// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum rvb extends rwb {
    public rvb() {
        super("CommentEndDash", 47);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        rtb rtbVar = bubVar.n;
        char d = ik1Var.d();
        qvb qvbVar = rwb.k0;
        if (d == 0) {
            bubVar.m(this);
            StringBuilder sb = rtbVar.e;
            sb.append('-');
            sb.append((char) 65533);
            bubVar.c = qvbVar;
            return;
        }
        if (d == '-') {
            bubVar.c = rwb.m0;
            return;
        }
        if (d == 65535) {
            bubVar.l(this);
            bubVar.i();
            bubVar.c = rwb.a;
        } else {
            StringBuilder sb2 = rtbVar.e;
            sb2.append('-');
            sb2.append(d);
            bubVar.c = qvbVar;
        }
    }
}
