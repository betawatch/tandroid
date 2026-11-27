// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xz6 implements ot2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp b;
    public final /* synthetic */ ja6 c;
    public final /* synthetic */ jt6 d;

    public /* synthetic */ xz6(lp lpVar, ja6 ja6Var, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = lpVar;
        this.c = ja6Var;
        this.d = jt6Var;
    }

    @Override // ot2
    public final void accept(Object obj) {
        byte b = this.a;
        jt6 jt6Var = this.d;
        ja6 ja6Var = this.c;
        lp lpVar = this.b;
        zz6 zz6Var = (zz6) obj;
        switch (b) {
            case 0:
                zz6Var.u(lpVar.b, (vz6) lpVar.c, ja6Var, jt6Var);
                break;
            default:
                zz6Var.s(lpVar.b, (vz6) lpVar.c, ja6Var, jt6Var);
                break;
        }
    }
}
