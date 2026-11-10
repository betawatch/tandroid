package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc1 b;

    public /* synthetic */ vb1(jc1 jc1Var, int i7) {
        this.a = i7;
        this.b = jc1Var;
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
                jc1 jc1Var = this.b;
                jc1Var.p0 = jc1Var.o0;
                jc1Var.y();
                break;
            case 6:
                this.b.s();
                break;
            case 7:
                int[] iArr = new int[2];
                jc1 jc1Var2 = this.b;
                jc1Var2.e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                jc1Var2.e.getLocationOnScreen(iArr);
                jc1Var2.e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.h.getLocationOnScreen(iArr);
                jc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.f.getLocationOnScreen(iArr);
                jc1Var2.f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.n.getLocationOnScreen(iArr);
                jc1Var2.n.setTranslationX((((jc1Var2.e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                jc1Var2.n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.n.setAlpha(1.0f);
                jc1Var2.e.setAlpha(1.0f);
                jc1Var2.h.setAlpha(1.0f);
                jc1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = jc1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j3 = org.telegram.messenger.qs.e3;
                translationX.setDuration(j3).start();
                jc1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                jc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                jc1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
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
                    jc1 jc1Var3 = this.b;
                    jc1Var3.N0.setTranslationY(jc1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    jc1Var3.N0.w();
                    break;
                }
                break;
            case 10:
                this.b.t0.b();
                break;
            case 11:
                jc1 jc1Var4 = this.b;
                jc1Var4.t0.setAlpha(1.0f);
                jc1Var4.t0.invalidate();
                ValueAnimator b10 = jc1Var4.b(true);
                jc1Var4.H.setAlpha(0.0f);
                jc1Var4.I.setAlpha(0.0f);
                jc1Var4.N.setAlpha(0.0f);
                jc1Var4.X.setAlpha(0.0f);
                jc1Var4.i0.setAlpha(0.0f);
                jc1Var4.g0.setAlpha(0.0f);
                jc1Var4.h0.setAlpha(0.0f);
                jc1Var4.K.setAlpha(0.0f);
                jc1Var4.L0.setAlpha(0.0f);
                jc1Var4.Y.b0 = true;
                org.telegram.messenger.g0.i3(new sb1(1, jc1Var4, b10), 32L);
                break;
            case 12:
                jc1 jc1Var5 = this.b;
                jc1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = jc1Var5.M0;
                boolean z9 = zoVar != null && zoVar.V;
                if (jc1Var5.y0 && jc1Var5.w0 && !jc1Var5.B0 && !z9) {
                    jc1Var5.J0 = System.currentTimeMillis();
                    jc1Var5.r(false);
                    jc1Var5.p0 = jc1Var5.o0;
                    jc1Var5.y();
                    break;
                }
                break;
            case 13:
                jc1 jc1Var6 = this.b;
                if (jc1Var6.o0 == 3) {
                    jc1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = jc1Var6.w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        break;
                    }
                }
                break;
            default:
                jc1 jc1Var7 = this.b;
                if (!jc1Var7.F0 && !jc1Var7.D0) {
                    jc1Var7.g();
                    break;
                }
                break;
        }
    }
}
