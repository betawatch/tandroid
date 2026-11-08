package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class z40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z40(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((d50) this.c).h = null;
                break;
            case 3:
                xm0 xm0Var = (xm0) this.c;
                if (animator.equals(xm0Var.k0)) {
                    xm0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((m31) this.c).n = null;
                break;
            case 11:
                za1 za1Var = (za1) this.c;
                AnimatorSet animatorSet = za1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    za1Var.I = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yc ycVar;
        float f10;
        org.telegram.ui.Cells.b4 b4Var;
        int i7 = this.a;
        boolean z9 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                d50 d50Var = (d50) obj;
                if (d50Var.h != null && (ycVar = d50Var.f) != null) {
                    if (z9) {
                        ycVar.setVisibility(4);
                    } else {
                        d50Var.n.setVisibility(4);
                    }
                    d50Var.h = null;
                    break;
                }
                break;
            case 1:
                ce0 ce0Var = (ce0) obj;
                if (!z9) {
                    ce0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ce0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ce0Var.L = null;
                    break;
                }
                break;
            case 2:
                if (!z9) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 3:
                xm0 xm0Var = (xm0) obj;
                if (animator.equals(xm0Var.k0)) {
                    if (!z9) {
                        xm0Var.Z.setVisibility(4);
                        xm0Var.a0.setVisibility(4);
                    }
                    xm0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((zr0) obj).E = z9 ? 1.0f : 0.0f;
                break;
            case 5:
                mw0 mw0Var = (mw0) obj;
                ProfileActivity profileActivity = mw0Var.n;
                if (mw0Var.h) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var != null) {
                        f5Var.setClickable(false);
                    }
                } else {
                    mw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.S6;
                profileActivity.L5(false);
                break;
            case 6:
                nx0 nx0Var = (nx0) obj;
                if (z9) {
                    nx0Var.c.setVisibility(8);
                    break;
                } else {
                    nx0Var.f.setVisibility(8);
                    break;
                }
            case 7:
                rz0 rz0Var = (rz0) obj;
                rz0Var.w = z9 ? 1.0f : 0.0f;
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                m11 m11Var = (m11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.w;
                f10 = z9 ? 1.0f : 0.0f;
                m11Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(s5);
                }
                m11Var.N = null;
                break;
            case 9:
                m31 m31Var = (m31) obj;
                if (m31Var.n != null && (b4Var = m31Var.r) != null) {
                    if (!z9) {
                        b4Var.setVisibility(4);
                    }
                    m31Var.n = null;
                    break;
                }
                break;
            case 10:
                ((g81) obj).D = z9 ? 1.0f : 0.0f;
                break;
            case 11:
                za1 za1Var = (za1) obj;
                AnimatorSet animatorSet2 = za1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z9) {
                        za1Var.e.setVisibility(4);
                        break;
                    } else {
                        za1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.k1 k1Var = (org.telegram.ui.web.k1) obj;
                bi.v vVar = k1Var.V;
                if (!k1Var.T) {
                    vVar.setVisibility(8);
                    vVar.setText("");
                }
                f10 = z9 ? 1.0f : 0.0f;
                k1Var.U = f10;
                vVar.setAlpha(f10);
                k1Var.invalidate();
                if (k1Var.T) {
                    vVar.requestFocus();
                    org.telegram.messenger.g0.K3(vVar);
                    break;
                } else {
                    vVar.clearFocus();
                    org.telegram.messenger.g0.v1(vVar);
                    break;
                }
            case 13:
                l0 l0Var = (l0) obj;
                bi.v vVar2 = l0Var.b0;
                if (!l0Var.W) {
                    vVar2.setVisibility(8);
                }
                f10 = z9 ? 1.0f : 0.0f;
                l0Var.a0 = f10;
                vVar2.setAlpha(f10);
                l0Var.j(l0Var.a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 14:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).D.o1.c();
                if (z9) {
                    o1Var.x.accept(Integer.valueOf(o1Var.s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    break;
                }
                break;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z9) {
                    limitPreviewView.j0 = false;
                }
                Runnable runnable = limitPreviewView.k0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.k0.run();
                    break;
                }
                break;
            default:
                ug.p0 p0Var = (ug.p0) obj;
                p0Var.O = z9 ? 1.0f : 0.0f;
                p0Var.f.invalidate();
                ug.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b) {
                    ((ce0) this.c).V.setVisibility(0);
                    break;
                }
                break;
            case 2:
                if (this.b) {
                    ((PasscodeActivity) this.c).w.setVisibility(0);
                    break;
                }
                break;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                mw0 mw0Var = (mw0) this.c;
                ProfileActivity profileActivity = mw0Var.n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null && !this.b) {
                    f5Var.setClickable(true);
                }
                profileActivity.B5(true);
                mw0Var.setVisibility(0);
                profileActivity.L5(false);
                break;
            case 6:
                nx0 nx0Var = (nx0) this.c;
                if (!this.b) {
                    nx0Var.c.setAlpha(0.0f);
                    nx0Var.c.setVisibility(0);
                    break;
                } else {
                    nx0Var.f.setAlpha(0.0f);
                    nx0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
