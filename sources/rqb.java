// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum rqb extends qsb {
    public rqb() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // qsb
    public final void c(aqb aqbVar, zj1 zj1Var) {
        if (zj1Var.o()) {
            aqbVar.e();
            aqbVar.h.append(zj1Var.i());
            aqbVar.h("<" + zj1Var.i());
            aqbVar.a(qsb.R);
            return;
        }
        if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.P);
        } else {
            aqbVar.f('<');
            aqbVar.c = qsb.L;
        }
    }
}
