package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s40(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((z60) this.c).h = null;
                break;
            case 4:
                tq0 tq0Var = (tq0) this.c;
                if (animator.equals(tq0Var.k0)) {
                    tq0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((f81) this.c).n = null;
                break;
            case 12:
                fg1 fg1Var = (fg1) this.c;
                AnimatorSet animatorSet = fg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg1Var.I = null;
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
        kd kdVar;
        org.telegram.ui.Cells.d4 d4Var;
        float f7;
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                x50 x50Var = (x50) obj;
                x50Var.U2 = null;
                x50Var.O.getSubtitleTextView().setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                z60 z60Var = (z60) obj;
                if (z60Var.h != null && (kdVar = z60Var.f) != null) {
                    if (z10) {
                        kdVar.setVisibility(4);
                    } else {
                        z60Var.n.setVisibility(4);
                    }
                    z60Var.h = null;
                    break;
                }
                break;
            case 2:
                ig0 ig0Var = (ig0) obj;
                if (!z10) {
                    ig0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.L = null;
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).v.setVisibility(8);
                    break;
                }
                break;
            case 4:
                tq0 tq0Var = (tq0) obj;
                if (animator.equals(tq0Var.k0)) {
                    if (!z10) {
                        tq0Var.Z.setVisibility(4);
                        tq0Var.a0.setVisibility(4);
                    }
                    tq0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((zv0) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 6:
                o01 o01Var = (o01) obj;
                if (o01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = o01Var.n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = o01Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = o01Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = o01Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    o01Var.setVisibility(8);
                }
                ProfileActivity profileActivity4 = o01Var.n;
                int i11 = ProfileActivity.R6;
                profileActivity4.x5(false);
                break;
            case 7:
                u11 u11Var = (u11) obj;
                if (z10) {
                    u11Var.c.setVisibility(8);
                    break;
                } else {
                    u11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                f41 f41Var = (f41) obj;
                f41Var.v = z10 ? 1.0f : 0.0f;
                if (f41Var.S) {
                    f41Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                b61 b61Var = (b61) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b61Var.v;
                float f10 = z10 ? 1.0f : 0.0f;
                b61Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.g.getInterpolation(b61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(b61Var.L, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setAlpha(cascade);
                }
                b61Var.N = null;
                break;
            case 10:
                f81 f81Var = (f81) obj;
                if (f81Var.n != null && (d4Var = f81Var.r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    f81Var.n = null;
                    break;
                }
                break;
            case 11:
                ((kd1) obj).y = z10 ? 1.0f : 0.0f;
                break;
            case 12:
                fg1 fg1Var = (fg1) obj;
                AnimatorSet animatorSet2 = fg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        fg1Var.e.setVisibility(4);
                        break;
                    } else {
                        fg1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                bi.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                f7 = z10 ? 1.0f : 0.0f;
                u1Var.U = f7;
                tVar.setAlpha(f7);
                u1Var.invalidate();
                if (u1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    break;
                } else {
                    tVar.clearFocus();
                    AndroidUtilities.hideKeyboard(tVar);
                    break;
                }
            case 14:
                l0 l0Var = (l0) obj;
                bi.t tVar2 = l0Var.b0;
                if (!l0Var.W) {
                    tVar2.setVisibility(8);
                }
                f7 = z10 ? 1.0f : 0.0f;
                l0Var.a0 = f7;
                tVar2.setAlpha(f7);
                l0Var.j(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 15:
                sg.z1 z1Var = (sg.z1) obj;
                ((rg.n) z1Var).y.n.d();
                if (z10) {
                    z1Var.w.accept(Integer.valueOf(z1Var.s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    break;
                }
                break;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.j0 = false;
                }
                Runnable runnable = limitPreviewView.k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.k0.run();
                    break;
                }
                break;
            default:
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.O = z10 ? 1.0f : 0.0f;
                p0Var.f.invalidate();
                tg.o0 o0Var = p0Var.h;
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
            case 2:
                if (this.b) {
                    ((ig0) this.c).V.setVisibility(0);
                    break;
                }
                break;
            case 3:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                o01 o01Var = (o01) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = o01Var.n.U0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = o01Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = o01Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = o01Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                o01Var.setVisibility(0);
                o01Var.n.x5(false);
                break;
            case 7:
                u11 u11Var = (u11) this.c;
                if (!this.b) {
                    u11Var.c.setAlpha(0.0f);
                    u11Var.c.setVisibility(0);
                    break;
                } else {
                    u11Var.f.setAlpha(0.0f);
                    u11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
