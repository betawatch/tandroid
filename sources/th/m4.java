package th;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ m4(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e5 e5Var = this.b;
                e5Var.R = false;
                e5Var.S = null;
                break;
            case 1:
                e5 e5Var2 = this.b;
                e5Var2.s = true;
                e5Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                e5 e5Var3 = this.b;
                e5Var3.R = false;
                e5Var3.S = null;
                break;
        }
    }
}
