package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ vo(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((zo) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    faVar.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.vi) this.c).b1 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) this.c;
                AnimatorSet animatorSet2 = z00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z00Var.e = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.c;
                AnimatorSet animatorSet3 = p70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    p70Var.X = null;
                    break;
                }
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.xv0) this.c).N1 = null;
                break;
            case 24:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.c;
                AnimatorSet animatorSet4 = m71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    m71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) this.c;
                AnimatorSet animatorSet5 = q71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    q71Var.r = null;
                    break;
                }
                break;
            case 27:
                ((ws) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        ViewGroup viewGroup;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                zo zoVar = (zo) this.c;
                if (zoVar.h != null && (radialProgressView = zoVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        zoVar.f.setVisibility(4);
                    }
                    zoVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        faVar.c.setVisibility(4);
                        break;
                    } else {
                        faVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.c;
                if (animator == adVar.g) {
                    adVar.g = null;
                    adVar.j = this.b ? 1.0f : 0.0f;
                    adVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.c;
                if (viVar.b1 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.u0 u0Var = viVar.h1;
                        if (u0Var != null) {
                            u0Var.setVisibility(4);
                        }
                        if (viVar.T0 != 0 || !viVar.t1) {
                            viVar.d1.setVisibility(4);
                            break;
                        }
                    } else if (viVar.V0) {
                        org.telegram.ui.Components.ni niVar = viVar.B0;
                        if (niVar == null || niVar.L()) {
                            viVar.A1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.z9 z9Var = woVar.h;
                    woVar.h = woVar.n;
                    woVar.n = z9Var;
                    z9Var.setVisibility(8);
                    woVar.n.setAlpha(0.0f);
                    woVar.h.setVisibility(0);
                    woVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.c;
                if (animator == gpVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    gpVar.d = f7;
                    gpVar.setShown(f7);
                    if (!z10) {
                        gpVar.setVisibility(8);
                    }
                    gpVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.c;
                zpVar.g0 = this.b ? 1.0f : 0.0f;
                zpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.g0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.zq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.kw kwVar = (org.telegram.ui.Components.kw) this.c;
                org.telegram.ui.Components.ow owVar = kwVar.J;
                if (owVar.U && !kwVar.h) {
                    if (!this.b && !kwVar.n) {
                        kwVar.setBackground(null);
                        break;
                    } else if (kwVar.getBackground() == null) {
                        kwVar.setBackground(org.telegram.ui.ActionBar.g6.Z(owVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) this.c;
                AnimatorSet animatorSet2 = z00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        z00Var.f.setVisibility(4);
                    }
                    z00Var.e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) this.c;
                k10Var.h = this.b ? 1.0f : 0.0f;
                k10Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) this.c;
                org.telegram.ui.Components.k30 k30Var = m30Var.a;
                if (!m30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    m30Var.b0 = f10;
                    m30Var.U.setPinnedProgress(f10);
                    k30Var.setScaleX(1.0f - (m30Var.b0 * 0.6f));
                    k30Var.setScaleY(1.0f - (m30Var.b0 * 0.6f));
                    if (m30Var.W) {
                        m30Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.c;
                AnimatorSet animatorSet3 = p70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        p70Var.Y.setVisibility(4);
                    }
                    p70Var.X = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) this.c;
                boolean z11 = this.b;
                a80Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.e3) a80Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    a80Var.V.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) this.c;
                if (vc0Var.getParent() != null) {
                    ((ViewGroup) vc0Var.getParent()).removeView(vc0Var);
                }
                boolean z12 = this.b;
                nl nlVar = (nl) vc0Var;
                MessagePreviewParams messagePreviewParams = nlVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new ml(nlVar, 0), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) this.c;
                pc0Var.P = null;
                pc0Var.g(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.re0 re0Var = (org.telegram.ui.Components.re0) this.c;
                TextView textView = re0Var.w;
                bi.i5 i5Var = re0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                i5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                i5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                i5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                re0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                boolean z13 = this.b;
                org.telegram.ui.Components.ko0 ko0Var = (org.telegram.ui.Components.ko0) this.c;
                if (animator == ko0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    ko0Var.F = f12;
                    ko0Var.setShown(f12);
                    if (!z13) {
                        ko0Var.setVisibility(8);
                    }
                    ko0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.c;
                if (xv0Var.N1 != null) {
                    xv0Var.N1 = null;
                    if (!this.b) {
                        xv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.c;
                v21Var.M = this.b ? 1.0f : 0.0f;
                v21Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.t31 t31Var = (org.telegram.ui.Components.t31) this.c;
                t31Var.F = this.b ? 1.0f : 0.0f;
                t31Var.h();
                break;
            case 23:
                org.telegram.ui.Components.x31 x31Var = (org.telegram.ui.Components.x31) this.c;
                x31Var.Q = this.b ? 1.0f : 0.0f;
                x31Var.h();
                x31Var.g();
                break;
            case 24:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.c;
                AnimatorSet animatorSet4 = m71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        m71Var.e.setVisibility(4);
                    }
                    m71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) this.c;
                AnimatorSet animatorSet5 = q71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        q71Var.n.setVisibility(4);
                    }
                    q71Var.r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.c;
                u2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.G && (drawable = (drawableArr = u2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.G = false;
                if (!u2Var.O) {
                    u2Var.n = u2Var.r;
                }
                u2Var.s = 0.0f;
                u2Var.invalidate();
                break;
            case 27:
                ws wsVar = (ws) this.c;
                if (wsVar.w != null && (radialProgressView2 = wsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        wsVar.v.setVisibility(4);
                    }
                    wsVar.w = null;
                    break;
                }
                break;
            case 28:
                pz pzVar = (pz) this.c;
                pzVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.z9 z9Var2 = pzVar.c;
                int i10 = org.telegram.ui.ActionBar.g6.C6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i10, pzVar.a);
                int i11 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(pzVar.r, w02, org.telegram.ui.ActionBar.g6.w0(i11, pzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                z9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                pzVar.c.invalidate();
                pzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - pzVar.r, org.telegram.ui.ActionBar.g6.w0(i10, pzVar.a), org.telegram.ui.ActionBar.g6.w0(i11, pzVar.a)), mode));
                pzVar.f.invalidate();
                break;
            default:
                e10 e10Var = (e10) this.c;
                e10Var.s = this.b ? 1.0f : 0.0f;
                e10Var.invalidate();
                break;
        }
    }

    public vo(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public vo(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public vo(org.telegram.ui.Components.wo woVar) {
        this.a = 4;
        this.c = woVar;
    }
}
