package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u40(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((y40) this.c).h = null;
                break;
            case 3:
                sm0 sm0Var = (sm0) this.c;
                if (animator.equals(sm0Var.l0)) {
                    sm0Var.l0 = null;
                    break;
                }
                break;
            case 9:
                ((c31) this.c).n = null;
                break;
            case 11:
                ra1 ra1Var = (ra1) this.c;
                AnimatorSet animatorSet = ra1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ra1Var.J = null;
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
        xc xcVar;
        float f10;
        org.telegram.ui.Cells.b4 b4Var;
        int i3 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                y40 y40Var = (y40) obj;
                if (y40Var.h != null && (xcVar = y40Var.f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        y40Var.n.setVisibility(4);
                    }
                    y40Var.h = null;
                    break;
                }
                break;
            case 1:
                xd0 xd0Var = (xd0) obj;
                if (!z10) {
                    xd0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = xd0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xd0Var.M = null;
                    break;
                }
                break;
            case 2:
                if (!z10) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 3:
                sm0 sm0Var = (sm0) obj;
                if (animator.equals(sm0Var.l0)) {
                    if (!z10) {
                        sm0Var.a0.setVisibility(4);
                        sm0Var.b0.setVisibility(4);
                    }
                    sm0Var.l0 = null;
                    break;
                }
                break;
            case 4:
                ((pr0) obj).F = z10 ? 1.0f : 0.0f;
                break;
            case 5:
                ew0 ew0Var = (ew0) obj;
                ProfileActivity profileActivity = ew0Var.n;
                if (ew0Var.h) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                    if (f5Var != null) {
                        f5Var.setClickable(false);
                    }
                } else {
                    ew0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.T6;
                profileActivity.L5(false);
                break;
            case 6:
                fx0 fx0Var = (fx0) obj;
                if (z10) {
                    fx0Var.c.setVisibility(8);
                    break;
                } else {
                    fx0Var.f.setVisibility(8);
                    break;
                }
            case 7:
                iz0 iz0Var = (iz0) obj;
                iz0Var.w = z10 ? 1.0f : 0.0f;
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                    break;
                }
                break;
            case 8:
                c11 c11Var = (c11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c11Var.w;
                f10 = z10 ? 1.0f : 0.0f;
                c11Var.M = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.g.getInterpolation(c11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s6 = org.telegram.messenger.g0.s(c11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s6);
                }
                c11Var.O = null;
                break;
            case 9:
                c31 c31Var = (c31) obj;
                if (c31Var.n != null && (b4Var = c31Var.r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    c31Var.n = null;
                    break;
                }
                break;
            case 10:
                ((w71) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 11:
                ra1 ra1Var = (ra1) obj;
                AnimatorSet animatorSet2 = ra1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        ra1Var.e.setVisibility(4);
                        break;
                    } else {
                        ra1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) obj;
                ci.s sVar = i1Var.W;
                if (!i1Var.U) {
                    sVar.setVisibility(8);
                    sVar.setText("");
                }
                f10 = z10 ? 1.0f : 0.0f;
                i1Var.V = f10;
                sVar.setAlpha(f10);
                i1Var.invalidate();
                if (i1Var.U) {
                    sVar.requestFocus();
                    org.telegram.messenger.g0.K3(sVar);
                    break;
                } else {
                    sVar.clearFocus();
                    org.telegram.messenger.g0.v1(sVar);
                    break;
                }
            case 13:
                m0 m0Var = (m0) obj;
                ci.s sVar2 = m0Var.c0;
                if (!m0Var.a0) {
                    sVar2.setVisibility(8);
                }
                f10 = z10 ? 1.0f : 0.0f;
                m0Var.b0 = f10;
                sVar2.setAlpha(f10);
                m0Var.j(m0Var.b0);
                m0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * m0Var.b0);
                m0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * m0Var.b0);
                m0Var.invalidate();
                break;
            case 14:
                if (z10) {
                    ((pg.m) obj).e(false, false, true, false);
                    break;
                }
                break;
            case 15:
                ug.o1 o1Var = (ug.o1) obj;
                ((tg.i) o1Var).E.p1.c();
                if (z10) {
                    o1Var.x.accept(Integer.valueOf(o1Var.s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    break;
                }
                break;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.k0 = false;
                }
                Runnable runnable = limitPreviewView.l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.l0.run();
                    break;
                }
                break;
            default:
                vg.o0 o0Var = (vg.o0) obj;
                o0Var.P = z10 ? 1.0f : 0.0f;
                o0Var.f.invalidate();
                vg.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.invalidate();
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
                    ((xd0) this.c).W.setVisibility(0);
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
                ew0 ew0Var = (ew0) this.c;
                ProfileActivity profileActivity = ew0Var.n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                if (f5Var != null && !this.b) {
                    f5Var.setClickable(true);
                }
                profileActivity.B5(true);
                ew0Var.setVisibility(0);
                profileActivity.L5(false);
                break;
            case 6:
                fx0 fx0Var = (fx0) this.c;
                if (!this.b) {
                    fx0Var.c.setAlpha(0.0f);
                    fx0Var.c.setVisibility(0);
                    break;
                } else {
                    fx0Var.f.setAlpha(0.0f);
                    fx0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
