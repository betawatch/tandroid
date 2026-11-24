// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum rrb extends qsb {
    public rrb() {
        super("CommentEnd", 48);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        qpb qpbVar = aqbVar.n;
        char d = zj1Var.d();
        prb prbVar = qsb.k0;
        if (d == 0) {
            aqbVar.m(this);
            StringBuilder sb = qpbVar.e;
            sb.append("--");
            sb.append((char) 65533);
            aqbVar.c = prbVar;
            return;
        }
        if (d == '!') {
            aqbVar.m(this);
            aqbVar.c = qsb.n0;
            return;
        }
        if (d == '-') {
            aqbVar.m(this);
            qpbVar.e.append('-');
            return;
        }
        lqb lqbVar = qsb.a;
        if (d == '>') {
            aqbVar.i();
            aqbVar.c = lqbVar;
        } else if (d == 65535) {
            aqbVar.l(this);
            aqbVar.i();
            aqbVar.c = lqbVar;
        } else {
            aqbVar.m(this);
            StringBuilder sb2 = qpbVar.e;
            sb2.append("--");
            sb2.append(d);
            aqbVar.c = prbVar;
        }
    }
}
