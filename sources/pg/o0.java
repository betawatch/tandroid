package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import m.f3;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                f3 f3Var = s0Var.a;
                if (f3Var != null) {
                    f3Var.g();
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
                        f3 f3Var2 = s0Var.a;
                        if (f3Var2 != null) {
                            f3Var2.g();
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
                    s0Var.K.setInterpolator(hs.h);
                    s0Var.K.start();
                    s0Var.d = h1Var;
                    f3 f3Var3 = s0Var.a;
                    if (f3Var3 != null) {
                        f3Var3.g();
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
