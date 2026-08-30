package rh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import k7.b6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c21;
import org.telegram.ui.jl0;
import org.telegram.ui.l61;
import org.telegram.ui.rt0;
import org.telegram.ui.xa1;
import org.telegram.ui.xn;
import ph.d4;
import ph.ga;
import ph.t8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q2 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.t3 {
    public static final HashSet T0 = new HashSet();
    public static final iv0 U0;
    public static int V0;
    public org.telegram.ui.ActionBar.m3 A0;
    public final f6 B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public int D;
    public float D0;
    public long E;
    public xa1 E0;
    public long F;
    public Drawable F0;
    public long G;
    public final HashMap G0;
    public int H;
    public o70 H0;
    public long I;
    public h0 I0;
    public String J;
    public boolean J0;
    public final Paint K;
    public float K0;
    public final Paint L;
    public ValueAnimator L0;
    public final Paint M;
    public ValueAnimator M0;
    public int N;
    public boolean N0;
    public int O;
    public ValueAnimator O0;
    public boolean P;
    public boolean P0;
    public final Paint Q;
    public String Q0;
    public boolean R;
    public org.telegram.ui.f3 R0;
    public boolean S;
    public boolean S0;
    public final n2 T;
    public final FrameLayout.LayoutParams U;
    public final Drawable V;
    public org.telegram.ui.ActionBar.w0 W;
    public BotFullscreenButtons.OptionsIcon X;
    public boolean Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public float b;
    public boolean b0;
    public o1.j c;
    public float c0;
    public Boolean d;
    public float d0;
    public final p2 e;
    public boolean e0;
    public final Rect f;
    public int f0;
    public int g0;
    public final Rect h;
    public Activity h0;
    public final m2 i0;
    public final BotFullscreenButtons j0;
    public ic k0;
    public g0 l0;
    public final FrameLayout m0;
    public int n;
    public final FrameLayout.LayoutParams n0;
    public boolean o0;
    public final vd0 p0;
    public final r1 q0;
    public final org.telegram.ui.ActionBar.n3 r;
    public int r0;
    public final c5.j s;
    public z3 s0;
    public boolean t0;
    public boolean u0;
    public final h2 v;
    public boolean v0;
    public final FrameLayout.LayoutParams w;
    public Boolean w0;
    public final i2 x;
    public boolean x0;
    public final o2 y;
    public v0 y0;
    public boolean z0;

    static {
        iv0 iv0Var = new iv0(new rg.a(10), new rg.a(11));
        iv0Var.c = 100.0f;
        U0 = iv0Var;
        V0 = 0;
    }

    public q2(Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.b = 0.0f;
        this.f = new Rect();
        this.h = new Rect();
        this.n = 0;
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint();
        this.L = paint2;
        this.M = new Paint(1);
        this.Q = new Paint(1);
        this.q0 = new r1(this, 1);
        this.r0 = -1;
        this.v0 = false;
        this.w0 = null;
        this.G0 = new HashMap();
        this.J0 = false;
        this.N0 = true;
        this.S0 = false;
        this.B = f6Var;
        this.a = j6.w0(null, j6.Ii, false);
        h2 h2Var = new h2(this, context, 0);
        this.v = h2Var;
        h2Var.setAllowFullSizeSwipe(true);
        h2Var.setShouldWaitWebViewScroll(true);
        int i10 = j6.d6;
        i2 i2Var = new i2(this, context, f6Var, j6.v0(i10, f6Var));
        this.x = i2Var;
        i2Var.setOnVerifiedAge(this.E0);
        i2Var.setDelegate(new l2(this, context, f6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.N = j6.v0(i10, f6Var);
        int v02 = j6.v0(j6.a7, f6Var);
        this.O = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        p2 p2Var = new p2(this, context);
        this.e = p2Var;
        p2Var.setDelegate(new t1(this, 0));
        FrameLayout.LayoutParams e = b6.e(-1, -1, 49);
        this.w = e;
        p2Var.addView(h2Var, e);
        m2 m2Var = new m2(this, getContext(), f6Var);
        this.i0 = m2Var;
        m2Var.setOnButtonClickListener(new u1(this, 0));
        m2Var.setOnResizeListener(new r1(this, 3));
        p2Var.addView(m2Var, b6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.j0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        boolean z4 = !MessagesController.getInstance(this.D).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        this.b0 = z4;
        botFullscreenButtons.setParentRenderNode(z4 ? h2Var.getRenderNode() : null);
        p2Var.addView(botFullscreenButtons, b6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new r1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new r1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new r1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.m0 = frameLayout;
        FrameLayout.LayoutParams e6 = b6.e(-1, 200, 55);
        this.n0 = e6;
        p2Var.addView(frameLayout, e6);
        this.V = getContext().getDrawable(R.drawable.header_shadow).mutate();
        n2 n2Var = new n2(context, f6Var);
        this.T = n2Var;
        n2Var.setBackgroundColor(0);
        n2Var.setBackButtonImage(R.drawable.ic_close_white);
        A();
        n2Var.setActionBarMenuOnItemClick(new jl0(this, 28));
        n2Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = b6.e(-1, -2, 49);
        this.U = e10;
        p2Var.addView(n2Var, e10);
        o2 o2Var = new o2(context, f6Var);
        this.y = o2Var;
        p2Var.addView(o2Var, b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        i2Var.setWebViewProgressListener(new cg.o(this, 4));
        h2Var.addView(i2Var, b6.c(-1.0f, -1));
        h2Var.setScrollListener(new r1(this, 7));
        h2Var.setScrollEndListener(new r1(this, 8));
        h2Var.setDelegate(new s1(this));
        h2Var.setIsKeyboardVisible(new s1(this));
        vd0 vd0Var = new vd0(context);
        this.p0 = vd0Var;
        p2Var.addView(vd0Var, b6.c(-1.0f, -1));
        setContentView(p2Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.D1;
        org.telegram.ui.ActionBar.n3 P = launchActivity != null ? launchActivity.P() : null;
        this.r = P;
        if (P != null) {
            ga gaVar = new ga(p2Var, 11);
            r1 r1Var = new r1(this, 2);
            P.F.add(gaVar);
            P.G.add(r1Var);
            this.s = new c5.j(P);
        }
    }

    public static /* synthetic */ void d(q2 q2Var) {
        if (q2Var.J0) {
            return;
        }
        super.dismiss();
        q2Var.J0 = true;
    }

    public static WindowInsets e(q2 q2Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).a;
        i0.b f10 = j1Var.f(2);
        q2Var.f.set(f10.a, f10.b, f10.c, f10.d);
        i0.b f11 = j1Var.f(647);
        Rect rect = q2Var.h;
        rect.set(Math.max(f11.a, windowInsets.getStableInsetLeft()), Math.max(f11.b, windowInsets.getStableInsetTop()), Math.max(f11.c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(q2Var.getContext()));
        }
        int i11 = j1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= AndroidUtilities.dp(20.0f)) {
            q2Var.n = 0;
        } else {
            q2Var.n = i11;
        }
        q2Var.D();
        return i10 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
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
        String formatString = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.R().getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.s1(i10, j10, tL_attachMenuBot, runnable));
        kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(f6 f6Var, final boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = j6.v(-16777216, j6.v0(j6.h5, f6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: rh.w1
                @Override // org.telegram.messenger.Utilities.CallbackReturn
                public final Object run(Object obj) {
                    int v10 = j6.v(v, ((Integer) obj).intValue());
                    return z4 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10))) : Integer.valueOf(v10);
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.d6, f6Var))));
            int i10 = j6.a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.G6, f6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.H6, f6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.J6, f6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Oh, f6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Sh, f6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.s8, f6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.q6, f6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.L6, f6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.z6, f6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.p7, f6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.d7, f6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A() {
        if (!this.R) {
            int i10 = j6.G6;
            f6 f6Var = this.B;
            int v02 = j6.v0(i10, f6Var);
            n2 n2Var = this.T;
            n2Var.setTitleColor(v02);
            n2Var.C(j6.v0(i10, f6Var), false);
            n2Var.B(j6.v0(j6.u8, f6Var), false);
            n2Var.D(j6.v0(j6.G8, f6Var), false);
            n2Var.E(j6.v0(j6.E8, f6Var), false, false);
            n2Var.E(j6.v0(j6.F8, f6Var), true, false);
            n2Var.F(j6.v0(j6.I5, f6Var), false);
        }
        this.x.setFlickerViewColor(this.M.getColor());
    }

    public final void B() {
        ic icVar;
        boolean z4;
        i0 c3 = i0.c(getContext(), this.D, this.E);
        ArrayList arrayList = c3.e;
        h0 h0Var = c3.f;
        boolean z10 = true;
        if (h0Var == null) {
            ic icVar2 = this.k0;
            if (icVar2 != null) {
                icVar2.b();
                this.k0 = null;
            }
        } else if ((!h0Var.c() || h0Var.l) && !h0Var.k) {
            g0 g0Var = this.l0;
            if (g0Var != null) {
                this.I0 = h0Var;
                if (g0Var.c(h0Var)) {
                    this.k0 = null;
                }
            }
        } else {
            if (this.I0 != h0Var && (icVar = this.k0) != null) {
                icVar.b();
                this.k0 = null;
            }
            ic icVar3 = this.k0;
            if (icVar3 == null || !icVar3.l) {
                this.I0 = h0Var;
                g0 g0Var2 = new g0(getContext(), this.B);
                this.l0 = g0Var2;
                ic f10 = ic.f(this.m0, g0Var2, 5000);
                this.k0 = f10;
                f10.k(true);
            }
            if (this.l0.c(h0Var)) {
                this.k0 = null;
            }
            h0Var.k = false;
            h0Var.l = true;
        }
        C();
        for (Map.Entry entry : this.G0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            h0 h0Var2 = (h0) entry.getKey();
            g1Var.setText(h0Var2.c);
            if (h0Var2.c()) {
                Pair b10 = h0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            } else {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(h0Var2.g));
            }
            if (h0Var2.c()) {
                g1Var.setRightIcon(R.drawable.msg_close);
                g1Var.b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (h0Var2.i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new t8(2, this, h0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z4 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((h0) obj).c()) {
                z4 = true;
                break;
            }
        }
        optionsIcon.setDownloading(z4);
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z10 = false;
                break;
            }
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((h0) obj2).c()) {
                break;
            }
        }
        this.j0.setDownloading(z10);
    }

    public final void C() {
        g0 g0Var = this.l0;
        if (g0Var == null) {
            return;
        }
        if (this.a0) {
            g0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.c0));
        } else if (this.b > 0.5f) {
            g0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            g0Var.setArrow(-1);
        }
    }

    public final void D() {
        BotFullscreenButtons botFullscreenButtons = this.j0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z4 = this.a0;
        i2 i2Var = this.x;
        p2 p2Var = this.e;
        m2 m2Var = this.i0;
        if (z4) {
            int i10 = (m2Var == null || m2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.n <= i10 && (m2Var == null || m2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int dp = AndroidUtilities.dp(46.0f);
            i2Var.K(rect2, false);
            i2Var.J(dp, false);
            p2Var.setPadding(0, 0, 0, Math.max(this.n, i10));
        } else {
            i2Var.K(new Rect(0, 0, 0, 0), false);
            i2Var.J(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.n;
            org.telegram.ui.ActionBar.n3 n3Var = this.r;
            p2Var.setPadding(i11, 0, i12, Math.max(i13, (n3Var != null ? n3Var.E : 0) + rect.bottom));
        }
        this.w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z10 = this.a0;
        int i14 = !z10 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.U;
        layoutParams.leftMargin = i14;
        layoutParams.rightMargin = 0;
        int i15 = !z10 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.n0;
        layoutParams2.leftMargin = i15;
        layoutParams2.rightMargin = !z10 ? 0 : rect.right;
        boolean z11 = this.e0;
        h2 h2Var = this.v;
        if (!z11) {
            h2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.a0) {
                h2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                h2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            h2Var.setSwipeOffsetAnimationDisallowed(false);
            h2Var.c();
            h2Var.invalidate();
            h2Var.requestLayout();
        }
        if (h2Var != null) {
            h2Var.setFullSize(m());
        }
        m2Var.requestLayout();
        p2Var.requestLayout();
        botFullscreenButtons.setVisibility(this.a0 ? 0 : 8);
    }

    public final void E() {
        boolean z4;
        if (this.R) {
            z4 = !this.P;
        } else {
            z4 = !AndroidUtilities.isTablet() && i0.a.f(j6.w0(null, j6.d6, true)) >= 0.7210000157356262d && this.b >= 0.85f;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            this.d = Boolean.valueOf(z4);
            if (Build.VERSION.SDK_INT >= 23) {
                p2 p2Var = this.e;
                int systemUiVisibility = p2Var.getSystemUiVisibility();
                p2Var.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.w0 webView;
        i2 i2Var = this.x;
        if (i2Var == null || (webView = i2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.M.getColor());
    }

    public final void G() {
        m2 m2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z4 = this.a0;
            if (z4) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            p2 p2Var = this.e;
            if (!z4 || (((m2Var = this.i0) != null && m2Var.getTotalHeight() > 0) || p2Var.u0)) {
                p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() & (-3));
            } else {
                p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.m3 a() {
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        m3Var.o = this.N;
        m3Var.n = this.r0;
        m3Var.l = this.R;
        m3Var.m = this.S;
        m3Var.p = this.M.getColor();
        m3Var.a = this.s0;
        i2 i2Var = this.x;
        m3Var.r = i2Var != null && i2Var.K;
        m3Var.B = j6.I.q();
        m3Var.v = i2Var != null ? i2Var.getUrlLoaded() : null;
        h2 h2Var = this.v;
        m3Var.h = (h2Var != null && h2Var.getSwipeOffsetY() < 0.0f) || this.u0 || m() || this.a0;
        m3Var.x = this.a0;
        m3Var.y = this.b0;
        Boolean bool = this.w0;
        m3Var.z = bool == null ? this.v0 : bool.booleanValue();
        m3Var.i = h2Var != null ? h2Var.getOffsetY() : Float.MAX_VALUE;
        m3Var.A = this.x0;
        m3Var.s = this.t0;
        m3Var.w = this.o0;
        m3Var.t = this.Y;
        m3Var.j = h2Var == null || h2Var.J;
        m3Var.u = this.i0.e;
        m3Var.q = this.O;
        v0 v0Var = this.y0;
        if (v0Var != null) {
            v0Var.b();
        }
        m3Var.I = this.y0;
        org.telegram.ui.web.w0 webView = i2Var != null ? i2Var.getWebView() : null;
        if (webView != null) {
            i2Var.g("preserveWebView");
            i2Var.w0 = true;
            if (i2Var.l0) {
                i2Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.FALSE, "is_visible"));
            }
            m3Var.b = webView;
            m3Var.d = i2Var.getBotProxy();
            m3Var.e = webView.getWidth();
            m3Var.f = webView.getHeight();
            webView.onPause();
        }
        boolean z4 = this.P0;
        m3Var.E = z4;
        if (z4) {
            m3Var.F = this.Q0;
        }
        m3Var.J = this.z0;
        this.A0 = m3Var;
        return m3Var;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.G == ((Long) objArr[0]).longValue()) {
                k(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.didSetNewTheme) {
            if (i10 == NotificationCenter.botDownloadsUpdate) {
                B();
            }
        } else {
            this.e.invalidate();
            this.x.n.b(j6.v0(j6.d6, this.B), 153);
            A();
            E();
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void dismiss(boolean z4) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z4) {
        if (botappsettings == null) {
            return;
        }
        boolean q10 = j6.I.q();
        int i10 = botappsettings.flags;
        boolean z10 = ((q10 ? 4 : 2) & i10) != 0;
        if ((i10 & (q10 ? 16 : 8)) != 0) {
            t((q10 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z4);
        }
        if (z10) {
            v((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z4);
            y((q10 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z4);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final int getNavigationBarColor(int i10) {
        return i0.a.d(this.K0, i10, this.O);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.u3 getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.J0 && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.H(true, true, true);
        }
        p2 p2Var = this.e;
        if (p2Var != null) {
            p2Var.invalidate();
        }
    }

    public final void i() {
        if (this.R0 == null) {
            org.telegram.ui.f3 f3Var = new org.telegram.ui.f3(getContext());
            this.R0 = f3Var;
            this.v.addView(f3Var, b6.c(-1.0f, -1));
            this.R0.setTranslationY(-1.0f);
            this.R0.h.setOnClickListener(new z1(this, 0));
            this.R0.setBackgroundColor(this.M.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.R0, this.P0, 1.0f, false);
        }
    }

    public final void k(boolean z4) {
        LaunchActivity launchActivity;
        if (this.Z) {
            return;
        }
        if (this.E0 != null) {
            z4 = false;
        }
        this.Z = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.q0);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z4 && ((launchActivity = LaunchActivity.D1) == null || launchActivity.v0 == null)) {
            z4 = false;
        }
        if (z4) {
            o1.j jVar = this.c;
            if (jVar != null) {
                jVar.u.i = 0.0f;
                jVar.f();
            }
            LaunchActivity.D1.v0.b(this);
        } else {
            m2 m2Var = this.i0;
            if (m2Var != null) {
                m2Var.animate().translationY(m2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(nr.h).start();
            }
            this.x.h();
            h2 h2Var = this.v;
            int height = h2Var.getHeight() + (m2Var != null ? m2Var.getTotalHeight() : 0);
            Rect rect = this.h;
            h2Var.f(this.e.R() + height + rect.top + rect.bottom + (m() ? AndroidUtilities.dp(200.0f) : 0), true, new r1(this, 0));
        }
        T0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.D1;
        }
        return ownerActivity == null ? AndroidUtilities.findActivity(getContext()) : ownerActivity;
    }

    public final boolean m() {
        if (this.a0) {
            return true;
        }
        Boolean bool = this.w0;
        return bool == null ? this.v0 : bool.booleanValue();
    }

    public final void n() {
        boolean z4;
        if (this.s0 == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.s0.r));
        String str = null;
        this.w0 = null;
        TLObject tLObject = this.s0.q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.G = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z4 = tL_webViewResultUrl.same_origin;
            this.w0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z10 = this.B0;
            if (!z10) {
                x(tL_webViewResultUrl.fullscreen, !z10, this.b0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.G = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.G = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            }
            z4 = false;
        }
        i2 i2Var = this.x;
        if (z4) {
            i2Var.setTrustedOrigin(str);
        }
        if (str != null && !this.B0) {
            MediaDataController.getInstance(this.D).increaseWebappRating(this.s0.c);
            i2Var.r(this.D, str);
        }
        AndroidUtilities.runOnUIThread(this.q0, max);
        h2 h2Var = this.v;
        if (h2Var != null) {
            h2Var.setFullSize(m());
        }
    }

    public final void o(boolean z4) {
        if (this.z0 == z4) {
            return;
        }
        this.z0 = z4;
        if (this.S0) {
            if (z4) {
                V0++;
            } else {
                V0--;
            }
        }
        if (V0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(true);
        if (this.c == null) {
            o1.j jVar = new o1.j(this, U0);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.u = kVar;
            this.c = jVar;
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.p0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.x.z()) {
                return;
            }
            k(true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        m2 m2Var;
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
        if (this.a0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        p2 p2Var = this.e;
        p2Var.setFitsSystemWindows(true);
        p2Var.setSystemUiVisibility(1792);
        p2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: rh.x1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return q2.e(q2.this, view, windowInsets);
            }
        });
        if (!this.a0 || ((m2Var = this.i0) != null && m2Var.getTotalHeight() > 0)) {
            p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() & (-3));
        } else {
            p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() | 2);
        }
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(this, i0.a.f(this.O) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.j jVar = this.c;
        if (jVar != null) {
            jVar.c();
            this.c = null;
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
            ((LaunchActivity) context).y0.add(this.p0);
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
            ((LaunchActivity) context).y0.remove(this.p0);
        }
    }

    public final boolean q() {
        if (!this.o0) {
            k(false);
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.O = formatName;
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new s1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.show();
        ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.q7, this.B));
        return false;
    }

    public final void r() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList arrayList;
        TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.D).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i10);
            i10++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == this.E) {
                break;
            }
        }
        o70 o70Var = this.H0;
        if (o70Var != null) {
            o70Var.u();
        }
        o70 G = o70.G(this.e, this.B, this.a0 ? this.j0 : this.W, true);
        this.H0 = G;
        ArrayList arrayList3 = i0.c(getContext(), this.D, this.E).e;
        HashMap hashMap = this.G0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            o70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new rt0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList3.get(i11);
                i11++;
                h0 h0Var = (h0) obj;
                String str = h0Var.c;
                c21 c21Var = new c21(15);
                f6 f6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.j0;
                    int intValue = num != null ? num.intValue() : j6.v0(j6.E8, f6Var);
                    Integer num2 = J.k0;
                    g1Var.c(intValue, num2 != null ? num2.intValue() : j6.v0(j6.F8, f6Var));
                    Integer num3 = J.l0;
                    g1Var.setSelectorColor(num3 != null ? num3.intValue() : j6.l1(0.12f, j6.v0(j6.E8, f6Var)));
                    g1Var.setOnClickListener(new org.telegram.ui.Components.g0(J, c21Var));
                    int i12 = J.S;
                    if (i12 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i12));
                        J.r(g1Var, b6.n(J.S, -2));
                    } else {
                        J.r(g1Var, b6.n(-1, -2));
                        hashMap.put(h0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(h0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new kh.z2(G, J, 9), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new r1(this, 9), this.E0 == null);
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new r1(this, 10), this.E0 == null && this.Y);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new r1(this, 11), false);
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new r1(this, 12), this.E0 == null && user != null && user.bot_has_main_app);
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new r1(this, 13), this.E0 == null);
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new r1(this, 14), this.E0 == null);
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new r1(this, 15), this.E0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.N != j6.w0(null, j6.d6, false)) {
            int i13 = AndroidUtilities.computePerceivedBrightness(this.N) >= 0.721f ? -1 : -15198183;
            int i14 = AndroidUtilities.computePerceivedBrightness(i13) >= 0.721f ? -16777216 : -1;
            int l1 = j6.l1(0.85f, i14);
            int l12 = j6.l1(0.1f, i14);
            G.P(i13);
            for (int i15 = 0; i15 < G.x(); i15++) {
                View w10 = G.w(i15);
                if (w10 instanceof org.telegram.ui.ActionBar.g1) {
                    org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) w10;
                    g1Var2.c(i14, l1);
                    g1Var2.setSelectorColor(l12);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.t = false;
        G.s = 0;
        G.Z();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void release() {
        if (this.J0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.p2 p2Var, z3 z3Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z4;
        TL_bots.botAppSettings botappsettings;
        this.s0 = z3Var;
        int i10 = z3Var.a;
        this.D = i10;
        this.F = z3Var.b;
        this.E = z3Var.c;
        this.H = z3Var.h;
        this.I = z3Var.i;
        this.J = z3Var.e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.E));
        CharSequence userName = UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        n2 n2Var = this.T;
        n2Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.D).getUserFull(this.E);
        f6 f6Var = this.B;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.F0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
            this.F0.setAlpha(255);
            n2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            n2Var.getTitleTextView().i(new dg.k1(this, 8));
        }
        BotFullscreenButtons botFullscreenButtons = this.j0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        org.telegram.ui.ActionBar.z n10 = n2Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.D).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                zVar = n10;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            tL_attachMenuBot = tL_attachMenuBot2;
            zVar = n10;
            if (tL_attachMenuBot.bot_id == this.E) {
                break;
            } else {
                n10 = zVar;
            }
        }
        if (!this.B0) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    g(botappsettings, false);
                }
                z4 = true;
            } else {
                z4 = true;
                MessagesController.getInstance(this.D).loadFullUser(user2, 0, true, new u1(this, 1));
            }
            if (z3Var.p) {
                x(z4, false, this.b0);
            }
        }
        if (this.E0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.X = optionsIcon;
        org.telegram.ui.ActionBar.w0 d = zVar2.d(0, optionsIcon);
        this.W = d;
        d.setOnClickListener(new z1(this, 1));
        n2Var.setActionBarMenuOnItemClick(new c2(this));
        JSONObject p10 = p(f6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        i2 i2Var = this.x;
        i2Var.setBotUser(user3);
        i2Var.q(this.D, this.E);
        TLRPC.User user4 = z3Var.m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.D).isShortcutAdded(this.E, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.D).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.D).preloadImage(ImageLocation.getForUser(this.D, user4, 1), 0);
            }
        }
        if (z3Var.q != null) {
            n();
            return;
        }
        int i12 = z3Var.g;
        if (i12 == 0) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(this.D).getInputPeer(this.F);
            tL_messages_requestWebView.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
            tL_messages_requestWebView.platform = "android";
            tL_messages_requestWebView.compact = z3Var.o;
            tL_messages_requestWebView.fullscreen = z3Var.p;
            String str = z3Var.f;
            if (str != null) {
                tL_messages_requestWebView.url = str;
                tL_messages_requestWebView.flags |= 2;
            }
            if (this.H != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.D).createReplyInput(this.H);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (this.I != 0) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.D).getInputPeer(this.I);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (this.I != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.D).getInputPeer(this.I);
                tL_messages_requestWebView.flags |= 1;
            }
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestWebView, new b2(this, 3));
            NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            tL_messages_requestSimpleWebView.from_switch_webview = (z3Var.n & 1) != 0;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
            tL_messages_requestSimpleWebView.platform = "android";
            tL_messages_requestSimpleWebView.from_side_menu = (z3Var.n & 2) != 0;
            tL_messages_requestSimpleWebView.compact = z3Var.o;
            tL_messages_requestSimpleWebView.fullscreen = z3Var.p;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                tL_dataJSON2.data = p10.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(z3Var.f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = z3Var.f;
            }
            if (!TextUtils.isEmpty(z3Var.l)) {
                tL_messages_requestSimpleWebView.start_param = z3Var.l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestSimpleWebView, new b2(this, 2));
            return;
        }
        if (i12 == 2) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView2.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
            tL_messages_requestWebView2.peer = MessagesController.getInstance(this.D).getInputPeer(this.E);
            tL_messages_requestWebView2.platform = "android";
            tL_messages_requestWebView2.compact = z3Var.o;
            tL_messages_requestWebView2.fullscreen = z3Var.p;
            tL_messages_requestWebView2.url = z3Var.f;
            tL_messages_requestWebView2.flags |= 2;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                tL_dataJSON3.data = p10.toString();
                tL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestWebView2, new b2(this, 1));
            NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i12 == 3) {
            TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
            TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
            TLRPC.BotApp botApp = z3Var.j;
            tL_inputBotAppID.id = botApp.id;
            tL_inputBotAppID.access_hash = botApp.access_hash;
            tL_messages_requestAppWebView.app = tL_inputBotAppID;
            tL_messages_requestAppWebView.write_allowed = z3Var.k;
            tL_messages_requestAppWebView.platform = "android";
            if (p2Var instanceof xn) {
                xn xnVar = (xn) p2Var;
                inputPeer = xnVar.i() != null ? MessagesController.getInputPeer(xnVar.i()) : MessagesController.getInputPeer(xnVar.e);
            } else {
                inputPeer = MessagesController.getInputPeer(z3Var.m);
            }
            tL_messages_requestAppWebView.peer = inputPeer;
            tL_messages_requestAppWebView.compact = z3Var.o;
            tL_messages_requestAppWebView.fullscreen = z3Var.p;
            if (!TextUtils.isEmpty(z3Var.l)) {
                tL_messages_requestAppWebView.start_param = z3Var.l;
                tL_messages_requestAppWebView.flags |= 2;
            }
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                tL_dataJSON4.data = p10.toString();
                tL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestAppWebView, new b2(this, 4), 66);
            return;
        }
        if (i12 != 4) {
            if (i12 != 5) {
                return;
            }
            TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
            tL_messages_requestChatJoinWebView.platform = "android";
            tL_messages_requestChatJoinWebView.query_id = z3Var.d;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p10.toString();
            }
            ConnectionsManager.getInstance(this.D).sendRequestTyped(tL_messages_requestChatJoinWebView, new org.telegram.messenger.a(), new d4(this, 11), 66);
            return;
        }
        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.D).getInputUser(z3Var.c);
        tL_messages_requestMainWebView.platform = "android";
        if (p2Var instanceof xn) {
            xn xnVar2 = (xn) p2Var;
            inputPeer2 = xnVar2.i() != null ? MessagesController.getInputPeer(xnVar2.i()) : MessagesController.getInputPeer(xnVar2.e);
        } else {
            inputPeer2 = MessagesController.getInstance(this.D).getInputPeer(z3Var.b);
        }
        tL_messages_requestMainWebView.peer = inputPeer2;
        tL_messages_requestMainWebView.compact = z3Var.o;
        tL_messages_requestMainWebView.fullscreen = z3Var.p;
        if (!TextUtils.isEmpty(z3Var.l)) {
            tL_messages_requestMainWebView.start_param = z3Var.l;
            tL_messages_requestMainWebView.flags |= 2;
        }
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestMainWebView.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = p10.toString();
            tL_messages_requestMainWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestMainWebView, new b2(this, 5), 66);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            z(true);
            p2 p2Var = this.e;
            p2Var.setAlpha(0.0f);
            p2Var.addOnLayoutChangeListener(new m.t2(this, 1));
            super.show();
            this.J0 = false;
            T0.add(this);
        }
    }

    public final void t(final int i10, boolean z4, boolean z10) {
        final int i11 = this.N;
        j6.b(0.35f, -0.1f, i10);
        final p1 p1Var = new p1();
        int i12 = this.R ? this.N : 0;
        SparseIntArray sparseIntArray = p1Var.a;
        f6 f6Var = this.B;
        p1Var.c(sparseIntArray, i12, f6Var);
        this.R = z4;
        this.P = i0.a.f(i10) < 0.7210000157356262d;
        p1Var.c(p1Var.b, this.R ? i10 : 0, f6Var);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.a2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i11, i10);
                    q2 q2Var = q2.this;
                    q2Var.N = d;
                    q2Var.h();
                    p2 p2Var = q2Var.e;
                    p2Var.invalidate();
                    n2 n2Var = q2Var.T;
                    n2Var.setBackgroundColor(q2Var.N);
                    p1 p1Var2 = p1Var;
                    p1Var2.b(n2Var, floatValue);
                    q2Var.a = p1Var2.a(j6.Ii);
                    p2Var.invalidate();
                }
            });
            duration.addListener(new g2(this, i11, i10, p1Var));
            duration.start();
        } else {
            this.N = i10;
            h();
            p2 p2Var = this.e;
            p2Var.invalidate();
            int i13 = this.N;
            n2 n2Var = this.T;
            n2Var.setBackgroundColor(i13);
            p1Var.b(n2Var, 1.0f);
            this.a = p1Var.a(j6.Ii);
            p2Var.invalidate();
        }
        E();
    }

    public final void u(boolean z4) {
        if (this.S0 == z4) {
            return;
        }
        this.S0 = z4;
        if (z4) {
            if (this.z0) {
                V0++;
            }
        } else if (this.z0) {
            V0--;
        }
        if (V0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i10, boolean z4) {
        Paint paint = this.M;
        int color = paint.getColor();
        this.S = true;
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = 0;
        if (z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.M0 = duration;
            duration.setInterpolator(nr.f);
            this.M0.addUpdateListener(new y1(this, color, i10, i11));
            this.M0.addListener(new b4(this, i10, 9));
            this.M0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.e.invalidate();
        org.telegram.ui.f3 f3Var = this.R0;
        if (f3Var != null) {
            f3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            this.R0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z4) {
        if (this.v0 != z4) {
            this.v0 = z4;
            h2 h2Var = this.v;
            if (h2Var != null) {
                h2Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z4, boolean z10, boolean z11) {
        float f10;
        if (this.a0 == z4) {
            return;
        }
        this.a0 = z4;
        this.b0 = z11 && !MessagesController.getInstance(this.D).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.j0;
        h2 h2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z4, z10);
            botFullscreenButtons.setParentRenderNode(this.b0 ? h2Var.getRenderNode() : null);
        }
        this.f0 = h2Var.getWidth();
        this.g0 = h2Var.getHeight();
        this.N0 = false;
        m2 m2Var = this.i0;
        i2 i2Var = this.x;
        n2 n2Var = this.T;
        if (!z10) {
            this.e0 = false;
            this.c0 = z4 ? 1.0f : 0.0f;
            this.d0 = 0.0f;
            D();
            G();
            n2Var.setVisibility(z4 ? 8 : 0);
            n2Var.setAlpha(1.0f - this.c0);
            n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.c0);
            m2Var.setTranslationX(0.0f);
            botFullscreenButtons.setAlpha(this.c0);
            i2Var.setViewPortHeightOffset(0.0f);
            i2Var.n(true, true);
            C();
            return;
        }
        D();
        G();
        C();
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            f10 = 0.0f;
        } else {
            int i10 = AndroidUtilities.displaySize.x;
            f10 = (i10 - ((int) (Math.min(i10, r0.y) * 0.8f))) / 2.0f;
        }
        float f11 = z4 ? this.h.left + f10 : (-r13) - f10;
        if (!z4) {
            f10 = -f10;
        }
        float translationY = z4 ? h2Var.getTranslationY() : -AndroidUtilities.dp(24.0f);
        float currentActionBarHeight = z4 ? -AndroidUtilities.dp(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        o1.j jVar = h2Var.v;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = h2Var.D;
        if (jVar2 != null) {
            jVar2.c();
        }
        h2Var.setSwipeOffsetAnimationDisallowed(true);
        n2Var.setVisibility(0);
        if (z4) {
            h2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
        } else {
            h2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
        }
        h2Var.c();
        h2Var.invalidate();
        this.d0 = 0.0f;
        float f12 = z4 ? 0.0f : 1.0f;
        this.c0 = f12;
        n2Var.setAlpha(1.0f - f12);
        n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.c0);
        h2Var.setTranslationY(AndroidUtilities.lerp(translationY, currentActionBarHeight, this.d0));
        h2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.d0));
        m2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.d0));
        botFullscreenButtons.setAlpha(this.c0);
        this.e.invalidate();
        i2Var.setViewPortHeightOffset(h2Var.getTranslationY() - currentActionBarHeight);
        i2Var.n(false, false);
        this.e0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O0 = ofFloat;
        float f13 = f11;
        ofFloat.addUpdateListener(new e2(this, z4, translationY, currentActionBarHeight, f13, f10));
        this.O0.addListener(new f2(this, z4, currentActionBarHeight2, f13));
        this.O0.setDuration(280L);
        this.O0.setInterpolator(nr.h);
        this.O0.start();
    }

    public final void y(int i10, boolean z4) {
        int i11 = this.O;
        m2 m2Var = this.i0;
        Paint paint = m2Var.a;
        m2Var.e.b = i10;
        paint.setColor(i10);
        int i12 = 1;
        if (!z4) {
            m2Var.d.a(i10, true);
        }
        if (z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(nr.f);
            duration.addUpdateListener(new y1(this, i11, i10, i12));
            duration.addListener(new r20(this, i11, i10, 3));
            duration.start();
        } else {
            this.O = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.O, false);
    }

    public final void z(boolean z4) {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.K0 - (z4 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K0, z4 ? 1.0f : 0.0f);
        this.L0 = ofFloat;
        ofFloat.addListener(new l61(14, this, z4));
        this.L0.addUpdateListener(new q1(this, 0));
        this.L0.setInterpolator(nr.h);
        this.L0.setDuration(220L);
        this.L0.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        k(false);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final /* synthetic */ void setLastVisible(boolean z4) {
    }
}
