// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bl9 b;

    public /* synthetic */ xk9(bl9 bl9Var, byte b) {
        this.a = b;
        this.b = bl9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bl9 bl9Var = this.b;
        switch (b) {
            case 0:
                bl9Var.c();
                break;
            default:
                bl9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(s33.h).setDuration(280L).start();
                bl9Var.c = System.currentTimeMillis();
                bl9Var.invalidate();
                try {
                    bl9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                gl.e3(bl9Var.h, 59500L);
                break;
        }
    }
}
