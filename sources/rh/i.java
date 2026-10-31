package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wb;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.br;
import org.telegram.ui.g61;
import org.telegram.ui.ie;
import org.telegram.ui.le;
import org.telegram.ui.oo;
import org.telegram.ui.rv0;
import org.telegram.ui.u61;
import org.telegram.ui.ul0;
import org.telegram.ui.y01;
import org.telegram.ui.yd;
import org.telegram.ui.zd;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends org.telegram.ui.ActionBar.k2 implements us {
    public final ie D;
    public final ie E;
    public final ie F;
    public final ie G;
    public final ie H;
    public final ie I;
    public final SpannableStringBuilder J;
    public g8 K;
    public FrameLayout L;
    public FrameLayout M;
    public w71 N;
    public boolean O;
    public int P;
    public jg.z2 Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.f6 T;
    public org.telegram.ui.Components.f6 U;
    public yd V;
    public boolean W;
    public boolean X;
    public long Y;
    public zd Z;
    public final int a;
    public ph.i a0;
    public final long b;
    public vh.d b0;
    public final boolean c;
    public final dq[] c0;
    public sn d;
    public jg.z2 d0;
    public u51 e;
    public RelativeSizeSpan e0;
    public ku0 f;
    public org.telegram.ui.Components.f6 f0;
    public org.telegram.ui.Components.f6 g0;
    public bi.t0 h;
    public vh.d h0;
    public double i0;
    public wb j0;
    public SpannableStringBuilder k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public boolean n0;
    public g61 o0;
    public g61 p0;
    public DecimalFormat q0;
    public View r;
    public SpannableStringBuilder r0;
    public fe.b s;
    public final b s0;
    public final int t0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public g61 y;

    /* JADX WARN: Multi-variable type inference failed */
    public i(int i10, long j10) {
        super(null);
        this.n = -1;
        this.D = ie.a("XTR", cd.L0(2131752961, null));
        this.E = ie.a("XTR", cd.L0(2131752959, null));
        this.F = ie.a("XTR", cd.L0(2131752958, null));
        this.G = ie.a("TON", cd.L0(2131753033, null));
        this.H = ie.a("TON", cd.L0(2131753032, null));
        this.I = ie.a("TON", cd.L0(2131753031, null));
        this.W = false;
        this.X = true;
        this.c0 = new dq[1];
        this.s0 = new b(this, 0 == true ? 1 : 0);
        this.t0 = -1;
        this.a = i10;
        this.b = j10;
        boolean z10 = j10 == getUserConfig().e();
        this.c = z10;
        if (i10 == 0) {
            r.g(this.currentAccount).r(j10);
            if (!z10) {
                r.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            r g10 = r.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.J = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(z10 ? cd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().S5) : cd.L0(2131752957, null), new b(this, 2)), true);
    }

    public static void Y(i iVar) {
        iVar.showDialog(le.I(iVar.getParentActivity(), iVar.resourceProvider, true));
    }

    public static void Z(i iVar, a51 a51Var) {
        if (a51Var.H(b8.class)) {
            h8.j1(iVar.getParentActivity(), true, iVar.b, iVar.currentAccount, (TL_stars.StarsTransaction) a51Var.G, iVar.getResourceProvider());
        } else if (a51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            le.M(iVar.getParentActivity(), iVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) a51Var.G, iVar.b, iVar.resourceProvider);
        } else if (a51Var.d == 2) {
            iVar.presentFragment(new xh.z2(iVar.b));
        }
    }

    public static void a0(i iVar) {
        b bVar = iVar.s0;
        wb.e();
        TLRPC.TL_payments_starsRevenueStats h = r.g(iVar.currentAccount).h(iVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < iVar.getMessagesController().S5) {
            iVar.X = true;
            iVar.Y = j10;
        } else {
            iVar.X = false;
            iVar.Y = iVar.getMessagesController().S5;
        }
        iVar.W = true;
        iVar.Z.setText(Long.toString(iVar.Y));
        zd zdVar = iVar.Z;
        zdVar.setSelection(zdVar.getText().length());
        iVar.W = false;
        org.telegram.messenger.i0.r(bVar);
        bVar.run();
    }

    public static void b0(i iVar, Context context, View view) {
        if (view.isEnabled()) {
            vh.d dVar = iVar.b0;
            if (dVar.Q) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = vp.r1(iVar.currentAccount).i1(iVar.b);
            ConnectionsManager.getInstance(iVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ul0(23, iVar, context));
        }
    }

    public static void c0(i iVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                gf.f.t(iVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    iVar.X = true;
                    gf.f.t(iVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(iVar.currentAccount).sendRequest(new TL_account.getPassword(), new s70(iVar, twoStepVerificationActivity, z10, j10), 8);
                return;
            }
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
            cc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.s0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String L0 = cd.L0(2131751298, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((cd.X ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.i0.W2(cd.L0(2131742889, null)));
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((cd.X ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.i0.W2(cd.L0(2131751301, null)));
        if (cd.X) {
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
            linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.b6.o(-2, -2));
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, 0);
        linearLayout.addView(e, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.a7.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((cd.X ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.i0.W2(cd.L0(2131751300, null)));
        if (cd.X) {
            e.addView(textView3, w7.b6.o(-1, -2));
            i10 = 5;
            e.addView(imageView2, w7.b6.r(-2, -2, 5));
        } else {
            i10 = 5;
            e.addView(imageView2, w7.b6.o(-2, -2));
            e.addView(textView3, w7.b6.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(cd.L0(2131751292, null), new c(iVar));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.m5.l(textView4, (cd.X ? i10 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(cd.L0(2131747847, null), null);
        }
        twoStepVerificationActivity.showDialog(x1Var);
    }

    public static void d0(i iVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i11;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ie ieVar = iVar.I;
        ie ieVar2 = iVar.H;
        ie ieVar3 = iVar.F;
        ie ieVar4 = iVar.E;
        ie ieVar5 = iVar.D;
        long j10 = iVar.b;
        ie ieVar6 = iVar.G;
        boolean z11 = iVar.c;
        int i12 = iVar.t0;
        iVar.n = -1;
        r g10 = r.g(iVar.currentAccount);
        int i13 = iVar.a;
        if (i13 == 0) {
            arrayList.add(a51.h(2, i12, iVar.y));
            arrayList.add(a51.B(-1, null));
            arrayList.add(a51.b(cd.L0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h == null || (tL_starsRevenueStatus2 = h.status) == null) {
                z10 = z11;
            } else {
                ieVar5.a = false;
                ieVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                ieVar5.i = starsAmount;
                ieVar5.h = "XTR";
                ieVar5.f = "USD";
                double d = starsAmount.amount;
                z10 = z11;
                double d10 = iVar.i0;
                ieVar5.j = (long) (d * d10 * 100.0d);
                ieVar4.a = false;
                ieVar4.g = true;
                ieVar4.i = tL_starsRevenueStatus2.current_balance;
                ieVar4.h = "XTR";
                ieVar4.j = (long) (r11.amount * d10 * 100.0d);
                ieVar4.f = "USD";
                ieVar3.a = false;
                ieVar3.g = true;
                ieVar3.i = tL_starsRevenueStatus2.overall_revenue;
                ieVar3.h = "XTR";
                ieVar3.j = (long) (r11.amount * d10 * 100.0d);
                ieVar3.f = "USD";
                iVar.u0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                iVar.R.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(a51.v(ieVar5));
            arrayList.add(a51.v(ieVar4));
            arrayList.add(a51.v(ieVar3));
            arrayList.add(a51.B(-2, cd.L0(z10 ? 2131745662 : 2131752960, null)));
            arrayList.add(a51.b(cd.L0(2131752972, null)));
            arrayList.add(a51.j(1, iVar.Q));
            arrayList.add(a51.B(-3, iVar.J));
            if (z10) {
                return;
            }
            if (iVar.getMessagesController().h6) {
                arrayList.add(xh.e.i(2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, iVar.resourceProvider), oo.h0(cd.L0(2131753145, null)), cd.L0(2131753146, null)));
                arrayList.add(a51.B(-4, null));
            }
            iVar.n = arrayList.size();
            arrayList.add(a51.n(iVar.h, -2));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            int i14 = 3;
            if (!z11) {
                if (iVar.k0 == null) {
                    iVar.k0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(cd.a0(null, null, 2131753045, 50), -1, 3, new b(iVar, i14), iVar.resourceProvider), true);
                }
                arrayList.add(a51.g(iVar.k0));
            }
            if (iVar.o0 == null && j11 != null) {
                g61 h02 = u61.h0(j11.top_hours_graph, cd.L0(2131753047, null), 0, false);
                iVar.o0 = h02;
                if (h02 != null) {
                    h02.n = true;
                }
            }
            g61 g61Var = iVar.o0;
            if (g61Var != null && !g61Var.l) {
                arrayList.add(a51.h(5, i12, g61Var));
                arrayList.add(a51.B(-1, null));
            }
            if (iVar.p0 != null || j11 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                iVar.p0 = u61.h0(statsGraph, cd.L0(2131753046, null), 2, false);
            }
            g61 g61Var2 = iVar.p0;
            if (g61Var2 != null && !g61Var2.l) {
                arrayList.add(a51.h(i10, i12, g61Var2));
                arrayList.add(a51.B(-2, null));
            }
            if (!iVar.n0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                ieVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                ieVar6.e = j13;
                if (iVar.q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    iVar.q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    iVar.q0.setMaximumFractionDigits(6);
                    iVar.q0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = iVar.q0;
                if (d12 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(le.K("TON " + iVar.q0.format(d12), iVar.f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(iVar.e0, indexOf, spannableStringBuilder.length(), 33);
                }
                iVar.f0.setText(spannableStringBuilder);
                iVar.g0.setText("≈" + org.telegram.messenger.u1.i().f(j13, "USD"));
                ieVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                ieVar2.d = j14;
                ieVar2.e = (long) ((j14 / 1.0E9d) * d11 * 100.0d);
                ieVar2.f = "USD";
                ieVar.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                ieVar.d = j15;
                ieVar.e = (long) ((j15 / 1.0E9d) * d11 * 100.0d);
                ieVar.f = "USD";
                iVar.n0 = true;
                iVar.h0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (iVar.n0) {
                arrayList.add(a51.b(cd.L0(2131753034, null)));
                arrayList.add(a51.v(ieVar6));
                arrayList.add(a51.v(ieVar2));
                arrayList.add(a51.v(ieVar));
                if (iVar.l0 == null) {
                    iVar.l0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(cd.L0(2131753030, null), -1, 3, new b(iVar, 4), iVar.resourceProvider), true);
                }
                arrayList.add(a51.B(-4, iVar.l0));
            }
            arrayList.add(a51.b(cd.L0(2131753051, null)));
            arrayList.add(a51.k(iVar.d0));
            if (iVar.m0 == null) {
                iVar.m0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(cd.L0(vp.r1(iVar.currentAccount).J5 ? 2131753050 : 2131753048, null), -1, 3, new b(iVar, 5), null), true);
            }
            arrayList.add(a51.B(-5, iVar.m0));
            iVar.n = arrayList.size();
            arrayList.add(a51.n(iVar.h, -2));
        }
    }

    public static String v0(int i10) {
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = i12 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i11 == 0) {
            return i13 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i16));
        }
        Locale locale = Locale.ENGLISH;
        return cd.a0(null, null, 2131747338, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10 = this.c;
        int i10 = this.a;
        int i11 = 1;
        if (i10 == 1 || !z10) {
            ku0 ku0Var = new ku0(context);
            this.f = ku0Var;
            ku0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new n2.u(this, 21));
            ku0 ku0Var2 = this.f;
            ku0Var2.getClass();
            this.h = new bi.t0(ku0Var2, context, 20);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        this.d = new sn(context, null, false, getResourceProvider());
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.b));
        this.d.k(Z1, true);
        this.simpleActionBar.setTitle(h20.p(Z1));
        if (i10 == 0) {
            this.simpleActionBar.setSubtitle(cd.L0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(cd.L0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 15));
        this.simpleActionBar.setBackground(null);
        g8 g8Var = (i10 != 0 || this.f == null) ? null : new g8(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.K = g8Var;
        if (i10 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            vk0 vk0Var = new vk0(context, this.resourceProvider, this.f);
            this.N = vk0Var;
            vk0Var.setAdapter(new g(this, context, vk0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            this.M.addView(vk0Var.n(-2, true), w7.b6.e(-1, 48, 48));
            this.L.addView(vk0Var, w7.b6.c(-1.0f, -1));
        } else if (g8Var != null) {
            this.N = g8Var.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        jg.z2 z2Var = new jg.z2(context, 12);
        this.Q = z2Var;
        z2Var.setOrientation(1);
        jg.z2 z2Var2 = this.Q;
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i12, z2Var2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.T = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.Components.f6 f6Var2 = this.T;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, getResourceProvider());
        this.T.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.U = f6Var3;
        f6Var3.setGravity(17);
        org.telegram.ui.Components.f6 f6Var4 = this.U;
        int i14 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var4, i14, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.Q.addView(this.U, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        yd ydVar = new yd(this, context, i11);
        this.V = ydVar;
        ydVar.setText(cd.L0(2131752953, null));
        this.V.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        zd zdVar = new zd(context, 4);
        this.Z = zdVar;
        zdVar.setFocusable(false);
        org.telegram.ui.ActionBar.a7.V(this.Z, i13, getResourceProvider());
        this.Z.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        this.Z.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.D(this.Z, org.telegram.ui.ActionBar.t6.ig, getResourceProvider());
        org.telegram.ui.ActionBar.a7.z(this.Z, org.telegram.ui.ActionBar.t6.jg, getResourceProvider());
        int i15 = 3;
        this.Z.setGravity(cd.X ? 5 : 3);
        this.Z.setOnFocusChangeListener(new bi.g6(this, i15));
        this.Z.addTextChangedListener(new ag.a1(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, w7.b6.p(-1, -2, 1.0f, zs.E1));
        this.V.e(this.Z);
        this.V.addView(linearLayout, w7.b6.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new ag.r1(this, 4));
        this.Q.addView(this.V, w7.b6.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        ph.i iVar = new ph.i(1, context, getResourceProvider(), 1 == true ? 1 : 0);
        iVar.setRoundRadius(24);
        this.a0 = iVar;
        iVar.setEnabled(vp.r1(this.currentAccount).J5);
        final int i16 = 0;
        this.a0.i(cd.L0(2131752969, null), false, true);
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: rh.f
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.x0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            i iVar2 = this.b;
                            if (!iVar2.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.k0 k0Var = new org.telegram.ui.web.k0(13, iVar2, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = k0Var;
                                iVar2.h0.setLoading(true);
                                twoStepVerificationActivity.w0(new d(iVar2, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setEnabled(true);
        this.b0.i(cd.L0(2131748389, null), false, true);
        this.b0.setOnClickListener(new rv0(24, this, context));
        this.R.addView(this.a0, w7.b6.p(-1, 48, 1.0f, zs.E1));
        if (!z10) {
            this.R.addView(new Space(context), w7.b6.p(8, 48, 0.0f, zs.E1));
            this.R.addView(this.b0, w7.b6.p(-1, 48, 1.0f, zs.E1));
        }
        this.Q.addView(this.R, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        jg.z2 z2Var3 = new jg.z2(context, 13);
        this.d0 = z2Var3;
        z2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i12, this.d0, this.resourceProvider);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var5 = new org.telegram.ui.Components.f6(context, false, true, true);
        this.f0 = f6Var5;
        f6Var5.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(this.f0, i13, this.resourceProvider);
        this.f0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.f0.setGravity(17);
        this.e0 = new RelativeSizeSpan(0.6770833f);
        this.d0.addView(this.f0, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var6 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.g0 = f6Var6;
        f6Var6.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.g0, i14, this.resourceProvider);
        this.g0.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.d0.addView(this.g0, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.h0 = dVar2;
        dVar2.setEnabled(vp.r1(this.currentAccount).J5);
        final int i17 = 1;
        this.h0.i(cd.L0(z10 ? 2131748390 : 2131748366, null), false, true);
        this.h0.setVisibility(8);
        this.h0.setOnClickListener(new View.OnClickListener(this) { // from class: rh.f
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.x0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            i iVar2 = this.b;
                            if (!iVar2.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.k0 k0Var = new org.telegram.ui.web.k0(13, iVar2, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = k0Var;
                                iVar2.h0.setLoading(true);
                                twoStepVerificationActivity.w0(new d(iVar2, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.d0.addView(this.h0, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        u51 u51Var = new u51(this, new qh.d(this, 1), new c(this), new org.telegram.utils.twidget.t(this, 25));
        this.e = u51Var;
        u51Var.r1();
        u51 u51Var2 = this.e;
        u51Var2.f3.r = false;
        u51Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        ku0 ku0Var3 = this.f;
        if (ku0Var3 != null) {
            u51 u51Var3 = this.e;
            getParentActivity();
            br brVar = new br((Object) ku0Var3, 4);
            u51Var3.e3 = brVar;
            u51Var3.setLayoutManager(brVar);
            this.f.u(this.e, new c(this));
            this.f.x(i10 == 1 ? this.L : this.K, this.N, new c(this));
            FrameLayout frameLayout5 = this.M;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout2.addView(this.e, w7.b6.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.M : this.simpleActionBar), w7.b6.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        fe.b bVar = new fe.b(0, new c(this), gr.h, 380L, false);
        this.s = bVar;
        ku0 ku0Var4 = this.f;
        bVar.a(ku0Var4 != null && ku0Var4.e0, false);
        if (this.f != null) {
            getBaseSimpleGlass().l = this.f;
            g8 g8Var2 = this.K;
            if (g8Var2 != null) {
                g8Var2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().m = new ei.a(7, this, new org.telegram.ui.ActionBar.y1(1, frameLayout2));
            View view = this.M;
            vg.f c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.o(b9.m(this.resourceProvider));
            c10.p(org.telegram.messenger.i0.L(9.66f));
            c10.q(org.telegram.messenger.i0.L(18.0f));
            view.setBackground(c10);
        }
        org.telegram.messenger.i0.E2(this.d.e);
        frameLayout2.addView(this.d.e, w7.b6.e(42, 42, 53));
        r0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.C3 && ((Long) objArr[0]).longValue() == this.b) {
            s0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        w71 w71Var = this.N;
        if (w71Var == null || !w71Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.C3);
        s0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        this.O = true;
        zs.f(this.currentAccount).n(this, zs.C3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        r0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            sn snVar = this.d;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Cj, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dj, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r0() {
        if (this.e == null) {
            return;
        }
        org.telegram.messenger.i0.A3(this.d.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.i0.L(6.0f), 0);
        u51 u51Var = this.e;
        i0.c cVar = this.mSystemInsets;
        ei.b.e(u51Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            ku0 ku0Var = this.f;
            ku0Var.B();
            ku0Var.requestLayout();
            ku0Var.invalidate();
        }
        if (this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? org.telegram.messenger.i0.L(44.0f) : 0);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.r.setLayoutParams(layoutParams);
            }
            w0();
        }
    }

    public final void s0() {
        cg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.i0 = h.usd_rate;
            g61 h02 = u61.h0(h.revenue_graph, cd.L0(2131752963, null), 2, false);
            this.y = h02;
            if (h02 != null && (bVar = h02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                g61 g61Var = this.y;
                g61Var.h = true;
                ((cg.a) g61Var.d.d.get(0)).g = org.telegram.ui.ActionBar.t6.mk;
                this.y.d.h = (float) ((1.0d / this.i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            u0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            u51 u51Var = this.e;
            if (u51Var != null) {
                ku0 ku0Var = this.f;
                boolean z10 = ku0Var != null && ku0Var.e0;
                u51Var.f3.O(ku0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    public final void t0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f7 = d20.i(this.currentAccount).f();
        if (parentActivity == null || f7 == null) {
            return;
        }
        long j11 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = vp.r1(this.currentAccount).i1(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = vp.r1(this.currentAccount).i1(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z10, j10));
    }

    public final void u0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.T == null || this.U == null) {
            return;
        }
        long j10 = (long) (this.i0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h8.Z0(false, TextUtils.concat("XTR ", h8.L0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
        }
        this.T.setText(spannableStringBuilder);
        this.U.setText("≈" + org.telegram.messenger.u1.i().f(j10, "USD"));
        this.V.setVisibility(j10 > 0 ? 0 : 8);
        if (this.X) {
            this.W = true;
            zd zdVar = this.Z;
            long j11 = starsAmount.amount;
            this.Y = j11;
            zdVar.setText(Long.toString(j11));
            zd zdVar2 = this.Z;
            zdVar2.setSelection(zdVar2.getText().length());
            this.W = false;
            this.a0.setEnabled(this.Y > 0);
        }
        this.P = i10;
        b bVar = this.s0;
        org.telegram.messenger.i0.r(bVar);
        bVar.run();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        fe.b bVar = this.s;
        view.setTranslationY(this.f != null ? org.telegram.messenger.i0.L(44.0f) * (-(1.0f - (bVar == null ? 0.0f : bVar.e))) : 0.0f);
    }

    public final void x0() {
        ph.i iVar = this.a0;
        if (!iVar.c0 || iVar.Q) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.P > currentTime) {
            this.j0 = cc.a0(this).Q(R.raw.timer_3, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752952, v0(this.P - currentTime)))).j();
            return;
        }
        if (this.Y < getMessagesController().S5) {
            cc.a0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.i0.T2(cd.G((int) getMessagesController().S5, "BotStarsWithdrawMinLimit", new Object[0]), new b(this, i10))).j();
            return;
        }
        long j10 = this.Y;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        org.telegram.messenger.voip.d0 d0Var = new org.telegram.messenger.voip.d0(this, j10, twoStepVerificationActivity, 7);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = d0Var;
        this.a0.setLoading(true);
        twoStepVerificationActivity.w0(new d(this, twoStepVerificationActivity, i10));
    }
}
