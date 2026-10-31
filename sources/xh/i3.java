package xh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import bi.d5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.k6;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.uh;
import org.telegram.ui.c01;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i3 extends uh implements us {
    public int D;
    public long E;
    public int F;
    public String G;
    public boolean H;
    public e3 I;
    public d2 J;
    public org.telegram.ui.ActionBar.t0 K;
    public org.telegram.ui.ActionBar.b1 L;
    public org.telegram.ui.ActionBar.b1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public b3 U;
    public boolean V;
    public int W;
    public e2 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        float f7;
        d2 d2Var = this.J;
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.q0 = true;
                if (i12 < 0) {
                    i12 = 0;
                }
                f7 = i12;
                if (d2Var.getOffsetY() == f7) {
                    this.s = true;
                    d2Var.setOffsetY(f7);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        this.b.q0 = true;
        if (i12 < 0) {
        }
        f7 = i12;
        if (d2Var.getOffsetY() == f7) {
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        e2 e2Var = this.n;
        CharSequence p5 = h20.p(vp.r1(this.F).Z1(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
            p5 = k6.m(p5, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        bi biVar = this.b;
        biVar.R2.setTitle(p5);
        this.J.setSwipeOffsetY(0.0f);
        if (e2Var.getWebView() != null) {
            e2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var != null) {
            e2Var.setParentActivity(k2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (e2Var.R) {
            return;
        }
        org.telegram.messenger.i0.Q3(biVar.R2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.uh
    public final void H() {
        if (this.n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.i0.g3(new b3(this, 0));
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        d2 d2Var = this.J;
        d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
    }

    public final boolean N() {
        if (!this.S) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User Z1 = vp.r1(this.F).Z1(Long.valueOf(this.w));
        String m10 = Z1 != null ? i5.m(0, Z1.first_name, Z1.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = m10;
        x1Var.T = cd.L0(2131752917, null);
        alertDialog$Builder.k(cd.L0(2131752916, null), new d3(this));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        x1Var.show();
        a7.V((TextView) x1Var.d(-1), t6.q7, this.a);
        return false;
    }

    public final void O() {
        bi biVar = this.b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if ((k2Var instanceof un) && ((un) k2Var).l1.Q() > org.telegram.messenger.i0.L(20.0f)) {
            org.telegram.messenger.i0.v1(biVar.W1.getFragmentView());
            org.telegram.messenger.i0.h3(new b3(this, 1), 250L);
        } else {
            biVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            biVar.A0(true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e2 e2Var = this.n;
        if (i10 != zs.z1) {
            if (i10 == zs.n4) {
                e2Var.n.b(t6.w0(t6.h5, this.a), zs.j2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            e2Var.h();
            this.H = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean f() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean g() {
        return this.Q;
    }

    @Override // org.telegram.ui.Components.uh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        d2 d2Var = this.J;
        return (int) (d2Var.getOffsetY() + d2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.uh
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.uh
    public int getCustomBackground() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.z0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean j() {
        if (this.n.C()) {
            return true;
        }
        N();
        return true;
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        zs.f(this.F).n(this, zs.z1);
        zs.e().n(this, zs.n4);
        org.telegram.ui.ActionBar.y p5 = this.b.R2.p();
        org.telegram.ui.ActionBar.t0 t0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        p5.removeView(t0Var);
        this.n.h();
        this.T = true;
        org.telegram.messenger.i0.r(this.U);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean r() {
        N();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
    public final void s() {
        bi biVar = this.b;
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
    }

    public void setAllowSwipes(boolean z10) {
        this.J.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.V = true;
        this.W = i10;
    }

    public void setCustomBackground(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.N = i10;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.S = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        this.K.setVisibility(8);
        this.P = false;
        e2 e2Var = this.n;
        boolean z10 = e2Var.R;
        bi biVar = this.b;
        if (!z10) {
            org.telegram.messenger.i0.Q3(biVar.R2.getBackButton(), R.drawable.ic_ab_back);
        }
        biVar.R2.setBackground(null);
        if (e2Var.T) {
            e2Var.h();
            this.H = true;
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i10) {
        e3 e3Var = this.I;
        e2 e2Var = this.n;
        if (i10 == -1) {
            if (e2Var.C()) {
                return;
            }
            N();
            return;
        }
        bi biVar = this.b;
        if (i10 == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            biVar.W1.presentFragment(new un(bundle));
            biVar.dismiss();
            return;
        }
        int i11 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (e2Var.getWebView() != null) {
                e2Var.getWebView().animate().cancel();
                e2Var.getWebView().animate().alpha(0.0f).start();
            }
            e3Var.setLoadProgress(0.0f);
            e3Var.setAlpha(1.0f);
            e3Var.setVisibility(0);
            e2Var.setBotUser(vp.r1(this.F).Z1(Long.valueOf(this.w)));
            e2Var.s(this.F, this.w);
            zs.f(e2Var.M).d(new org.telegram.ui.web.q(e2Var, 1));
            return;
        }
        if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.F).b.bots;
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    biVar.j1(tL_attachMenuBot2, vp.r1(this.F).Z1(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            e2Var.getClass();
            e2Var.P = System.currentTimeMillis();
            e2Var.x("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                ui.b0(this.F).y0(this.w, ui.c2, null);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                gf.f.r(getContext(), cd.L0(2131752893, null));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i12 = this.F;
                Context context = getContext();
                cc ccVar = new cc(ra.a(getContext()), this.a);
                long j10 = this.w;
                int i13 = c01.s1;
                c01.J0(i12, context, j10, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
    public final void z(int i10, boolean z10) {
        boolean z11;
        e2 e2Var = this.n;
        d2 d2Var = this.J;
        if (z10) {
            e2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY());
            if (d2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.b.l3.Q() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            d2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (e2Var.getWebView() != null) {
                int scrollY = e2Var.getWebView().getScrollY();
                int i11 = (Q - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(ci.o.V);
                this.r.addUpdateListener(new c3(this, 0));
                this.r.addListener(new d5(this, i11, 15));
                this.r.start();
            }
        }
    }
}
