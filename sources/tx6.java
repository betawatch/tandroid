// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class tx6 implements us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp b;
    public final /* synthetic */ f86 c;
    public final /* synthetic */ fr6 d;

    public /* synthetic */ tx6(kp kpVar, f86 f86Var, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = kpVar;
        this.c = f86Var;
        this.d = fr6Var;
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        fr6 fr6Var = this.d;
        f86 f86Var = this.c;
        kp kpVar = this.b;
        vx6 vx6Var = (vx6) obj;
        switch (b) {
            case 0:
                vx6Var.u(kpVar.b, (rx6) kpVar.c, f86Var, fr6Var);
                break;
            default:
                vx6Var.s(kpVar.b, (rx6) kpVar.c, f86Var, fr6Var);
                break;
        }
    }
}
