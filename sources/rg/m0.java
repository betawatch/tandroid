package rg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import li.e3;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                e3 e3Var = q0Var.a;
                if (e3Var != null) {
                    e3Var.v0();
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
                        e3 e3Var2 = q0Var.a;
                        if (e3Var2 != null) {
                            e3Var2.v0();
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
                    q0Var.K.setInterpolator(ds.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    e3 e3Var3 = q0Var.a;
                    if (e3Var3 != null) {
                        e3Var3.v0();
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
