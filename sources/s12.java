// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s12 extends p02 implements gk7 {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public m12 J;
    public fw0 K;
    public r7 L;
    public a8 M;
    public a8 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public i12 V;
    public boolean W;
    public int a0;
    public gw0 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    @Override // p02
    public final void A(int i, boolean z) {
        boolean z2;
        gw0 gw0Var = this.n;
        fw0 fw0Var = this.K;
        if (z) {
            gw0Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY());
            byte b = 0;
            if (fw0Var.getSwipeOffsetY() != topActionBarOffsetY) {
                fw0Var.d(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int Q = this.b.o3.Q() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.P = true;
            fw0Var.setSwipeOffsetAnimationDisallowed(true);
            if (z2) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (gw0Var.getWebView() != null) {
                int scrollY = gw0Var.getWebView().getScrollY();
                int i2 = (Q - i) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(la2.V);
                this.r.addUpdateListener(new j12(this, b));
                this.r.addListener(new cn(this, i2, (byte) 4));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        float f;
        fw0 fw0Var = this.K;
        if (!gl.O1()) {
            Point point = gl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                this.b.r0 = true;
                if (i3 < 0) {
                    i3 = 0;
                }
                f = i3;
                if (fw0Var.getOffsetY() == f) {
                    this.s = true;
                    fw0Var.setOffsetY(f);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        this.b.r0 = true;
        if (i3 < 0) {
        }
        f = i3;
        if (fw0Var.getOffsetY() == f) {
        }
    }

    @Override // p02
    public final void I(p02 p02Var) {
        gw0 gw0Var = this.n;
        CharSequence r = l7c.r(na7.q1(this.G).V1(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gl.L(20.0f));
            r = vu3.m(r, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x02 x02Var = this.b;
        x02Var.U2.setTitle(r);
        this.K.setSwipeOffsetY(0.0f);
        if (gw0Var.getWebView() != null) {
            gw0Var.getWebView().scrollTo(0, 0);
        }
        d dVar = x02Var.Z1;
        if (dVar != null) {
            gw0Var.setParentActivity(dVar.getParentActivity());
        }
        this.L.setVisibility(0);
        if (gw0Var.S) {
            return;
        }
        gl.L3(x02Var.U2.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // p02
    public final void J() {
        if (this.n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        gl.c3(new i12(this, (byte) 0));
    }

    @Override // p02
    public final void K() {
        fw0 fw0Var = this.K;
        fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
    }

    @Override // p02
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        if (!this.T) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User V1 = na7.q1(this.G).V1(Long.valueOf(this.w));
        String m = V1 != null ? qu2.m(0, V1.first_name, V1.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = m;
        hdVar.U = k96.M0(2131752905, null);
        alertDialog$Builder.j(k96.M0(2131752904, null), new k12(this));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        hdVar.show();
        zkb.X((TextView) hdVar.c(-1), bkb.p7, this.a);
        return false;
    }

    public final void Q() {
        x02 x02Var = this.b;
        d dVar = x02Var.Z1;
        byte b = 1;
        if ((dVar instanceof mu1) && ((mu1) dVar).m1.Q() > gl.L(20.0f)) {
            gl.t1(x02Var.Z1.getFragmentView());
            gl.d3(new i12(this, b), 250L);
        } else {
            x02Var.getWindow().setSoftInputMode(20);
            setFocusable(true);
            x02Var.v0(true);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gw0 gw0Var = this.n;
        if (i != kk7.y1) {
            if (i == kk7.p4) {
                gw0Var.n.b(bkb.v0(bkb.g5, this.a), kk7.i2);
                return;
            }
            return;
        }
        if (this.y == ((Long) objArr[0]).longValue()) {
            gw0Var.f();
            this.I = true;
            this.b.dismiss();
        }
    }

    @Override // p02
    public final boolean g() {
        return this.W;
    }

    @Override // p02
    public int getButtonsHideOffset() {
        return gl.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override // p02
    public int getCurrentItemTop() {
        fw0 fw0Var = this.K;
        return (int) (fw0Var.getOffsetY() + fw0Var.getSwipeOffsetY());
    }

    @Override // p02
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override // p02
    public int getCustomBackground() {
        return this.S;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public hv0 getWebViewContainer() {
        return this.n;
    }

    @Override // p02
    public final boolean h() {
        return this.R;
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    @Override // p02
    public final boolean k() {
        if (this.n.A()) {
            return true;
        }
        P();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // p02
    public final void q() {
        kk7.f(this.G).n(this, kk7.y1);
        kk7.e().n(this, kk7.p4);
        r6 t = this.b.U2.t();
        r7 r7Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        t.removeView(r7Var);
        this.n.f();
        this.U = true;
        gl.r(this.V);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z) {
        this.K.setAllowSwipes(z);
    }

    public void setCustomActionBarBackground(int i) {
        this.W = true;
        this.a0 = i;
    }

    public void setCustomBackground(int i) {
        this.S = i;
        this.R = true;
    }

    public void setDelegate(ku0 ku0Var) {
        this.n.setDelegate(ku0Var);
    }

    public void setMeasureOffsetY(int i) {
        this.O = i;
        this.K.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z) {
        this.T = z;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override // p02
    public final boolean t() {
        P();
        return false;
    }

    @Override // p02
    public final void u() {
        x02 x02Var = this.b;
        x02Var.v0(false);
        x02Var.getWindow().setSoftInputMode(48);
    }

    @Override // p02
    public final void v() {
        this.L.setVisibility(8);
        this.Q = false;
        gw0 gw0Var = this.n;
        boolean z = gw0Var.S;
        x02 x02Var = this.b;
        if (!z) {
            gl.L3(x02Var.U2.getBackButton(), R.drawable.ic_ab_back);
        }
        x02Var.U2.setBackground(null);
        if (gw0Var.U) {
            gw0Var.f();
            this.I = true;
        }
    }

    @Override // p02
    public final void x(int i) {
        m12 m12Var = this.J;
        gw0 gw0Var = this.n;
        if (i == -1) {
            if (gw0Var.A()) {
                return;
            }
            P();
            return;
        }
        x02 x02Var = this.b;
        if (i == R.id.menu_open_bot) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            x02Var.Z1.presentFragment(new mu1(bundle));
            x02Var.dismiss();
            return;
        }
        int i2 = 0;
        if (i == R.id.menu_reload_page) {
            if (gw0Var.getWebView() != null) {
                gw0Var.getWebView().animate().cancel();
                gw0Var.getWebView().animate().alpha(0.0f).start();
            }
            m12Var.setLoadProgress(0.0f);
            m12Var.setAlpha(1.0f);
            m12Var.setVisibility(0);
            gw0Var.setBotUser(na7.q1(this.G).V1(Long.valueOf(this.w)));
            gw0Var.p(this.G, this.w);
            kk7.f(gw0Var.N).d(new st0(gw0Var, (byte) 1));
            return;
        }
        if (i == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    x02Var.f1(tL_attachMenuBot2, na7.q1(this.G).V1(Long.valueOf(this.w)));
                    return;
                }
            }
            return;
        }
        if (i == R.id.menu_settings) {
            gw0Var.getClass();
            gw0Var.Q = System.currentTimeMillis();
            gw0Var.v("settings_button_pressed", null);
        } else {
            if (i == R.id.menu_add_to_home_screen_bot) {
                hq6.d0(this.G).z0(this.w, hq6.f2 ? 1 : 0, null);
                return;
            }
            if (i == R.id.menu_tos_bot) {
                d01.t(getContext(), k96.M0(2131752881, null));
                return;
            }
            if (i == R.id.menu_report_bot) {
                int i3 = this.G;
                Context context = getContext();
                u21 u21Var = new u21(f11.a(getContext()), this.a);
                long j = this.w;
                int i4 = b89.v1;
                b89.D0(i3, context, j, false, false, new ArrayList(), u21Var, null, new byte[0], null, null);
            }
        }
    }

    @Override // p02
    public final void z() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }
}
