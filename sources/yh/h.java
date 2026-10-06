package yh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import ci.ab;
import ci.p9;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.fa1;
import org.telegram.ui.je;
import org.telegram.ui.me;
import org.telegram.ui.p81;
import org.telegram.ui.py0;
import org.telegram.ui.si1;
import org.telegram.ui.ta1;
import org.telegram.ui.to;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class h extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final je E;
    public final je F;
    public final je G;
    public final je H;
    public final je I;
    public final CharSequence J;
    public y7 K;
    public FrameLayout L;
    public FrameLayout M;
    public h91 N;
    public boolean O;
    public int P;
    public zd Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.p6 T;
    public org.telegram.ui.Components.p6 U;
    public ae V;
    public boolean W;
    public boolean X;
    public long Y;
    public fi.o Z;
    public final int a;
    public bi.q a0;
    public final long b;
    public ci.d b0;
    public final boolean c;
    public final rq[] c0;
    public ho d;
    public zd d0;
    public e71 e;
    public RelativeSizeSpan e0;
    public bw0 f;
    public org.telegram.ui.Components.p6 f0;
    public org.telegram.ui.Components.p6 g0;
    public ab h;
    public ci.d h0;
    public double i0;
    public rc j0;
    public CharSequence k0;
    public CharSequence l0;
    public CharSequence m0;
    public int n;
    public boolean n0;
    public fa1 o0;
    public fa1 p0;
    public DecimalFormat q0;
    public View r;
    public SpannableStringBuilder r0;
    public le.b s;
    public final b s0;
    public final int t0;
    public TLRPC.TL_payments_starsRevenueStats v;
    public TLRPC.TL_starsRevenueStatus w;
    public fa1 x;
    public final je y;

    public h(int i10, long j3) {
        super(null);
        this.n = -1;
        this.y = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.E = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.F = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.G = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.H = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.I = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.W = false;
        this.X = true;
        this.c0 = new rq[1];
        this.s0 = new b(this, 0);
        this.t0 = -1;
        this.a = i10;
        this.b = j3;
        boolean z10 = j3 == getUserConfig().getClientUserId();
        this.c = z10;
        if (i10 == 0) {
            p.g(this.currentAccount).r(j3);
            if (!z10) {
                p.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            p g10 = p.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.J = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new b(this, 2)), true);
    }

    public static void S(h hVar) {
        hVar.showDialog(me.I(hVar.getParentActivity(), hVar.resourceProvider, true));
    }

    public static void T(h hVar, h61 h61Var) {
        if (h61Var.H(s7.class)) {
            z7.n1(hVar.getParentActivity(), true, hVar.b, hVar.currentAccount, (TL_stars.StarsTransaction) h61Var.G, hVar.getResourceProvider());
        } else if (h61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            me.M(hVar.getParentActivity(), hVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) h61Var.G, hVar.b, hVar.resourceProvider);
        } else if (h61Var.d == 2) {
            hVar.presentFragment(new ei.f4(hVar.b));
        }
    }

    public static void U(h hVar) {
        b bVar = hVar.s0;
        rc.e();
        TLRPC.TL_payments_starsRevenueStats h = p.g(hVar.currentAccount).h(hVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < hVar.getMessagesController().starsRevenueWithdrawalMin) {
            hVar.X = true;
            hVar.Y = j3;
        } else {
            hVar.X = false;
            hVar.Y = hVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        hVar.W = true;
        hVar.Z.setText(Long.toString(hVar.Y));
        fi.o oVar = hVar.Z;
        oVar.setSelection(oVar.getText().length());
        hVar.W = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void W(h hVar, Context context, View view) {
        if (view.isEnabled()) {
            ci.d dVar = hVar.b0;
            if (dVar.N) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(hVar.currentAccount).getInputPeer(hVar.b);
            ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new si1(6, hVar, context));
        }
    }

    public static void X(h hVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                nf.f.u(hVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    hVar.X = true;
                    nf.f.u(hVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(new TL_account.getPassword(), new v9(hVar, twoStepVerificationActivity, z10, j3, 3), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            yc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
        }
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 0);
        linearLayout.addView(e7, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            e7.addView(textView3, w7.z5.n(-1, -2));
            i10 = 5;
            e7.addView(imageView2, w7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            e7.addView(imageView2, w7.z5.n(-2, -2));
            e7.addView(textView3, w7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new c(hVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static void Y(h hVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i11;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        je jeVar = hVar.I;
        je jeVar2 = hVar.H;
        je jeVar3 = hVar.F;
        je jeVar4 = hVar.E;
        je jeVar5 = hVar.y;
        long j3 = hVar.b;
        je jeVar6 = hVar.G;
        boolean z11 = hVar.c;
        int i12 = hVar.t0;
        hVar.n = -1;
        p g10 = p.g(hVar.currentAccount);
        int i13 = hVar.a;
        if (i13 == 0) {
            arrayList.add(h61.h(2, i12, hVar.x));
            arrayList.add(h61.B(-1, null));
            arrayList.add(h61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h == null || (tL_starsRevenueStatus2 = h.status) == null) {
                z10 = z11;
            } else {
                jeVar5.a = false;
                jeVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                jeVar5.i = starsAmount;
                jeVar5.h = "XTR";
                jeVar5.f = "USD";
                double d = starsAmount.amount;
                double d10 = hVar.i0;
                z10 = z11;
                jeVar5.j = (long) (d * d10 * 100.0d);
                jeVar4.a = false;
                jeVar4.g = true;
                jeVar4.i = tL_starsRevenueStatus2.current_balance;
                jeVar4.h = "XTR";
                jeVar4.j = (long) (r9.amount * d10 * 100.0d);
                jeVar4.f = "USD";
                jeVar3.a = false;
                jeVar3.g = true;
                jeVar3.i = tL_starsRevenueStatus2.overall_revenue;
                jeVar3.h = "XTR";
                jeVar3.j = (long) (r9.amount * d10 * 100.0d);
                jeVar3.f = "USD";
                hVar.q0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                hVar.R.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(h61.v(jeVar5));
            arrayList.add(h61.v(jeVar4));
            arrayList.add(h61.v(jeVar3));
            arrayList.add(h61.B(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(h61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(h61.j(1, hVar.Q));
            arrayList.add(h61.B(-3, hVar.J));
            if (z10) {
                return;
            }
            if (hVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(ei.i.a(2, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, hVar.resourceProvider), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(h61.B(-4, null));
            }
            hVar.n = arrayList.size();
            arrayList.add(h61.n(hVar.h, -2));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            int i14 = 3;
            if (!z11) {
                if (hVar.k0 == null) {
                    hVar.k0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(hVar, i14), hVar.resourceProvider), true);
                }
                arrayList.add(h61.g(hVar.k0));
            }
            if (hVar.o0 == null && j10 != null) {
                fa1 d02 = ta1.d0(j10.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                hVar.o0 = d02;
                if (d02 != null) {
                    d02.n = true;
                }
            }
            fa1 fa1Var = hVar.o0;
            if (fa1Var != null && !fa1Var.l) {
                arrayList.add(h61.h(5, i12, fa1Var));
                arrayList.add(h61.B(-1, null));
            }
            if (hVar.p0 != null || j10 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i10 = 2;
                hVar.p0 = ta1.d0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            fa1 fa1Var2 = hVar.p0;
            if (fa1Var2 != null && !fa1Var2.l) {
                arrayList.add(h61.h(i10, i12, fa1Var2));
                arrayList.add(h61.B(-2, null));
            }
            if (!hVar.n0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d11 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                jeVar6.d = j11;
                double d12 = j11 / 1.0E9d;
                long j12 = (long) (d12 * d11 * 100.0d);
                jeVar6.e = j12;
                if (hVar.q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    hVar.q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    hVar.q0.setMaximumFractionDigits(6);
                    hVar.q0.setGroupingUsed(false);
                } else {
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = hVar.q0;
                if (d12 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(me.K("TON " + hVar.q0.format(d12), hVar.f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(hVar.e0, indexOf, spannableStringBuilder.length(), 33);
                }
                hVar.f0.setText(spannableStringBuilder);
                hVar.g0.setText("≈" + BillingController.getInstance().formatCurrency(j12, "USD"));
                jeVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                jeVar2.d = j13;
                jeVar2.e = (long) ((j13 / 1.0E9d) * d11 * 100.0d);
                jeVar2.f = "USD";
                jeVar.a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                jeVar.d = j14;
                jeVar.e = (long) ((j14 / 1.0E9d) * d11 * 100.0d);
                jeVar.f = "USD";
                hVar.n0 = true;
                hVar.h0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (hVar.n0) {
                arrayList.add(h61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(h61.v(jeVar6));
                arrayList.add(h61.v(jeVar2));
                arrayList.add(h61.v(jeVar));
                if (hVar.l0 == null) {
                    hVar.l0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new qg.f2(hVar, R.string.BotMonetizationProceedsTONInfoLink, 3), hVar.resourceProvider), true);
                }
                arrayList.add(h61.B(-4, hVar.l0));
            }
            arrayList.add(h61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(h61.k(hVar.d0));
            if (hVar.m0 == null) {
                hVar.m0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(hVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new b(hVar, 4)), true);
            }
            arrayList.add(h61.B(-5, hVar.m0));
            hVar.n = arrayList.size();
            arrayList.add(h61.n(hVar.h, -2));
        }
    }

    public static String r0(int i10) {
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = i12 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i11 == 0) {
            return i13 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i16));
        }
        int i17 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i17, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10 = this.c;
        int i10 = this.a;
        if (i10 == 1 || !z10) {
            bw0 bw0Var = new bw0(context);
            this.f = bw0Var;
            bw0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new k2.e(this, 26));
            bw0 bw0Var2 = this.f;
            bw0Var2.getClass();
            this.h = new ab(bw0Var2, context, 24);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.a7));
        this.d = new ho(context, null, false, getResourceProvider());
        this.actionBar.setAllowOverlayTitle(false);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.j(user, true);
        this.actionBar.setTitle(UserObject.getUserName(user));
        if (i10 == 0) {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.Oi;
        kVar.A(org.telegram.ui.ActionBar.i6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i11, false), true);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z8, false), false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        y7 y7Var = (i10 != 0 || this.f == null) ? null : new y7(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.K = y7Var;
        if (i10 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            bm0 bm0Var = new bm0(context, this.resourceProvider, this.f);
            this.N = bm0Var;
            bm0Var.setAdapter(new f(this, context, bm0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            this.M.addView(bm0Var.n(-2, true), w7.z5.e(-1, 48, 48));
            this.L.addView(bm0Var, w7.z5.c(-1.0f, -1));
        } else if (y7Var != null) {
            this.N = y7Var.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        zd zdVar = new zd(context, 8);
        this.Q = zdVar;
        zdVar.setOrientation(1);
        zd zdVar2 = this.Q;
        int i12 = org.telegram.ui.ActionBar.i6.d6;
        zdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, getResourceProvider()));
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.T = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.p6 p6Var2 = this.T;
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, getResourceProvider()));
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.U = p6Var3;
        p6Var3.setGravity(17);
        org.telegram.ui.Components.p6 p6Var4 = this.U;
        int i14 = org.telegram.ui.ActionBar.i6.y6;
        p6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, getResourceProvider()));
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.U, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, context, 1);
        this.V = aeVar;
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.V.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(context, 5);
        this.Z = oVar;
        oVar.setFocusable(false);
        this.Z.setTextColor(getThemedColor(i13));
        this.Z.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Z.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        this.Z.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.i6.uf));
        this.Z.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.i6.vf));
        this.Z.setGravity(LocaleController.isRTL ? 5 : 3);
        this.Z.setOnFocusChangeListener(new ii.x5(this, 3));
        this.Z.addTextChangedListener(new ci.i2(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, w7.z5.o(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, w7.z5.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new hg.t0(this, 2));
        this.Q.addView(this.V, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.q qVar = new bi.q(2, context, getResourceProvider(), true);
        qVar.setRoundRadius(24);
        this.a0 = qVar;
        qVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.a0.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i15 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.t0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            h hVar = this.b;
                            if (!hVar.h0.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                rg.x xVar = new rg.x(17, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = xVar;
                                hVar.h0.setLoading(true);
                                twoStepVerificationActivity.s0(new d(hVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setEnabled(true);
        this.b0.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.b0.setOnClickListener(new py0(29, this, context));
        this.R.addView(this.a0, w7.z5.o(-1, 48, 1.0f, 119));
        if (!z10) {
            this.R.addView(new Space(context), w7.z5.o(8, 48, 0.0f, 119));
            this.R.addView(this.b0, w7.z5.o(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar3 = new zd(context, 9);
        this.d0 = zdVar3;
        zdVar3.setOrientation(1);
        this.d0.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, this.resourceProvider));
        this.d0.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var5 = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f0 = p6Var5;
        p6Var5.setTypeface(AndroidUtilities.bold());
        this.f0.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, this.resourceProvider));
        this.f0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f0.setGravity(17);
        this.e0 = new RelativeSizeSpan(0.6770833f);
        this.d0.addView(this.f0, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var6 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.g0 = p6Var6;
        p6Var6.setGravity(17);
        this.g0.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, this.resourceProvider));
        this.g0.setTextSize(AndroidUtilities.dp(14.0f));
        this.d0.addView(this.g0, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h0 = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.h0.g(LocaleController.getString(z10 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.h0.setVisibility(8);
        final int i16 = 1;
        this.h0.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.t0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            h hVar = this.b;
                            if (!hVar.h0.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                rg.x xVar = new rg.x(17, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = xVar;
                                hVar.h0.setLoading(true);
                                twoStepVerificationActivity.s0(new d(hVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.d0.addView(this.h0, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        e71 e71Var = new e71(this, new hi.a(this, 21), new c(this), new c(this));
        this.e = e71Var;
        e71Var.r1();
        e71 e71Var2 = this.e;
        e71Var2.f3.r = false;
        e71Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        bw0 bw0Var3 = this.f;
        if (bw0Var3 != null) {
            e71 e71Var3 = this.e;
            getParentActivity();
            gg.j0 j0Var = new gg.j0(5, bw0Var3, false);
            e71Var3.e3 = j0Var;
            e71Var3.setLayoutManager(j0Var);
            this.f.u(this.e, new c(this));
            this.f.x(i10 == 1 ? this.L : this.K, this.N, new c(this));
            FrameLayout frameLayout5 = this.M;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout2.addView(this.e, w7.z5.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().d(frameLayout2, this.e, this.actionBar, this.resourceProvider);
        this.actionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.M : this.actionBar), w7.z5.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        le.b bVar = new le.b(0, new c(this), tr.h, 380L, false);
        this.s = bVar;
        bw0 bw0Var4 = this.f;
        bVar.a(bw0Var4 != null && bw0Var4.e0, false);
        if (this.f != null) {
            getBaseSimpleGlass().h = this.f;
            y7 y7Var2 = this.K;
            if (y7Var2 != null) {
                y7Var2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().i = new di.f(6, this, new di.e(1, frameLayout2));
            View view = this.M;
            ch.d c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.w(eh.b.m(this.resourceProvider));
            c10.x(AndroidUtilities.dp(9.66f));
            c10.y(AndroidUtilities.dp(18.0f));
            view.setBackground(c10);
        }
        AndroidUtilities.removeFromParent(this.d.e);
        frameLayout2.addView(this.d.e, w7.z5.e(42, 42, 53));
        n0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            o0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        h91 h91Var = this.N;
        if (h91Var == null || !h91Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void n0() {
        if (this.e == null) {
            return;
        }
        AndroidUtilities.setViewLayoutMargins(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.b, AndroidUtilities.dp(6.0f), 0);
        e71 e71Var = this.e;
        i0.b bVar = this.mSystemInsets;
        li.a.c(e71Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            bw0 bw0Var = this.f;
            bw0Var.B();
            bw0Var.requestLayout();
            bw0Var.invalidate();
        }
        if (this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? AndroidUtilities.dp(44.0f) : 0);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.r.setLayoutParams(layoutParams);
            }
            s0();
        }
    }

    public final void o0() {
        jg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(this.b, false);
        if (h == this.v) {
            if ((h == null ? null : h.status) == this.w) {
                return;
            }
        }
        this.v = h;
        this.w = h != null ? h.status : null;
        if (h != null) {
            this.i0 = h.usd_rate;
            fa1 d02 = ta1.d0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.x = d02;
            if (d02 != null && (bVar = d02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.x.d.d.get(0) != null) {
                fa1 fa1Var = this.x;
                fa1Var.h = true;
                ((jg.a) fa1Var.d.d.get(0)).g = org.telegram.ui.ActionBar.i6.yj;
                this.x.d.h = (float) ((1.0d / this.i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            q0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            e71 e71Var = this.e;
            if (e71Var != null) {
                bw0 bw0Var = this.f;
                boolean z10 = bw0Var != null && bw0Var.e0;
                e71Var.f3.N(bw0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        o0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        this.O = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        n0();
    }

    public final void p0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j10 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.d8(this, twoStepVerificationActivity, parentActivity, z10, j3));
    }

    public final void q0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.T == null || this.U == null) {
            return;
        }
        long j3 = (long) (this.i0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z7.d1(false, TextUtils.concat("XTR ", z7.P0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
        }
        this.T.setText(spannableStringBuilder);
        this.U.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
        this.V.setVisibility(j3 > 0 ? 0 : 8);
        if (this.X) {
            this.W = true;
            fi.o oVar = this.Z;
            long j10 = starsAmount.amount;
            this.Y = j10;
            oVar.setText(Long.toString(j10));
            fi.o oVar2 = this.Z;
            oVar2.setSelection(oVar2.getText().length());
            this.W = false;
            this.a0.setEnabled(this.Y > 0);
        }
        this.P = i10;
        b bVar = this.s0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public final void s0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        le.b bVar = this.s;
        view.setTranslationY(this.f != null ? AndroidUtilities.dp(44.0f) * (-(1.0f - (bVar == null ? 0.0f : bVar.e))) : 0.0f);
    }

    public final void t0() {
        bi.q qVar = this.a0;
        if (!qVar.W || qVar.N) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.P > currentTime) {
            this.j0 = yc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, r0(this.P - currentTime)))).j();
            return;
        }
        if (this.Y < getMessagesController().starsRevenueWithdrawalMin) {
            yc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, i10))).j();
            return;
        }
        long j3 = this.Y;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        p9 p9Var = new p9(this, j3, twoStepVerificationActivity, 10);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = p9Var;
        this.a0.setLoading(true);
        twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, i10));
    }
}
