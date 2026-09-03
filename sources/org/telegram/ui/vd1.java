package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vd1(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                vg1 vg1Var = (vg1) this.c;
                AnimatorSet animatorSet = vg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg1Var.F = null;
                    break;
                }
                break;
            case 15:
                ((th.n) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View m9;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                ((zd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 1:
                vg1 vg1Var = (vg1) this.c;
                AnimatorSet animatorSet = vg1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        vg1Var.b.setVisibility(4);
                        break;
                    } else {
                        vg1Var.e.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.c;
                mh.m mVar = t1Var.S;
                if (!t1Var.Q) {
                    mVar.setVisibility(8);
                    mVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                t1Var.R = f10;
                mVar.setAlpha(f10);
                t1Var.invalidate();
                if (!t1Var.Q) {
                    mVar.clearFocus();
                    AndroidUtilities.hideKeyboard(mVar);
                    break;
                } else {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    break;
                }
            case 3:
                m0 m0Var = (m0) this.c;
                mh.m mVar2 = m0Var.V;
                if (!m0Var.T) {
                    mVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                m0Var.U = f11;
                mVar2.setAlpha(f11);
                m0Var.j(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                break;
            case 4:
                ph.p pVar = (ph.p) this.c;
                boolean z4 = this.b;
                pVar.w = z4 ? 1.0f : 0.0f;
                pVar.r.setTranslationY(AndroidUtilities.dp(z4 ? 0.0f : -42.0f));
                pVar.n.setTranslationY(AndroidUtilities.dp(z4 ? 42.0f : 0.0f));
                break;
            case 5:
                ph.l lVar = (ph.l) this.c;
                org.telegram.ui.Components.g61 g61Var = lVar.h;
                ph.e eVar = lVar.f;
                ph.g gVar = lVar.v;
                lVar.b = false;
                boolean z10 = this.b;
                if (z10) {
                    int i10 = lVar.e;
                    lVar.d = i10;
                    lVar.T.y = i10;
                    SharedConfig.setStoriesColumnsCount(i10);
                }
                int h = gVar.h();
                if (z10) {
                    g61Var.y1(lVar.d);
                    eVar.a0();
                    if (gVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(eVar);
                    } else {
                        gVar.l();
                    }
                }
                lVar.r.setVisibility(8);
                int i11 = lVar.P;
                if (i11 >= 0) {
                    if (z10 && (m9 = lVar.s.m(i11)) != null) {
                        lVar.Q = m9.getTop();
                    }
                    g61Var.h1(lVar.P, (-eVar.getPaddingTop()) + lVar.Q);
                }
                super.onAnimationEnd(animator);
                break;
            case 6:
                qh.d dVar = (qh.d) this.c;
                dVar.J = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 7:
                qh.k kVar = (qh.k) this.c;
                boolean z11 = this.b;
                if (!z11) {
                    kVar.r.setVisibility(8);
                    org.telegram.ui.Components.zh zhVar = kVar.J;
                    if (zhVar != null) {
                        zhVar.setVisibility(8);
                    }
                }
                if (z11) {
                    kVar.f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z11);
                break;
            case 8:
                qh.u uVar = (qh.u) this.c;
                k3 k3Var = uVar.a;
                boolean z12 = this.b;
                uVar.d = z12 ? 1.0f : 0.0f;
                k3Var.invalidate();
                k3Var.setVisibility(z12 ? 0 : 8);
                break;
            case 9:
                if (!this.b) {
                    ((qh.z2) this.c).F.setVisibility(8);
                    break;
                }
                break;
            case 10:
                if (!this.b) {
                    ((qh.q3) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 11:
                qh.a5 a5Var = (qh.a5) this.c;
                if (!this.b) {
                    a5Var.W1.setVisibility(8);
                    a5Var.W1.n();
                    break;
                }
                break;
            case 12:
                qh.u7 u7Var = (qh.u7) this.c;
                if (this.b) {
                    u7Var.setVisibility(8);
                }
                u7Var.c = null;
                break;
            case 13:
                qh.ba baVar = (qh.ba) this.c;
                if (!this.b) {
                    baVar.S0.setVisibility(8);
                }
                baVar.c2 = null;
                break;
            case 14:
                sh.p2 p2Var = (sh.p2) this.c;
                p2Var.K0 = this.b ? 1.0f : 0.0f;
                p2Var.h();
                break;
            case 15:
                th.n nVar = (th.n) this.c;
                if (nVar.w != null && (radialProgressView = nVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar.s.setVisibility(4);
                    }
                    nVar.w = null;
                    break;
                }
                break;
            case 16:
                uf.x0 x0Var = (uf.x0) this.c;
                boolean z13 = this.b;
                x0Var.e = z13 ? 1.0f : 0.0f;
                x0Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    x0Var.c[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i12].setVisibility((i12 == 1) == z13 ? 0 : 8);
                    x0Var.c[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i12].setVisibility((i12 == 1) == z13 ? 0 : 8);
                    x0Var.d[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, x0Var.e));
                    i12++;
                }
                break;
            default:
                if (this.b) {
                    ((zf.n) this.c).e(false, false, true, false);
                    break;
                }
                break;
        }
    }
}
