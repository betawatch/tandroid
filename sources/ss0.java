// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ss0 extends FrameLayout implements gyc, vi5 {
    public boolean E;
    public boolean F;
    public boolean G;
    public final int a;
    public final long b;
    public final ylb c;
    public final os0 d;
    public final hyc e;
    public final xd f;
    public final sb h;
    public final FrameLayout n;
    public final b61 r;
    public final int s;
    public cyc w;
    public final Rect x;
    public int y;

    public ss0(Context context, int i, long j, ylb ylbVar, os0 os0Var) {
        super(context);
        this.x = new Rect();
        this.F = true;
        this.a = i;
        this.b = j;
        this.c = ylbVar;
        this.d = os0Var;
        this.e = new hyc(this, gm.p);
        this.s = cmb.v0(cmb.c6, ylbVar);
        xd xdVar = new xd(context, os0Var);
        this.f = xdVar;
        xdVar.setFillViewport(true);
        xdVar.setVerticalScrollBarEnabled(false);
        xdVar.setOverScrollMode(2);
        sb sbVar = new sb((byte) 2, context, this);
        this.h = sbVar;
        xdVar.addView(sbVar, new FrameLayout.LayoutParams(-1, -2));
        addView(xdVar, qoe.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        b61 i2 = mlb.i(24, ylbVar, context, true);
        this.r = i2;
        i2.setOnClickListener(new j1(this, (byte) 23));
        frameLayout.addView(i2, qoe.d(-1, 48.0f, nm7.D1, 16.0f, 12.0f, 16.0f, 12.0f));
        addView(frameLayout, qoe.e(-1, -2, 80));
        k();
    }

    @Override // vi5
    public final void a(ucb ucbVar, RectF rectF) {
        ucbVar.b = true;
    }

    @Override // gyc
    public final void b(boolean z) {
        this.f.requestDisallowInterceptTouchEvent(z);
    }

    public final void c() {
        i();
        cyc cycVar = this.w;
        if (cycVar != null) {
            txc g = wxc.g(cycVar);
            if (g != null) {
                g.p = null;
            }
            cyc cycVar2 = this.w;
            txc g2 = wxc.g(cycVar2);
            if (g2 != null && g2.o) {
                wxc.i();
                g2.p = null;
                wxc.a.remove(g2.a);
                cycVar2.n();
                cycVar2.f = null;
                cycVar2.g = null;
                cycVar2.d = null;
                wxc.F();
            }
            this.w = null;
        }
        this.e.r();
    }

    public final void e() {
        String d;
        if (this.G || this.w == null || !this.E || !this.F || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.G = true;
        this.w.m(getWidth());
        j();
        cyc cycVar = this.w;
        int[] iArr = nyc.a;
        ylb ylbVar = this.c;
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("colorScheme", a ? "dark" : "light");
            JSONObject u = wx0.u(ylbVar, true);
            if (u != null) {
                jSONObject.put("params", u);
            }
            JSONObject f = nyc.f();
            f.put("padding", "8px 16px");
            jSONObject.put("text", f);
            d = jSONObject.toString();
        } catch (Exception e) {
            fc4.g(e, true);
            d = nyc.d(a);
        }
        cycVar.k(d);
        cyc cycVar2 = this.w;
        hyc hycVar = this.e;
        hycVar.b(cycVar2);
        hycVar.q(true);
        txc g = wxc.g(this.w);
        if (g != null) {
            g.p = this;
        }
        wxc.u(this.w);
        sb sbVar = this.h;
        sbVar.requestLayout();
        sbVar.invalidate();
    }

    @Override // gyc
    public final void f() {
        this.h.invalidate();
        this.d.a();
    }

    @Override // vi5
    public final void g(Canvas canvas, RectF rectF) {
        canvas.drawColor(this.s);
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            sb sbVar = this.h;
            int left = sbVar.getLeft();
            xd xdVar = this.f;
            canvas.translate(left - xdVar.getScrollX(), sbVar.getTop() - xdVar.getScrollY());
            this.e.c(canvas, sbVar.getWidth());
            canvas.restore();
        }
    }

    public View getBottomBar() {
        return this.n;
    }

    public View getWidgetView() {
        return this.h;
    }

    @Override // gyc
    public final void h() {
        this.h.requestLayout();
    }

    public final void i() {
        if (this.G) {
            this.G = false;
            hyc hycVar = this.e;
            hycVar.q(false);
            hycVar.r();
            cyc cycVar = this.w;
            if (cycVar != null) {
                wxc.r(cycVar);
            }
        }
    }

    public final void j() {
        if (this.w == null || getHeight() <= 0) {
            return;
        }
        float f = gm.p;
        float L = gm.L(72.0f);
        cyc cycVar = this.w;
        Rect rect = this.x;
        float f2 = rect.top / f;
        float f3 = rect.bottom / f;
        float f4 = rect.left / f;
        float f5 = rect.right / f;
        float f6 = this.y / f;
        float f7 = L / f;
        float height = getHeight() / f;
        synchronized (cycVar) {
            String format = String.format(Locale.US, "{\"device\":{\"top\":%.2f,\"right\":%.2f,\"bottom\":%.2f,\"left\":%.2f},\"content\":{\"top\":%.2f,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":0},\"viewportHeight\":%.2f}", Float.valueOf(f2), Float.valueOf(f5), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(height));
            if (format.equals(cycVar.w)) {
                return;
            }
            cycVar.w = format;
            cycVar.x = true;
            gm.c3(new byc(cycVar, (byte) 1));
        }
    }

    public final void k() {
        String M0;
        os0 os0Var = this.d;
        rs0 rs0Var = os0Var.a;
        TLRPC.Dialog R0 = rs0Var.getMessagesController().R0(rs0Var.a);
        if (R0 == null || R0.top_message == 0 || os0Var.a.e0()) {
            M0 = jb6.M0(2131744604, null);
        } else {
            rs0 rs0Var2 = os0Var.a;
            TLRPC.User W1 = rs0Var2.getMessagesController().W1(Long.valueOf(rs0Var2.a));
            M0 = (W1 == null || !W1.bot_has_main_app) ? jb6.M0(2131752965, null) : jb6.M0(2131746441, null);
        }
        this.r.i(M0, false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        i();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        cyc cycVar = this.w;
        if (cycVar != null && this.G) {
            cycVar.m(i);
            j();
        }
        gm.c3(new f00(this, (byte) 25));
    }

    public void setActive(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        if (z) {
            e();
        } else {
            i();
        }
    }

    public void setChromeTop(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        j();
    }

    public void setWidget(TL_bots.TL_botProfileWidget tL_botProfileWidget) {
        cyc cycVar;
        ConcurrentHashMap concurrentHashMap = wxc.a;
        if (tL_botProfileWidget == null || tL_botProfileWidget.payload == null) {
            cycVar = null;
        } else {
            StringBuilder sb = new StringBuilder("tg-widget:profile/");
            int i = this.a;
            sb.append(i);
            sb.append("/");
            long j = this.b;
            sb.append(j);
            sb.append("/");
            sb.append(Arrays.hashCode(tL_botProfileWidget.payload));
            sb.append("/");
            sb.append(tL_botProfileWidget.can_query ? 1 : 0);
            sb.append(tL_botProfileWidget.background_query ? 1 : 0);
            String sb2 = sb.toString();
            ConcurrentHashMap concurrentHashMap2 = wxc.a;
            txc txcVar = (txc) concurrentHashMap2.get(sb2);
            if (txcVar == null) {
                txc txcVar2 = new txc(sb2, i, j, tL_botProfileWidget);
                concurrentHashMap2.put(sb2, txcVar2);
                cf7 Y = cf7.Y(txcVar2.b);
                Y.a.c(new ptc(Y, txcVar2, (byte) 14));
            } else {
                txcVar.s = tL_botProfileWidget.public_data_hash;
                wxc.a(txcVar, wxc.D(tL_botProfileWidget.chat_data), wxc.D(tL_botProfileWidget.public_data));
            }
            cycVar = wxc.h(sb2);
        }
        if (cycVar == this.w) {
            return;
        }
        c();
        this.w = cycVar;
        e();
    }

    @Override // gyc
    public final void d() {
    }

    @Override // gyc
    public void setCursor(String str) {
    }
}
