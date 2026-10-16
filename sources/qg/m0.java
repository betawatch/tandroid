package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import ji.w4;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ m0(q0 q0Var, f1 f1Var, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f1 f1Var = this.c;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                q0Var.c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.c.a(q0Var.h);
                w4 w4Var = q0Var.a;
                if (w4Var != null) {
                    w4Var.Y0();
                    break;
                }
                break;
            default:
                if (f1Var != null && q0Var.q == 0) {
                    q0Var.q = r1.b(q0Var.g);
                }
                int i11 = 0;
                if (q0Var.H == (f1Var != null)) {
                    if (f1Var != q0Var.d) {
                        q0Var.d = f1Var;
                        w4 w4Var2 = q0Var.a;
                        if (w4Var2 != null) {
                            w4Var2.Y0();
                            break;
                        }
                    }
                } else {
                    q0Var.H = f1Var != null;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(q0Var.I, q0Var.H ? 1.0f : 0.0f);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new l0(q0Var, i11));
                    q0Var.K.addListener(new p0(q0Var, i11));
                    q0Var.K.setInterpolator(es.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    w4 w4Var3 = q0Var.a;
                    if (w4Var3 != null) {
                        w4Var3.Y0();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
