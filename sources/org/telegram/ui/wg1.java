package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ wg1(mh1 mh1Var, int i9) {
        this.a = i9;
        this.b = mh1Var;
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
                mh1 mh1Var = this.b;
                mh1Var.m0 = mh1Var.l0;
                mh1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                mh1 mh1Var2 = this.b;
                mh1Var2.a0.getLocationOnScreen(iArr);
                int i9 = iArr[0];
                int i10 = iArr[1];
                mh1Var2.e.getLocationOnScreen(iArr);
                mh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.h.getLocationOnScreen(iArr);
                mh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.f.getLocationOnScreen(iArr);
                mh1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.n.getLocationOnScreen(iArr);
                mh1Var2.n.setTranslationX((((mh1Var2.a0.getWidth() + i9) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                mh1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.n.setAlpha(1.0f);
                mh1Var2.e.setAlpha(1.0f);
                mh1Var2.h.setAlpha(1.0f);
                mh1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                mh1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.q0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    mh1 mh1Var3 = this.b;
                    mh1Var3.K0.setTranslationY(mh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    mh1Var3.K0.v();
                    break;
                }
                break;
            case 10:
                this.b.q0.b();
                break;
            case 11:
                mh1 mh1Var4 = this.b;
                mh1Var4.q0.setAlpha(1.0f);
                mh1Var4.q0.invalidate();
                ValueAnimator k10 = mh1Var4.k(true);
                mh1Var4.D.setAlpha(0.0f);
                mh1Var4.E.setAlpha(0.0f);
                mh1Var4.J.setAlpha(0.0f);
                mh1Var4.T.setAlpha(0.0f);
                mh1Var4.f0.setAlpha(0.0f);
                mh1Var4.d0.setAlpha(0.0f);
                mh1Var4.e0.setAlpha(0.0f);
                mh1Var4.G.setAlpha(0.0f);
                mh1Var4.I0.setAlpha(0.0f);
                mh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new n21(28, mh1Var4, k10), 32L);
                break;
            case 12:
                mh1 mh1Var5 = this.b;
                mh1Var5.N0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = mh1Var5.J0;
                boolean z10 = c3Var != null && c3Var.R;
                if (mh1Var5.v0 && mh1Var5.t0 && !mh1Var5.y0 && !z10) {
                    mh1Var5.G0 = System.currentTimeMillis();
                    mh1Var5.A(false);
                    mh1Var5.m0 = mh1Var5.l0;
                    mh1Var5.H();
                    break;
                }
                break;
            default:
                mh1 mh1Var6 = this.b;
                if (mh1Var6.l0 == 3) {
                    mh1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = mh1Var6.v;
                    if (!b3Var.N) {
                        b3Var.N = true;
                        break;
                    }
                }
                break;
        }
    }
}
