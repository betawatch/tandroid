package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic1 b;

    public /* synthetic */ tb1(ic1 ic1Var, int i7) {
        this.a = i7;
        this.b = ic1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t0.b();
                break;
            case 1:
                this.b.t0.b();
                break;
            case 2:
                this.b.t0.b();
                break;
            case 3:
                this.b.t0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.n1 n1Var = this.b.Z;
                n1Var.c0 = false;
                n1Var.invalidate();
                break;
            case 5:
                ic1 ic1Var = this.b;
                ic1Var.p0 = ic1Var.o0;
                ic1Var.y();
                break;
            case 6:
                this.b.s();
                break;
            case 7:
                int[] iArr = new int[2];
                ic1 ic1Var2 = this.b;
                ic1Var2.e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                ic1Var2.e.getLocationOnScreen(iArr);
                ic1Var2.e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.h.getLocationOnScreen(iArr);
                ic1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.f.getLocationOnScreen(iArr);
                ic1Var2.f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.n.getLocationOnScreen(iArr);
                ic1Var2.n.setTranslationX((((ic1Var2.e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                ic1Var2.n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.n.setAlpha(1.0f);
                ic1Var2.e.setAlpha(1.0f);
                ic1Var2.h.setAlpha(1.0f);
                ic1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = ic1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j3 = org.telegram.messenger.qs.e3;
                translationX.setDuration(j3).start();
                ic1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ic1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ic1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.t0.b();
                break;
            case 9:
                int i11 = org.telegram.messenger.iz.f1;
                if (i11 < 2) {
                    org.telegram.messenger.iz.f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f1);
                    edit.apply();
                    ic1 ic1Var3 = this.b;
                    ic1Var3.N0.setTranslationY(ic1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    ic1Var3.N0.w();
                    break;
                }
                break;
            case 10:
                this.b.t0.b();
                break;
            case 11:
                ic1 ic1Var4 = this.b;
                ic1Var4.t0.setAlpha(1.0f);
                ic1Var4.t0.invalidate();
                ValueAnimator b10 = ic1Var4.b(true);
                ic1Var4.H.setAlpha(0.0f);
                ic1Var4.I.setAlpha(0.0f);
                ic1Var4.N.setAlpha(0.0f);
                ic1Var4.X.setAlpha(0.0f);
                ic1Var4.i0.setAlpha(0.0f);
                ic1Var4.g0.setAlpha(0.0f);
                ic1Var4.h0.setAlpha(0.0f);
                ic1Var4.K.setAlpha(0.0f);
                ic1Var4.L0.setAlpha(0.0f);
                ic1Var4.Y.b0 = true;
                org.telegram.messenger.g0.i3(new wb1(0, ic1Var4, b10), 32L);
                break;
            case 12:
                ic1 ic1Var5 = this.b;
                ic1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = ic1Var5.M0;
                boolean z9 = zoVar != null && zoVar.V;
                if (ic1Var5.y0 && ic1Var5.w0 && !ic1Var5.B0 && !z9) {
                    ic1Var5.J0 = System.currentTimeMillis();
                    ic1Var5.r(false);
                    ic1Var5.p0 = ic1Var5.o0;
                    ic1Var5.y();
                    break;
                }
                break;
            case 13:
                ic1 ic1Var6 = this.b;
                if (ic1Var6.o0 == 3) {
                    ic1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = ic1Var6.w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        break;
                    }
                }
                break;
            default:
                ic1 ic1Var7 = this.b;
                if (!ic1Var7.F0 && !ic1Var7.D0) {
                    ic1Var7.g();
                    break;
                }
                break;
        }
    }
}
