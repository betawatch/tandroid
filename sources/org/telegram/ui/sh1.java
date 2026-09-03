package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii1 b;

    public /* synthetic */ sh1(ii1 ii1Var, int i10) {
        this.a = i10;
        this.b = ii1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0.b();
                break;
            case 1:
                this.b.r0.b();
                break;
            case 2:
                this.b.r0.b();
                break;
            case 3:
                this.b.r0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.b.W;
                t1Var.W = false;
                t1Var.invalidate();
                break;
            case 5:
                ii1 ii1Var = this.b;
                ii1Var.n0 = ii1Var.m0;
                ii1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ii1 ii1Var2 = this.b;
                ii1Var2.b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ii1Var2.e.getLocationOnScreen(iArr);
                ii1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.h.getLocationOnScreen(iArr);
                ii1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.f.getLocationOnScreen(iArr);
                ii1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.n.getLocationOnScreen(iArr);
                ii1Var2.n.setTranslationX((((ii1Var2.b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ii1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.n.setAlpha(1.0f);
                ii1Var2.e.setAlpha(1.0f);
                ii1Var2.h.setAlpha(1.0f);
                ii1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                ii1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.r0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ii1 ii1Var3 = this.b;
                    ii1Var3.L0.setTranslationY(ii1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ii1Var3.L0.u();
                    break;
                }
                break;
            case 10:
                this.b.r0.b();
                break;
            case 11:
                ii1 ii1Var4 = this.b;
                ii1Var4.r0.setAlpha(1.0f);
                ii1Var4.r0.invalidate();
                ValueAnimator k10 = ii1Var4.k(true);
                ii1Var4.E.setAlpha(0.0f);
                ii1Var4.F.setAlpha(0.0f);
                ii1Var4.K.setAlpha(0.0f);
                ii1Var4.U.setAlpha(0.0f);
                ii1Var4.g0.setAlpha(0.0f);
                ii1Var4.e0.setAlpha(0.0f);
                ii1Var4.f0.setAlpha(0.0f);
                ii1Var4.H.setAlpha(0.0f);
                ii1Var4.J0.setAlpha(0.0f);
                ii1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new bh1(2, ii1Var4, k10), 32L);
                break;
            case 12:
                ii1 ii1Var5 = this.b;
                ii1Var5.O0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ii1Var5.K0;
                boolean z4 = e3Var != null && e3Var.S;
                if (ii1Var5.w0 && ii1Var5.u0 && !ii1Var5.z0 && !z4) {
                    ii1Var5.H0 = System.currentTimeMillis();
                    ii1Var5.A(false);
                    ii1Var5.n0 = ii1Var5.m0;
                    ii1Var5.H();
                    break;
                }
                break;
            default:
                ii1 ii1Var6 = this.b;
                if (ii1Var6.m0 == 3) {
                    ii1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ii1Var6.v;
                    if (!d3Var.O) {
                        d3Var.O = true;
                        break;
                    }
                }
                break;
        }
    }
}
