package rh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ i8(y8 y8Var, int i10) {
        this.a = i10;
        this.b = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y8 y8Var = this.b;
                y8Var.K1 = true;
                y8Var.J0(null);
                org.telegram.messenger.i0.h3(new i8(y8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                n8 n8Var = this.b.p1;
                n8Var.F = false;
                n8Var.invalidate();
                break;
        }
    }
}
