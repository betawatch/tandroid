// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u37 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j47 b;

    public /* synthetic */ u37(j47 j47Var, byte b) {
        this.a = b;
        this.b = j47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                j47Var.l();
                break;
            case 1:
                j47Var.getClass();
                pla.f(false);
                pla plaVar = j47Var.i0;
                if (plaVar != null) {
                    plaVar.b(j47Var.F);
                }
                gl.d3(new u37(j47Var, b2));
                break;
            case 2:
                pla.f(false);
                pla plaVar2 = j47Var.i0;
                if (plaVar2 != null) {
                    plaVar2.b(j47Var.F);
                }
                gl.d3(new u37(j47Var, (byte) 3));
                break;
            default:
                j47Var.k();
                break;
        }
    }
}
