package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ o0(s0 s0Var, i1 i1Var, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i1 i1Var = this.c;
        s0 s0Var = this.b;
        switch (i10) {
            case 0:
                s0Var.c = i1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.c.a(s0Var.h);
                n2.e eVar = s0Var.a;
                if (eVar != null) {
                    eVar.t();
                    break;
                }
                break;
            default:
                if (i1Var != null && s0Var.q == 0) {
                    s0Var.q = u1.b(s0Var.g);
                }
                int i11 = 0;
                if (s0Var.H == (i1Var != null)) {
                    if (i1Var != s0Var.d) {
                        s0Var.d = i1Var;
                        n2.e eVar2 = s0Var.a;
                        if (eVar2 != null) {
                            eVar2.t();
                            break;
                        }
                    }
                } else {
                    s0Var.H = i1Var != null;
                    ValueAnimator valueAnimator = s0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        s0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s0Var.I, s0Var.H ? 1.0f : 0.0f);
                    s0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new n0(s0Var, i11));
                    s0Var.K.addListener(new r0(s0Var, i11));
                    s0Var.K.setInterpolator(rr.h);
                    s0Var.K.start();
                    s0Var.d = i1Var;
                    n2.e eVar3 = s0Var.a;
                    if (eVar3 != null) {
                        eVar3.t();
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
