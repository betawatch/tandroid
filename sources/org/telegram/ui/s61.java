package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s61(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((w81) this.c).r = null;
                break;
            case 3:
                wg1 wg1Var = (wg1) this.c;
                AnimatorSet animatorSet = wg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg1Var.F = null;
                    break;
                }
                break;
            case 15:
                ((sh.n) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Cells.x3 x3Var;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                t61 t61Var = (t61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t61Var.v;
                float f10 = this.b ? 1.0f : 0.0f;
                t61Var.I = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.mr.g.getInterpolation(t61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t61Var.I, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10).setAlpha(cascade);
                }
                t61Var.K = null;
                break;
            case 1:
                w81 w81Var = (w81) this.c;
                if (w81Var.r != null && (x3Var = w81Var.s) != null) {
                    if (!this.b) {
                        x3Var.setVisibility(4);
                    }
                    w81Var.r = null;
                    break;
                }
                break;
            case 2:
                ((yd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 3:
                wg1 wg1Var = (wg1) this.c;
                AnimatorSet animatorSet = wg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.b) {
                        wg1Var.e.setVisibility(4);
                        break;
                    } else {
                        wg1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                lh.n nVar = u1Var.S;
                if (!u1Var.Q) {
                    nVar.setVisibility(8);
                    nVar.setText("");
                }
                float f11 = this.b ? 1.0f : 0.0f;
                u1Var.R = f11;
                nVar.setAlpha(f11);
                u1Var.invalidate();
                if (u1Var.Q) {
                    nVar.requestFocus();
                    AndroidUtilities.showKeyboard(nVar);
                    break;
                } else {
                    nVar.clearFocus();
                    AndroidUtilities.hideKeyboard(nVar);
                    break;
                }
            case 5:
                o0 o0Var = (o0) this.c;
                lh.n nVar2 = o0Var.V;
                if (!o0Var.T) {
                    nVar2.setVisibility(8);
                }
                float f12 = this.b ? 1.0f : 0.0f;
                o0Var.U = f12;
                nVar2.setAlpha(f12);
                o0Var.j(o0Var.U);
                o0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.U);
                o0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.U);
                o0Var.invalidate();
                break;
            case 6:
                ph.d dVar = (ph.d) this.c;
                dVar.J = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 7:
                ph.k kVar = (ph.k) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    kVar.r.setVisibility(8);
                    org.telegram.ui.Components.zh zhVar = kVar.J;
                    if (zhVar != null) {
                        zhVar.setVisibility(8);
                    }
                }
                if (z4) {
                    kVar.f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z4);
                break;
            case 8:
                ph.u uVar = (ph.u) this.c;
                m3 m3Var = uVar.a;
                boolean z10 = this.b;
                uVar.d = z10 ? 1.0f : 0.0f;
                m3Var.invalidate();
                m3Var.setVisibility(z10 ? 0 : 8);
                break;
            case 9:
                if (!this.b) {
                    ((ph.a3) this.c).F.setVisibility(8);
                    break;
                }
                break;
            case 10:
                if (!this.b) {
                    ((ph.r3) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 11:
                ph.c5 c5Var = (ph.c5) this.c;
                if (!this.b) {
                    c5Var.W1.setVisibility(8);
                    c5Var.W1.n();
                    break;
                }
                break;
            case 12:
                ph.w7 w7Var = (ph.w7) this.c;
                if (this.b) {
                    w7Var.setVisibility(8);
                }
                w7Var.c = null;
                break;
            case 13:
                ph.da daVar = (ph.da) this.c;
                if (!this.b) {
                    daVar.S0.setVisibility(8);
                }
                daVar.c2 = null;
                break;
            case 14:
                rh.p2 p2Var = (rh.p2) this.c;
                p2Var.K0 = this.b ? 1.0f : 0.0f;
                p2Var.h();
                break;
            case 15:
                sh.n nVar3 = (sh.n) this.c;
                if (nVar3.w != null && (radialProgressView = nVar3.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar3.s.setVisibility(4);
                    }
                    nVar3.w = null;
                    break;
                }
                break;
            case 16:
                tf.x0 x0Var = (tf.x0) this.c;
                boolean z11 = this.b;
                x0Var.e = z11 ? 1.0f : 0.0f;
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i11].setVisibility((i11 == 1) == z11 ? 0 : 8);
                    x0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility((i11 == 1) == z11 ? 0 : 8);
                    x0Var.d[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    i11++;
                }
                break;
            default:
                if (this.b) {
                    ((yf.n) this.c).e(false, false, true, false);
                    break;
                }
                break;
        }
    }
}
