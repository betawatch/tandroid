package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ rg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
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
                org.telegram.ui.Components.voip.s1 s1Var = this.b.Z;
                s1Var.c0 = false;
                s1Var.invalidate();
                break;
            case 5:
                hh1 hh1Var = this.b;
                hh1Var.q0 = hh1Var.p0;
                hh1Var.G();
                break;
            case 6:
                this.b.A();
                break;
            case 7:
                int[] iArr = new int[2];
                hh1 hh1Var2 = this.b;
                hh1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                hh1Var2.e.getLocationOnScreen(iArr);
                hh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.h.getLocationOnScreen(iArr);
                hh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.f.getLocationOnScreen(iArr);
                hh1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.n.getLocationOnScreen(iArr);
                hh1Var2.n.setTranslationX((((hh1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                hh1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.n.setAlpha(1.0f);
                hh1Var2.e.setAlpha(1.0f);
                hh1Var2.h.setAlpha(1.0f);
                hh1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                hh1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    hh1 hh1Var3 = this.b;
                    hh1Var3.O0.setTranslationY(hh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    hh1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                hh1 hh1Var4 = this.b;
                hh1Var4.u0.setAlpha(1.0f);
                hh1Var4.u0.invalidate();
                ValueAnimator j11 = hh1Var4.j(true);
                hh1Var4.H.setAlpha(0.0f);
                hh1Var4.I.setAlpha(0.0f);
                hh1Var4.N.setAlpha(0.0f);
                hh1Var4.X.setAlpha(0.0f);
                hh1Var4.j0.setAlpha(0.0f);
                hh1Var4.h0.setAlpha(0.0f);
                hh1Var4.i0.setAlpha(0.0f);
                hh1Var4.K.setAlpha(0.0f);
                hh1Var4.M0.setAlpha(0.0f);
                hh1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new k71(22, hh1Var4, j11), 32L);
                break;
            case 12:
                hh1 hh1Var5 = this.b;
                hh1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = hh1Var5.N0;
                boolean z10 = b3Var != null && b3Var.V;
                if (hh1Var5.z0 && hh1Var5.x0 && !hh1Var5.C0 && !z10) {
                    hh1Var5.K0 = System.currentTimeMillis();
                    hh1Var5.z(false);
                    hh1Var5.q0 = hh1Var5.p0;
                    hh1Var5.G();
                    break;
                }
                break;
            default:
                hh1 hh1Var6 = this.b;
                if (hh1Var6.p0 == 3) {
                    hh1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = hh1Var6.v;
                    if (!a3Var.R) {
                        a3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
