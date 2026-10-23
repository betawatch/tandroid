package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ h1 c;

    public /* synthetic */ o0(s0 s0Var, h1 h1Var, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        h1 h1Var = this.c;
        s0 s0Var = this.b;
        switch (i10) {
            case 0:
                s0Var.c = h1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.c.a(s0Var.h);
                ki.t1 t1Var = s0Var.a;
                if (t1Var != null) {
                    t1Var.J();
                    break;
                }
                break;
            default:
                if (h1Var != null && s0Var.q == 0) {
                    s0Var.q = t1.b(s0Var.g);
                }
                int i11 = 0;
                if (s0Var.H == (h1Var != null)) {
                    if (h1Var != s0Var.d) {
                        s0Var.d = h1Var;
                        ki.t1 t1Var2 = s0Var.a;
                        if (t1Var2 != null) {
                            t1Var2.J();
                            break;
                        }
                    }
                } else {
                    s0Var.H = h1Var != null;
                    ValueAnimator valueAnimator = s0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        s0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s0Var.I, s0Var.H ? 1.0f : 0.0f);
                    s0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new n0(s0Var, i11));
                    s0Var.K.addListener(new r0(s0Var, i11));
                    s0Var.K.setInterpolator(bs.h);
                    s0Var.K.start();
                    s0Var.d = h1Var;
                    ki.t1 t1Var3 = s0Var.a;
                    if (t1Var3 != null) {
                        t1Var3.J();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
