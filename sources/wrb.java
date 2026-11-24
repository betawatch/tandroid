// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum wrb extends qsb {
    public wrb() {
        super("DoctypeName", 52);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        if (zj1Var.o()) {
            rpbVar.e.append(zj1Var.e());
            return;
        }
        char d = zj1Var.d();
        if (d == 0) {
            aqbVar.m(this);
            rpbVar.e.append((char) 65533);
            return;
        }
        if (d != ' ') {
            lqb lqbVar = qsb.a;
            if (d == '>') {
                aqbVar.j();
                aqbVar.c = lqbVar;
                return;
            } else if (d == 65535) {
                aqbVar.l(this);
                aqbVar.j();
                aqbVar.c = lqbVar;
                return;
            } else if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                rpbVar.e.append(d);
                return;
            }
        }
        aqbVar.c = qsb.r0;
    }
}
