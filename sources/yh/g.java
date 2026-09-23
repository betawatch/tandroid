package yh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import ci.q9;
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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.da1;
import org.telegram.ui.ge;
import org.telegram.ui.je;
import org.telegram.ui.o81;
import org.telegram.ui.py0;
import org.telegram.ui.ra1;
import org.telegram.ui.so;
import org.telegram.ui.ui1;
import org.telegram.ui.xd;
import org.telegram.ui.yd;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class g extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public v7 F;
    public int G;
    public xd H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.p6 K;
    public org.telegram.ui.Components.p6 L;
    public yd M;
    public boolean N;
    public boolean O;
    public long P;
    public fi.o Q;
    public bi.q R;
    public ci.d S;
    public final pq[] T;
    public xd U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.p6 W;
    public org.telegram.ui.Components.p6 X;
    public ci.d Y;
    public double Z;
    public final int a;
    public qc a0;
    public final long b;
    public CharSequence b0;
    public final boolean c;
    public CharSequence c0;
    public fo d;
    public CharSequence d0;
    public d61 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public da1 f0;
    public da1 g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean h0;
    public boolean i0;
    public final ArrayList j0;
    public String k0;
    public DecimalFormat l0;
    public SpannableStringBuilder m0;
    public da1 n;
    public final b n0;
    public final int o0;
    public final ge r;
    public final ge s;
    public final ge v;
    public final ge w;
    public final ge x;
    public final ge y;

    public g(int i10, long j3) {
        super(null);
        this.r = ge.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = ge.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ge.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = ge.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = ge.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = ge.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.N = false;
        this.O = true;
        this.T = new pq[1];
        this.h0 = false;
        this.i0 = false;
        this.j0 = new ArrayList();
        this.k0 = "";
        this.n0 = new b(this, 0);
        this.o0 = -1;
        this.a = i10;
        this.b = j3;
        boolean z10 = j3 == getUserConfig().getClientUserId();
        this.c = z10;
        if (i10 == 0) {
            o.g(this.currentAccount).r(j3);
            if (!z10) {
                o.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            o g10 = o.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new b(this, 4)), true);
    }

    public static void U(g gVar) {
        b bVar = gVar.n0;
        qc.e();
        TLRPC.TL_payments_starsRevenueStats h = o.g(gVar.currentAccount).h(gVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < gVar.getMessagesController().starsRevenueWithdrawalMin) {
            gVar.O = true;
            gVar.P = j3;
        } else {
            gVar.O = false;
            gVar.P = gVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        gVar.N = true;
        gVar.Q.setText(Long.toString(gVar.P));
        fi.o oVar = gVar.Q;
        oVar.setSelection(oVar.getText().length());
        gVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void V(g gVar) {
        gVar.showDialog(je.d0(gVar.getParentActivity(), gVar.resourceProvider, true));
    }

    public static void W(g gVar, h51 h51Var) {
        if (h51Var.G(p7.class)) {
            w7.h1(gVar.getParentActivity(), true, gVar.b, gVar.currentAccount, (TL_stars.StarsTransaction) h51Var.G, gVar.getResourceProvider());
        } else if (h51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            je.h0(gVar.getParentActivity(), gVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) h51Var.G, gVar.b, gVar.resourceProvider);
        } else if (h51Var.d == 2) {
            gVar.presentFragment(new ei.e4(gVar.b));
        }
    }

    public static void X(g gVar, Context context, View view) {
        if (view.isEnabled()) {
            ci.d dVar = gVar.S;
            if (dVar.N) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.b);
            ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ui1(6, gVar, context));
        }
    }

    public static void Y(g gVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ge geVar = gVar.x;
        ArrayList arrayList2 = gVar.j0;
        ge geVar2 = gVar.y;
        ge geVar3 = gVar.v;
        ge geVar4 = gVar.s;
        ge geVar5 = gVar.r;
        long j3 = gVar.b;
        ge geVar6 = gVar.w;
        boolean z10 = gVar.c;
        int i12 = gVar.o0;
        o g10 = o.g(gVar.currentAccount);
        int i13 = gVar.a;
        if (i13 == 0) {
            arrayList.add(h51.h(2, i12, gVar.n));
            arrayList.add(h51.A(-1, null));
            arrayList.add(h51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                geVar5.a = false;
                geVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                geVar5.i = starsAmount;
                geVar5.h = "XTR";
                geVar5.f = "USD";
                double d10 = starsAmount.amount;
                double d11 = gVar.Z;
                geVar5.j = (long) (d10 * d11 * 100.0d);
                geVar4.a = false;
                geVar4.g = true;
                geVar4.i = tL_starsRevenueStatus2.current_balance;
                geVar4.h = "XTR";
                geVar4.j = (long) (r9.amount * d11 * 100.0d);
                geVar4.f = "USD";
                geVar3.a = false;
                geVar3.g = true;
                geVar3.i = tL_starsRevenueStatus2.overall_revenue;
                geVar3.h = "XTR";
                geVar3.j = (long) (r9.amount * d11 * 100.0d);
                geVar3.f = "USD";
                gVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                gVar.I.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(h51.u(geVar5));
            arrayList.add(h51.u(geVar4));
            arrayList.add(h51.u(geVar3));
            arrayList.add(h51.A(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(h51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(h51.j(1, gVar.H));
            arrayList.add(h51.A(-3, gVar.E));
            if (z10) {
                return;
            }
            if (gVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(ei.h.a(2, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uj, gVar.resourceProvider), R.drawable.filled_earn_stars, so.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(h51.A(-4, null));
            }
            arrayList.add(h51.p(gVar.F, 0, false));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            if (!z10) {
                if (gVar.b0 == null) {
                    gVar.b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(gVar, 2), gVar.resourceProvider), true);
                }
                arrayList.add(h51.g(gVar.b0));
            }
            if (gVar.f0 == null && j10 != null) {
                da1 f02 = ra1.f0(j10.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                gVar.f0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            da1 da1Var = gVar.f0;
            if (da1Var != null && !da1Var.l) {
                arrayList.add(h51.h(5, i12, da1Var));
                arrayList.add(h51.A(-1, null));
            }
            if (gVar.g0 != null || j10 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i10 = 2;
                gVar.g0 = ra1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            da1 da1Var2 = gVar.g0;
            if (da1Var2 != null && !da1Var2.l) {
                arrayList.add(h51.h(i10, i12, da1Var2));
                arrayList.add(h51.A(-2, null));
            }
            if (!gVar.e0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d12 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                geVar6.d = j11;
                double d13 = j11 / 1.0E9d;
                long j12 = (long) (d13 * d12 * 100.0d);
                geVar6.e = j12;
                if (gVar.l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d12;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    gVar.l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    gVar.l0.setMaximumFractionDigits(6);
                    gVar.l0.setGroupingUsed(false);
                } else {
                    d = d12;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = gVar.l0;
                if (d13 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(je.f0("TON " + gVar.l0.format(d13), gVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(gVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                gVar.W.setText(spannableStringBuilder);
                gVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j12, "USD"));
                geVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                geVar.d = j13;
                geVar.e = (long) ((j13 / 1.0E9d) * d * 100.0d);
                geVar.f = "USD";
                geVar2.a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                geVar2.d = j14;
                geVar2.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                geVar2.f = "USD";
                gVar.e0 = true;
                gVar.Y.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (gVar.e0) {
                arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(h51.u(geVar6));
                arrayList.add(h51.u(geVar));
                arrayList.add(h51.u(geVar2));
                if (gVar.c0 == null) {
                    gVar.c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new qg.v(gVar, R.string.BotMonetizationProceedsTONInfoLink, 4), gVar.resourceProvider), true);
                }
                arrayList.add(h51.A(-4, gVar.c0));
            }
            arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(h51.k(gVar.U));
            if (gVar.d0 == null) {
                gVar.d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(gVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new b(gVar, 3)), true);
            }
            arrayList.add(h51.A(-5, gVar.d0));
            if (!gVar.i0 || !arrayList2.isEmpty()) {
                arrayList.add(h51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    int i15 = p7.a;
                    h51 J = h51.J(p7.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!gVar.i0) {
                    arrayList.add(h51.o(1, 7));
                    arrayList.add(h51.o(2, 7));
                    arrayList.add(h51.o(3, 7));
                }
            }
            arrayList.add(h51.A(-6, null));
        }
    }

    public static void Z(g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                nf.f.u(gVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    gVar.O = true;
                    nf.f.u(gVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(new TL_account.getPassword(), new v9(gVar, twoStepVerificationActivity, z10, j3, 3), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            xc.b0(tL_error);
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
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
            linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.x5.n(-2, -2));
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
        }
        LinearLayout f7 = org.telegram.messenger.z0.f(activity, 0);
        linearLayout.addView(f7, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.z0.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            f7.addView(textView3, w7.x5.n(-1, -2));
            i10 = 5;
            f7.addView(imageView2, w7.x5.q(-2, -2, 5));
        } else {
            i10 = 5;
            f7.addView(imageView2, w7.x5.n(-2, -2));
            f7.addView(textView3, w7.x5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new d(gVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(g gVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(gVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(gVar.currentAccount).putChats(starsStatus.chats, false);
            gVar.k0 = starsStatus.next_offset;
            gVar.j0.addAll(starsStatus.history);
            gVar.i0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            xc.b0(tL_error);
            gVar.i0 = true;
        }
        gVar.h0 = false;
        v51 v51Var = gVar.e.Y2;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    public static void e0(g gVar) {
        if (gVar.h0 || gVar.i0 || gVar.k0 == null) {
            return;
        }
        gVar.h0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.b);
        tL_payments_getStarsTransactions.offset = gVar.k0;
        tL_payments_getStarsTransactions.limit = gVar.j0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new ai.n8(gVar, 24));
    }

    public static String j0(int i10) {
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
        f fVar = new f(this, context);
        fo foVar = new fo(context, null, false, null);
        this.d = foVar;
        foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, w7.x5.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 11));
        fo foVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.h6.Oi;
        foVar2.i(org.telegram.ui.ActionBar.h6.w0(null, i10, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.z8, false), false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.d6;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.F = new v7(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        xd xdVar = new xd(context, 9);
        this.H = xdVar;
        xdVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.K = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.p6 p6Var2 = this.K;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.L = p6Var3;
        p6Var3.setGravity(17);
        org.telegram.ui.Components.p6 p6Var4 = this.L;
        int i13 = org.telegram.ui.ActionBar.h6.y6;
        p6Var4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        yd ydVar = new yd(this, context, 1);
        this.M = ydVar;
        ydVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(context, 5);
        this.Q = oVar;
        oVar.setFocusable(false);
        this.Q.setTextColor(getThemedColor(i12));
        this.Q.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Q.setCursorWidth(1.5f);
        this.Q.setBackground(null);
        this.Q.setTextSize(1, 18.0f);
        this.Q.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Q.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Q.setInputType(2);
        this.Q.setTypeface(Typeface.DEFAULT);
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.h6.vf));
        this.Q.setGravity(LocaleController.isRTL ? 5 : 3);
        this.Q.setOnFocusChangeListener(new ii.w5(this, 3));
        this.Q.addTextChangedListener(new ci.i2(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.x5.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.x5.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new hg.u0(this, 2));
        this.H.addView(this.M, w7.x5.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.q qVar = new bi.q(2, context, getResourceProvider(), true);
        qVar.setRoundRadius(24);
        this.R = qVar;
        qVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.R.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.k0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                tg.d dVar = new tg.d(15, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = dVar;
                                gVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(gVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new py0(29, this, context));
        this.I.addView(this.R, w7.x5.o(-1, 48, 1.0f, 119));
        boolean z10 = this.c;
        if (!z10) {
            this.I.addView(new Space(context), w7.x5.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.x5.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        xd xdVar2 = new xd(context, 10);
        this.U = xdVar2;
        xdVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var5 = new org.telegram.ui.Components.p6(context, false, true, true);
        this.W = p6Var5;
        p6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var6 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.X = p6Var6;
        p6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.Y.g(LocaleController.getString(z10 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.Y.setVisibility(8);
        final int i15 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: yh.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.k0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                tg.d dVar3 = new tg.d(15, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = dVar3;
                                gVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(gVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.U.addView(this.Y, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        d61 d61Var = new d61(this, new hi.a(this, 21), new d(this), new d(this));
        this.e = d61Var;
        d61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        this.e.p1();
        fVar.addView(this.e, w7.x5.c(-1.0f, -1));
        this.e.setOnScrollListener(new kg0(this, 17));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = fVar;
        return fVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        jg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.Z = h.usd_rate;
            da1 f02 = ra1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                da1 da1Var = this.n;
                da1Var.h = true;
                ((jg.a) da1Var.d.d.get(0)).g = org.telegram.ui.ActionBar.h6.yj;
                this.n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            d61 d61Var = this.e;
            if (d61Var != null) {
                d61Var.Y2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
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

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.K == null || this.L == null) {
            return;
        }
        long j3 = (long) (this.Z * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w7.X0(false, TextUtils.concat("XTR ", w7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
        }
        this.K.setText(spannableStringBuilder);
        this.L.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
        this.M.setVisibility(j3 > 0 ? 0 : 8);
        if (this.O) {
            this.N = true;
            fi.o oVar = this.Q;
            long j10 = starsAmount.amount;
            this.P = j10;
            oVar.setText(Long.toString(j10));
            fi.o oVar2 = this.Q;
            oVar2.setSelection(oVar2.getText().length());
            this.N = false;
            this.R.setEnabled(this.P > 0);
        }
        this.G = i10;
        b bVar = this.n0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false)) > 0.721f;
    }

    public final void k0() {
        bi.q qVar = this.R;
        if (!qVar.W || qVar.N) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.G > currentTime) {
            this.a0 = xc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            return;
        }
        if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
            xc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, i10))).j();
            return;
        }
        long j3 = this.P;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        q9 q9Var = new q9(this, j3, twoStepVerificationActivity, 10);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = q9Var;
        this.R.setLoading(true);
        twoStepVerificationActivity.s0(new c(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
