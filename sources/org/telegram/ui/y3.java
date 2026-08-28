package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public final /* synthetic */ l4 G;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 b;
    public final x3 c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ih.n3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public y3(l4 l4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.G = l4Var;
        this.b = o2Var;
        o2Var.getResourceProvider();
        x3 x3Var = new x3(this, o2Var.getContext());
        this.c = x3Var;
        new kh.b4(x3Var, true, new w3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.l3 a() {
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l4 l4Var = this.G;
        l3Var.C = l4Var.d0.getTitle();
        l3Var.H = l4Var;
        p3 p3Var = l4Var.q0[0];
        Bitmap bitmap = null;
        l3Var.o = (p3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false) : p3Var.getActionBarColor();
        p3 p3Var2 = l4Var.q0[0];
        l3Var.p = (p3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false) : p3Var2.getBackgroundColor();
        l3Var.l = true;
        l3Var.G = !this.B ? 0.0f : l4Var.q0[0].getProgress();
        p3 p3Var3 = l4Var.q0[0];
        l3Var.c = p3Var3;
        if (p3Var3 != null && p3Var3.getWebView() != null) {
            bitmap = l4Var.q0[0].getWebView().getFavicon();
        }
        l3Var.D = bitmap;
        p3 p3Var4 = l3Var.c;
        if (p3Var4 != null) {
            l3Var.e = p3Var4.getWidth();
            l3Var.f = l3Var.c.getHeight();
        }
        l3Var.g = l();
        l3Var.B = org.telegram.ui.ActionBar.f6.I.q();
        return l3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        ofFloat.addUpdateListener(new v3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, kt0 kt0Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 2));
        this.A.addListener(new androidx.fragment.app.g(this, z10, kt0Var, 3));
        this.A.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A.setDuration(250L);
        this.A.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 1));
        this.y.addListener(new mh.x(this, 4));
        this.y.setInterpolator(org.telegram.ui.Components.gr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        qn qnVar;
        ak akVar;
        this.r = false;
        this.b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof qn) && (akVar = (qnVar = (qn) o2Var).U) != null) {
            akVar.O();
            qnVar.U.m0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var == null) {
            x3 x3Var = this.c;
            AndroidUtilities.removeFromParent(x3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(x3Var);
            }
        } else if (!i3Var.e) {
            i3Var.e = true;
            try {
                i3Var.show();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        l4 l4Var = this.G;
        p3 p3Var = l4Var.q0[0];
        if (p3Var != null && p3Var.A) {
            if (p3Var.getWebView() != null) {
                p3Var.getWebView().onResume();
            }
            p3Var.A = false;
        }
        p3 p3Var2 = l4Var.q0[1];
        if (p3Var2 != null && p3Var2.A) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onResume();
            }
            p3Var2.A = false;
        }
        l4.X0.add(l4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.oc getBulletinFactory() {
        FrameLayout frameLayout;
        l4 l4Var = this.G;
        if (l4Var.q0[0].f()) {
            if (l4Var.q0[0].getWebView() != null) {
                frameLayout = l4Var.q0[0].f;
                return new org.telegram.ui.Components.oc(frameLayout, null);
            }
            return null;
        }
        p3 p3Var = l4Var.q0[0];
        TLRPC.WebPage webPage = p3Var.c.A;
        frameLayout = p3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i9) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.E);
        int j10 = j();
        n0 n0Var = this.G.d0;
        if (n0Var != null) {
            j10 = i0.a.d(n0Var.T, j10, n0Var.x);
        }
        return i0.a.d(min, i9, j10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.b;
            if (o2Var == null || !(o2Var.getParentLayout() instanceof ActionBarLayout)) {
                x3 x3Var = this.c;
                if (x3Var.getParent() instanceof View) {
                    ((View) x3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.w wVar = actionBarLayout.s;
            if (wVar != null) {
                wVar.invalidate();
            }
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.w;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        x3 x3Var = this.c;
        AndroidUtilities.setLightStatusBar(i3Var != null ? i3Var.b : x3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 == null) {
            LaunchActivity.C1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(x3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = i3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        i3Var2.d.setColor(navigationBarColor);
        i3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(i3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.C1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.E) * Math.min(this.w, 1.0f - this.x);
        if (this.B && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                l4 l4Var = this.G;
                d = i0.a.d(1.0f - (l4Var.q0[0].getVisibility() == 0 ? 1.0f - (l4Var.q0[0].getTranslationX() / l4Var.q0[0].getWidth()) : 0.0f), l4Var.q0[0].getActionBarColor(), l4Var.q0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isFullyVisible() {
        return this.C && this.x <= 0.0f && this.w >= 1.0f && this.E <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isShown() {
        x3 x3Var;
        return !this.h && !this.r && this.w > 0.5f && (x3Var = this.c) != null && x3Var.isAttachedToWindow() && AndroidUtilities.lerp(x3Var.D0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(x3Var.w0.c)) < x3Var.getHeight() && this.E < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sk, false);
        }
        l4 l4Var = this.G;
        return i0.a.d(1.0f - (l4Var.q0[0].getVisibility() != 0 ? 0.0f : 1.0f - (l4Var.q0[0].getTranslationX() / l4Var.q0[0].getWidth())), l4Var.q0[0].getBackgroundColor(), l4Var.q0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.l0.A(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        l4 l4Var = this.G;
        int i9 = 0;
        p3 p3Var = l4Var.q0[0];
        float translationX = (p3Var == null || p3Var.getVisibility() != 0) ? 0.0f : 1.0f - (l4Var.q0[0].getTranslationX() / l4Var.q0[0].getWidth());
        float f10 = 1.0f - translationX;
        p3 p3Var2 = l4Var.q0[0];
        if (p3Var2 != null && p3Var2.getVisibility() == 0) {
            i9 = (int) (l4Var.q0[0].getAlpha() * l4Var.q0[0].getListTop() * translationX);
        }
        p3 p3Var3 = l4Var.q0[1];
        if (p3Var3 == null || p3Var3.getVisibility() != 0) {
            return i9;
        }
        return i9 + ((int) (l4Var.q0[1].getAlpha() * l4Var.q0[1].getListTop() * f10));
    }

    public final void m() {
        l4 l4Var = this.G;
        l4Var.q0[0].setLastVisible(this.F);
        l4Var.q0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.w, this.n ? 0.0f : this.x) * k());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onAttachedBackPressed() {
        l4 l4Var = this.G;
        if (l4Var.k0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        n0 n0Var = l4Var.d0;
        if (n0Var.P) {
            n0Var.h(false);
            return true;
        }
        if (n0Var.S) {
            n0Var.k(false);
            return true;
        }
        if (l4Var.J()) {
            p3 p3Var = l4Var.q0[0];
            if (p3Var.s) {
                if (p3Var.f() && p3Var.getWebView() != null) {
                    p3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (l4Var.Z.size() > 1) {
            l4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final void release() {
        this.r = true;
        l4 l4Var = this.G;
        p3 p3Var = l4Var.q0[0];
        if (p3Var != null && p3Var.h) {
            m3 m3Var = p3Var.e;
            m3Var.setSwipeOffsetY((-m3Var.f) + m3Var.e);
            l4Var.q0[0].h = false;
        }
        p3 p3Var2 = l4Var.q0[0];
        if (p3Var2 != null && !p3Var2.A) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onPause();
            }
            p3Var2.A = true;
        }
        p3 p3Var3 = l4Var.q0[1];
        if (p3Var3 != null && !p3Var3.A) {
            if (p3Var3.getWebView() != null) {
                p3Var3.getWebView().onPause();
            }
            p3Var3.A = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        ih.n3 n3Var = this.v;
        if (n3Var != null) {
            n3Var.run();
            this.v = null;
        }
        l4.X0.remove(l4Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setLastVisible(boolean z10) {
        this.F = z10;
        l4 l4Var = this.G;
        l4Var.q0[0].setLastVisible(z10);
        l4Var.q0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ih.n3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.C1.u0.b(this);
        } else {
            e(true, new kt0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.t3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setKeyboardHeightFromParent(int i9) {
    }
}
