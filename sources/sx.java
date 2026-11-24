// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sx implements ah0, cz0 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final /* synthetic */ o L;
    public final po a = new po(null);
    public d b;
    public final rx c;
    public View d;
    public sy0 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public j48 w;
    public float x;
    public float y;

    public sx(o oVar, d dVar) {
        this.L = oVar;
        this.b = dVar;
        dVar.getResourceProvider();
        rx rxVar = new rx(this, dVar.getContext());
        this.c = rxVar;
        new mx5(rxVar, true, new mf2(this, (byte) 4));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // ah0
    public final void a(boolean z) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z;
        if (z) {
            LaunchActivity.H1.x0.b(this);
        } else {
            m(true, new b1(this, (byte) 26));
        }
        u();
        r();
    }

    @Override // ah0
    public final void b(boolean z) {
        this.K = z;
        o oVar = this.L;
        oVar.v0[0].setLastVisible(z);
        oVar.v0[1].setLastVisible(false);
    }

    @Override // cz0
    public final wy0 c() {
        wy0 wy0Var = new wy0();
        o oVar = this.L;
        wy0Var.E = oVar.i0.getTitle();
        wy0Var.J = oVar;
        m mVar = oVar.v0[0];
        Bitmap bitmap = null;
        wy0Var.q = (mVar == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar.getActionBarColor();
        m mVar2 = oVar.v0[0];
        wy0Var.r = (mVar2 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar2.getBackgroundColor();
        wy0Var.n = true;
        wy0Var.I = !this.G ? 0.0f : oVar.v0[0].getProgress();
        m mVar3 = oVar.v0[0];
        wy0Var.c = mVar3;
        if (mVar3 != null && mVar3.getWebView() != null) {
            bitmap = oVar.v0[0].getWebView().getFavicon();
        }
        wy0Var.F = bitmap;
        m mVar4 = wy0Var.c;
        if (mVar4 != null) {
            wy0Var.g = mVar4.getWidth();
            wy0Var.h = wy0Var.c.getHeight();
        }
        wy0Var.i = x();
        wy0Var.D = cmb.I.o();
        return wy0Var;
    }

    @Override // cz0
    public final dz0 d() {
        return this.c;
    }

    @Override // ah0, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // ah0
    public final int e(int i) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        int v = v();
        wu wuVar = this.L.i0;
        if (wuVar != null) {
            v = on2.f(wuVar.b0, v, wuVar.y);
        }
        return on2.f(min, i, v);
    }

    @Override // ah0
    public final boolean f() {
        int f;
        float min = this.n ? 0.0f : (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        if (this.G && min > 0.25f) {
            if (gda.s0) {
                o oVar = this.L;
                f = on2.f(1.0f - (oVar.v0[0].getVisibility() == 0 ? 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth()) : 0.0f), oVar.v0[0].getActionBarColor(), oVar.v0[1].getActionBarColor());
            } else {
                f = cmb.w0(null, cmb.Fl, false);
            }
            if (gm.B(f) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // ah0
    public final boolean h() {
        return this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h;
    }

    @Override // cz0
    public final boolean i() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // ah0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c41 j() {
        FrameLayout frameLayout;
        o oVar = this.L;
        boolean e = oVar.v0[0].e();
        m[] mVarArr = oVar.v0;
        if (e) {
            if (mVarArr[0].getWebView() != null) {
                frameLayout = oVar.v0[0].f;
                return new c41(frameLayout, null);
            }
            return null;
        }
        m mVar = mVarArr[0];
        TLRPC.WebPage webPage = mVar.c.F;
        frameLayout = mVar;
    }

    @Override // cz0
    public final boolean k(sy0 sy0Var) {
        this.e = sy0Var;
        if (sy0Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator l(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        ofFloat.addUpdateListener(new px(this, (byte) 0));
        return ofFloat;
    }

    public final void m(boolean z, b1 b1Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new px(this, (byte) 2));
        this.F.addListener(new qx((Object) this, z, (Object) b1Var, (byte) 0));
        this.F.setInterpolator(d53.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override // ah0
    public final void n(Runnable runnable) {
        this.w = (j48) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new px(this, (byte) 1));
        this.E.addListener(new g0(this, (byte) 15));
        this.E.setInterpolator(d53.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override // ah0
    public final void p() {
        o oVar = this.L;
        if (oVar.p0) {
            gm.t1(this.c);
            return;
        }
        wu wuVar = oVar.i0;
        if (wuVar.U) {
            wuVar.h(false);
            return;
        }
        if (wuVar.a0) {
            wuVar.k(false);
            return;
        }
        if (oVar.G()) {
            m mVar = oVar.v0[0];
            if (mVar.s) {
                if (!mVar.e() || mVar.getWebView() == null) {
                    return;
                }
                mVar.getWebView().goBack();
                return;
            }
        }
        if (oVar.e0.size() > 1) {
            oVar.D();
        } else {
            a(false);
        }
    }

    public final void q(d dVar) {
        yv1 yv1Var;
        ms1 ms1Var;
        this.r = false;
        this.b = dVar;
        dVar.getResourceProvider();
        if ((dVar instanceof yv1) && (ms1Var = (yv1Var = (yv1) dVar).a0) != null) {
            ms1Var.R();
            yv1Var.a0.K0(true, false, true);
        }
        sy0 sy0Var = this.e;
        if (sy0Var == null) {
            rx rxVar = this.c;
            gm.B2(rxVar);
            if (dVar.getLayoutContainer() != null) {
                dVar.getLayoutContainer().addView(rxVar);
            }
        } else if (!sy0Var.e) {
            sy0Var.e = true;
            try {
                sy0Var.show();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        o oVar = this.L;
        m mVar = oVar.v0[0];
        if (mVar != null && mVar.G) {
            if (mVar.getWebView() != null) {
                mVar.getWebView().onResume();
            }
            mVar.G = false;
        }
        m mVar2 = oVar.v0[1];
        if (mVar2 != null && mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onResume();
            }
            mVar2.G = false;
        }
        o.d1.add(oVar);
    }

    public final void r() {
        if (this.s != h()) {
            this.s = h();
            if (!(this.b.getParentLayout() instanceof ActionBarLayout)) {
                rx rxVar = this.c;
                if (rxVar.getParent() instanceof View) {
                    ((View) rxVar.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            b bVar = actionBarLayout.s;
            if (bVar != null) {
                bVar.invalidate();
            }
            b bVar2 = actionBarLayout.x;
            if (bVar2 != null) {
                bVar2.invalidate();
            }
        }
    }

    @Override // cz0
    public final void release() {
        this.r = true;
        o oVar = this.L;
        m[] mVarArr = oVar.v0;
        m mVar = mVarArr[0];
        if (mVar != null && mVar.h) {
            ix ixVar = mVar.e;
            ixVar.setSwipeOffsetY((-ixVar.f) + ixVar.e);
            mVarArr = oVar.v0;
            mVarArr[0].h = false;
        }
        m mVar2 = mVarArr[0];
        if (mVar2 != null && !mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onPause();
            }
            mVar2.G = true;
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 != null && !mVar3.G) {
            if (mVar3.getWebView() != null) {
                mVar3.getWebView().onPause();
            }
            mVar3.G = true;
        }
        sy0 sy0Var = this.e;
        if (sy0Var != null) {
            sy0Var.b();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            gm.B2(this.c);
        }
        j48 j48Var = this.w;
        if (j48Var != null) {
            j48Var.run();
            this.w = null;
        }
        o.d1.remove(oVar);
    }

    @Override // ah0
    public final boolean s() {
        rx rxVar;
        if (!this.h && !this.r && this.x > 0.5f && (rxVar = this.c) != null && rxVar.isAttachedToWindow()) {
            if (gm.U1(Utilities.l(rxVar.q0.c), rxVar.x0.x() - gm.L(20.0f), 0) < rxVar.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // ah0
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        sy0 sy0Var = this.e;
        rx rxVar = this.c;
        gm.m3(sy0Var != null ? sy0Var.b : rxVar, f());
        sy0 sy0Var2 = this.e;
        if (sy0Var2 == null) {
            LaunchActivity.H1.H(true, true, true);
            gm.j3(rxVar, gm.B(e(cmb.w0(null, cmb.Z6, false))) >= 0.721f);
            return;
        }
        int e = sy0Var2.a.e(cmb.w0(null, cmb.Z6, false));
        sy0Var2.d.setColor(e);
        sy0Var2.c.invalidate();
        gm.o3(sy0Var2, e, true, null);
        gm.i3(sy0Var2, gm.B(e) >= 0.721f);
        LaunchActivity.H1.H(true, true, true);
    }

    public final int v() {
        if (!gda.s0) {
            return cmb.w0(null, cmb.Il, false);
        }
        o oVar = this.L;
        return on2.f(1.0f - (oVar.v0[0].getVisibility() != 0 ? 0.0f : 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth())), oVar.v0[0].getBackgroundColor(), oVar.v0[1].getBackgroundColor());
    }

    public final int w() {
        int L = gm.L(16.0f);
        View view = this.d;
        return hg9.f(20.0f, x(), L + (view == null ? gm.q.y : view.getHeight()));
    }

    public final int x() {
        o oVar = this.L;
        int i = 0;
        m mVar = oVar.v0[0];
        float translationX = (mVar == null || mVar.getVisibility() != 0) ? 0.0f : 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
        float f = 1.0f - translationX;
        m mVar2 = oVar.v0[0];
        if (mVar2 != null && mVar2.getVisibility() == 0) {
            i = (int) (oVar.v0[0].getAlpha() * oVar.v0[0].getListTop() * translationX);
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 == null || mVar3.getVisibility() != 0) {
            return i;
        }
        return i + ((int) (oVar.v0[1].getAlpha() * oVar.v0[1].getListTop() * f));
    }

    @Override // ah0
    public final boolean y() {
        return this.c.isAttachedToWindow();
    }

    public final void z() {
        o oVar = this.L;
        oVar.v0[0].setLastVisible(this.K);
        oVar.v0[1].setLastVisible(false);
    }

    @Override // ah0
    public final View d() {
        return this.c;
    }

    @Override // ah0
    public final void g(int i) {
    }
}
