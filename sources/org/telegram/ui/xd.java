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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xd extends org.telegram.ui.Components.gt0 implements org.telegram.ui.ActionBar.z5 {
    public static xd u1;
    public static HashMap v1;
    public final org.telegram.ui.Components.h6 A0;
    public final gi.d B0;
    public int C0;
    public final ci.q D0;
    public TL_stars.StarsAmount E0;
    public final org.telegram.ui.Components.h6 F0;
    public final org.telegram.ui.Components.h6 G0;
    public final nd H0;
    public final org.telegram.ui.Components.wp[] I0;
    public final LinearLayout J0;
    public final gi.d K0;
    public final ci.r L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final ci.s P0;
    public org.telegram.ui.Components.ac Q0;
    public boolean R0;
    public int S0;
    public Runnable T0;
    public final ai.x2 U0;
    public int V0;
    public int W0;
    public int X0;
    public final org.telegram.ui.Components.l41 Y0;
    public final FrameLayout Z0;
    public DecimalFormat a1;
    public final td b1;
    public final boolean c1;
    public final boolean d1;
    public final pi.q e1;
    public SpannableStringBuilder f1;
    public final dd g1;
    public double h1;
    public double i1;
    public org.telegram.ui.ActionBar.k j1;
    public boolean k1;
    public boolean l1;
    public d41 m1;
    public final r41 n0;
    public d41 n1;
    public final org.telegram.ui.ActionBar.e6 o0;
    public d41 o1;
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
    public final ci.q x0;
    public final RelativeSizeSpan y0;
    public final org.telegram.ui.Components.h6 z0;

    public xd(Activity activity, r41 r41Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, pi.q qVar, boolean z10, boolean z11) {
        super(activity);
        this.E0 = TL_stars.StarsAmount.ofStars(0L);
        this.I0 = new org.telegram.ui.Components.wp[1];
        this.M0 = false;
        this.N0 = true;
        this.R0 = true;
        this.S0 = -1;
        this.k1 = false;
        this.l1 = false;
        this.p1 = false;
        String M0 = org.telegram.messenger.bd.M0(2131748392, null);
        ud udVar = new ud();
        udVar.a = false;
        udVar.b = "TON";
        udVar.h = "XTR";
        udVar.c = M0;
        this.q1 = udVar;
        String M02 = org.telegram.messenger.bd.M0(2131748391, null);
        ud udVar2 = new ud();
        udVar2.a = false;
        udVar2.b = "TON";
        udVar2.h = "XTR";
        udVar2.c = M02;
        this.r1 = udVar2;
        String M03 = org.telegram.messenger.bd.M0(2131748390, null);
        ud udVar3 = new ud();
        udVar3.a = false;
        udVar3.b = "TON";
        udVar3.h = "XTR";
        udVar3.c = M03;
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
        this.n0 = r41Var;
        this.o0 = e6Var;
        this.p0 = i3;
        this.q0 = j10;
        long j11 = -j10;
        TLRPC.Chat M04 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
        if (M04 != null) {
            this.s0 = M04.level;
        }
        org.telegram.messenger.hp.s1(i3).G0().a(j10, new s3(this, i10));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(j11);
            if (N0 != null) {
                boolean z12 = N0.restricted_sponsored;
                this.k1 = z12;
                this.l1 = z12;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
        int i11 = 3;
        this.t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131748407, 50), -1, 3, new p1(r41Var, activity, e6Var, 12), e6Var), true);
        this.u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(org.telegram.messenger.hp.s1(i3).I5 ? 2131748413 : 2131748411, null), -1, 3, new cd(this, 0), null), true);
        int i12 = 1;
        this.v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0((z11 && z10) ? 2131748387 : z11 ? 2131748389 : 2131748385, null), -1, 3, new dd(this, (z11 && z10) ? 2131748386 : z11 ? 2131748388 : 2131748384, 0), e6Var), true);
        this.w0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(M05) ? 2131748380 : 2131748379, null), new cd(this, i12)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.U0 = new ai.x2(26, activity, this);
        td tdVar = new td(this, activity, i3, j10, r41Var.getClassGuid(), new cd(this, 2), e6Var);
        this.b1 = tdVar;
        ci.q qVar2 = new ci.q(activity, i11);
        this.x0 = qVar2;
        qVar2.setOrientation(1);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i13, qVar2, e6Var);
        qVar2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.z0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i14, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var.setGravity(17);
        this.y0 = new RelativeSizeSpan(0.6770833f);
        qVar2.addView(h6Var, b8.mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.A0 = h6Var2;
        h6Var2.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i15, e6Var);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        qVar2.addView(h6Var2, b8.mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setEnabled(org.telegram.messenger.hp.s1(i3).I5);
        dVar.i(org.telegram.messenger.bd.M0(2131748359, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.messenger.video.g(13, this, r41Var));
        qVar2.addView(dVar, b8.mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ci.q qVar3 = new ci.q(activity, 4);
        this.D0 = qVar3;
        qVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i13, qVar3, e6Var);
        qVar3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(activity, false, true, true);
        this.F0 = h6Var3;
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var3, i14, e6Var);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        h6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        qVar3.addView(h6Var3, b8.mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var4 = new org.telegram.ui.Components.h6(activity, true, true, true);
        this.G0 = h6Var4;
        h6Var4.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var4, i15, e6Var);
        h6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        qVar3.addView(h6Var4, b8.mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.r rVar = new ci.r(1, activity, this);
        this.L0 = rVar;
        rVar.setVisibility(8);
        rVar.setText(org.telegram.messenger.bd.M0(2131752953, null));
        rVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        ci.s sVar = new ci.s(activity, 3);
        this.P0 = sVar;
        sVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(sVar, i14, e6Var);
        sVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sVar.setCursorWidth(1.5f);
        sVar.setBackground(null);
        sVar.setTextSize(1, 18.0f);
        sVar.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        sVar.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        sVar.setInputType(2);
        sVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(sVar, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(sVar, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
        sVar.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        sVar.setOnFocusChangeListener(new ed(this, 0));
        sVar.addTextChangedListener(new md(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, b8.mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(sVar, b8.mf.p(-1, -2, 1.0f, org.telegram.messenger.hs.E1));
        rVar.e(sVar);
        rVar.addView(linearLayout, b8.mf.e(-1, -2, 48));
        qVar3.addView(rVar, b8.mf.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.J0 = linearLayout2;
        linearLayout2.setOrientation(0);
        nd ndVar = new nd(activity, e6Var, true);
        ndVar.setRoundRadius(24);
        this.H0 = ndVar;
        ndVar.setEnabled(false);
        ndVar.i(org.telegram.messenger.bd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        ndVar.setVisibility(0);
        ndVar.setOnClickListener(new ai.h3(this, i3, r41Var, 6));
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.K0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.bd.M0(2131748382, null), false, true);
        dVar2.setOnClickListener(new gd(this, i3, j10, activity));
        linearLayout2.addView(ndVar, b8.mf.p(-1, 48, 1.0f, org.telegram.messenger.hs.E1));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), b8.mf.p(8, 48, 0.0f, org.telegram.messenger.hs.E1));
            linearLayout2.addView(dVar2, b8.mf.p(-1, 48, 1.0f, org.telegram.messenger.hs.E1));
        }
        qVar3.addView(linearLayout2, b8.mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        sVar.setOnEditorActionListener(new ld(0, this, r41Var));
        int i16 = 2;
        this.g1 = new dd(this, i3, i16);
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(r41Var, new c5(this, i16), new bd(this), new org.telegram.messenger.go(this, 17));
        this.Y0 = l41Var;
        kg.f0 f0Var = new kg.f0(5, this, false);
        l41Var.f3 = f0Var;
        l41Var.setLayoutManager(f0Var);
        l41Var.setClipToPadding(false);
        l41Var.r1();
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.g3.r = false;
        u(l41Var, new bd(this));
        x(tdVar, tdVar.b, new org.telegram.messenger.go(16));
        View view = tdVar.d;
        y(view);
        view.setLayoutParams(b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(l41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, e6Var);
        frameLayout.addView(e10, b8.mf.e(-2, -2, 17));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(activity);
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.statistic_preload, 120, 120, null);
        fh0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i17 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i17, null);
        textView.setTag(Integer.valueOf(i17));
        textView.setText(org.telegram.messenger.bd.M0(2131748785, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, null);
        textView2.setTag(Integer.valueOf(i18));
        textView2.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView2.setGravity(1);
        e10.addView(fh0Var, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, b8.mf.r(-2, -2, 1));
        addView(frameLayout, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
    }

    public static org.telegram.ui.ActionBar.t2 I(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i3 = 0;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.setImageResource(R.drawable.large_monetize);
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        fh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(fh0Var, L2, N, null, e6Var);
        f10.addView(fh0Var, b8.mf.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        k2.p1.t(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        textView.setText(org.telegram.messenger.bd.M0(z10 ? 2131753035 : 2131748397, null));
        f10.addView(textView, b8.mf.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        f10.addView(new ai.d2(context, R.drawable.msg_channel, org.telegram.messenger.bd.M0(z10 ? 2131753044 : 2131748406, null), org.telegram.messenger.bd.M0(z10 ? 2131753043 : 2131748405, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        f10.addView(new ai.d2(context, R.drawable.menu_feature_split, org.telegram.messenger.bd.M0(z10 ? 2131753042 : 2131748404, null), org.telegram.messenger.bd.M0(z10 ? 2131753041 : 2131748403, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        f10.addView(new ai.d2(context, R.drawable.menu_feature_withdrawals, org.telegram.messenger.bd.M0(z10 ? 2131753040 : 2131748402, null), org.telegram.messenger.bd.M0(z10 ? 2131753039 : 2131748401, null), e6Var), b8.mf.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, e6Var);
        f10.addView(view, b8.mf.n(1.0f / org.telegram.messenger.g0.p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        o5Var.setGravity(17);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(o5Var, i11, e6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_72, 0);
        wpVar.d = false;
        wpVar.I = 0.9f;
        wpVar.J = 0.9f;
        wpVar.b(o5Var.getPaint().getFontMetricsInt());
        wpVar.H = 0.9f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        o5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(z10 ? 2131753036 : 2131748398, null), spannableString, "💎"));
        f10.addView(o5Var, b8.mf.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, e6Var);
        s70Var.setGravity(17);
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(z10 ? 2131753037 : 2131748399, null)), new ci.e1(19, context, z10)));
        f10.addView(s70Var, b8.mf.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.i(org.telegram.messenger.bd.M0(2131749539, null), false, true);
        h.setOnClickListener(new fd(l10, i3));
        f10.addView(h, b8.mf.t(-1, 48, 55, 10, 25, 10, 14));
        l10.O = f10;
        return l10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        if (v1 == null) {
            v1 = new HashMap();
        }
        int i3 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) v1.get(Integer.valueOf(i3));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_72, 0);
                wpVar.d = false;
                wpVar.I = f10;
                wpVar.J = f10;
                wpVar.a(org.telegram.ui.ActionBar.k6.o6);
                wpVar.b(textPaint.getFontMetricsInt());
                wpVar.H = 0.9f;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_gram_16, 0);
                wpVar2.d = false;
                wpVar2.I = f10;
                wpVar2.J = f10;
                wpVar2.s = f11;
                wpVar2.H = 0.95f;
                spannableString.setSpan(wpVar2, 0, spannableString.length(), 33);
            }
            v1.put(Integer.valueOf(i3), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(Context context, int i3, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        long j11;
        String M0;
        long j12;
        long j13;
        long j14;
        char c2;
        boolean z10;
        boolean z11;
        String p10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.bd.M0(2131748369, null);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            j13 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j14 = 0;
            c2 = 65535;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.bd.M0(2131748371, null);
                j12 = tL_broadcastRevenueTransactionProceeds.from_date;
                j14 = tL_broadcastRevenueTransactionProceeds.to_date;
                j13 = tL_broadcastRevenueTransactionProceeds.amount;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.bd.M0(2131748370, null);
                j12 = tL_broadcastRevenueTransactionRefund.from_date;
                j13 = tL_broadcastRevenueTransactionRefund.amount;
                j14 = 0;
            }
            c2 = 1;
            z10 = false;
            z11 = false;
        }
        long j15 = j13;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, c2 < 0 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c2 < 0 ? "-" : "+"));
        long j16 = j12;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f10.addView(textView, b8.mf.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, e6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.bd.M0(2131748366, null));
        } else if (j16 == j11) {
            textView2.setText(org.telegram.messenger.bd.Q(j14));
        } else if (j14 == j11) {
            textView2.setText(org.telegram.messenger.bd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.bd.Q(j16) + " - " + org.telegram.messenger.bd.Q(j14));
        }
        if (z11) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, e6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.bd.M0(2131748367, null)));
        }
        f10.addView(textView2, b8.mf.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.camera.q.m(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView3.setText(M0);
        f10.addView(textView3, b8.mf.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e02, N, null, e6Var);
            if (j10 < j11) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
                if (M02 == 0) {
                    p10 = "";
                    user = M02;
                } else {
                    p10 = M02.title;
                    user = M02;
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
                p10 = org.telegram.messenger.l10.p(a22);
                user = a22;
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.l(user);
            k9Var.e(user, u8Var);
            frameLayout.addView(k9Var, b8.mf.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.j5, e6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, b8.mf.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, b8.mf.t(-2, 28, 1, 42, 10, 42, 0));
        }
        int i11 = 1;
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                h.i(org.telegram.messenger.bd.M0(2131748368, null), false, true);
                h.setOnClickListener(new org.telegram.messenger.video.g(14, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(h, b8.mf.t(-1, 48, 55, 18, 30, 18, 14));
                l10.O = f10;
                l10.show();
            }
        }
        h.i(org.telegram.messenger.bd.M0(2131747839, null), false, true);
        h.setOnClickListener(new fd(l10, i11));
        f10.addView(h, b8.mf.t(-1, 48, 55, 18, 30, 18, 14));
        l10.O = f10;
        l10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        ng.b bVar;
        ArrayList arrayList;
        boolean z10 = this.o1 == null;
        this.i1 = tL_payments_starsRevenueStats.usd_rate;
        d41 i02 = r41.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.bd.M0(2131748408, null), 2, false);
        this.o1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.o1.d.d.get(0) != null) {
            ((ng.a) this.o1.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.Yj;
            this.o1.d.h = (float) ((1.0d / this.i1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(this, 6)).start();
        }
        org.telegram.ui.Components.l41 l41Var = this.Y0;
        if (l41Var != null) {
            l41Var.g3.O(!z10);
            if (z10) {
                l41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.c1 && this.p1 && org.telegram.messenger.hp.e1().getBoolean("monetizationadshint", true)) {
            this.n0.showDialog(I(getContext(), this.o0, false));
            org.telegram.messenger.hp.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        r41 r41Var = this.n0;
        if (r41Var == null) {
            return;
        }
        Activity parentActivity = r41Var.getParentActivity();
        int i3 = this.p0;
        TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j10 = this.q0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.O0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ci.o3(this, twoStepVerificationActivity, parentActivity, z10));
    }

    public final boolean G(float f10, float f11) {
        return this.Z0.getVisibility() != 0 && c() && f10 >= 0.0f && f10 < ((float) getWidth()) && f11 >= getTabsTop() && f11 < ((float) getHeight());
    }

    public final void H(boolean z10) {
        if (this.d1) {
            int i3 = this.p0;
            ci.i0 g7 = ci.i0.g(i3);
            long j10 = this.q0;
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j10, z10);
            if (h != null) {
                org.telegram.messenger.g0.h3(new sc(3, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.hp.s1(i3).j1(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new jd(this, 2));
        }
    }

    public final void J() {
        td tdVar = this.b1;
        cd cdVar = tdVar.f;
        boolean[] zArr = tdVar.w;
        boolean a10 = tdVar.a();
        for (int i3 = 0; i3 < 2; i3++) {
            if (zArr[i3]) {
                return;
            }
            if (i3 == 1) {
                tdVar.n.clear();
                tdVar.h = "";
            } else {
                tdVar.r.clear();
                tdVar.s = "";
            }
            zArr[i3] = false;
            tdVar.c(i3);
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
        int i3;
        int i10;
        org.telegram.ui.Components.f41 f41Var;
        ud udVar2;
        int i11;
        xd xdVar = this;
        ud udVar3 = xdVar.s1;
        ud udVar4 = xdVar.r1;
        org.telegram.ui.Components.h6 h6Var = xdVar.A0;
        RelativeSizeSpan relativeSizeSpan = xdVar.y0;
        org.telegram.ui.Components.h6 h6Var2 = xdVar.z0;
        ud udVar5 = xdVar.q1;
        if (z10) {
            udVar5.a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            udVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (xdVar.h1 * d * 100.0d);
            udVar5.e = j11;
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + xdVar.a1.format(d), h6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            h6Var2.setText(spannableStringBuilder);
            h6Var.setText("≈" + org.telegram.messenger.r1.i().f(j11, "USD"));
            udVar5.f = "USD";
            udVar4.a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            udVar4.d = j12;
            xdVar = this;
            double d10 = xdVar.h1;
            udVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            udVar4.f = "USD";
            ud udVar6 = udVar2;
            udVar6.a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            udVar6.d = j13;
            udVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            udVar6.f = "USD";
            xdVar.p1 = true;
            xdVar.B0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = xdVar.i1;
            if (d11 == 0.0d) {
                return;
            }
            udVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            udVar5.i = starsAmount;
            udVar5.j = (long) (starsAmount.amount * d11 * 100.0d);
            int i12 = tL_starsRevenueStatus.next_withdrawal_at;
            nd ndVar = xdVar.H0;
            if (h6Var2 == null || h6Var == null) {
                udVar = udVar3;
                i3 = 0;
            } else {
                udVar = udVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ci.wb.a1(false, TextUtils.concat("XTR ", ci.wb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
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
                    long j14 = starsAmount.amount;
                    xdVar.O0 = j14;
                    String l10 = Long.toString(j14);
                    ci.s sVar = xdVar.P0;
                    sVar.setText(l10);
                    sVar.setSelection(sVar.getText().length());
                    i3 = 0;
                    xdVar.M0 = false;
                    ndVar.setEnabled(xdVar.O0 > 0);
                } else {
                    i3 = 0;
                }
                gi.d dVar = xdVar.K0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0 ? 1 : i3);
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
            double d12 = starsAmount2.amount;
            double d13 = xdVar.i1;
            udVar4.j = (long) (d12 * d13 * 100.0d);
            udVar4.f = "USD";
            ud udVar7 = udVar;
            udVar7.g = true;
            udVar7.i = tL_starsRevenueStatus.overall_revenue;
            udVar7.j = (long) (r4.amount * d13 * 100.0d);
            udVar7.f = "USD";
            xdVar.p1 = true;
            LinearLayout linearLayout = xdVar.J0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i3 : 8);
            }
            if (ndVar != null) {
                if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                    boolean z11 = org.telegram.messenger.r2.a;
                    i10 = 8;
                } else {
                    i10 = i3;
                }
                ndVar.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
        if (l41Var == null || (f41Var = l41Var.g3) == null) {
            return;
        }
        f41Var.O(true);
    }

    public View getTransactionTabs() {
        return this.b1.d;
    }

    @Override // org.telegram.ui.Components.gt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override // org.telegram.ui.Components.gt0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            ci.s sVar = this.P0;
            if (sVar != null) {
                sVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.jg, this.o0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
