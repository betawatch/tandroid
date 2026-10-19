package qg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ p0(t0 t0Var, i1 i1Var, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i1 i1Var = this.c;
        t0 t0Var = this.b;
        switch (i10) {
            case 0:
                t0Var.c = i1Var;
                if (t0Var.h == null) {
                    t0Var.h = new RectF();
                }
                t0Var.c.a(t0Var.h);
                ki.t1 t1Var = t0Var.a;
                if (t1Var != null) {
                    t1Var.s();
                    break;
                }
                break;
            default:
                if (i1Var != null && t0Var.q == 0) {
                    t0Var.q = u1.b(t0Var.g);
                }
                int i11 = 0;
                if (t0Var.H == (i1Var != null)) {
                    if (i1Var != t0Var.d) {
                        t0Var.d = i1Var;
                        ki.t1 t1Var2 = t0Var.a;
                        if (t1Var2 != null) {
                            t1Var2.s();
                            break;
                        }
                    }
                } else {
                    t0Var.H = i1Var != null;
                    ValueAnimator valueAnimator = t0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        t0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(t0Var.I, t0Var.H ? 1.0f : 0.0f);
                    t0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new o0(t0Var, i11));
                    t0Var.K.addListener(new s0(t0Var, i11));
                    t0Var.K.setInterpolator(bs.h);
                    t0Var.K.start();
                    t0Var.d = i1Var;
                    ki.t1 t1Var3 = t0Var.a;
                    if (t1Var3 != null) {
                        t1Var3.s();
                    }
                    if (t0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
