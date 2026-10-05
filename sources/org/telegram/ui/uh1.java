package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki1 b;

    public /* synthetic */ uh1(ki1 ki1Var, int i10) {
        this.a = i10;
        this.b = ki1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u0.b();
                break;
            case 1:
                this.b.u0.b();
                break;
            case 2:
                this.b.u0.b();
                break;
            case 3:
                this.b.u0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.b.Z;
                v1Var.c0 = false;
                v1Var.invalidate();
                break;
            case 5:
                ki1 ki1Var = this.b;
                ki1Var.q0 = ki1Var.p0;
                ki1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ki1 ki1Var2 = this.b;
                ki1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ki1Var2.e.getLocationOnScreen(iArr);
                ki1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.h.getLocationOnScreen(iArr);
                ki1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.f.getLocationOnScreen(iArr);
                ki1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.n.getLocationOnScreen(iArr);
                ki1Var2.n.setTranslationX((((ki1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ki1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.n.setAlpha(1.0f);
                ki1Var2.e.setAlpha(1.0f);
                ki1Var2.h.setAlpha(1.0f);
                ki1Var2.f.setAlpha(1.0f);
                long j3 = 200;
                ki1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ki1 ki1Var3 = this.b;
                    ki1Var3.O0.setTranslationY(ki1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ki1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                ki1 ki1Var4 = this.b;
                ki1Var4.u0.setAlpha(1.0f);
                ki1Var4.u0.invalidate();
                ValueAnimator k10 = ki1Var4.k(true);
                ki1Var4.H.setAlpha(0.0f);
                ki1Var4.I.setAlpha(0.0f);
                ki1Var4.N.setAlpha(0.0f);
                ki1Var4.X.setAlpha(0.0f);
                ki1Var4.j0.setAlpha(0.0f);
                ki1Var4.h0.setAlpha(0.0f);
                ki1Var4.i0.setAlpha(0.0f);
                ki1Var4.K.setAlpha(0.0f);
                ki1Var4.M0.setAlpha(0.0f);
                ki1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new e91(19, ki1Var4, k10), 32L);
                break;
            case 12:
                ki1 ki1Var5 = this.b;
                ki1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ki1Var5.N0;
                boolean z10 = e3Var != null && e3Var.V;
                if (ki1Var5.z0 && ki1Var5.x0 && !ki1Var5.C0 && !z10) {
                    ki1Var5.K0 = System.currentTimeMillis();
                    ki1Var5.A(false);
                    ki1Var5.q0 = ki1Var5.p0;
                    ki1Var5.H();
                    break;
                }
                break;
            default:
                ki1 ki1Var6 = this.b;
                if (ki1Var6.p0 == 3) {
                    ki1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ki1Var6.v;
                    if (!d3Var.R) {
                        d3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
