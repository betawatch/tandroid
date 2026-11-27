// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xjc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mkc b;

    public /* synthetic */ xjc(mkc mkcVar, byte b) {
        this.a = b;
        this.b = mkcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mkc mkcVar = this.b;
        switch (b) {
            case 0:
                mkcVar.u0.b();
                break;
            case 1:
                mkcVar.u0.b();
                break;
            case 2:
                mkcVar.u0.b();
                break;
            case 3:
                ujc ujcVar = mkcVar.a0;
                ujcVar.d0 = false;
                ujcVar.invalidate();
                break;
            case 4:
                mkcVar.u0.b();
                break;
            case 5:
                mkcVar.q0 = mkcVar.p0;
                mkcVar.y();
                break;
            case 6:
                mkcVar.s();
                break;
            case 7:
                int[] iArr = new int[2];
                mkcVar.f0.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                mkcVar.e.getLocationOnScreen(iArr);
                mkcVar.e.setTranslationX(hl.L(42.0f) + (i - iArr[0]));
                mkcVar.e.setTranslationY(hl.L(44.0f) + (i2 - iArr[1]));
                mkcVar.h.getLocationOnScreen(iArr);
                mkcVar.h.setTranslationX(hl.L(42.0f) + (i - iArr[0]));
                mkcVar.h.setTranslationY(hl.L(44.0f) + (i2 - iArr[1]));
                mkcVar.f.getLocationOnScreen(iArr);
                mkcVar.f.setTranslationX(hl.L(42.0f) + (i - iArr[0]));
                mkcVar.f.setTranslationY(hl.L(44.0f) + (i2 - iArr[1]));
                mkcVar.n.getLocationOnScreen(iArr);
                mkcVar.n.setTranslationX((((mkcVar.f0.getWidth() + i) - iArr[0]) - hl.L(49.0f)) - hl.L(60.0f));
                mkcVar.n.setTranslationY(hl.L(44.0f) + (i2 - iArr[1]));
                mkcVar.n.setAlpha(1.0f);
                mkcVar.e.setAlpha(1.0f);
                mkcVar.h.setAlpha(1.0f);
                mkcVar.f.setAlpha(1.0f);
                mkcVar.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                mkcVar.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                mkcVar.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                mkcVar.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                break;
            case 8:
                mkcVar.u0.b();
                break;
            case 9:
                int i3 = xea.b1;
                if (i3 < 2) {
                    xea.b1 = i3 + 1;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", xea.b1);
                    edit.apply();
                    mkcVar.O0.setTranslationY(mkcVar.O.getY() + hl.L(36.0f));
                    mkcVar.O0.v();
                    break;
                }
                break;
            case 10:
                mkcVar.u0.b();
                break;
            case 11:
                mkcVar.u0.setAlpha(1.0f);
                mkcVar.u0.invalidate();
                ValueAnimator a = mkcVar.a(true);
                mkcVar.I.setAlpha(0.0f);
                mkcVar.J.setAlpha(0.0f);
                mkcVar.O.setAlpha(0.0f);
                mkcVar.Y.setAlpha(0.0f);
                mkcVar.j0.setAlpha(0.0f);
                mkcVar.h0.setAlpha(0.0f);
                mkcVar.i0.setAlpha(0.0f);
                mkcVar.L.setAlpha(0.0f);
                mkcVar.M0.setAlpha(0.0f);
                mkcVar.Z.c0 = true;
                hl.d3(new g9c(mkcVar, a, (byte) 28), 32L);
                break;
            case 12:
                mkcVar.R0 = false;
                ug2 ug2Var = mkcVar.N0;
                boolean z = ug2Var != null && ug2Var.W;
                if (mkcVar.z0 && mkcVar.x0 && !mkcVar.C0 && !z) {
                    mkcVar.K0 = System.currentTimeMillis();
                    mkcVar.r(false);
                    mkcVar.q0 = mkcVar.p0;
                    mkcVar.y();
                    break;
                }
                break;
            case 13:
                if (mkcVar.p0 == 3) {
                    mkcVar.E.b(true, false);
                    wmc wmcVar = mkcVar.w;
                    if (!wmcVar.S) {
                        wmcVar.S = true;
                        break;
                    }
                }
                break;
            default:
                if (!mkcVar.G0 && !mkcVar.E0) {
                    mkcVar.g();
                    break;
                }
                break;
        }
    }
}
