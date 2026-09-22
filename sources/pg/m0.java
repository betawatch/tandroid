package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                k2.u uVar = q0Var.a;
                if (uVar != null) {
                    uVar.W();
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
                        k2.u uVar2 = q0Var.a;
                        if (uVar2 != null) {
                            uVar2.W();
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
                    q0Var.K.setInterpolator(qr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    k2.u uVar3 = q0Var.a;
                    if (uVar3 != null) {
                        uVar3.W();
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
