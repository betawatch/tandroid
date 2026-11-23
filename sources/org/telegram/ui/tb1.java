package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;

    public /* synthetic */ tb1(hc1 hc1Var, int i7) {
        this.a = i7;
        this.b = hc1Var;
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
                org.telegram.ui.Components.voip.q1 q1Var = this.b.a0;
                q1Var.d0 = false;
                q1Var.invalidate();
                break;
            case 5:
                hc1 hc1Var = this.b;
                hc1Var.q0 = hc1Var.p0;
                hc1Var.y();
                break;
            case 6:
                this.b.s();
                break;
            case 7:
                int[] iArr = new int[2];
                hc1 hc1Var2 = this.b;
                hc1Var2.f0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                hc1Var2.e.getLocationOnScreen(iArr);
                hc1Var2.e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.h.getLocationOnScreen(iArr);
                hc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.f.getLocationOnScreen(iArr);
                hc1Var2.f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.n.getLocationOnScreen(iArr);
                hc1Var2.n.setTranslationX((((hc1Var2.f0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                hc1Var2.n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.n.setAlpha(1.0f);
                hc1Var2.e.setAlpha(1.0f);
                hc1Var2.h.setAlpha(1.0f);
                hc1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = hc1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j3 = org.telegram.messenger.ls.e3;
                translationX.setDuration(j3).start();
                hc1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                hc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                hc1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                int i11 = org.telegram.messenger.cz.f1;
                if (i11 < 2) {
                    org.telegram.messenger.cz.f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.cz.f1);
                    edit.apply();
                    hc1 hc1Var3 = this.b;
                    hc1Var3.O0.setTranslationY(hc1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    hc1Var3.O0.x();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                hc1 hc1Var4 = this.b;
                hc1Var4.u0.setAlpha(1.0f);
                hc1Var4.u0.invalidate();
                ValueAnimator b10 = hc1Var4.b(true);
                hc1Var4.I.setAlpha(0.0f);
                hc1Var4.J.setAlpha(0.0f);
                hc1Var4.O.setAlpha(0.0f);
                hc1Var4.Y.setAlpha(0.0f);
                hc1Var4.j0.setAlpha(0.0f);
                hc1Var4.h0.setAlpha(0.0f);
                hc1Var4.i0.setAlpha(0.0f);
                hc1Var4.L.setAlpha(0.0f);
                hc1Var4.M0.setAlpha(0.0f);
                hc1Var4.Z.c0 = true;
                org.telegram.messenger.g0.h3(new mz0(23, hc1Var4, b10), 32L);
                break;
            case 12:
                hc1 hc1Var5 = this.b;
                hc1Var5.R0 = false;
                org.telegram.ui.Components.rp rpVar = hc1Var5.N0;
                boolean z10 = rpVar != null && rpVar.W;
                if (hc1Var5.z0 && hc1Var5.x0 && !hc1Var5.C0 && !z10) {
                    hc1Var5.K0 = System.currentTimeMillis();
                    hc1Var5.r(false);
                    hc1Var5.q0 = hc1Var5.p0;
                    hc1Var5.y();
                    break;
                }
                break;
            case 13:
                hc1 hc1Var6 = this.b;
                if (hc1Var6.p0 == 3) {
                    hc1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.x2 x2Var = hc1Var6.w;
                    if (!x2Var.S) {
                        x2Var.S = true;
                        break;
                    }
                }
                break;
            default:
                hc1 hc1Var7 = this.b;
                if (!hc1Var7.G0 && !hc1Var7.E0) {
                    hc1Var7.g();
                    break;
                }
                break;
        }
    }
}
