package sg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ z0 c;

    public /* synthetic */ e0(j0 j0Var, z0 z0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
        this.c = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        z0 z0Var = this.c;
        j0 j0Var = this.b;
        switch (i7) {
            case 0:
                j0Var.c = z0Var;
                if (j0Var.h == null) {
                    j0Var.h = new RectF();
                }
                j0Var.c.a(j0Var.h);
                vy vyVar = j0Var.a;
                if (vyVar != null) {
                    vyVar.b();
                    break;
                }
                break;
            default:
                if (z0Var != null && j0Var.q == 0) {
                    j0Var.q = k1.b(j0Var.g);
                }
                int i10 = 0;
                if (j0Var.H == (z0Var != null)) {
                    if (z0Var != j0Var.d) {
                        j0Var.d = z0Var;
                        vy vyVar2 = j0Var.a;
                        if (vyVar2 != null) {
                            vyVar2.b();
                            break;
                        }
                    }
                } else {
                    j0Var.H = z0Var != null;
                    ValueAnimator valueAnimator = j0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        j0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(j0Var.I, j0Var.H ? 1.0f : 0.0f);
                    j0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new d0(j0Var, i10));
                    j0Var.K.addListener(new h0(j0Var, i10));
                    j0Var.K.setInterpolator(xq.h);
                    j0Var.K.start();
                    j0Var.d = z0Var;
                    vy vyVar3 = j0Var.a;
                    if (vyVar3 != null) {
                        vyVar3.b();
                    }
                    if (j0Var.H) {
                        p2.y.a();
                        break;
                    }
                }
                break;
        }
    }
}
