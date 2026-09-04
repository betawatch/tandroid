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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class to extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ to(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((xo) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.vi) this.c).Y0 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) this.c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.r60 r60Var = (org.telegram.ui.Components.r60) this.c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r60Var.X = null;
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
                ((org.telegram.ui.Components.xu0) this.c).N1 = null;
                break;
            case 24:
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) this.c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j61Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.o61 o61Var = (org.telegram.ui.Components.o61) this.c;
                AnimatorSet animatorSet5 = o61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o61Var.r = null;
                    break;
                }
                break;
            case 27:
                ((ss) this.c).w = null;
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
                xo xoVar = (xo) this.c;
                if (xoVar.h != null && (radialProgressView = xoVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        xoVar.f.setVisibility(4);
                    }
                    xoVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        daVar.c.setVisibility(4);
                        break;
                    } else {
                        daVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.c;
                if (animator == zcVar.g) {
                    zcVar.g = null;
                    zcVar.i = this.b ? 1.0f : 0.0f;
                    zcVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.c;
                if (viVar.Y0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.v0 v0Var = viVar.e1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                        if (viVar.Q0 != 0 || !viVar.q1) {
                            viVar.a1.setVisibility(4);
                            break;
                        }
                    } else if (viVar.S0) {
                        org.telegram.ui.Components.ni niVar = viVar.y0;
                        if (niVar == null || niVar.J()) {
                            viVar.x1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.x9 x9Var = ioVar.h;
                    ioVar.h = ioVar.n;
                    ioVar.n = x9Var;
                    x9Var.setVisibility(8);
                    ioVar.n.setAlpha(0.0f);
                    ioVar.h.setVisibility(0);
                    ioVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.c;
                if (animator == soVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    soVar.d = f7;
                    soVar.setShown(f7);
                    if (!z10) {
                        soVar.setVisibility(8);
                    }
                    soVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) this.c;
                lpVar.g0 = this.b ? 1.0f : 0.0f;
                lpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * lpVar.g0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.lq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.xv xvVar = (org.telegram.ui.Components.xv) this.c;
                org.telegram.ui.Components.bw bwVar = xvVar.J;
                if (bwVar.U && !xvVar.h) {
                    if (!this.b && !xvVar.n) {
                        xvVar.setBackground(null);
                        break;
                    } else if (xvVar.getBackground() == null) {
                        xvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(bwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) this.c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        n00Var.f.setVisibility(4);
                    }
                    n00Var.e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.y00 y00Var = (org.telegram.ui.Components.y00) this.c;
                y00Var.h = this.b ? 1.0f : 0.0f;
                y00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.c;
                org.telegram.ui.Components.x20 x20Var = z20Var.a;
                if (!z20Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    z20Var.b0 = f10;
                    z20Var.U.setPinnedProgress(f10);
                    x20Var.setScaleX(1.0f - (z20Var.b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.r60 r60Var = (org.telegram.ui.Components.r60) this.c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        r60Var.Y.setVisibility(4);
                    }
                    r60Var.X = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.c;
                boolean z11 = this.b;
                b70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) b70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    b70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.wb0 wb0Var = (org.telegram.ui.Components.wb0) this.c;
                if (wb0Var.getParent() != null) {
                    ((ViewGroup) wb0Var.getParent()).removeView(wb0Var);
                }
                boolean z12 = this.b;
                il ilVar = (il) wb0Var;
                MessagePreviewParams messagePreviewParams = ilVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new hl(ilVar, 0), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.qb0 qb0Var = (org.telegram.ui.Components.qb0) this.c;
                qb0Var.P = null;
                qb0Var.g(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.c;
                TextView textView = sd0Var.w;
                bi.g5 g5Var = sd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                g5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                g5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                g5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                sd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.c;
                if (animator == hn0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    hn0Var.F = f12;
                    hn0Var.setShown(f12);
                    if (!z13) {
                        hn0Var.setVisibility(8);
                    }
                    hn0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) this.c;
                if (xu0Var.N1 != null) {
                    xu0Var.N1 = null;
                    if (!this.b) {
                        xu0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) this.c;
                t11Var.M = this.b ? 1.0f : 0.0f;
                t11Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) this.c;
                r21Var.F = this.b ? 1.0f : 0.0f;
                r21Var.h();
                break;
            case 23:
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.c;
                v21Var.Q = this.b ? 1.0f : 0.0f;
                v21Var.h();
                v21Var.g();
                break;
            case 24:
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) this.c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        j61Var.e.setVisibility(4);
                    }
                    j61Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.o61 o61Var = (org.telegram.ui.Components.o61) this.c;
                AnimatorSet animatorSet5 = o61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        o61Var.n.setVisibility(4);
                    }
                    o61Var.r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.c;
                t2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = t2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!t2Var.G && (drawable = (drawableArr = t2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                t2Var.G = false;
                if (!t2Var.O) {
                    t2Var.n = t2Var.r;
                }
                t2Var.s = 0.0f;
                t2Var.invalidate();
                break;
            case 27:
                ss ssVar = (ss) this.c;
                if (ssVar.w != null && (radialProgressView2 = ssVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.w = null;
                    break;
                }
                break;
            case 28:
                lz lzVar = (lz) this.c;
                lzVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.x9 x9Var2 = lzVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, lzVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                x9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.c.invalidate();
                lzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.j6.v0(i10, lzVar.a), org.telegram.ui.ActionBar.j6.v0(i11, lzVar.a)), mode));
                lzVar.f.invalidate();
                break;
            default:
                y00 y00Var2 = (y00) this.c;
                y00Var2.s = this.b ? 1.0f : 0.0f;
                y00Var2.invalidate();
                break;
        }
    }

    public to(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public to(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public to(org.telegram.ui.Components.io ioVar) {
        this.a = 4;
        this.c = ioVar;
    }
}
