// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zi1 extends dha implements tjb {
    public static zi1 t1;
    public static HashMap u1;
    public final u41 A0;
    public int B0;
    public final t1 C0;
    public TL_stars.StarsAmount D0;
    public final hn E0;
    public final hn F0;
    public final oi1 G0;
    public final cm2[] H0;
    public final LinearLayout I0;
    public final u41 J0;
    public final os0 K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final ps0 O0;
    public m21 P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final si9 T0;
    public int U0;
    public int V0;
    public int W0;
    public final q5c X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final vi1 a1;
    public final boolean b1;
    public final boolean c1;
    public final qw4 d1;
    public SpannableStringBuilder e1;
    public final fi1 f1;
    public double g1;
    public double h1;
    public a i1;
    public boolean j1;
    public boolean k1;
    public gxa l1;
    public final uxa m0;
    public gxa m1;
    public final wjb n0;
    public gxa n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final wi1 p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final wi1 q1;
    public int r0;
    public final wi1 r1;
    public final SpannableStringBuilder s0;
    public final ei1 s1;
    public final SpannableStringBuilder t0;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final t1 w0;
    public final RelativeSizeSpan x0;
    public final hn y0;
    public final hn z0;

    public zi1(Activity activity, uxa uxaVar, int i, long j, wjb wjbVar, qw4 qw4Var, boolean z, boolean z2) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new cm2[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String M0 = k96.M0(2131748192, null);
        wi1 wi1Var = new wi1();
        wi1Var.a = false;
        wi1Var.b = "TON";
        wi1Var.h = "XTR";
        wi1Var.c = M0;
        this.p1 = wi1Var;
        String M02 = k96.M0(2131748191, null);
        wi1 wi1Var2 = new wi1();
        wi1Var2.a = false;
        wi1Var2.b = "TON";
        wi1Var2.h = "XTR";
        wi1Var2.c = M02;
        this.q1 = wi1Var2;
        String M03 = k96.M0(2131748190, null);
        wi1 wi1Var3 = new wi1();
        wi1Var3.a = false;
        wi1Var3.b = "TON";
        wi1Var3.h = "XTR";
        wi1Var3.c = M03;
        this.r1 = wi1Var3;
        this.s1 = new ei1(this, (byte) 7);
        this.d1 = qw4Var;
        this.b1 = z;
        this.c1 = z2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = uxaVar;
        this.n0 = wjbVar;
        this.o0 = i;
        this.p0 = j;
        long j2 = -j;
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(j2));
        if (K0 != null) {
            this.r0 = K0.level;
        }
        na7.q1(i).E0().a(j, new be2(this, (byte) 15));
        I(false);
        if (z) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = bkb.I.o();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = na7.q1(i).h1(j);
            TLRPC.ChatFull L0 = na7.q1(i).L0(j2);
            if (L0 != null) {
                boolean z3 = L0.restricted_sponsored;
                this.j1 = z3;
                this.k1 = z3;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ii1(this, (byte) 1), null, null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        }
        TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(j2));
        byte b = 3;
        this.s0 = gl.D2(gl.N2(k96.a0(null, null, 2131748207, 50), -1, 3, new fv0((Object) uxaVar, (Object) activity, (Object) wjbVar, (byte) 20), wjbVar), true);
        this.t0 = gl.D2(gl.N2(k96.M0(na7.q1(i).k4.T2.f ? 2131748213 : 2131748211, null), -1, 3, new ei1(this, (byte) 0), null), true);
        byte b2 = 1;
        this.u0 = gl.D2(gl.N2(k96.M0(z2 ? z ? 2131748187 : 2131748189 : 2131748185, null), -1, 3, new fi1(this, z2 ? z ? 2131748186 : 2131748188 : 2131748184, (byte) 0), wjbVar), true);
        this.v0 = gl.D2(gl.N2(k96.M0(hc2.V(K02) ? 2131748180 : 2131748179, null), -1, 0, new ei1(this, b2), null), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new l69(this, (byte) 17));
        this.T0 = new si9((byte) 6, activity, this);
        vi1 vi1Var = new vi1(this, activity, i, j, uxaVar.getClassGuid(), new ei1(this, (byte) 2), wjbVar);
        this.a1 = vi1Var;
        t1 t1Var = new t1(b, activity, false);
        this.w0 = t1Var;
        t1Var.setOrientation(1);
        int i2 = bkb.c6;
        zkb.h(i2, wjbVar, t1Var);
        t1Var.setPadding(0, 0, 0, gl.L(17.0f));
        hn hnVar = new hn(activity, false, true, true);
        this.y0 = hnVar;
        hnVar.setTypeface(gl.o());
        int i3 = bkb.F6;
        zkb.U(hnVar, i3, wjbVar);
        hnVar.setTextSize(gl.L(32.0f));
        hnVar.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        t1Var.addView(hnVar, nme.t(-1, 38, 49, 22, 15, 22, 0));
        hn hnVar2 = new hn(activity, true, true, true);
        this.z0 = hnVar2;
        hnVar2.setGravity(17);
        int i4 = bkb.x6;
        zkb.U(hnVar2, i4, wjbVar);
        hnVar2.setTextSize(gl.L(14.0f));
        t1Var.addView(hnVar2, nme.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        this.A0 = u41Var;
        u41Var.setEnabled(na7.q1(i).k4.T2.f);
        u41Var.i(k96.M0(2131748159, null), false, true);
        u41Var.setVisibility(8);
        u41Var.setOnClickListener(new kb1((Object) this, (Object) uxaVar, (byte) 2));
        t1Var.addView(u41Var, nme.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t1 t1Var2 = new t1((byte) 4, activity, false);
        this.C0 = t1Var2;
        t1Var2.setOrientation(1);
        zkb.h(i2, wjbVar, t1Var2);
        t1Var2.setPadding(0, 0, 0, gl.L(17.0f));
        hn hnVar3 = new hn(activity, false, true, true);
        this.E0 = hnVar3;
        hnVar3.setTypeface(gl.o());
        zkb.U(hnVar3, i3, wjbVar);
        hnVar3.setTextSize(gl.L(32.0f));
        hnVar3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        t1Var2.addView(hnVar3, nme.t(-1, 38, 49, 22, 15, 22, 0));
        hn hnVar4 = new hn(activity, true, true, true);
        this.F0 = hnVar4;
        hnVar4.setGravity(17);
        zkb.U(hnVar4, i4, wjbVar);
        hnVar4.setTextSize(gl.L(14.0f));
        t1Var2.addView(hnVar4, nme.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        byte b3 = 1;
        os0 os0Var = new os0(b3, activity, this);
        this.K0 = os0Var;
        os0Var.setVisibility(8);
        os0Var.setText(k96.M0(2131752941, null));
        os0Var.setLeftPadding(gl.L(36.0f));
        ps0 ps0Var = new ps0(activity, b3);
        this.O0 = ps0Var;
        ps0Var.setFocusable(false);
        zkb.X(ps0Var, i3, wjbVar);
        ps0Var.setCursorSize(gl.L(20.0f));
        ps0Var.setCursorWidth(1.5f);
        ps0Var.setBackground(null);
        ps0Var.setTextSize(1, 18.0f);
        ps0Var.setMaxLines(1);
        int L = gl.L(16.0f);
        ps0Var.setPadding(gl.L(6.0f), L, L, L);
        ps0Var.setInputType(2);
        ps0Var.setTypeface(Typeface.DEFAULT);
        zkb.C(ps0Var, bkb.kg, wjbVar);
        zkb.l(ps0Var, 36, bkb.lg, wjbVar);
        ps0Var.setGravity(k96.a0 ? 5 : 3);
        ps0Var.setOnFocusChangeListener(new ls0(this, (byte) 1));
        ps0Var.addTextChangedListener(new ni1(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, nme.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(ps0Var, nme.p(-1, -2, 1.0f, kk7.D1));
        os0Var.e(ps0Var);
        os0Var.addView(linearLayout, nme.e(-1, -2, 48));
        t1Var2.addView(os0Var, nme.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        oi1 oi1Var = new oi1(wjbVar, activity, true);
        oi1Var.setRoundRadius(24);
        this.G0 = oi1Var;
        oi1Var.setEnabled(false);
        oi1Var.i(k96.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        oi1Var.setVisibility(0);
        oi1Var.setOnClickListener(new wg((Object) this, i, (Object) uxaVar, (byte) 1));
        u41 u41Var2 = new u41(wjbVar, activity, true);
        u41Var2.setRoundRadius(24);
        this.J0 = u41Var2;
        u41Var2.setEnabled(false);
        u41Var2.i(k96.M0(2131748182, null), false, true);
        u41Var2.setOnClickListener(new ih(this, i, j, activity));
        linearLayout2.addView(oi1Var, nme.p(-1, 48, 1.0f, kk7.D1));
        if (hc2.V(K02)) {
            linearLayout2.addView(new Space(activity), nme.p(8, 48, 0.0f, kk7.D1));
            linearLayout2.addView(u41Var2, nme.p(-1, 48, 1.0f, kk7.D1));
        }
        t1Var2.addView(linearLayout2, nme.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ps0Var.setOnEditorActionListener(new df(this, uxaVar, (byte) 1));
        this.f1 = new fi1(this, i, (byte) 2);
        q5c q5cVar = new q5c(uxaVar, new f(this, (byte) 24), new di1(this), new qm0(this, (byte) 19));
        this.X0 = q5cVar;
        xe2 xe2Var = new xe2((Object) this, (byte) 5);
        q5cVar.f3 = xe2Var;
        q5cVar.setLayoutManager(xe2Var);
        q5cVar.setClipToPadding(false);
        q5cVar.r1();
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        q5cVar.g3.r = false;
        v(q5cVar, new di1(this));
        y(vi1Var, vi1Var.b, new qm0((byte) 18));
        z(vi1Var.d);
        vi1Var.d.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (qw4Var != null) {
            qw4Var.b(q5cVar);
        }
        LinearLayout m = ir2.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        zkb.h(bkb.Z6, wjbVar, frameLayout);
        frameLayout.addView(m, nme.e(-2, -2, 17));
        ry8 ry8Var = new ry8(activity);
        ry8Var.setAutoRepeat(true);
        ry8Var.f(R.raw.statistic_preload, 120, 120, null);
        ry8Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i5 = bkb.Ej;
        zkb.X(textView, i5, null);
        textView.setTag(Integer.valueOf(i5));
        textView.setText(k96.M0(2131748585, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i6 = bkb.Fj;
        zkb.X(textView2, i6, null);
        textView2.setTag(Integer.valueOf(i6));
        textView2.setText(k96.M0(2131748584, null));
        textView2.setGravity(1);
        m.addView(ry8Var, nme.t(120, 120, 1, 0, 0, 0, 20));
        m.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 10));
        m.addView(textView2, nme.r(-2, -2, 1));
        addView(frameLayout, nme.e(-1, -1, kk7.D1));
    }

    public static fx0 J(wjb wjbVar, Context context, boolean z) {
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        ry8 ry8Var = new ry8(context);
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.setImageResource(R.drawable.large_monetize);
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(80.0f);
        int i = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        ry8Var.setBackground(K);
        zkb.j(ry8Var, K, M, null, wjbVar);
        j.addView(ry8Var, nme.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        ir2.t(textView, 1, 20.0f);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setText(k96.M0(z ? 2131753023 : 2131748197, null));
        j.addView(textView, nme.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        j.addView(new a6(context, R.drawable.msg_channel, k96.M0(z ? 2131753032 : 2131748206, null), k96.M0(z ? 2131753031 : 2131748205, null), wjbVar), nme.t(-1, -2, 49, 8, 0, 8, 16));
        j.addView(new a6(context, R.drawable.menu_feature_split, k96.M0(z ? 2131753030 : 2131748204, null), k96.M0(z ? 2131753029 : 2131748203, null), wjbVar), nme.t(-1, -2, 49, 8, 0, 8, 16));
        j.addView(new a6(context, R.drawable.menu_feature_withdrawals, k96.M0(z ? 2131753028 : 2131748202, null), k96.M0(z ? 2131753027 : 2131748201, null), wjbVar), nme.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        zkb.h(bkb.c7, wjbVar, view);
        j.addView(view, nme.n(1.0f / gl.p, -1, 55, 12, 0, 12, 0));
        fm fmVar = new fm(context);
        fmVar.setGravity(17);
        fmVar.setTextSize(1, 20.0f);
        fmVar.setTypeface(gl.o());
        zkb.X(fmVar, i2, wjbVar);
        SpannableString spannableString = new SpannableString("💎");
        cm2 cm2Var = new cm2(R.drawable.mini_gram_72, 0);
        cm2Var.d = false;
        cm2Var.I = 0.9f;
        cm2Var.J = 0.9f;
        cm2Var.b(fmVar.getPaint().getFontMetricsInt());
        cm2Var.H = 0.9f;
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        fmVar.setText(gl.G2(k96.M0(z ? 2131753024 : 2131748198, null), spannableString, "💎"));
        j.addView(fmVar, nme.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        l46 l46Var = new l46(context, wjbVar);
        l46Var.setGravity(17);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i2, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setText(gl.X3(gl.S2(k96.M0(z ? 2131753025 : 2131748199, null)), new x6c((byte) 8, context, z)));
        j.addView(l46Var, nme.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        u41 i3 = yjb.i(24, wjbVar, context, true);
        i3.i(k96.M0(2131749356, null), false, true);
        i3.setOnClickListener(new dh(h, (byte) 2));
        j.addView(i3, nme.t(-1, 48, 55, 10, 25, 10, 14));
        h.O = j;
        return h;
    }

    public static SpannableStringBuilder L(CharSequence charSequence, TextPaint textPaint, float f, float f2, boolean z) {
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i = ((textPaint.getFontMetricsInt().bottom * (z ? 1 : -1)) * ((int) (f * 100.0f))) - ((int) (100.0f * f2));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z) {
                cm2 cm2Var = new cm2(R.drawable.mini_gram_72, 0);
                cm2Var.d = false;
                cm2Var.I = f;
                cm2Var.J = f;
                cm2Var.a(bkb.n6);
                cm2Var.b(textPaint.getFontMetricsInt());
                cm2Var.H = 0.9f;
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
            } else {
                cm2 cm2Var2 = new cm2(R.drawable.mini_gram_16, 0);
                cm2Var2.d = false;
                cm2Var2.I = f;
                cm2Var2.J = f;
                cm2Var2.s = f2;
                cm2Var2.H = 0.95f;
                spannableString.setSpan(cm2Var2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i), spannableString);
        }
        return gl.I2(charSequence, spannableString, "TON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(Context context, int i, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j, wjb wjbVar) {
        long j2;
        String M0;
        long j3;
        long j4;
        long j5;
        char c;
        boolean z;
        boolean z2;
        String r;
        TLRPC.User user;
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j6 = de9.j(context, 1);
        boolean z3 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = k96.M0(2131748169, null);
            j2 = 0;
            j3 = tL_broadcastRevenueTransactionWithdrawal.date;
            j4 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z4 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z2 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z = z4;
            j5 = 0;
            c = 65535;
        } else {
            j2 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = k96.M0(2131748171, null);
                j3 = tL_broadcastRevenueTransactionProceeds.from_date;
                j5 = tL_broadcastRevenueTransactionProceeds.to_date;
                j4 = tL_broadcastRevenueTransactionProceeds.amount;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = k96.M0(2131748170, null);
                j3 = tL_broadcastRevenueTransactionRefund.from_date;
                j4 = tL_broadcastRevenueTransactionRefund.amount;
                j5 = 0;
            }
            c = 1;
            z = false;
            z2 = false;
        }
        long j7 = j4;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        ug8.v(textView, 1, 18.0f);
        zkb.X(textView, c < 0 ? bkb.p7 : bkb.k8, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (c < 0 ? "-" : "+"));
        long j8 = j3;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j7) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        j6.addView(textView, nme.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        zkb.X(textView2, bkb.x6, wjbVar);
        if (z) {
            textView2.setText(k96.M0(2131748166, null));
        } else if (j8 == j2) {
            textView2.setText(k96.Q(j5));
        } else if (j5 == j2) {
            textView2.setText(k96.Q(j8));
        } else {
            textView2.setText(k96.Q(j8) + " - " + k96.Q(j5));
        }
        byte b = 3;
        if (z2) {
            zkb.X(textView2, bkb.p7, wjbVar);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", k96.M0(2131748167, null)));
        }
        j6.addView(textView2, nme.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        ug8.v(textView3, 1, 14.0f);
        zkb.X(textView3, bkb.F6, wjbVar);
        textView3.setText(M0);
        j6.addView(textView3, nme.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gl.L(28.0f);
            int L2 = gl.L(28.0f);
            int i2 = bkb.Si;
            ShapeDrawable c0 = bkb.c0(L, L2, bkb.v0(i2, wjbVar));
            vkb M = zkb.M(i2);
            frameLayout.setBackground(c0);
            zkb.j(frameLayout, c0, M, null, wjbVar);
            if (j < j2) {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                if (K0 == 0) {
                    r = "";
                    user = K0;
                } else {
                    r = K0.title;
                    user = K0;
                }
            } else {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
                r = l7c.r(V1);
                user = V1;
            }
            be0 be0Var = new be0(context);
            be0Var.setRoundRadius(gl.L(28.0f));
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.k(user);
            be0Var.f(user, pb0Var);
            frameLayout.addView(be0Var, nme.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            zkb.X(textView4, bkb.i5, wjbVar);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(r);
            frameLayout.addView(textView4, nme.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            j6.addView(frameLayout, nme.t(-2, 28, 1, 42, 10, 42, 0));
        }
        u41 i3 = yjb.i(24, wjbVar, context, true);
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i3.i(k96.M0(2131748168, null), false, true);
                i3.setOnClickListener(new kb1(context, tL_broadcastRevenueTransactionWithdrawal2, b));
                j6.addView(i3, nme.t(-1, 48, 55, 18, 30, 18, 14));
                h.O = j6;
                h.show();
            }
        }
        i3.i(k96.M0(2131747638, null), false, true);
        i3.setOnClickListener(new dh(h, b));
        j6.addView(i3, nme.t(-1, 48, 55, 18, 30, 18, 14));
        h.O = j6;
        h.show();
    }

    public final void E(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        fk1 fk1Var;
        ArrayList arrayList;
        boolean z = this.n1 == null;
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        gxa f0 = uxa.f0(tL_payments_starsRevenueStats.revenue_graph, k96.M0(2131748208, null), 2, false);
        this.n1 = f0;
        if (f0 != null && (fk1Var = f0.d) != null && (arrayList = fk1Var.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((ek1) this.n1.d.d.get(0)).g = bkb.ak;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        M(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(s33.h).withEndAction(new ei1(this, (byte) 6)).start();
        }
        q5c q5cVar = this.X0;
        if (q5cVar != null) {
            q5cVar.g3.O(!z);
            if (z) {
                q5cVar.w0(0);
            }
        }
    }

    public final void F() {
        if (isAttachedToWindow() && this.b1 && this.o1 && na7.c1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(J(this.n0, getContext(), false));
            na7.c1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void G(boolean z, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        uxa uxaVar = this.m0;
        if (uxaVar != null) {
            Activity parentActivity = uxaVar.getParentActivity();
            int i = this.o0;
            TLRPC.User f = y6c.h(i).f();
            if (parentActivity == null || f == null) {
                return;
            }
            long j = this.p0;
            if (z) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = na7.q1(i).h1(j);
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = tL_inputCheckPasswordSRP;
                if (tL_inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = na7.q1(i).h1(j);
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                if (tL_inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP2 = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP2;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ji1((Object) this, (Object) twoStepVerificationActivity, (Object) parentActivity, z, (byte) 0));
        }
    }

    public final boolean H(float f, float f2) {
        return this.Y0.getVisibility() != 0 && c() && f >= 0.0f && f < ((float) getWidth()) && f2 >= getTabsTop() && f2 < ((float) getHeight());
    }

    public final void I(boolean z) {
        if (this.c1) {
            int i = this.o0;
            ct0 g = ct0.g(i);
            long j = this.p0;
            TLRPC.TL_payments_starsRevenueStats h = g.h(j, z);
            if (h != null) {
                gl.c3(new q21(this, h, (byte) 29));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = na7.q1(i).h1(j);
            tL_payments_getStarsRevenueStats.dark = bkb.I.o();
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ii1(this, (byte) 2));
        }
    }

    public final void K() {
        vi1 vi1Var = this.a1;
        ei1 ei1Var = vi1Var.f;
        boolean[] zArr = vi1Var.w;
        boolean a = vi1Var.a();
        for (int i = 0; i < 2; i++) {
            if (zArr[i]) {
                return;
            }
            if (i == 1) {
                vi1Var.n.clear();
                vi1Var.h = "";
            } else {
                vi1Var.r.clear();
                vi1Var.s = "";
            }
            zArr[i] = false;
            vi1Var.c(i);
        }
        if (vi1Var.a() == a || ei1Var == null) {
            return;
        }
        vi1Var.e();
        ei1Var.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(boolean z, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        wi1 wi1Var;
        int i;
        int i2;
        l5c l5cVar;
        wi1 wi1Var2;
        int i3;
        zi1 zi1Var = this;
        wi1 wi1Var3 = zi1Var.r1;
        wi1 wi1Var4 = zi1Var.q1;
        hn hnVar = zi1Var.z0;
        RelativeSizeSpan relativeSizeSpan = zi1Var.x0;
        hn hnVar2 = zi1Var.y0;
        wi1 wi1Var5 = zi1Var.p1;
        if (z) {
            wi1Var5.a = true;
            long j = tL_starsRevenueStatus.available_balance.amount;
            wi1Var5.d = j;
            double d = j / 1.0E9d;
            long j2 = (long) (zi1Var.g1 * d * 100.0d);
            wi1Var5.e = j2;
            if (zi1Var.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                wi1Var2 = wi1Var3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                zi1Var.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i3 = 6;
                zi1Var.Z0.setMaximumFractionDigits(6);
                zi1Var.Z0.setGroupingUsed(false);
            } else {
                wi1Var2 = wi1Var3;
                i3 = 6;
            }
            DecimalFormat decimalFormat2 = zi1Var.Z0;
            if (d > 1.5d) {
                i3 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L("TON " + zi1Var.Z0.format(d), hnVar2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            hnVar2.setText(spannableStringBuilder);
            hnVar.setText("≈" + ci0.h().e(j2, "USD"));
            wi1Var5.f = "USD";
            wi1Var4.a = true;
            long j3 = tL_starsRevenueStatus.current_balance.amount;
            wi1Var4.d = j3;
            zi1Var = this;
            double d2 = zi1Var.g1;
            wi1Var4.e = (long) ((j3 / 1.0E9d) * d2 * 100.0d);
            wi1Var4.f = "USD";
            wi1 wi1Var6 = wi1Var2;
            wi1Var6.a = true;
            long j4 = tL_starsRevenueStatus.overall_revenue.amount;
            wi1Var6.d = j4;
            wi1Var6.e = (long) ((j4 / 1.0E9d) * d2 * 100.0d);
            wi1Var6.f = "USD";
            zi1Var.o1 = true;
            zi1Var.A0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d3 = zi1Var.h1;
            if (d3 == 0.0d) {
                return;
            }
            wi1Var5.g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            wi1Var5.i = starsAmount;
            wi1Var5.j = (long) (starsAmount.amount * d3 * 100.0d);
            int i4 = tL_starsRevenueStatus.next_withdrawal_at;
            oi1 oi1Var = zi1Var.G0;
            if (hnVar2 == null || hnVar == null) {
                wi1Var = wi1Var3;
                i = 0;
            } else {
                wi1Var = wi1Var3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jva.a1(false, TextUtils.concat("XTR ", jva.G0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                }
                zi1Var.D0 = starsAmount;
                zi1Var.E0.setText(spannableStringBuilder2);
                zi1Var.F0.setText("≈" + ci0.h().e((long) (zi1Var.h1 * starsAmount.amount * 100.0d), "USD"));
                zi1Var.K0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (zi1Var.M0) {
                    zi1Var.L0 = true;
                    long j5 = starsAmount.amount;
                    zi1Var.N0 = j5;
                    String l = Long.toString(j5);
                    ps0 ps0Var = zi1Var.O0;
                    ps0Var.setText(l);
                    ps0Var.setSelection(ps0Var.getText().length());
                    i = 0;
                    zi1Var.L0 = false;
                    oi1Var.setEnabled(zi1Var.N0 > 0);
                } else {
                    i = 0;
                }
                u41 u41Var = zi1Var.J0;
                if (u41Var != null) {
                    u41Var.setEnabled(starsAmount.amount > 0 ? 1 : i);
                }
                zi1Var.B0 = i4;
                fi1 fi1Var = zi1Var.f1;
                gl.r(fi1Var);
                fi1Var.run();
            }
            wi1Var5.f = "USD";
            wi1Var4.g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            wi1Var4.i = starsAmount2;
            double d4 = starsAmount2.amount;
            double d5 = zi1Var.h1;
            wi1Var4.j = (long) (d4 * d5 * 100.0d);
            wi1Var4.f = "USD";
            wi1 wi1Var7 = wi1Var;
            wi1Var7.g = true;
            wi1Var7.i = tL_starsRevenueStatus.overall_revenue;
            wi1Var7.j = (long) (r4.amount * d5 * 100.0d);
            wi1Var7.f = "USD";
            zi1Var.o1 = true;
            LinearLayout linearLayout = zi1Var.I0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? i : 8);
            }
            if (oi1Var != null) {
                if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                    boolean z2 = w01.a;
                    i2 = 8;
                } else {
                    i2 = i;
                }
                oi1Var.setVisibility(i2);
            }
        }
        q5c q5cVar = zi1Var.X0;
        if (q5cVar == null || (l5cVar = q5cVar.g3) == null) {
            return;
        }
        l5cVar.O(true);
    }

    public View getTransactionTabs() {
        return this.a1.d;
    }

    @Override // dha, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        F();
    }

    @Override // dha, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        a aVar = this.i1;
        if (aVar != null) {
            aVar.setCastShadows(true);
        }
    }

    public void setActionBar(a aVar) {
        this.i1 = aVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            ps0 ps0Var = this.O0;
            if (ps0Var != null) {
                ps0Var.setHandlesColor(bkb.v0(bkb.lg, this.n0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
