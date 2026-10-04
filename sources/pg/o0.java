package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                l2.g gVar = s0Var.a;
                if (gVar != null) {
                    gVar.m();
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
                        l2.g gVar2 = s0Var.a;
                        if (gVar2 != null) {
                            gVar2.m();
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
                    s0Var.K.setInterpolator(tr.h);
                    s0Var.K.start();
                    s0Var.d = i1Var;
                    l2.g gVar3 = s0Var.a;
                    if (gVar3 != null) {
                        gVar3.m();
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
