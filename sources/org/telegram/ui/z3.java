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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public final /* synthetic */ m4 G;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 b;
    public final y3 c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public lh.j3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public z3(m4 m4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.G = m4Var;
        this.b = o2Var;
        o2Var.getResourceProvider();
        y3 y3Var = new y3(this, o2Var.getContext());
        this.c = y3Var;
        new nh.w3(y3Var, true, new x3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.l3 a() {
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        m4 m4Var = this.G;
        l3Var.C = m4Var.d0.getTitle();
        l3Var.H = m4Var;
        q3 q3Var = m4Var.q0[0];
        Bitmap bitmap = null;
        l3Var.o = (q3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var.getActionBarColor();
        q3 q3Var2 = m4Var.q0[0];
        l3Var.p = (q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor();
        l3Var.l = true;
        l3Var.G = !this.B ? 0.0f : m4Var.q0[0].getProgress();
        q3 q3Var3 = m4Var.q0[0];
        l3Var.c = q3Var3;
        if (q3Var3 != null && q3Var3.getWebView() != null) {
            bitmap = m4Var.q0[0].getWebView().getFavicon();
        }
        l3Var.D = bitmap;
        q3 q3Var4 = l3Var.c;
        if (q3Var4 != null) {
            l3Var.e = q3Var4.getWidth();
            l3Var.f = l3Var.c.getHeight();
        }
        l3Var.g = l();
        l3Var.B = org.telegram.ui.ActionBar.g6.I.q();
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

    public final ValueAnimator d(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f9);
        ofFloat.addUpdateListener(new w3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, it0 it0Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new w3(this, 2));
        this.A.addListener(new androidx.fragment.app.g(this, z10, it0Var, 4));
        this.A.setInterpolator(org.telegram.ui.Components.jr.h);
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
        ofFloat.addUpdateListener(new w3(this, 1));
        this.y.addListener(new nh.q5(this, 6));
        this.y.setInterpolator(org.telegram.ui.Components.jr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        tn tnVar;
        dk dkVar;
        this.r = false;
        this.b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof tn) && (dkVar = (tnVar = (tn) o2Var).U) != null) {
            dkVar.P();
            tnVar.U.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var == null) {
            y3 y3Var = this.c;
            AndroidUtilities.removeFromParent(y3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(y3Var);
            }
        } else if (!i3Var.e) {
            i3Var.e = true;
            try {
                i3Var.show();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        m4 m4Var = this.G;
        q3 q3Var = m4Var.q0[0];
        if (q3Var != null && q3Var.A) {
            if (q3Var.getWebView() != null) {
                q3Var.getWebView().onResume();
            }
            q3Var.A = false;
        }
        q3 q3Var2 = m4Var.q0[1];
        if (q3Var2 != null && q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onResume();
            }
            q3Var2.A = false;
        }
        m4.X0.add(m4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.tc getBulletinFactory() {
        FrameLayout frameLayout;
        m4 m4Var = this.G;
        if (m4Var.q0[0].f()) {
            if (m4Var.q0[0].getWebView() != null) {
                frameLayout = m4Var.q0[0].f;
                return new org.telegram.ui.Components.tc(frameLayout, null);
            }
            return null;
        }
        q3 q3Var = m4Var.q0[0];
        TLRPC.WebPage webPage = q3Var.c.A;
        frameLayout = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.E);
        int j10 = j();
        o0 o0Var = this.G.d0;
        if (o0Var != null) {
            j10 = i0.a.d(o0Var.T, j10, o0Var.x);
        }
        return i0.a.d(min, i10, j10);
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
                y3 y3Var = this.c;
                if (y3Var.getParent() instanceof View) {
                    ((View) y3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.x xVar = actionBarLayout.s;
            if (xVar != null) {
                xVar.invalidate();
            }
            org.telegram.ui.ActionBar.x xVar2 = actionBarLayout.w;
            if (xVar2 != null) {
                xVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        y3 y3Var = this.c;
        AndroidUtilities.setLightStatusBar(i3Var != null ? i3Var.b : y3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 == null) {
            LaunchActivity.C1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(y3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = i3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
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
                m4 m4Var = this.G;
                d = i0.a.d(1.0f - (m4Var.q0[0].getVisibility() == 0 ? 1.0f - (m4Var.q0[0].getTranslationX() / m4Var.q0[0].getWidth()) : 0.0f), m4Var.q0[0].getActionBarColor(), m4Var.q0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
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
        y3 y3Var;
        return !this.h && !this.r && this.w > 0.5f && (y3Var = this.c) != null && y3Var.isAttachedToWindow() && AndroidUtilities.lerp(y3Var.D0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(y3Var.w0.c)) < y3Var.getHeight() && this.E < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sk, false);
        }
        m4 m4Var = this.G;
        return i0.a.d(1.0f - (m4Var.q0[0].getVisibility() != 0 ? 0.0f : 1.0f - (m4Var.q0[0].getTranslationX() / m4Var.q0[0].getWidth())), m4Var.q0[0].getBackgroundColor(), m4Var.q0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.x3.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        m4 m4Var = this.G;
        int i10 = 0;
        q3 q3Var = m4Var.q0[0];
        float translationX = (q3Var == null || q3Var.getVisibility() != 0) ? 0.0f : 1.0f - (m4Var.q0[0].getTranslationX() / m4Var.q0[0].getWidth());
        float f9 = 1.0f - translationX;
        q3 q3Var2 = m4Var.q0[0];
        if (q3Var2 != null && q3Var2.getVisibility() == 0) {
            i10 = (int) (m4Var.q0[0].getAlpha() * m4Var.q0[0].getListTop() * translationX);
        }
        q3 q3Var3 = m4Var.q0[1];
        if (q3Var3 == null || q3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (m4Var.q0[1].getAlpha() * m4Var.q0[1].getListTop() * f9));
    }

    public final void m() {
        m4 m4Var = this.G;
        m4Var.q0[0].setLastVisible(this.F);
        m4Var.q0[1].setLastVisible(false);
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
        m4 m4Var = this.G;
        if (m4Var.k0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        o0 o0Var = m4Var.d0;
        if (o0Var.P) {
            o0Var.h(false);
            return true;
        }
        if (o0Var.S) {
            o0Var.k(false);
            return true;
        }
        if (m4Var.J()) {
            q3 q3Var = m4Var.q0[0];
            if (q3Var.s) {
                if (q3Var.f() && q3Var.getWebView() != null) {
                    q3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (m4Var.Z.size() > 1) {
            m4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final void release() {
        this.r = true;
        m4 m4Var = this.G;
        q3 q3Var = m4Var.q0[0];
        if (q3Var != null && q3Var.h) {
            n3 n3Var = q3Var.e;
            n3Var.setSwipeOffsetY((-n3Var.f) + n3Var.e);
            m4Var.q0[0].h = false;
        }
        q3 q3Var2 = m4Var.q0[0];
        if (q3Var2 != null && !q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onPause();
            }
            q3Var2.A = true;
        }
        q3 q3Var3 = m4Var.q0[1];
        if (q3Var3 != null && !q3Var3.A) {
            if (q3Var3.getWebView() != null) {
                q3Var3.getWebView().onPause();
            }
            q3Var3.A = true;
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
        lh.j3 j3Var = this.v;
        if (j3Var != null) {
            j3Var.run();
            this.v = null;
        }
        m4.X0.remove(m4Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setLastVisible(boolean z10) {
        this.F = z10;
        m4 m4Var = this.G;
        m4Var.q0[0].setLastVisible(z10);
        m4Var.q0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (lh.j3) runnable;
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
            e(true, new it0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.t3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
