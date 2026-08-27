package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;

    public /* synthetic */ vg1(lh1 lh1Var, int i10) {
        this.a = i10;
        this.b = lh1Var;
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
                org.telegram.ui.Components.voip.s1 s1Var = this.b.V;
                s1Var.V = false;
                s1Var.invalidate();
                break;
            case 5:
                lh1 lh1Var = this.b;
                lh1Var.m0 = lh1Var.l0;
                lh1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                lh1 lh1Var2 = this.b;
                lh1Var2.a0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                lh1Var2.e.getLocationOnScreen(iArr);
                lh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.h.getLocationOnScreen(iArr);
                lh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.f.getLocationOnScreen(iArr);
                lh1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.n.getLocationOnScreen(iArr);
                lh1Var2.n.setTranslationX((((lh1Var2.a0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                lh1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.n.setAlpha(1.0f);
                lh1Var2.e.setAlpha(1.0f);
                lh1Var2.h.setAlpha(1.0f);
                lh1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                lh1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.q0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    lh1 lh1Var3 = this.b;
                    lh1Var3.K0.setTranslationY(lh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    lh1Var3.K0.v();
                    break;
                }
                break;
            case 10:
                this.b.q0.b();
                break;
            case 11:
                lh1 lh1Var4 = this.b;
                lh1Var4.q0.setAlpha(1.0f);
                lh1Var4.q0.invalidate();
                ValueAnimator k10 = lh1Var4.k(true);
                lh1Var4.D.setAlpha(0.0f);
                lh1Var4.E.setAlpha(0.0f);
                lh1Var4.J.setAlpha(0.0f);
                lh1Var4.T.setAlpha(0.0f);
                lh1Var4.f0.setAlpha(0.0f);
                lh1Var4.d0.setAlpha(0.0f);
                lh1Var4.e0.setAlpha(0.0f);
                lh1Var4.G.setAlpha(0.0f);
                lh1Var4.I0.setAlpha(0.0f);
                lh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new m21(28, lh1Var4, k10), 32L);
                break;
            case 12:
                lh1 lh1Var5 = this.b;
                lh1Var5.N0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = lh1Var5.J0;
                boolean z10 = c3Var != null && c3Var.R;
                if (lh1Var5.v0 && lh1Var5.t0 && !lh1Var5.y0 && !z10) {
                    lh1Var5.G0 = System.currentTimeMillis();
                    lh1Var5.A(false);
                    lh1Var5.m0 = lh1Var5.l0;
                    lh1Var5.H();
                    break;
                }
                break;
            default:
                lh1 lh1Var6 = this.b;
                if (lh1Var6.l0 == 3) {
                    lh1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = lh1Var6.v;
                    if (!b3Var.N) {
                        b3Var.N = true;
                        break;
                    }
                }
                break;
        }
    }
}
