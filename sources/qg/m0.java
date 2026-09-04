package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import ji.u4;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                u4 u4Var = q0Var.a;
                if (u4Var != null) {
                    u4Var.n();
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
                        u4 u4Var2 = q0Var.a;
                        if (u4Var2 != null) {
                            u4Var2.n();
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
                    q0Var.K.setInterpolator(pr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    u4 u4Var3 = q0Var.a;
                    if (u4Var3 != null) {
                        u4Var3.n();
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
