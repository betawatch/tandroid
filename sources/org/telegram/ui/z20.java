package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z20(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((c50) this.c).h = null;
                break;
            case 4:
                zm0 zm0Var = (zm0) this.c;
                if (animator.equals(zm0Var.l0)) {
                    zm0Var.l0 = null;
                    break;
                }
                break;
            case 10:
                ((k31) this.c).n = null;
                break;
            case 12:
                xa1 xa1Var = (xa1) this.c;
                AnimatorSet animatorSet = xa1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xa1Var.J = null;
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
        org.telegram.ui.Cells.b4 b4Var;
        float f10;
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                c40 c40Var = (c40) obj;
                c40Var.T4 = null;
                c40Var.J1.getSubtitleTextView().setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
                break;
            case 1:
                c50 c50Var = (c50) obj;
                if (c50Var.h != null && (xcVar = c50Var.f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        c50Var.n.setVisibility(4);
                    }
                    c50Var.h = null;
                    break;
                }
                break;
            case 2:
                ce0 ce0Var = (ce0) obj;
                if (!z10) {
                    ce0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = ce0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ce0Var.M = null;
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 4:
                zm0 zm0Var = (zm0) obj;
                if (animator.equals(zm0Var.l0)) {
                    if (!z10) {
                        zm0Var.a0.setVisibility(4);
                        zm0Var.b0.setVisibility(4);
                    }
                    zm0Var.l0 = null;
                    break;
                }
                break;
            case 5:
                ((xr0) obj).F = z10 ? 1.0f : 0.0f;
                break;
            case 6:
                lw0 lw0Var = (lw0) obj;
                ProfileActivity profileActivity = lw0Var.n;
                if (lw0Var.h) {
                    org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                    if (d5Var != null) {
                        d5Var.setClickable(false);
                    }
                } else {
                    lw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.X6;
                profileActivity.O5(false);
                break;
            case 7:
                mx0 mx0Var = (mx0) obj;
                if (z10) {
                    mx0Var.c.setVisibility(8);
                    break;
                } else {
                    mx0Var.f.setVisibility(8);
                    break;
                }
            case 8:
                pz0 pz0Var = (pz0) obj;
                pz0Var.w = z10 ? 1.0f : 0.0f;
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                    break;
                }
                break;
            case 9:
                j11 j11Var = (j11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j11Var.w;
                float f11 = z10 ? 1.0f : 0.0f;
                j11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.g.getInterpolation(j11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(j11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                j11Var.O = null;
                break;
            case 10:
                k31 k31Var = (k31) obj;
                if (k31Var.n != null && (b4Var = k31Var.r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    k31Var.n = null;
                    break;
                }
                break;
            case 11:
                ((e81) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 12:
                xa1 xa1Var = (xa1) obj;
                AnimatorSet animatorSet2 = xa1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        xa1Var.e.setVisibility(4);
                        break;
                    } else {
                        xa1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) obj;
                di.q qVar = j1Var.W;
                if (!j1Var.U) {
                    qVar.setVisibility(8);
                    qVar.setText("");
                }
                f10 = z10 ? 1.0f : 0.0f;
                j1Var.V = f10;
                qVar.setAlpha(f10);
                j1Var.invalidate();
                if (j1Var.U) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.J3(qVar);
                    break;
                } else {
                    qVar.clearFocus();
                    org.telegram.messenger.g0.v1(qVar);
                    break;
                }
            case 14:
                l0 l0Var = (l0) obj;
                di.q qVar2 = l0Var.c0;
                if (!l0Var.a0) {
                    qVar2.setVisibility(8);
                }
                f10 = z10 ? 1.0f : 0.0f;
                l0Var.b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.b0);
                l0Var.invalidate();
                break;
            case 15:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).E.s1.d();
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
                ug.q0 q0Var = (ug.q0) obj;
                q0Var.P = z10 ? 1.0f : 0.0f;
                q0Var.f.invalidate();
                ug.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.invalidate();
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
                    ((ce0) this.c).W.setVisibility(0);
                    break;
                }
                break;
            case 3:
                if (this.b) {
                    ((PasscodeActivity) this.c).w.setVisibility(0);
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                lw0 lw0Var = (lw0) this.c;
                ProfileActivity profileActivity = lw0Var.n;
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                if (d5Var != null && !this.b) {
                    d5Var.setClickable(true);
                }
                profileActivity.E5(true);
                lw0Var.setVisibility(0);
                profileActivity.O5(false);
                break;
            case 7:
                mx0 mx0Var = (mx0) this.c;
                if (!this.b) {
                    mx0Var.c.setAlpha(0.0f);
                    mx0Var.c.setVisibility(0);
                    break;
                } else {
                    mx0Var.f.setAlpha(0.0f);
                    mx0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
