// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vr1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr1 b;

    public /* synthetic */ vr1(wr1 wr1Var, byte b) {
        this.a = b;
        this.b = wr1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wr1 wr1Var = this.b;
        switch (b) {
            case 0:
                ar1 ar1Var = wr1Var.I.a0;
                if (ar1Var != null) {
                    ar1Var.h1();
                    break;
                }
                break;
            default:
                ar1 ar1Var2 = wr1Var.I.a0;
                if (ar1Var2 != null) {
                    ar1Var2.U0 = false;
                    wx1 wx1Var = ar1Var2.V0;
                    if (wx1Var != null) {
                        wx1Var.t(false);
                        break;
                    }
                }
                break;
        }
    }
}
