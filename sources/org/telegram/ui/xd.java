package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xd extends org.telegram.ui.Components.tt0 implements org.telegram.ui.ActionBar.b6 {
    public static xd u1;
    public static HashMap v1;
    public final org.telegram.ui.Components.o6 A0;
    public final hi.e B0;
    public int C0;
    public final ai.u2 D0;
    public TL_stars.StarsAmount E0;
    public final org.telegram.ui.Components.o6 F0;
    public final org.telegram.ui.Components.o6 G0;
    public final nd H0;
    public final org.telegram.ui.Components.nq[] I0;
    public final LinearLayout J0;
    public final hi.e K0;
    public final di.p L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final di.q P0;
    public org.telegram.ui.Components.gc Q0;
    public boolean R0;
    public int S0;
    public Runnable T0;
    public final bi.m3 U0;
    public int V0;
    public int W0;
    public int X0;
    public final org.telegram.ui.Components.h51 Y0;
    public final FrameLayout Z0;
    public DecimalFormat a1;
    public final td b1;
    public final boolean c1;
    public final boolean d1;
    public final ri.q e1;
    public SpannableStringBuilder f1;
    public final dd g1;
    public double h1;
    public double i1;
    public org.telegram.ui.ActionBar.k j1;
    public boolean k1;
    public boolean l1;
    public o41 m1;
    public final c51 n0;
    public o41 n1;
    public final org.telegram.ui.ActionBar.h6 o0;
    public o41 o1;
    public final int p0;
    public boolean p1;
    public final long q0;
    public final ud q1;
    public TL_stories.TL_premium_boostsStatus r0;
    public final ud r1;
    public int s0;
    public final ud s1;
    public final SpannableStringBuilder t0;
    public final cd t1;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final SpannableStringBuilder w0;
    public final ai.u2 x0;
    public final RelativeSizeSpan y0;
    public final org.telegram.ui.Components.o6 z0;

    public xd(Activity activity, c51 c51Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, ri.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.E0 = TL_stars.StarsAmount.ofStars(0L);
        this.I0 = new org.telegram.ui.Components.nq[1];
        this.M0 = false;
        this.N0 = true;
        this.R0 = true;
        this.S0 = -1;
        this.k1 = false;
        this.l1 = false;
        this.p1 = false;
        String N0 = org.telegram.messenger.hd.N0(2131748191, null);
        ud udVar = new ud();
        udVar.a = false;
        udVar.b = "TON";
        udVar.h = "XTR";
        udVar.c = N0;
        this.q1 = udVar;
        String N02 = org.telegram.messenger.hd.N0(2131748190, null);
        ud udVar2 = new ud();
        udVar2.a = false;
        udVar2.b = "TON";
        udVar2.h = "XTR";
        udVar2.c = N02;
        this.r1 = udVar2;
        String N03 = org.telegram.messenger.hd.N0(2131748189, null);
        ud udVar3 = new ud();
        udVar3.a = false;
        udVar3.b = "TON";
        udVar3.h = "XTR";
        udVar3.c = N03;
        this.s1 = udVar3;
        this.t1 = new cd(this, 7);
        this.e1 = qVar;
        this.c1 = z10;
        this.d1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.a1 = decimalFormat;
        int i10 = 2;
        decimalFormat.setMinimumFractionDigits(2);
        this.a1.setMaximumFractionDigits(12);
        this.a1.setGroupingUsed(false);
        this.n0 = c51Var;
        this.o0 = h6Var;
        this.p0 = i7;
        this.q0 = j3;
        long j10 = -j3;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10));
        if (O0 != null) {
            this.s0 = O0.level;
        }
        org.telegram.messenger.np.u1(i7).I0().a(j3, new r3(this, i10));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.m6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.np.u1(i7).l1(j3);
            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(j10);
            if (P0 != null) {
                boolean z12 = P0.restricted_sponsored;
                this.k1 = z12;
                this.l1 = z12;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat O02 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10));
        this.t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.a0(null, null, 2131748206, 50), -1, 3, new o1(c51Var, activity, h6Var, 12), h6Var), true);
        this.u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(org.telegram.messenger.np.u1(i7).L5 ? 2131748212 : 2131748210, null), -1, 3, new cd(this, 0), null), true);
        int i11 = 1;
        this.v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0((z11 && z10) ? 2131748186 : z11 ? 2131748188 : 2131748184, null), -1, 3, new dd(this, (z11 && z10) ? 2131748185 : z11 ? 2131748187 : 2131748183, 0), h6Var), true);
        this.w0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(O02) ? 2131748179 : 2131748178, null), new cd(this, i11)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.U0 = new bi.m3(26, activity, this);
        td tdVar = new td(this, activity, i7, j3, c51Var.getClassGuid(), new cd(this, 2), h6Var);
        this.b1 = tdVar;
        ai.u2 u2Var = new ai.u2(activity, 4);
        this.x0 = u2Var;
        u2Var.setOrientation(1);
        int i12 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.t6.h(i12, u2Var, h6Var);
        u2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(activity, false, true, true);
        this.z0 = o6Var;
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i13, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        o6Var.setGravity(17);
        this.y0 = new RelativeSizeSpan(0.6770833f);
        u2Var.addView(o6Var, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(activity, true, true, true);
        this.A0 = o6Var2;
        o6Var2.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i14, h6Var);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        u2Var.addView(o6Var2, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        this.B0 = eVar;
        eVar.setEnabled(org.telegram.messenger.np.u1(i7).L5);
        eVar.i(org.telegram.messenger.hd.N0(2131748158, null), false, true);
        eVar.setVisibility(8);
        eVar.setOnClickListener(new oi.i1(9, this, c51Var));
        u2Var.addView(eVar, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.u2 u2Var2 = new ai.u2(activity, 5);
        this.D0 = u2Var2;
        u2Var2.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(i12, u2Var2, h6Var);
        u2Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(activity, false, true, true);
        this.F0 = o6Var3;
        o6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var3, i13, h6Var);
        o6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        o6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        u2Var2.addView(o6Var3, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var4 = new org.telegram.ui.Components.o6(activity, true, true, true);
        this.G0 = o6Var4;
        o6Var4.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(o6Var4, i14, h6Var);
        o6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        u2Var2.addView(o6Var4, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        di.p pVar = new di.p(1, activity, this);
        this.L0 = pVar;
        pVar.setVisibility(8);
        pVar.setText(org.telegram.messenger.hd.N0(2131752941, null));
        pVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        di.q qVar2 = new di.q(activity, 3);
        this.P0 = qVar2;
        qVar2.setFocusable(false);
        org.telegram.ui.ActionBar.t6.U(qVar2, i13, h6Var);
        qVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar2.setCursorWidth(1.5f);
        qVar2.setBackground(null);
        qVar2.setTextSize(1, 18.0f);
        qVar2.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        qVar2.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        qVar2.setInputType(2);
        qVar2.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.t6.C(qVar2, org.telegram.ui.ActionBar.m6.lg, h6Var);
        org.telegram.ui.ActionBar.t6.l(qVar2, 36, org.telegram.ui.ActionBar.m6.mg, h6Var);
        qVar2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        qVar2.setOnFocusChangeListener(new ed(this, 0));
        qVar2.addTextChangedListener(new md(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, c8.ma.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(qVar2, c8.ma.p(-1, -2, 1.0f, org.telegram.messenger.ls.E1));
        pVar.e(qVar2);
        pVar.addView(linearLayout, c8.ma.e(-1, -2, 48));
        u2Var2.addView(pVar, c8.ma.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.J0 = linearLayout2;
        linearLayout2.setOrientation(0);
        nd ndVar = new nd(activity, h6Var, true);
        ndVar.setRoundRadius(24);
        this.H0 = ndVar;
        ndVar.setEnabled(false);
        ndVar.i(org.telegram.messenger.hd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        ndVar.setVisibility(0);
        ndVar.setOnClickListener(new bi.h5(this, i7, c51Var, 6));
        hi.e eVar2 = new hi.e(activity, h6Var, true);
        eVar2.setRoundRadius(24);
        this.K0 = eVar2;
        eVar2.setEnabled(false);
        eVar2.i(org.telegram.messenger.hd.N0(2131748181, null), false, true);
        eVar2.setOnClickListener(new gd(this, i7, j3, activity));
        linearLayout2.addView(ndVar, c8.ma.p(-1, 48, 1.0f, org.telegram.messenger.ls.E1));
        if (org.telegram.messenger.v3.V(O02)) {
            linearLayout2.addView(new Space(activity), c8.ma.p(8, 48, 0.0f, org.telegram.messenger.ls.E1));
            linearLayout2.addView(eVar2, c8.ma.p(-1, 48, 1.0f, org.telegram.messenger.ls.E1));
        }
        u2Var2.addView(linearLayout2, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        qVar2.setOnEditorActionListener(new ld(0, this, c51Var));
        int i15 = 2;
        this.g1 = new dd(this, i7, i15);
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(c51Var, new a5(this, i15), new bd(this), new org.telegram.messenger.fd(this, 25));
        this.Y0 = h51Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        h51Var.f3 = i0Var;
        h51Var.setLayoutManager(i0Var);
        h51Var.setClipToPadding(false);
        h51Var.r1();
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        h51Var.g3.r = false;
        u(h51Var, new bd(this));
        x(tdVar, tdVar.b, new org.telegram.messenger.fd(24));
        View view = tdVar.d;
        y(view);
        view.setLayoutParams(c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(h51Var);
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout, h6Var);
        frameLayout.addView(f10, c8.ma.e(-2, -2, 17));
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(activity);
        rh0Var.setAutoRepeat(true);
        rh0Var.f(R.raw.statistic_preload, 120, 120, null);
        rh0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i16 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(textView, i16, null);
        textView.setTag(Integer.valueOf(i16));
        textView.setText(org.telegram.messenger.hd.N0(2131748584, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i17 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.U(textView2, i17, null);
        textView2.setTag(Integer.valueOf(i17));
        textView2.setText(org.telegram.messenger.hd.N0(2131748583, null));
        textView2.setGravity(1);
        f10.addView(rh0Var, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        f10.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        f10.addView(textView2, c8.ma.r(-2, -2, 1));
        addView(frameLayout, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
    }

    public static org.telegram.ui.ActionBar.w2 I(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        int i7 = 0;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.setImageResource(R.drawable.large_monetize);
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        rh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(rh0Var, L2, M, null, h6Var);
        g10.addView(rh0Var, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        i5.c.x(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i11, h6Var);
        textView.setText(org.telegram.messenger.hd.N0(z10 ? 2131753023 : 2131748196, null));
        g10.addView(textView, c8.ma.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        g10.addView(new bi.t2(context, R.drawable.msg_channel, org.telegram.messenger.hd.N0(z10 ? 2131753032 : 2131748205, null), org.telegram.messenger.hd.N0(z10 ? 2131753031 : 2131748204, null), h6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        g10.addView(new bi.t2(context, R.drawable.menu_feature_split, org.telegram.messenger.hd.N0(z10 ? 2131753030 : 2131748203, null), org.telegram.messenger.hd.N0(z10 ? 2131753029 : 2131748202, null), h6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        g10.addView(new bi.t2(context, R.drawable.menu_feature_withdrawals, org.telegram.messenger.hd.N0(z10 ? 2131753028 : 2131748201, null), org.telegram.messenger.hd.N0(z10 ? 2131753027 : 2131748200, null), h6Var), c8.ma.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
        g10.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        x5Var.setGravity(17);
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(x5Var, i11, h6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_72, 0);
        nqVar.d = false;
        nqVar.I = 0.9f;
        nqVar.J = 0.9f;
        nqVar.b(x5Var.getPaint().getFontMetricsInt());
        nqVar.H = 0.9f;
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        x5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.N0(z10 ? 2131753024 : 2131748197, null), spannableString, "💎"));
        g10.addView(x5Var, c8.ma.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context, h6Var);
        m80Var.setGravity(17);
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i11, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setText(org.telegram.messenger.g0.b4(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(z10 ? 2131753025 : 2131748198, null)), new ch.k(19, context, z10)));
        g10.addView(m80Var, c8.ma.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        hi.e g11 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        g11.i(org.telegram.messenger.hd.N0(2131749355, null), false, true);
        g11.setOnClickListener(new fd(j3, i7));
        g10.addView(g11, c8.ma.t(-1, 48, 55, 10, 25, 10, 14));
        j3.O = g10;
        return j3;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        if (v1 == null) {
            v1 = new HashMap();
        }
        int i7 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) v1.get(Integer.valueOf(i7));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_72, 0);
                nqVar.d = false;
                nqVar.I = f10;
                nqVar.J = f10;
                nqVar.a(org.telegram.ui.ActionBar.m6.o6);
                nqVar.b(textPaint.getFontMetricsInt());
                nqVar.H = 0.9f;
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.nq nqVar2 = new org.telegram.ui.Components.nq(R.drawable.mini_gram_16, 0);
                nqVar2.d = false;
                nqVar2.I = f10;
                nqVar2.J = f10;
                nqVar2.s = f11;
                nqVar2.H = 0.95f;
                spannableString.setSpan(nqVar2, 0, spannableString.length(), 33);
            }
            v1.put(Integer.valueOf(i7), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        long j10;
        String N0;
        long j11;
        long j12;
        long j13;
        char c10;
        boolean z10;
        boolean z11;
        String q10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.w2 j14 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            N0 = org.telegram.messenger.hd.N0(2131748168, null);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.date;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j13 = 0;
            c10 = 65535;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                N0 = org.telegram.messenger.hd.N0(2131748170, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                N0 = org.telegram.messenger.hd.N0(2131748169, null);
                j11 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = 0;
            }
            c10 = 1;
            z10 = false;
            z11 = false;
        }
        long j15 = j12;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.o10.p(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.t6.U(textView, c10 < 0 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        long j16 = j11;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        g10.addView(textView, c8.ma.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.y6, h6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.hd.N0(2131748165, null));
        } else if (j16 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.hd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.hd.Q(j16) + " - " + org.telegram.messenger.hd.Q(j13));
        }
        if (z11) {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, h6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.hd.N0(2131748166, null)));
        }
        g10.addView(textView2, c8.ma.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.o10.p(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView3.setText(N0);
        g10.addView(textView3, c8.ma.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i10 = org.telegram.ui.ActionBar.m6.Ti;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L, L2, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.t6.j(frameLayout, e02, M, null, h6Var);
            if (j3 < j10) {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == 0) {
                    q10 = "";
                    user = O0;
                } else {
                    q10 = O0.title;
                    user = O0;
                }
            } else {
                TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(j3));
                q10 = org.telegram.messenger.p10.q(c22);
                user = c22;
            }
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var.l(user);
            q9Var.f(user, b9Var);
            frameLayout.addView(q9Var, c8.ma.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.j5, h6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(q10);
            frameLayout.addView(textView4, c8.ma.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            g10.addView(frameLayout, c8.ma.t(-2, 28, 1, 42, 10, 42, 0));
        }
        int i11 = 1;
        hi.e g11 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g11.i(org.telegram.messenger.hd.N0(2131748167, null), false, true);
                g11.setOnClickListener(new oi.i1(context, tL_broadcastRevenueTransactionWithdrawal2));
                g10.addView(g11, c8.ma.t(-1, 48, 55, 18, 30, 18, 14));
                j14.O = g10;
                j14.show();
            }
        }
        g11.i(org.telegram.messenger.hd.N0(2131747637, null), false, true);
        g11.setOnClickListener(new fd(j14, i11));
        g10.addView(g11, c8.ma.t(-1, 48, 55, 18, 30, 18, 14));
        j14.O = g10;
        j14.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        mg.b bVar;
        ArrayList arrayList;
        boolean z10 = this.o1 == null;
        this.i1 = tL_payments_starsRevenueStats.usd_rate;
        o41 i02 = c51.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.hd.N0(2131748207, null), 2, false);
        this.o1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.o1.d.d.get(0) != null) {
            ((mg.a) this.o1.d.d.get(0)).g = org.telegram.ui.ActionBar.m6.bk;
            this.o1.d.h = (float) ((1.0d / this.i1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new cd(this, 6)).start();
        }
        org.telegram.ui.Components.h51 h51Var = this.Y0;
        if (h51Var != null) {
            h51Var.g3.O(!z10);
            if (z10) {
                h51Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.c1 && this.p1 && org.telegram.messenger.np.g1().getBoolean("monetizationadshint", true)) {
            this.n0.showDialog(I(getContext(), this.o0, false));
            org.telegram.messenger.np.g1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        c51 c51Var = this.n0;
        if (c51Var == null) {
            return;
        }
        Activity parentActivity = c51Var.getParentActivity();
        int i7 = this.p0;
        TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j3 = this.q0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.np.u1(i7).l1(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.O0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.np.u1(i7).l1(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new di.j3(this, twoStepVerificationActivity, parentActivity, z10));
    }

    public final boolean G(float f10, float f11) {
        return this.Z0.getVisibility() != 0 && c() && f10 >= 0.0f && f10 < ((float) getWidth()) && f11 >= getTabsTop() && f11 < ((float) getHeight());
    }

    public final void H(boolean z10) {
        if (this.d1) {
            int i7 = this.p0;
            di.e0 g10 = di.e0.g(i7);
            long j3 = this.q0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
            if (h != null) {
                org.telegram.messenger.g0.g3(new u8(15, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.np.u1(i7).l1(j3);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.m6.I.q();
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 2));
        }
    }

    public final void J() {
        td tdVar = this.b1;
        cd cdVar = tdVar.f;
        boolean[] zArr = tdVar.w;
        boolean a10 = tdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (zArr[i7]) {
                return;
            }
            if (i7 == 1) {
                tdVar.n.clear();
                tdVar.h = "";
            } else {
                tdVar.r.clear();
                tdVar.s = "";
            }
            zArr[i7] = false;
            tdVar.c(i7);
        }
        if (tdVar.a() == a10 || cdVar == null) {
            return;
        }
        tdVar.e();
        cdVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ud udVar;
        int i7;
        int i10;
        org.telegram.ui.Components.c51 c51Var;
        ud udVar2;
        int i11;
        xd xdVar = this;
        ud udVar3 = xdVar.s1;
        ud udVar4 = xdVar.r1;
        org.telegram.ui.Components.o6 o6Var = xdVar.A0;
        RelativeSizeSpan relativeSizeSpan = xdVar.y0;
        org.telegram.ui.Components.o6 o6Var2 = xdVar.z0;
        ud udVar5 = xdVar.q1;
        if (z10) {
            udVar5.a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            udVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (xdVar.h1 * d * 100.0d);
            udVar5.e = j10;
            if (xdVar.a1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                udVar2 = udVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                xdVar.a1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i11 = 6;
                xdVar.a1.setMaximumFractionDigits(6);
                xdVar.a1.setGroupingUsed(false);
            } else {
                udVar2 = udVar3;
                i11 = 6;
            }
            DecimalFormat decimalFormat2 = xdVar.a1;
            if (d > 1.5d) {
                i11 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + xdVar.a1.format(d), o6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            o6Var2.setText(spannableStringBuilder);
            o6Var.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
            udVar5.f = "USD";
            udVar4.a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            udVar4.d = j11;
            xdVar = this;
            double d2 = xdVar.h1;
            udVar4.e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            udVar4.f = "USD";
            ud udVar6 = udVar2;
            udVar6.a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            udVar6.d = j12;
            udVar6.e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            udVar6.f = "USD";
            xdVar.p1 = true;
            xdVar.B0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d10 = xdVar.i1;
            if (d10 == 0.0d) {
                return;
            }
            udVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            udVar5.i = starsAmount;
            udVar5.j = (long) (starsAmount.amount * d10 * 100.0d);
            int i12 = tL_starsRevenueStatus.next_withdrawal_at;
            nd ndVar = xdVar.H0;
            if (o6Var2 == null || o6Var == null) {
                udVar = udVar3;
                i7 = 0;
            } else {
                udVar = udVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(di.pb.b1(false, TextUtils.concat("XTR ", di.pb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                xdVar.E0 = starsAmount;
                xdVar.F0.setText(spannableStringBuilder2);
                xdVar.G0.setText("≈" + org.telegram.messenger.r1.i().f((long) (xdVar.i1 * starsAmount.amount * 100.0d), "USD"));
                xdVar.L0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (xdVar.N0) {
                    xdVar.M0 = true;
                    long j13 = starsAmount.amount;
                    xdVar.O0 = j13;
                    String l10 = Long.toString(j13);
                    di.q qVar = xdVar.P0;
                    qVar.setText(l10);
                    qVar.setSelection(qVar.getText().length());
                    i7 = 0;
                    xdVar.M0 = false;
                    ndVar.setEnabled(xdVar.O0 > 0);
                } else {
                    i7 = 0;
                }
                hi.e eVar = xdVar.K0;
                if (eVar != null) {
                    eVar.setEnabled(starsAmount.amount > 0 ? 1 : i7);
                }
                xdVar.C0 = i12;
                dd ddVar = xdVar.g1;
                org.telegram.messenger.g0.r(ddVar);
                ddVar.run();
            }
            udVar5.f = "USD";
            udVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            udVar4.i = starsAmount2;
            double d11 = starsAmount2.amount;
            double d12 = xdVar.i1;
            udVar4.j = (long) (d11 * d12 * 100.0d);
            udVar4.f = "USD";
            ud udVar7 = udVar;
            udVar7.g = true;
            udVar7.i = tL_starsRevenueStatus.overall_revenue;
            udVar7.j = (long) (r4.amount * d12 * 100.0d);
            udVar7.f = "USD";
            xdVar.p1 = true;
            LinearLayout linearLayout = xdVar.J0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i7 : 8);
            }
            if (ndVar != null) {
                if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                    boolean z11 = org.telegram.messenger.s2.a;
                    i10 = 8;
                } else {
                    i10 = i7;
                }
                ndVar.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.h51 h51Var = xdVar.Y0;
        if (h51Var == null || (c51Var = h51Var.g3) == null) {
            return;
        }
        c51Var.O(true);
    }

    public View getTransactionTabs() {
        return this.b1.d;
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        u1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.j1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.j1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.T0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            di.q qVar = this.P0;
            if (qVar != null) {
                qVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mg, this.o0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
