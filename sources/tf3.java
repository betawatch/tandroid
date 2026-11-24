// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uf3 b;

    public /* synthetic */ tf3(uf3 uf3Var, byte b) {
        this.a = b;
        this.b = uf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uf3 uf3Var = this.b;
        switch (b) {
            case 0:
                oh3 oh3Var = uf3Var.c0;
                ValueAnimator valueAnimator = oh3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                oh3Var.l0 = null;
                break;
            default:
                uf3Var.x = false;
                uf3Var.invalidate();
                break;
        }
    }
}
