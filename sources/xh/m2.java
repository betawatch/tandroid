package xh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.ic;
import org.telegram.messenger.k6;
import org.telegram.messenger.qz;
import org.telegram.messenger.r20;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zg;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
import org.telegram.ui.rr0;
import org.telegram.ui.un;
import org.telegram.ui.yv0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m2 extends Dialog implements us, org.telegram.ui.ActionBar.n3 {
    public static final HashSet a1 = new HashSet();
    public static final ou0 b1;
    public static int c1;
    public Boolean A0;
    public boolean B0;
    public s0 C0;
    public final e2 D;
    public boolean D0;
    public final k2 E;
    public org.telegram.ui.ActionBar.h3 E0;
    public final p6 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public float H0;
    public long I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public int K0;
    public int L;
    public k71 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public z60 O0;
    public final Paint P;
    public e0 P0;
    public final Paint Q;
    public boolean Q0;
    public int R;
    public float R0;
    public int S;
    public ValueAnimator S0;
    public boolean T;
    public ValueAnimator T0;
    public final Paint U;
    public boolean U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final j2 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.b3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int a;
    public org.telegram.ui.ActionBar.t0 a0;
    public int b;
    public org.telegram.messenger.k2 b0;
    public float c;
    public boolean c0;
    public o1.j d;
    public boolean d0;
    public Boolean e;
    public boolean e0;
    public final l2 f;
    public boolean f0;
    public float g0;
    public final Rect h;
    public float h0;
    public boolean i0;
    public int j0;
    public int k0;
    public Activity l0;
    public final i2 m0;
    public final Rect n;
    public final org.telegram.messenger.l2 n0;
    public wb o0;
    public c0 p0;
    public final FrameLayout q0;
    public int r;
    public final FrameLayout.LayoutParams r0;
    public final org.telegram.ui.ActionBar.i3 s;
    public boolean s0;
    public final zc0 t0;
    public final q1 u0;
    public int v0;
    public final bh.d w;
    public s3 w0;
    public final d2 x;
    public boolean x0;
    public final FrameLayout.LayoutParams y;
    public boolean y0;
    public boolean z0;

    static {
        ou0 ou0Var = new ou0(new xg.a(16), new xg.a(17));
        ou0Var.c = 100.0f;
        b1 = ou0Var;
        c1 = 0;
    }

    public m2(Context context, p6 p6Var) {
        super(context, R.style.TransparentDialog);
        this.c = 0.0f;
        this.h = new Rect();
        this.n = new Rect();
        int i10 = 0;
        this.r = 0;
        int i11 = 1;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.u0 = new q1(this, i11);
        this.v0 = -1;
        this.z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = p6Var;
        int x02 = t6.x0(null, t6.wj, false);
        this.b = x02;
        this.a = x02;
        d2 d2Var = new d2(this, context, i10);
        this.x = d2Var;
        d2Var.setAllowFullSizeSwipe(true);
        d2Var.setShouldWaitWebViewScroll(true);
        int i12 = t6.d6;
        e2 e2Var = new e2(this, context, p6Var, t6.w0(i12, p6Var), 0);
        this.D = e2Var;
        e2Var.setOnVerifiedAge(this.L0);
        e2Var.setDelegate(new h2(this, context, p6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.R = t6.w0(i12, p6Var);
        int w02 = t6.w0(t6.a7, p6Var);
        this.S = w02;
        org.telegram.messenger.i0.t3(this, w02, false, null);
        l2 l2Var = new l2(this, context);
        this.f = l2Var;
        l2Var.setDelegate(new bi.s1(this, i11));
        FrameLayout.LayoutParams e = b6.e(-1, -1, 49);
        this.y = e;
        l2Var.addView(d2Var, e);
        i2 i2Var = new i2(this, getContext(), p6Var);
        this.m0 = i2Var;
        i2Var.setOnButtonClickListener(new s1(this, i10));
        i2Var.setOnResizeListener(new q1(this, 3));
        l2Var.addView(i2Var, b6.e(-1, -2, 81));
        org.telegram.messenger.l2 l2Var2 = new org.telegram.messenger.l2(getContext());
        this.n0 = l2Var2;
        l2Var2.setAlpha(0.0f);
        l2Var2.setVisibility(8);
        boolean z10 = !vp.r1(this.H).H6 && tz.o() >= 2;
        this.f0 = z10;
        l2Var2.setParentRenderNode(z10 ? d2Var.getRenderNode() : null);
        l2Var.addView(l2Var2, b6.e(-1, -1, zs.E1));
        int i13 = 4;
        l2Var2.setOnCloseClickListener(new q1(this, i13));
        l2Var2.setOnCollapseClickListener(new q1(this, 5));
        l2Var2.setOnMenuClickListener(new q1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q0 = frameLayout;
        FrameLayout.LayoutParams e7 = b6.e(-1, zs.e3, 55);
        this.r0 = e7;
        l2Var.addView(frameLayout, e7);
        this.Z = getContext().getDrawable(R.drawable.header_shadow).mutate();
        j2 j2Var = new j2(context, p6Var);
        this.X = j2Var;
        j2Var.setBackgroundColor(0);
        j2Var.setBackButtonImage(R.drawable.ic_close_white);
        F();
        j2Var.setActionBarMenuOnItemClick(new y1(this, i11));
        j2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = b6.e(-1, -2, 49);
        this.Y = e10;
        l2Var.addView(j2Var, e10);
        k2 k2Var = new k2(context, p6Var);
        this.E = k2Var;
        l2Var.addView(k2Var, b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        e2Var.setWebViewProgressListener(new ig.i(this, i13));
        d2Var.addView(e2Var, b6.c(-1.0f, -1));
        d2Var.setScrollListener(new q1(this, 7));
        d2Var.setScrollEndListener(new q1(this, 8));
        d2Var.setDelegate(new r1(this));
        d2Var.setIsKeyboardVisible(new r1(this));
        zc0 zc0Var = new zc0(context);
        this.t0 = zc0Var;
        l2Var.addView(zc0Var, b6.c(-1.0f, -1));
        setContentView(l2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.I1;
        org.telegram.ui.ActionBar.i3 O = launchActivity != null ? launchActivity.O() : null;
        this.s = O;
        if (O != null) {
            d0 d0Var = new d0(l2Var, 5);
            q1 q1Var = new q1(this, 2);
            O.I.add(d0Var);
            O.J.add(q1Var);
            this.w = new bh.d(O);
        }
    }

    public static /* synthetic */ void f(m2 m2Var) {
        if (m2Var.Q0) {
            return;
        }
        super.dismiss();
        m2Var.Q0 = true;
    }

    public static WindowInsets h(m2 m2Var, View view, WindowInsets windowInsets) {
        r0.g1 g1Var = r0.j1.h(view, windowInsets).a;
        i0.c f7 = g1Var.f(2);
        m2Var.h.set(f7.a, f7.b, f7.c, f7.d);
        i0.c f10 = g1Var.f(647);
        Rect rect = m2Var.n;
        rect.set(Math.max(f10.a, windowInsets.getStableInsetLeft()), Math.max(f10.b, windowInsets.getStableInsetTop()), Math.max(f10.c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            int i11 = rect.top;
            Context context = m2Var.getContext();
            Typeface typeface = org.telegram.messenger.i0.a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            rect.top = Math.max(i11, identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
        }
        int i12 = g1Var.f(8).d;
        if (i12 <= rect.bottom || i12 <= org.telegram.messenger.i0.L(20.0f)) {
            m2Var.r = 0;
        } else {
            m2Var.r = i12;
        }
        m2Var.I();
        return i10 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void n(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i10).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j10) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String a02 = cd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String L0 = cd.L0(2131753001, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(a02);
        alertDialog$Builder.k(cd.L0(2131747847, null), new di.a(i10, j10, tL_attachMenuBot, runnable));
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(p6 p6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w9 = t6.w(-16777216, t6.w0(t6.h5, p6Var));
            r20 r20Var = new r20() { // from class: xh.w1
                @Override // org.telegram.messenger.r20
                public final Object a(Object obj) {
                    int w10 = t6.w(w9, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10))) : Integer.valueOf(w10);
                }
            };
            jSONObject.put("bg_color", r20Var.a(Integer.valueOf(w9)));
            jSONObject.put("section_bg_color", r20Var.a(Integer.valueOf(t6.w0(t6.d6, p6Var))));
            int i10 = t6.a7;
            jSONObject.put("secondary_bg_color", r20Var.a(Integer.valueOf(t6.w0(i10, p6Var))));
            jSONObject.put("text_color", r20Var.a(Integer.valueOf(t6.w0(t6.G6, p6Var))));
            jSONObject.put("hint_color", r20Var.a(Integer.valueOf(t6.w0(t6.H6, p6Var))));
            jSONObject.put("link_color", r20Var.a(Integer.valueOf(t6.w0(t6.J6, p6Var))));
            jSONObject.put("button_color", r20Var.a(Integer.valueOf(t6.w0(t6.Ci, p6Var))));
            jSONObject.put("button_text_color", r20Var.a(Integer.valueOf(t6.w0(t6.Gi, p6Var))));
            jSONObject.put("header_bg_color", r20Var.a(Integer.valueOf(t6.w0(t6.s8, p6Var))));
            jSONObject.put("accent_text_color", r20Var.a(Integer.valueOf(t6.w0(t6.q6, p6Var))));
            jSONObject.put("section_header_text_color", r20Var.a(Integer.valueOf(t6.w0(t6.L6, p6Var))));
            jSONObject.put("subtitle_text_color", r20Var.a(Integer.valueOf(t6.w0(t6.z6, p6Var))));
            jSONObject.put("destructive_text_color", r20Var.a(Integer.valueOf(t6.w0(t6.p7, p6Var))));
            jSONObject.put("section_separator_color", r20Var.a(Integer.valueOf(t6.w0(t6.d7, p6Var))));
            jSONObject.put("bottom_bar_bg_color", r20Var.a(Integer.valueOf(t6.w0(i10, p6Var))));
            return jSONObject;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final void A(int i10, boolean z10) {
        Paint paint = this.Q;
        int color = paint.getColor();
        this.W = true;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.T0 = duration;
            duration.setInterpolator(gr.f);
            this.T0.addUpdateListener(new o1(this, color, i10, i11));
            this.T0.addListener(new d5(this, i10, 14));
            this.T0.start();
            return;
        }
        paint.setColor(i10);
        F();
        this.f.invalidate();
        org.telegram.ui.b3 b3Var = this.Y0;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.z0 != z10) {
            this.z0 = z10;
            d2 d2Var = this.x;
            if (d2Var != null) {
                d2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        float f7;
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        this.f0 = z12 && !vp.r1(this.H).H6 && tz.o() >= 2;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.l2 l2Var = this.n0;
        d2 d2Var = this.x;
        if (l2Var != null) {
            org.telegram.messenger.a aVar = l2Var.a0;
            org.telegram.messenger.i0.r(aVar);
            l2Var.M = z10;
            if (!z11) {
                l2Var.N.f(z10, true);
            }
            l2Var.invalidate();
            if (z10) {
                org.telegram.messenger.i0.h3(aVar, 2500L);
            }
            l2Var.setParentRenderNode(this.f0 ? d2Var.getRenderNode() : null);
        }
        this.j0 = d2Var.getWidth();
        this.k0 = d2Var.getHeight();
        this.U0 = false;
        i2 i2Var = this.m0;
        e2 e2Var = this.D;
        j2 j2Var = this.X;
        if (!z11) {
            this.i0 = false;
            this.g0 = z10 ? 1.0f : 0.0f;
            this.h0 = 0.0f;
            I();
            L();
            j2Var.setVisibility(z10 ? 8 : 0);
            j2Var.setAlpha(1.0f - this.g0);
            j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.g0);
            i2Var.setTranslationX(0.0f);
            l2Var.setAlpha(this.g0);
            e2Var.setViewPortHeightOffset(0.0f);
            e2Var.n(true, true);
            H();
            return;
        }
        I();
        L();
        H();
        if (!org.telegram.messenger.i0.Q1() || org.telegram.messenger.i0.E || org.telegram.messenger.i0.P1()) {
            f7 = 0.0f;
        } else {
            int i10 = org.telegram.messenger.i0.q.x;
            f7 = (i10 - ((int) (Math.min(i10, r12.y) * 0.8f))) / 2.0f;
        }
        float f10 = z10 ? this.n.left + f7 : (-r13) - f7;
        if (!z10) {
            f7 = -f7;
        }
        float translationY = z10 ? d2Var.getTranslationY() : -org.telegram.messenger.i0.L(24.0f);
        float currentActionBarHeight = z10 ? -org.telegram.messenger.i0.L(24.0f) : (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
        o1.j jVar = d2Var.w;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = d2Var.G;
        if (jVar2 != null) {
            jVar2.d();
        }
        d2Var.setSwipeOffsetAnimationDisallowed(true);
        j2Var.setVisibility(0);
        if (z10) {
            d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
        } else {
            d2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.i0.L(24.0f));
        }
        d2Var.c();
        d2Var.invalidate();
        this.h0 = 0.0f;
        float f11 = z10 ? 0.0f : 1.0f;
        this.g0 = f11;
        j2Var.setAlpha(1.0f - f11);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.g0);
        d2Var.setTranslationY(org.telegram.messenger.i0.T1(translationY, currentActionBarHeight, this.h0));
        d2Var.setTranslationX(org.telegram.messenger.i0.T1(f10, 0.0f, this.h0));
        i2Var.setTranslationX(org.telegram.messenger.i0.T1(f7, 0.0f, this.h0));
        l2Var.setAlpha(this.g0);
        this.f.invalidate();
        e2Var.setViewPortHeightOffset(d2Var.getTranslationY() - currentActionBarHeight);
        e2Var.n(false, false);
        this.i0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V0 = ofFloat;
        float f12 = f10;
        ofFloat.addUpdateListener(new a2(this, z10, translationY, currentActionBarHeight, f12, f7));
        this.V0.addListener(new b2(this, z10, currentActionBarHeight2, f12));
        this.V0.setDuration(280L);
        this.V0.setInterpolator(gr.h);
        this.V0.start();
    }

    public final void D(int i10, boolean z10) {
        this.I0 = false;
        int i11 = this.S;
        i2 i2Var = this.m0;
        Paint paint = i2Var.a;
        i2Var.e.b = i10;
        paint.setColor(i10);
        int i12 = 1;
        if (!z10) {
            i2Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f);
            duration.addUpdateListener(new o1(this, i11, i10, i12));
            duration.addListener(new x10(this, i11, i10, 3));
            duration.start();
        } else {
            this.S = i10;
            l();
        }
        org.telegram.messenger.i0.t3(this, this.S, false, null);
    }

    public final void E(boolean z10) {
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.R0 - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, z10 ? 1.0f : 0.0f);
        this.S0 = ofFloat;
        ofFloat.addListener(new sg.y(15, this, z10));
        this.S0.addUpdateListener(new p1(this, 0));
        this.S0.setInterpolator(gr.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void F() {
        if (!this.V) {
            int i10 = t6.G6;
            p6 p6Var = this.F;
            int w02 = t6.w0(i10, p6Var);
            j2 j2Var = this.X;
            j2Var.setTitleColor(w02);
            j2Var.D(t6.w0(i10, p6Var), false);
            j2Var.C(t6.w0(t6.u8, p6Var), false);
            j2Var.F(t6.w0(t6.G8, p6Var), false);
            j2Var.G(t6.w0(t6.E8, p6Var), false, false);
            j2Var.G(t6.w0(t6.F8, p6Var), true, false);
            j2Var.H(t6.w0(t6.I5, p6Var), false);
        }
        this.D.setFlickerViewColor(this.Q.getColor());
    }

    public final void G() {
        wb wbVar;
        boolean z10;
        f0 c10 = f0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.e;
        e0 e0Var = c10.f;
        boolean z11 = true;
        if (e0Var == null) {
            wb wbVar2 = this.o0;
            if (wbVar2 != null) {
                wbVar2.b();
                this.o0 = null;
            }
        } else if ((!e0Var.c() || e0Var.l) && !e0Var.k) {
            c0 c0Var = this.p0;
            if (c0Var != null) {
                this.P0 = e0Var;
                if (c0Var.c(e0Var)) {
                    this.o0 = null;
                }
            }
        } else {
            if (this.P0 != e0Var && (wbVar = this.o0) != null) {
                wbVar.b();
                this.o0 = null;
            }
            wb wbVar3 = this.o0;
            if (wbVar3 == null || !wbVar3.l) {
                this.P0 = e0Var;
                c0 c0Var2 = new c0(getContext(), this.F);
                this.p0 = c0Var2;
                wb f7 = wb.f(this.q0, c0Var2, 5000);
                this.o0 = f7;
                f7.k(true);
            }
            if (this.p0.c(e0Var)) {
                this.o0 = null;
            }
            e0Var.k = false;
            e0Var.l = true;
        }
        H();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) entry.getValue();
            e0 e0Var2 = (e0) entry.getKey();
            b1Var.setText(e0Var2.c);
            if (e0Var2.c()) {
                Pair b10 = e0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    b1Var.setSubtext(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.i0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    b1Var.setSubtext(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false));
                }
            } else {
                b1Var.setSubtext(org.telegram.messenger.i0.i0(e0Var2.g, false, false));
            }
            if (e0Var2.c()) {
                b1Var.setRightIcon(R.drawable.msg_close);
                b1Var.b.setPadding(0, 0, org.telegram.messenger.i0.L(32.0f), 0);
            } else if (e0Var2.i) {
                b1Var.setVisibility(8);
            } else {
                b1Var.setRightIcon(0);
                b1Var.b.setPadding(0, 0, 0, 0);
            }
            b1Var.setOnClickListener(new rh.u1(12, this, e0Var2));
        }
        org.telegram.messenger.k2 k2Var = this.b0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((e0) obj).c()) {
                z10 = true;
                break;
            }
        }
        if (k2Var.e != z10) {
            k2Var.e = z10;
            k2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z11 = false;
                break;
            }
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((e0) obj2).c()) {
                break;
            }
        }
        this.n0.setDownloading(z11);
    }

    public final void H() {
        c0 c0Var = this.p0;
        if (c0Var == null) {
            return;
        }
        if (this.e0) {
            c0Var.setArrow(org.telegram.messenger.i0.W1(this.g0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(26.0f)));
        } else if (this.c > 0.5f) {
            c0Var.setArrow(org.telegram.messenger.i0.L(24.0f));
        } else {
            c0Var.setArrow(-1);
        }
    }

    public final void I() {
        org.telegram.messenger.l2 l2Var = this.n0;
        Rect rect = this.n;
        l2Var.setInsets(rect);
        boolean z10 = this.e0;
        e2 e2Var = this.D;
        l2 l2Var2 = this.f;
        i2 i2Var = this.m0;
        if (z10) {
            int i10 = (i2Var == null || i2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.r <= i10 && (i2Var == null || i2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int L = org.telegram.messenger.i0.L(46.0f);
            e2Var.P(rect2, false);
            e2Var.O(L, false);
            l2Var2.setPadding(0, 0, 0, Math.max(this.r, i10));
        } else {
            e2Var.P(new Rect(0, 0, 0, 0), false);
            e2Var.O(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.r;
            org.telegram.ui.ActionBar.i3 i3Var = this.s;
            l2Var2.setPadding(i11, 0, i12, Math.max(i13, (i3Var != null ? i3Var.H : 0) + rect.bottom));
        }
        this.y.topMargin = org.telegram.messenger.i0.L(24.0f);
        boolean z11 = this.e0;
        int i14 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.Y;
        layoutParams.leftMargin = i14;
        layoutParams.rightMargin = 0;
        int i15 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.r0;
        layoutParams2.leftMargin = i15;
        layoutParams2.rightMargin = !z11 ? 0 : rect.right;
        boolean z12 = this.i0;
        d2 d2Var = this.x;
        if (!z12) {
            d2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.e0) {
                d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
            } else {
                d2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(24.0f));
            }
            d2Var.setSwipeOffsetAnimationDisallowed(false);
            d2Var.c();
            d2Var.invalidate();
            d2Var.requestLayout();
        }
        if (d2Var != null) {
            d2Var.setFullSize(r());
        }
        i2Var.requestLayout();
        l2Var2.requestLayout();
        l2Var.setVisibility(this.e0 ? 0 : 8);
    }

    public final void J() {
        boolean z10;
        if (this.V) {
            z10 = !this.T;
        } else {
            z10 = !org.telegram.messenger.i0.Q1() && i0.b.h(t6.x0(null, t6.d6, true)) >= 0.7210000157356262d && this.c >= 0.85f;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z10) {
            this.e = Boolean.valueOf(z10);
            l2 l2Var = this.f;
            int systemUiVisibility = l2Var.getSystemUiVisibility();
            l2Var.setSystemUiVisibility(z10 ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
    }

    public final void K() {
        org.telegram.ui.web.v0 webView;
        e2 e2Var = this.D;
        if (e2Var == null || (webView = e2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void L() {
        i2 i2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z10 = this.e0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            l2 l2Var = this.f;
            if (!z10 || (((i2Var = this.m0) != null && i2Var.getTotalHeight() > 0) || l2Var.g0)) {
                l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() & (-3));
            } else {
                l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final void a(boolean z10) {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final org.telegram.ui.ActionBar.h3 c() {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3();
        h3Var.q = this.R;
        h3Var.p = this.v0;
        h3Var.n = this.V;
        h3Var.o = this.W;
        h3Var.r = this.Q.getColor();
        h3Var.a = this.w0;
        e2 e2Var = this.D;
        h3Var.t = e2Var != null && e2Var.N;
        h3Var.D = t6.I.q();
        h3Var.x = e2Var != null ? e2Var.getUrlLoaded() : null;
        h3Var.e = e2Var != null && e2Var.t0;
        h3Var.f = e2Var != null ? e2Var.getTrustedOrigin() : null;
        d2 d2Var = this.x;
        h3Var.j = (d2Var != null && d2Var.getSwipeOffsetY() < 0.0f) || this.y0 || r() || this.e0;
        h3Var.z = this.e0;
        h3Var.A = this.f0;
        Boolean bool = this.A0;
        h3Var.B = bool == null ? this.z0 : bool.booleanValue();
        h3Var.k = d2Var != null ? d2Var.getOffsetY() : Float.MAX_VALUE;
        h3Var.C = this.B0;
        h3Var.u = this.x0;
        h3Var.y = this.s0;
        h3Var.v = this.c0;
        h3Var.l = d2Var == null || d2Var.M;
        h3Var.w = this.m0.e;
        h3Var.s = this.S;
        s0 s0Var = this.C0;
        if (s0Var != null) {
            s0Var.b();
        }
        h3Var.K = this.C0;
        org.telegram.ui.web.v0 webView = e2Var != null ? e2Var.getWebView() : null;
        if (webView != null) {
            e2Var.L();
            h3Var.b = webView;
            h3Var.d = e2Var.getBotProxy();
            h3Var.g = webView.getWidth();
            h3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.W0;
        h3Var.G = z10;
        if (z10) {
            h3Var.H = this.X0;
        }
        h3Var.L = this.D0;
        this.E0 = h3Var;
        return h3Var;
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final org.telegram.ui.ActionBar.o3 d() {
        return this.f;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.z1) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                o(false);
                return;
            }
            return;
        }
        if (i10 != zs.n4) {
            if (i10 == zs.J3) {
                G();
            }
        } else {
            this.f.invalidate();
            this.D.n.b(t6.w0(t6.d6, this.F), zs.j2);
            F();
            J();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        o(false);
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final int e(int i10) {
        return i0.b.f(this.R0, i10, this.S);
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final boolean i(org.telegram.ui.ActionBar.d3 d3Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean q6 = t6.I.q();
        int i10 = botappsettings.flags;
        boolean z11 = ((q6 ? 4 : 2) & i10) != 0;
        if ((i10 & (q6 ? 16 : 8)) != 0) {
            y((q6 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z10);
        }
        if (z11) {
            A((q6 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
            D((q6 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.F(true, true, true);
        }
        l2 l2Var = this.f;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Y0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Y0 = b3Var;
            this.x.addView(b3Var, b6.c(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new t1(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            org.telegram.messenger.i0.Y3(this.Y0, this.W0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        LaunchActivity launchActivity;
        if (this.d0) {
            return;
        }
        if (this.L0 != null) {
            z10 = false;
        }
        this.d0 = true;
        E(false);
        org.telegram.messenger.i0.r(this.u0);
        zs.f(this.H).n(this, zs.z1);
        zs.f(this.H).n(this, zs.J3);
        zs.e().n(this, zs.n4);
        if (z10 && ((launchActivity = LaunchActivity.I1) == null || launchActivity.y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.j jVar = this.d;
            if (jVar != null) {
                jVar.m.i = 0.0f;
                jVar.h();
            }
            LaunchActivity.I1.y0.b(this);
        } else {
            i2 i2Var = this.m0;
            if (i2Var != null) {
                i2Var.animate().translationY(i2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(gr.h).start();
            }
            this.D.h();
            d2 d2Var = this.x;
            int height = d2Var.getHeight() + (i2Var != null ? i2Var.getTotalHeight() : 0);
            Rect rect = this.n;
            d2Var.f(this.f.Q() + height + rect.top + rect.bottom + (r() ? org.telegram.messenger.i0.L(200.0f) : 0), true, new q1(this, 0));
        }
        a1.remove(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            o1.j jVar = new o1.j(this, b1);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.m = kVar;
            this.d = jVar;
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.D.C()) {
                return;
            }
            o(true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        i2 i2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i11 = attributes.flags;
        int i12 = i11 & (-3);
        attributes.flags = i12;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.e0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        l2 l2Var = this.f;
        l2Var.setFitsSystemWindows(true);
        l2Var.setSystemUiVisibility(1792);
        l2Var.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.o2(this, 1));
        if (!this.e0 || ((i2Var = this.m0) != null && i2Var.getTotalHeight() > 0)) {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() & (-3));
        } else {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | 2);
        }
        if (i10 >= 26) {
            org.telegram.messenger.i0.m3(this, i0.b.h(this.S) >= 0.7210000157356262d);
        }
        zs.e().c(this, zs.n4);
        zs.f(this.H).c(this, zs.J3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        o1.j jVar = this.d;
        if (jVar != null) {
            jVar.d();
            this.d = null;
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.t0);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.t0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.I1;
        }
        return ownerActivity == null ? org.telegram.messenger.i0.W(getContext()) : ownerActivity;
    }

    public final boolean q() {
        s3 s3Var = this.w0;
        return s3Var != null && s3Var.g == 6;
    }

    public final boolean r() {
        if (this.e0) {
            return true;
        }
        Boolean bool = this.A0;
        return bool == null ? this.z0 : bool.booleanValue();
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final void release() {
        if (this.Q0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            f8.g(e, true);
        }
        E(false);
    }

    public final void s() {
        String str;
        boolean z10;
        if (this.w0 == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.w0.r));
        TLRPC.TL_topPeer tL_topPeer = null;
        this.A0 = null;
        TLObject tLObject = this.w0.q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.K = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z10 = tL_webViewResultUrl.same_origin;
            this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z11 = this.F0;
            if (!z11) {
                C(tL_webViewResultUrl.fullscreen, !z11, this.f0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.K = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.K = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            } else {
                str = null;
            }
            z10 = false;
        }
        if (str != null && !this.F0) {
            ui b02 = ui.b0(this.H);
            long j10 = this.w0.c;
            TLRPC.User Z1 = b02.getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null && Z1.bot) {
                int max2 = b02.getUserConfig().G != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().G) : 60;
                int i10 = 0;
                while (true) {
                    if (i10 >= b02.l1.size()) {
                        break;
                    }
                    TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.l1.get(i10);
                    if (tL_topPeer2.peer.user_id == j10) {
                        tL_topPeer = tL_topPeer2;
                        break;
                    }
                    i10++;
                }
                if (tL_topPeer == null) {
                    tL_topPeer = new TLRPC.TL_topPeer();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_topPeer.peer = tL_peerUser;
                    tL_peerUser.user_id = j10;
                    b02.l1.add(tL_topPeer);
                }
                tL_topPeer.rating = Math.exp(max2 / b02.getMessagesController().Z2) + tL_topPeer.rating;
                Collections.sort(b02.l1, new a4.d(23));
                if (b02.l1.size() > 20) {
                    a1.g.x(1, b02.l1);
                }
                b02.getMessagesStorage().a.c(new zg(b02, j10, 2, tL_topPeer.rating));
                b02.getNotificationCenter().k(zs.V0, new Object[0]);
            }
            this.D.t(this.H, str, z10);
        }
        org.telegram.messenger.i0.h3(this.u0, max);
        d2 d2Var = this.x;
        if (d2Var != null) {
            d2Var.setFullSize(r());
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            E(true);
            l2 l2Var = this.f;
            l2Var.setAlpha(0.0f);
            l2Var.addOnLayoutChangeListener(new ag.t(this, 2));
            super.show();
            this.Q0 = false;
            a1.add(this);
        }
    }

    public final void t(boolean z10) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (this.Z0) {
            if (z10) {
                c1++;
            } else {
                c1--;
            }
        }
        if (c1 > 0) {
            org.telegram.messenger.i0.f2(p());
        } else {
            org.telegram.messenger.i0.P3(p());
        }
    }

    public final boolean v() {
        if (!this.s0) {
            o(false);
            return true;
        }
        TLRPC.User Z1 = vp.r1(this.H).Z1(Long.valueOf(this.I));
        String m10 = Z1 != null ? i5.m(0, Z1.first_name, Z1.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = m10;
        x1Var.T = cd.L0(2131752917, null);
        alertDialog$Builder.k(cd.L0(2131752916, null), new r1(this));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        x1Var.show();
        ((TextView) x1Var.d(-1)).setTextColor(t6.w0(t6.q7, this.F));
        return false;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean q6 = q();
        TLRPC.User Z1 = vp.r1(this.H).Z1(Long.valueOf(this.I));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = ui.b0(this.H).b.bots;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i12);
            i12++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == this.I) {
                break;
            }
        }
        z60 z60Var = this.O0;
        if (z60Var != null) {
            z60Var.u();
        }
        z60 G = z60.G(this.f, this.F, this.e0 ? this.n0 : this.a0, true);
        this.O0 = G;
        ArrayList arrayList3 = f0.c(getContext(), this.H, this.I).e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        if (arrayList3.isEmpty()) {
            i10 = -1;
        } else {
            z60 J = G.J();
            J.c(R.drawable.msg_arrow_back, cd.L0(2131753756, null), new rr0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                e0 e0Var = (e0) obj;
                String str = e0Var.c;
                r5.a aVar = new r5.a(17);
                p6 p6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i11 = size2;
                } else {
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i11 = size2;
                    b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                    b1Var.setText(str);
                    b1Var.setSubtext("");
                    Integer num = J.j0;
                    if (num == null && J.k0 == null) {
                        b1Var.c(t6.E8, t6.F8);
                    } else {
                        int intValue = num != null ? num.intValue() : t6.w0(t6.E8, p6Var);
                        Integer num2 = J.k0;
                        b1Var.d(intValue, num2 != null ? num2.intValue() : t6.w0(t6.F8, p6Var));
                    }
                    Integer num3 = J.l0;
                    if (num3 != null) {
                        b1Var.setSelectorColor(num3.intValue());
                    } else {
                        b1Var.h(0.12f, t6.E8);
                    }
                    b1Var.setOnClickListener(new org.telegram.ui.Components.h0(J, aVar));
                    int i14 = J.S;
                    if (i14 > 0) {
                        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i14));
                        J.r(b1Var, b6.o(J.S, -2));
                    } else {
                        J.r(b1Var, b6.o(-1, -2));
                        hashMap.put(e0Var, J.y());
                        size2 = i11;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(e0Var, J.y());
                size2 = i11;
                arrayList3 = arrayList;
            }
            i10 = -1;
            G();
            J.S = org.telegram.messenger.i0.L(180.0f);
            G.c(R.drawable.menu_download_round, cd.L0(2131753094, null), new bi.k(G, J, 11), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, cd.L0(2131752912, null), new q1(this, 9), this.L0 == null && !q6);
        G.l(R.drawable.msg_settings, cd.L0(2131752897, null), new q1(this, 10), this.L0 == null && this.c0);
        G.c(R.drawable.msg_retry, cd.L0(2131752911, null), new yv0(15, this, q6), false);
        G.l(R.drawable.msg_home, cd.L0(2131754390, null), new q1(this, 11), this.L0 == null && Z1 != null && Z1.bot_has_main_app);
        G.l(R.drawable.menu_intro, cd.L0(2131752894, null), new q1(this, 12), this.L0 == null && !q6);
        G.l(R.drawable.msg_report, cd.L0(2131752910, null), new q1(this, 13), this.L0 == null && !q6);
        G.l(R.drawable.msg_delete, cd.L0(2131752915, null), new q1(this, 14), this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.R != t6.x0(null, t6.d6, false)) {
            int i15 = org.telegram.messenger.i0.B(this.R) >= 0.721f ? i10 : -15198183;
            int i16 = org.telegram.messenger.i0.B(i15) >= 0.721f ? -16777216 : i10;
            int r12 = t6.r1(0.85f, i16);
            int r13 = t6.r1(0.1f, i16);
            G.P(i15);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w9 = G.w(i17);
                if (w9 instanceof org.telegram.ui.ActionBar.b1) {
                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) w9;
                    b1Var2.d(i16, r12);
                    b1Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.n.right, 0.0f);
        G.U = true;
        G.t = false;
        G.s = 0;
        G.Z();
    }

    public final void x(org.telegram.ui.ActionBar.k2 k2Var, s3 s3Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        TLRPC.InputPeer m12;
        TLRPC.InputPeer i12;
        boolean z10;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        this.w0 = s3Var;
        int i10 = s3Var.a;
        this.H = i10;
        this.J = s3Var.b;
        this.I = s3Var.c;
        this.L = s3Var.h;
        this.M = s3Var.i;
        this.N = s3Var.e;
        boolean z12 = s3Var.g == 6;
        TLRPC.User Z1 = z12 ? null : vp.r1(i10).Z1(Long.valueOf(this.I));
        CharSequence p5 = z12 ? s3Var.e : h20.p(Z1);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
            p5 = k6.m(p5, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        j2 j2Var = this.X;
        j2Var.setTitle(p5);
        TLRPC.UserFull a2 = z12 ? null : vp.r1(this.H).a2(this.I);
        p6 p6Var = this.F;
        if ((Z1 != null && Z1.verified) || (a2 != null && (user = a2.user) != null && user.verified)) {
            this.M0 = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            a7.y(j2Var.getTitleTextView(), this.M0, t6.Ci, p6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(zs.e4);
            j2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.i0.L(2.0f));
            j2Var.getTitleTextView().i(new jg.x0(this, 9));
        }
        org.telegram.messenger.l2 l2Var = this.n0;
        if (l2Var != null) {
            String p9 = z12 ? s3Var.e : h20.p(Z1);
            boolean z13 = Z1 != null && Z1.verified;
            l2Var.T = new qz0(p9, 13.0f, org.telegram.messenger.i0.o());
            if (z13) {
                l2Var.U = l2Var.getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
                l2Var.V = l2Var.getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
            } else {
                l2Var.U = null;
                l2Var.V = null;
            }
        }
        org.telegram.ui.ActionBar.y p10 = j2Var.p();
        p10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.H).b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                yVar = p10;
                userFull = a2;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            yVar = p10;
            userFull = a2;
            if (tL_attachMenuBot.bot_id == this.I) {
                break;
            }
            p10 = yVar;
            a2 = userFull;
        }
        if (!this.F0 && !z12) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo == null || (botappsettings = botInfo.app_settings) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    k(botappsettings, false);
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
                vp.r1(this.H).U2(Z1, 0, true, new s1(this, 1 == true ? 1 : 0));
            }
            if (s3Var.p) {
                C(z11, z10, this.f0);
            }
        }
        if (this.L0 == null) {
            yVar2 = yVar;
            yVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.k2 k2Var2 = new org.telegram.messenger.k2(getContext());
        this.b0 = k2Var2;
        org.telegram.ui.ActionBar.t0 d = yVar2.d(0, k2Var2);
        this.a0 = d;
        d.setOnClickListener(new t1(this, 1));
        j2Var.setActionBarMenuOnItemClick(new y1(this, 0));
        JSONObject u10 = u(p6Var, false);
        e2 e2Var = this.D;
        e2Var.setBotUser(Z1);
        if (!z12) {
            e2Var.s(this.H, this.I);
            TLRPC.User user2 = s3Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                ui.b0(this.H);
                if (!ui.z0(ui.c2, this.I)) {
                    if (user2 == null) {
                        user2 = vp.r1(this.H).Z1(Long.valueOf(this.I));
                    }
                    if (user2 != null && user2.photo != null) {
                        b8.G(this.H);
                        if (!b8.K(user2.photo.photo_small, null, true, true).exists()) {
                            ui.b0(this.H).l1(ic.l(this.H, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (s3Var.q != null) {
            s();
            return;
        }
        int i13 = s3Var.g;
        int i14 = zs.z1;
        int i15 = 4;
        int i16 = 2;
        switch (i13) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = vp.r1(this.H).i1(this.J);
                tL_messages_requestWebView.bot = vp.r1(this.H).n1(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = s3Var.o;
                tL_messages_requestWebView.fullscreen = s3Var.p;
                String str = s3Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.L != 0) {
                    qz.C(this.H);
                    int i17 = this.L;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i17;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.M != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = vp.r1(this.H).i1(this.M);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.M != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = vp.r1(this.H).i1(this.M);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new x1(this, 3));
                zs.f(this.H).c(this, i14);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (s3Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = vp.r1(this.H).n1(this.I);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (s3Var.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = s3Var.o;
                tL_messages_requestSimpleWebView.fullscreen = s3Var.p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(s3Var.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = s3Var.f;
                }
                if (!TextUtils.isEmpty(s3Var.l)) {
                    tL_messages_requestSimpleWebView.start_param = s3Var.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new x1(this, i16));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = vp.r1(this.H).n1(this.I);
                tL_messages_requestWebView2.peer = vp.r1(this.H).i1(this.I);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = s3Var.o;
                tL_messages_requestWebView2.fullscreen = s3Var.p;
                tL_messages_requestWebView2.url = s3Var.f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new x1(this, 1));
                zs.f(this.H).c(this, i14);
                break;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = s3Var.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = s3Var.k;
                tL_messages_requestAppWebView.platform = "android";
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    m12 = unVar.j() != null ? vp.m1(unVar.j()) : vp.k1(unVar.e);
                } else {
                    m12 = vp.m1(s3Var.m);
                }
                tL_messages_requestAppWebView.peer = m12;
                tL_messages_requestAppWebView.compact = s3Var.o;
                tL_messages_requestAppWebView.fullscreen = s3Var.p;
                if (!TextUtils.isEmpty(s3Var.l)) {
                    tL_messages_requestAppWebView.start_param = s3Var.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new x1(this, i15), 66);
                break;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = vp.r1(this.H).n1(s3Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (k2Var instanceof un) {
                    un unVar2 = (un) k2Var;
                    i12 = unVar2.j() != null ? vp.m1(unVar2.j()) : vp.k1(unVar2.e);
                } else {
                    i12 = vp.r1(this.H).i1(s3Var.b);
                }
                tL_messages_requestMainWebView.peer = i12;
                tL_messages_requestMainWebView.compact = s3Var.o;
                tL_messages_requestMainWebView.fullscreen = s3Var.p;
                if (!TextUtils.isEmpty(s3Var.l)) {
                    tL_messages_requestMainWebView.start_param = s3Var.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new x1(this, 5), 66);
                break;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = s3Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new a3.b(1), new n1(this, 0), 66);
                break;
            case 6:
                if (!this.F0) {
                    e2Var.t(this.H, s3Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void y(final int i10, boolean z10, boolean z11) {
        final int i11 = this.R;
        t6.b(0.35f, -0.1f, i10);
        final m1 m1Var = new m1();
        int i12 = this.V ? this.R : 0;
        SparseIntArray sparseIntArray = m1Var.a;
        p6 p6Var = this.F;
        m1Var.c(sparseIntArray, i12, p6Var);
        this.V = z10;
        this.T = i0.b.h(i10) < 0.7210000157356262d;
        m1Var.c(m1Var.b, this.V ? i10 : 0, p6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.u1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.b.f(floatValue, i11, i10);
                    m2 m2Var = m2.this;
                    m2Var.R = f7;
                    m2Var.l();
                    l2 l2Var = m2Var.f;
                    l2Var.invalidate();
                    j2 j2Var = m2Var.X;
                    j2Var.setBackgroundColor(m2Var.R);
                    m1 m1Var2 = m1Var;
                    m1Var2.b(j2Var, floatValue);
                    m2Var.a = m1Var2.a(t6.wj);
                    l2Var.invalidate();
                }
            });
            duration.addListener(new c2(this, i11, i10, m1Var));
            duration.start();
        } else {
            this.R = i10;
            l();
            l2 l2Var = this.f;
            l2Var.invalidate();
            int i13 = this.R;
            j2 j2Var = this.X;
            j2Var.setBackgroundColor(i13);
            m1Var.b(j2Var, 1.0f);
            this.a = m1Var.a(t6.wj);
            l2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.Z0 == z10) {
            return;
        }
        this.Z0 = z10;
        if (z10) {
            if (this.D0) {
                c1++;
            }
        } else if (this.D0) {
            c1--;
        }
        if (c1 > 0) {
            org.telegram.messenger.i0.f2(p());
        } else {
            org.telegram.messenger.i0.P3(p());
        }
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final /* synthetic */ void b(boolean z10) {
    }
}
