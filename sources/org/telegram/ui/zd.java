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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zd extends org.telegram.ui.Components.ht0 implements org.telegram.ui.ActionBar.a6 {
    public static zd t1;
    public static HashMap u1;
    public final fi.d A0;
    public int B0;
    public final bi.t C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.j6 E0;
    public final org.telegram.ui.Components.j6 F0;
    public final pd G0;
    public final org.telegram.ui.Components.wp[] H0;
    public final LinearLayout I0;
    public final fi.d J0;
    public final bi.u K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final bi.v O0;
    public org.telegram.ui.Components.cc P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.ec T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.q41 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final vd a1;
    public final boolean b1;
    public final boolean c1;
    public final oi.q d1;
    public SpannableStringBuilder e1;
    public final ed f1;
    public double g1;
    public double h1;
    public org.telegram.ui.ActionBar.k i1;
    public boolean j1;
    public boolean k1;
    public o41 l1;
    public final c51 m0;
    public o41 m1;
    public final org.telegram.ui.ActionBar.f6 n0;
    public o41 n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final wd p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final wd q1;
    public int r0;
    public final wd r1;
    public final SpannableStringBuilder s0;
    public final dd s1;
    public final SpannableStringBuilder t0;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final bi.t w0;
    public final RelativeSizeSpan x0;
    public final org.telegram.ui.Components.j6 y0;
    public final org.telegram.ui.Components.j6 z0;

    public zd(Activity activity, c51 c51Var, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, oi.q qVar, boolean z9, boolean z10) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.wp[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String M0 = org.telegram.messenger.id.M0(2131748385, null);
        wd wdVar = new wd();
        wdVar.a = false;
        wdVar.b = "TON";
        wdVar.h = "XTR";
        wdVar.c = M0;
        this.p1 = wdVar;
        String M02 = org.telegram.messenger.id.M0(2131748384, null);
        wd wdVar2 = new wd();
        wdVar2.a = false;
        wdVar2.b = "TON";
        wdVar2.h = "XTR";
        wdVar2.c = M02;
        this.q1 = wdVar2;
        String M03 = org.telegram.messenger.id.M0(2131748383, null);
        wd wdVar3 = new wd();
        wdVar3.a = false;
        wdVar3.b = "TON";
        wdVar3.h = "XTR";
        wdVar3.c = M03;
        this.r1 = wdVar3;
        this.s1 = new dd(this, 7);
        this.d1 = qVar;
        this.b1 = z9;
        this.c1 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        int i10 = 2;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = c51Var;
        this.n0 = f6Var;
        this.o0 = i7;
        this.p0 = j3;
        long j10 = -j3;
        TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        if (M04 != null) {
            this.r0 = M04.level;
        }
        org.telegram.messenger.qp.s1(i7).G0().a(j3, new r3(this, i10));
        H(false);
        if (z9) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j10);
            if (N0 != null) {
                boolean z11 = N0.restricted_sponsored;
                this.j1 = z11;
                this.k1 = z11;
            }
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
        int i11 = 3;
        this.s0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131748400, 50), -1, 3, new o1(c51Var, activity, f6Var, 12), f6Var), true);
        this.t0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(org.telegram.messenger.qp.s1(i7).I5 ? 2131748406 : 2131748404, null), -1, 3, new dd(this, 0), null), true);
        int i12 = 1;
        this.u0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0((z10 && z9) ? 2131748380 : z10 ? 2131748382 : 2131748378, null), -1, 3, new ed(this, (z10 && z9) ? 2131748379 : z10 ? 2131748381 : 2131748377, 0), f6Var), true);
        this.v0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(M05) ? 2131748373 : 2131748372, null), new dd(this, i12)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new f(this, 11));
        this.T0 = new bi.ec(25, activity, this);
        vd vdVar = new vd(this, activity, i7, j3, c51Var.getClassGuid(), new dd(this, 2), f6Var);
        this.a1 = vdVar;
        bi.t tVar = new bi.t(activity, i11);
        this.w0 = tVar;
        tVar.setOrientation(1);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i13, tVar, f6Var);
        tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.y0 = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i14, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(32.0f));
        j6Var.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        tVar.addView(j6Var, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.z0 = j6Var2;
        j6Var2.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i15, f6Var);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar.addView(j6Var2, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(org.telegram.messenger.qp.s1(i7).I5);
        dVar.i(org.telegram.messenger.id.M0(2131748352, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.l1(7, this, c51Var));
        tVar.addView(dVar, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        bi.t tVar2 = new bi.t(activity, 4);
        this.C0 = tVar2;
        tVar2.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i13, tVar2, f6Var);
        tVar2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.E0 = j6Var3;
        j6Var3.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(j6Var3, i14, f6Var);
        j6Var3.setTextSize(org.telegram.messenger.g0.L(32.0f));
        j6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        tVar2.addView(j6Var3, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var4 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.F0 = j6Var4;
        j6Var4.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(j6Var4, i15, f6Var);
        j6Var4.setTextSize(org.telegram.messenger.g0.L(14.0f));
        tVar2.addView(j6Var4, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        bi.u uVar = new bi.u(1, activity, this);
        this.K0 = uVar;
        uVar.setVisibility(8);
        uVar.setText(org.telegram.messenger.id.M0(2131752953, null));
        uVar.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        bi.v vVar = new bi.v(activity, 3);
        this.O0 = vVar;
        vVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(vVar, i14, f6Var);
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setBackground(null);
        vVar.setTextSize(1, 18.0f);
        vVar.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        vVar.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        vVar.setInputType(2);
        vVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(vVar, org.telegram.ui.ActionBar.k6.ig, f6Var);
        org.telegram.ui.ActionBar.r6.m(vVar, 36, org.telegram.ui.ActionBar.k6.jg, f6Var);
        vVar.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        vVar.setOnFocusChangeListener(new fd(this, 0));
        vVar.addTextChangedListener(new od(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(vVar, c8.ha.p(-1, -2, 1.0f, org.telegram.messenger.qs.E1));
        uVar.e(vVar);
        uVar.addView(linearLayout, c8.ha.e(-1, -2, 48));
        tVar2.addView(uVar, c8.ha.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        pd pdVar = new pd(activity, f6Var, true);
        pdVar.setRoundRadius(24);
        this.G0 = pdVar;
        pdVar.setEnabled(false);
        pdVar.i(org.telegram.messenger.id.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        pdVar.setVisibility(0);
        pdVar.setOnClickListener(new bi.la(this, i7, c51Var, 4));
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.J0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.id.M0(2131748375, null), false, true);
        dVar2.setOnClickListener(new hd(this, i7, j3, activity));
        linearLayout2.addView(pdVar, c8.ha.p(-1, 48, 1.0f, org.telegram.messenger.qs.E1));
        if (org.telegram.messenger.t3.V(M05)) {
            linearLayout2.addView(new Space(activity), c8.ha.p(8, 48, 0.0f, org.telegram.messenger.qs.E1));
            linearLayout2.addView(dVar2, c8.ha.p(-1, 48, 1.0f, org.telegram.messenger.qs.E1));
        }
        tVar2.addView(linearLayout2, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        vVar.setOnEditorActionListener(new nd(0, this, c51Var));
        int i16 = 2;
        this.f1 = new ed(this, i7, i16);
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(c51Var, new a5(this, i16), new cd(this), new org.telegram.messenger.ch(this, 20));
        this.X0 = q41Var;
        jg.i0 i0Var = new jg.i0(5, this, false);
        q41Var.e3 = i0Var;
        q41Var.setLayoutManager(i0Var);
        q41Var.setClipToPadding(false);
        q41Var.r1();
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        q41Var.f3.r = false;
        u(q41Var, new cd(this));
        x(vdVar, vdVar.b, new org.telegram.messenger.ch(19));
        View view = vdVar.d;
        y(view);
        view.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qVar != null) {
            qVar.b(q41Var);
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, f6Var);
        frameLayout.addView(e10, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(activity);
        ch0Var.setAutoRepeat(true);
        ch0Var.f(R.raw.statistic_preload, 120, 120, null);
        ch0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i17 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i17, null);
        textView.setTag(Integer.valueOf(i17));
        textView.setText(org.telegram.messenger.id.M0(2131748778, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, null);
        textView2.setTag(Integer.valueOf(i18));
        textView2.setText(org.telegram.messenger.id.M0(2131748777, null));
        textView2.setGravity(1);
        e10.addView(ch0Var, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        e10.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        e10.addView(textView2, c8.ha.r(-2, -2, 1));
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
    }

    public static org.telegram.ui.ActionBar.v2 I(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        int i7 = 0;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.setImageResource(R.drawable.large_monetize);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        ch0Var.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(ch0Var, L2, N, null, f6Var);
        f10.addView(ch0Var, c8.ha.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, f6Var);
        textView.setText(org.telegram.messenger.id.M0(z9 ? 2131753035 : 2131748390, null));
        f10.addView(textView, c8.ha.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        f10.addView(new di.a4(context, R.drawable.msg_channel, org.telegram.messenger.id.M0(z9 ? 2131753044 : 2131748399, null), org.telegram.messenger.id.M0(z9 ? 2131753043 : 2131748398, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        f10.addView(new di.a4(context, R.drawable.menu_feature_split, org.telegram.messenger.id.M0(z9 ? 2131753042 : 2131748397, null), org.telegram.messenger.id.M0(z9 ? 2131753041 : 2131748396, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        f10.addView(new di.a4(context, R.drawable.menu_feature_withdrawals, org.telegram.messenger.id.M0(z9 ? 2131753040 : 2131748395, null), org.telegram.messenger.id.M0(z9 ? 2131753039 : 2131748394, null), f6Var), c8.ha.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, f6Var);
        f10.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        q5Var.setGravity(17);
        q5Var.setTextSize(1, 20.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(q5Var, i11, f6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_72, 0);
        wpVar.d = false;
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.b(q5Var.getPaint().getFontMetricsInt());
        wpVar.G = 0.9f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        q5Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(z9 ? 2131753036 : 2131748391, null), spannableString, "💎"));
        f10.addView(q5Var, c8.ha.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, f6Var);
        w70Var.setGravity(17);
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, i11, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(z9 ? 2131753037 : 2131748392, null)), new bi.k1(19, context, z9)));
        f10.addView(w70Var, c8.ha.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.i(org.telegram.messenger.id.M0(2131749532, null), false, true);
        h.setOnClickListener(new gd(l10, i7));
        f10.addView(h, c8.ha.t(-1, 48, 55, 10, 25, 10, 14));
        l10.N = f10;
        return l10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z9) {
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i7 = ((textPaint.getFontMetricsInt().bottom * (z9 ? 1 : -1)) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i7));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z9) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_gram_72, 0);
                wpVar.d = false;
                wpVar.H = f10;
                wpVar.I = f10;
                wpVar.a(org.telegram.ui.ActionBar.k6.o6);
                wpVar.b(textPaint.getFontMetricsInt());
                wpVar.G = 0.9f;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_gram_16, 0);
                wpVar2.d = false;
                wpVar2.H = f10;
                wpVar2.I = f10;
                wpVar2.s = f11;
                wpVar2.G = 0.95f;
                spannableString.setSpan(wpVar2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i7), spannableString);
        }
        return org.telegram.messenger.g0.M2(charSequence, spannableString, "TON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(Context context, int i7, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        long j10;
        String M0;
        long j11;
        long j12;
        long j13;
        char c10;
        boolean z9;
        boolean z10;
        String p10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        boolean z11 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = org.telegram.messenger.id.M0(2131748362, null);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.date;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z12 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z9 = z12;
            j13 = 0;
            c10 = 65535;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.id.M0(2131748364, null);
                j11 = tL_broadcastRevenueTransactionProceeds.from_date;
                j13 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = org.telegram.messenger.id.M0(2131748363, null);
                j11 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = 0;
            }
            c10 = 1;
            z9 = false;
            z10 = false;
        }
        long j14 = j12;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, c10 < 0 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.l8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c10 < 0 ? "-" : "+"));
        long j15 = j11;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j14) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f10.addView(textView, c8.ha.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, f6Var);
        if (z9) {
            textView2.setText(org.telegram.messenger.id.M0(2131748359, null));
        } else if (j15 == j10) {
            textView2.setText(org.telegram.messenger.id.Q(j13));
        } else if (j13 == j10) {
            textView2.setText(org.telegram.messenger.id.Q(j15));
        } else {
            textView2.setText(org.telegram.messenger.id.Q(j15) + " - " + org.telegram.messenger.id.Q(j13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, f6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.id.M0(2131748360, null)));
        }
        f10.addView(textView2, c8.ha.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.camera.q.m(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, f6Var);
        textView3.setText(M0);
        f10.addView(textView3, c8.ha.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, L2, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.r6.k(frameLayout, e02, N, null, f6Var);
            if (j3 < j10) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M02 == 0) {
                    p10 = "";
                    user = M02;
                } else {
                    p10 = M02.title;
                    user = M02;
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                p10 = org.telegram.messenger.t10.p(a22);
                user = a22;
            }
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.l(user);
            l9Var.e(user, w8Var);
            frameLayout.addView(l9Var, c8.ha.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.j5, f6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p10);
            frameLayout.addView(textView4, c8.ha.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, c8.ha.t(-2, 28, 1, 42, 10, 42, 0));
        }
        int i11 = 1;
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                h.i(org.telegram.messenger.id.M0(2131748361, null), false, true);
                h.setOnClickListener(new org.telegram.ui.ActionBar.l1(8, context, tL_broadcastRevenueTransactionWithdrawal2));
                f10.addView(h, c8.ha.t(-1, 48, 55, 18, 30, 18, 14));
                l10.N = f10;
                l10.show();
            }
        }
        h.i(org.telegram.messenger.id.M0(2131747832, null), false, true);
        h.setOnClickListener(new gd(l10, i11));
        f10.addView(h, c8.ha.t(-1, 48, 55, 18, 30, 18, 14));
        l10.N = f10;
        l10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        mg.b bVar;
        ArrayList arrayList;
        boolean z9 = this.n1 == null;
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        o41 i02 = c51.i0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.id.M0(2131748401, null), 2, false);
        this.n1 = i02;
        if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((mg.a) this.n1.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.Yj;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new dd(this, 6)).start();
        }
        org.telegram.ui.Components.q41 q41Var = this.X0;
        if (q41Var != null) {
            q41Var.f3.O(!z9);
            if (z9) {
                q41Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.b1 && this.o1 && org.telegram.messenger.qp.e1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.n0, false));
            org.telegram.messenger.qp.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z9, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        c51 c51Var = this.m0;
        if (c51Var == null) {
            return;
        }
        Activity parentActivity = c51Var.getParentActivity();
        int i7 = this.o0;
        TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j3 = this.p0;
        if (z9) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new bi.d4(this, twoStepVerificationActivity, parentActivity, z9));
    }

    public final boolean G(float f10, float f11) {
        return this.Y0.getVisibility() != 0 && c() && f10 >= 0.0f && f10 < ((float) getWidth()) && f11 >= getTabsTop() && f11 < ((float) getHeight());
    }

    public final void H(boolean z9) {
        if (this.c1) {
            int i7 = this.o0;
            bi.n0 g10 = bi.n0.g(i7);
            long j3 = this.p0;
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z9);
            if (h != null) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(28, this, h));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new kd(this, 2));
        }
    }

    public final void J() {
        vd vdVar = this.a1;
        dd ddVar = vdVar.f;
        boolean[] zArr = vdVar.w;
        boolean a10 = vdVar.a();
        for (int i7 = 0; i7 < 2; i7++) {
            if (zArr[i7]) {
                return;
            }
            if (i7 == 1) {
                vdVar.n.clear();
                vdVar.h = "";
            } else {
                vdVar.r.clear();
                vdVar.s = "";
            }
            zArr[i7] = false;
            vdVar.c(i7);
        }
        if (vdVar.a() == a10 || ddVar == null) {
            return;
        }
        vdVar.e();
        ddVar.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z9, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        wd wdVar;
        int i7;
        int i10;
        org.telegram.ui.Components.l41 l41Var;
        wd wdVar2;
        int i11;
        zd zdVar = this;
        wd wdVar3 = zdVar.r1;
        wd wdVar4 = zdVar.q1;
        org.telegram.ui.Components.j6 j6Var = zdVar.z0;
        RelativeSizeSpan relativeSizeSpan = zdVar.x0;
        org.telegram.ui.Components.j6 j6Var2 = zdVar.y0;
        wd wdVar5 = zdVar.p1;
        if (z9) {
            wdVar5.a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            wdVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (zdVar.g1 * d * 100.0d);
            wdVar5.e = j10;
            if (zdVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                wdVar2 = wdVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                zdVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i11 = 6;
                zdVar.Z0.setMaximumFractionDigits(6);
                zdVar.Z0.setGroupingUsed(false);
            } else {
                wdVar2 = wdVar3;
                i11 = 6;
            }
            DecimalFormat decimalFormat2 = zdVar.Z0;
            if (d > 1.5d) {
                i11 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + zdVar.Z0.format(d), j6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            j6Var2.setText(spannableStringBuilder);
            j6Var.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
            wdVar5.f = "USD";
            wdVar4.a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            wdVar4.d = j11;
            zdVar = this;
            double d2 = zdVar.g1;
            wdVar4.e = (long) ((j11 / 1.0E9d) * d2 * 100.0d);
            wdVar4.f = "USD";
            wd wdVar6 = wdVar2;
            wdVar6.a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            wdVar6.d = j12;
            wdVar6.e = (long) ((j12 / 1.0E9d) * d2 * 100.0d);
            wdVar6.f = "USD";
            zdVar.o1 = true;
            zdVar.A0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d10 = zdVar.h1;
            if (d10 == 0.0d) {
                return;
            }
            wdVar5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            wdVar5.i = starsAmount;
            wdVar5.j = (long) (starsAmount.amount * d10 * 100.0d);
            int i12 = tL_starsRevenueStatus.next_withdrawal_at;
            pd pdVar = zdVar.G0;
            if (j6Var2 == null || j6Var == null) {
                wdVar = wdVar3;
                i7 = 0;
            } else {
                wdVar = wdVar3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bi.dd.a1(false, TextUtils.concat("XTR ", bi.dd.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                zdVar.D0 = starsAmount;
                zdVar.E0.setText(spannableStringBuilder2);
                zdVar.F0.setText("≈" + org.telegram.messenger.r1.i().f((long) (zdVar.h1 * starsAmount.amount * 100.0d), "USD"));
                zdVar.K0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (zdVar.M0) {
                    zdVar.L0 = true;
                    long j13 = starsAmount.amount;
                    zdVar.N0 = j13;
                    String l10 = Long.toString(j13);
                    bi.v vVar = zdVar.O0;
                    vVar.setText(l10);
                    vVar.setSelection(vVar.getText().length());
                    i7 = 0;
                    zdVar.L0 = false;
                    pdVar.setEnabled(zdVar.N0 > 0);
                } else {
                    i7 = 0;
                }
                fi.d dVar = zdVar.J0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0 ? 1 : i7);
                }
                zdVar.B0 = i12;
                ed edVar = zdVar.f1;
                org.telegram.messenger.g0.r(edVar);
                edVar.run();
            }
            wdVar5.f = "USD";
            wdVar4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            wdVar4.i = starsAmount2;
            double d11 = starsAmount2.amount;
            double d12 = zdVar.h1;
            wdVar4.j = (long) (d11 * d12 * 100.0d);
            wdVar4.f = "USD";
            wd wdVar7 = wdVar;
            wdVar7.g = true;
            wdVar7.i = tL_starsRevenueStatus.overall_revenue;
            wdVar7.j = (long) (r4.amount * d12 * 100.0d);
            wdVar7.f = "USD";
            zdVar.o1 = true;
            LinearLayout linearLayout = zdVar.I0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i7 : 8);
            }
            if (pdVar != null) {
                if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                    boolean z10 = org.telegram.messenger.r2.a;
                    i10 = 8;
                } else {
                    i10 = i7;
                }
                pdVar.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.q41 q41Var = zdVar.X0;
        if (q41Var == null || (l41Var = q41Var.f3) == null) {
            return;
        }
        l41Var.O(true);
    }

    public View getTransactionTabs() {
        return this.a1.d;
    }

    @Override // org.telegram.ui.Components.ht0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override // org.telegram.ui.Components.ht0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.i1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.i1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            bi.v vVar = this.O0;
            if (vVar != null) {
                vVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.jg, this.n0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
