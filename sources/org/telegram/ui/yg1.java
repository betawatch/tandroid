package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ yg1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q0.b();
                break;
            case 1:
                this.b.q0.b();
                break;
            case 2:
                this.b.q0.b();
                break;
            case 3:
                this.b.q0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.b.V;
                t1Var.V = false;
                t1Var.invalidate();
                break;
            case 5:
                oh1 oh1Var = this.b;
                oh1Var.m0 = oh1Var.l0;
                oh1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                oh1 oh1Var2 = this.b;
                oh1Var2.a0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                oh1Var2.e.getLocationOnScreen(iArr);
                oh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.h.getLocationOnScreen(iArr);
                oh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f.getLocationOnScreen(iArr);
                oh1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.n.getLocationOnScreen(iArr);
                oh1Var2.n.setTranslationX((((oh1Var2.a0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                oh1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.n.setAlpha(1.0f);
                oh1Var2.e.setAlpha(1.0f);
                oh1Var2.h.setAlpha(1.0f);
                oh1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                oh1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.q0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    oh1 oh1Var3 = this.b;
                    oh1Var3.K0.setTranslationY(oh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    oh1Var3.K0.v();
                    break;
                }
                break;
            case 10:
                this.b.q0.b();
                break;
            case 11:
                oh1 oh1Var4 = this.b;
                oh1Var4.q0.setAlpha(1.0f);
                oh1Var4.q0.invalidate();
                ValueAnimator k9 = oh1Var4.k(true);
                oh1Var4.D.setAlpha(0.0f);
                oh1Var4.E.setAlpha(0.0f);
                oh1Var4.J.setAlpha(0.0f);
                oh1Var4.T.setAlpha(0.0f);
                oh1Var4.f0.setAlpha(0.0f);
                oh1Var4.d0.setAlpha(0.0f);
                oh1Var4.e0.setAlpha(0.0f);
                oh1Var4.G.setAlpha(0.0f);
                oh1Var4.I0.setAlpha(0.0f);
                oh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new t31(25, oh1Var4, k9), 32L);
                break;
            case 12:
                oh1 oh1Var5 = this.b;
                oh1Var5.N0 = false;
                org.telegram.ui.Components.voip.f3 f3Var = oh1Var5.J0;
                boolean z10 = f3Var != null && f3Var.R;
                if (oh1Var5.v0 && oh1Var5.t0 && !oh1Var5.y0 && !z10) {
                    oh1Var5.G0 = System.currentTimeMillis();
                    oh1Var5.A(false);
                    oh1Var5.m0 = oh1Var5.l0;
                    oh1Var5.H();
                    break;
                }
                break;
            default:
                oh1 oh1Var6 = this.b;
                if (oh1Var6.l0 == 3) {
                    oh1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.e3 e3Var = oh1Var6.v;
                    if (!e3Var.N) {
                        e3Var.N = true;
                        break;
                    }
                }
                break;
        }
    }
}
