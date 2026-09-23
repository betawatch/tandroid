package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ g1 c;

    public /* synthetic */ n0(r0 r0Var, g1 g1Var, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        g1 g1Var = this.c;
        r0 r0Var = this.b;
        switch (i10) {
            case 0:
                r0Var.c = g1Var;
                if (r0Var.h == null) {
                    r0Var.h = new RectF();
                }
                r0Var.c.a(r0Var.h);
                k2.u uVar = r0Var.a;
                if (uVar != null) {
                    uVar.W();
                    break;
                }
                break;
            default:
                if (g1Var != null && r0Var.q == 0) {
                    r0Var.q = s1.b(r0Var.g);
                }
                int i11 = 0;
                if (r0Var.H == (g1Var != null)) {
                    if (g1Var != r0Var.d) {
                        r0Var.d = g1Var;
                        k2.u uVar2 = r0Var.a;
                        if (uVar2 != null) {
                            uVar2.W();
                            break;
                        }
                    }
                } else {
                    r0Var.H = g1Var != null;
                    ValueAnimator valueAnimator = r0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        r0Var.K = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(r0Var.I, r0Var.H ? 1.0f : 0.0f);
                    r0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new m0(r0Var, i11));
                    r0Var.K.addListener(new q0(r0Var, i11));
                    r0Var.K.setInterpolator(rr.h);
                    r0Var.K.start();
                    r0Var.d = g1Var;
                    k2.u uVar3 = r0Var.a;
                    if (uVar3 != null) {
                        uVar3.W();
                    }
                    if (r0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        break;
                    }
                }
                break;
        }
    }
}
