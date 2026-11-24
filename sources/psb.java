// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum psb extends qsb {
    public psb() {
        super("EndTagOpen", 8);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        boolean j = zj1Var.j();
        lqb lqbVar = qsb.a;
        if (j) {
            aqbVar.l(this);
            aqbVar.h("</");
            aqbVar.c = lqbVar;
        } else if (zj1Var.o()) {
            aqbVar.d(false);
            aqbVar.c = qsb.r;
        } else if (zj1Var.m('>')) {
            aqbVar.m(this);
            aqbVar.a(lqbVar);
        } else {
            aqbVar.m(this);
            aqbVar.a(qsb.g0);
        }
    }
}
