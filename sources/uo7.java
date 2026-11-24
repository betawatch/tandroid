// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uo7 implements ka1 {
    public final yn4 a;
    public final /* synthetic */ vo7 b;

    public uo7(vo7 vo7Var, yn4 yn4Var) {
        this.b = vo7Var;
        this.a = yn4Var;
    }

    @Override // ka1
    public final void cancel() {
        vo7 vo7Var = this.b;
        ks ksVar = vo7Var.b;
        yn4 yn4Var = this.a;
        ksVar.remove(yn4Var);
        if (rp5.a(vo7Var.c, yn4Var)) {
            yn4Var.a();
            vo7Var.c = null;
        }
        yn4Var.b.remove(this);
        op4 op4Var = yn4Var.c;
        if (op4Var != null) {
            op4Var.invoke();
        }
        yn4Var.c = null;
    }
}
