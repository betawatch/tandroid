// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zd6 b;

    public /* synthetic */ yd6(zd6 zd6Var, byte b) {
        this.a = b;
        this.b = zd6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zd6 zd6Var = this.b;
        switch (b) {
            case 0:
                ae6 ae6Var = zd6Var.d;
                if (zd6Var.b) {
                    boolean z = ae6Var.M;
                    oy8 oy8Var = ae6Var.L;
                    vh1 vh1Var = ae6Var.n;
                    if (z && System.currentTimeMillis() - zd6Var.a >= 10000) {
                        vh1Var.setAnimation(oy8Var);
                        oy8Var.I(0, false, false);
                        oy8Var.u0 = new yd6(zd6Var, (byte) 1);
                        vh1Var.d();
                        zd6Var.a = System.currentTimeMillis();
                    }
                    vh1Var.postDelayed(zd6Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                gl.d3(new yd6(zd6Var, (byte) 2));
                break;
            default:
                ae6 ae6Var2 = zd6Var.d;
                oy8 oy8Var2 = ae6Var2.K;
                oy8Var2.I(0, false, false);
                ae6Var2.n.setAnimation(oy8Var2);
                break;
        }
    }
}
