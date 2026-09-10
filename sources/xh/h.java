package xh;

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
import bi.bb;
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
import org.telegram.messenger.ca;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.b91;
import org.telegram.ui.fb1;
import org.telegram.ui.ie;
import org.telegram.ui.le;
import org.telegram.ui.ra1;
import org.telegram.ui.w71;
import org.telegram.ui.yo;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public y7 F;
    public int G;
    public zd H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.o6 K;
    public org.telegram.ui.Components.o6 L;
    public ae M;
    public boolean N;
    public boolean O;
    public long P;
    public ei.o Q;
    public ai.w R;
    public bi.d S;
    public final uq[] T;
    public zd U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.o6 W;
    public org.telegram.ui.Components.o6 X;
    public bi.d Y;
    public double Z;
    public final int a;
    public pc a0;
    public final long b;
    public CharSequence b0;
    public final boolean c;
    public CharSequence c0;
    public jo d;
    public CharSequence d0;
    public r61 e;
    public boolean e0;
    public TLRPC.TL_payments_starsRevenueStats f;
    public ra1 f0;
    public ra1 g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean h0;
    public boolean i0;
    public final ArrayList j0;
    public String k0;
    public DecimalFormat l0;
    public SpannableStringBuilder m0;
    public ra1 n;
    public final b n0;
    public final int o0;
    public final ie r;
    public final ie s;
    public final ie v;
    public final ie w;
    public final ie x;
    public final ie y;

    public h(int i10, long j3) {
        super(null);
        this.r = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.s = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.w = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.x = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.y = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        this.N = false;
        this.O = true;
        this.T = new uq[1];
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
            p.g(this.currentAccount).r(j3);
            if (!z10) {
                p.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            p g10 = p.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z10 ? LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin) : LocaleController.getString(R.string.BotStarsWithdrawInfo), new b(this, 4)), true);
    }

    public static void U(h hVar) {
        b bVar = hVar.n0;
        pc.e();
        TLRPC.TL_payments_starsRevenueStats h = p.g(hVar.currentAccount).h(hVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < hVar.getMessagesController().starsRevenueWithdrawalMin) {
            hVar.O = true;
            hVar.P = j3;
        } else {
            hVar.O = false;
            hVar.P = hVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        hVar.N = true;
        hVar.Q.setText(Long.toString(hVar.P));
        ei.o oVar = hVar.Q;
        oVar.setSelection(oVar.getText().length());
        hVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void V(h hVar) {
        hVar.showDialog(le.d0(hVar.getParentActivity(), hVar.resourceProvider, true));
    }

    public static void W(h hVar, v51 v51Var) {
        if (v51Var.G(s7.class)) {
            z7.h1(hVar.getParentActivity(), true, hVar.b, hVar.currentAccount, (TL_stars.StarsTransaction) v51Var.G, hVar.getResourceProvider());
        } else if (v51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            le.h0(hVar.getParentActivity(), hVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) v51Var.G, hVar.b, hVar.resourceProvider);
        } else if (v51Var.d == 2) {
            hVar.presentFragment(new di.h4(hVar.b));
        }
    }

    public static void X(h hVar, Context context, View view) {
        if (view.isEnabled()) {
            bi.d dVar = hVar.S;
            if (dVar.N) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(hVar.currentAccount).getInputPeer(hVar.b);
            ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new wh.s3(1, hVar, context));
        }
    }

    public static void Y(h hVar, ArrayList arrayList) {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ie ieVar = hVar.x;
        ArrayList arrayList2 = hVar.j0;
        ie ieVar2 = hVar.y;
        ie ieVar3 = hVar.v;
        ie ieVar4 = hVar.s;
        ie ieVar5 = hVar.r;
        long j3 = hVar.b;
        ie ieVar6 = hVar.w;
        boolean z10 = hVar.c;
        int i12 = hVar.o0;
        p g10 = p.g(hVar.currentAccount);
        int i13 = hVar.a;
        if (i13 == 0) {
            arrayList.add(v51.h(2, i12, hVar.n));
            arrayList.add(v51.A(-1, null));
            arrayList.add(v51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                ieVar5.a = false;
                ieVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                ieVar5.i = starsAmount;
                ieVar5.h = "XTR";
                ieVar5.f = "USD";
                double d10 = starsAmount.amount;
                double d11 = hVar.Z;
                ieVar5.j = (long) (d10 * d11 * 100.0d);
                ieVar4.a = false;
                ieVar4.g = true;
                ieVar4.i = tL_starsRevenueStatus2.current_balance;
                ieVar4.h = "XTR";
                ieVar4.j = (long) (r9.amount * d11 * 100.0d);
                ieVar4.f = "USD";
                ieVar3.a = false;
                ieVar3.g = true;
                ieVar3.i = tL_starsRevenueStatus2.overall_revenue;
                ieVar3.h = "XTR";
                ieVar3.j = (long) (r9.amount * d11 * 100.0d);
                ieVar3.f = "USD";
                hVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                hVar.I.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(v51.u(ieVar5));
            arrayList.add(v51.u(ieVar4));
            arrayList.add(v51.u(ieVar3));
            arrayList.add(v51.A(-2, LocaleController.getString(z10 ? R.string.SelfStarsOverviewInfo : R.string.BotStarsOverviewInfo)));
            arrayList.add(v51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(v51.j(1, hVar.H));
            arrayList.add(v51.A(-3, hVar.E));
            if (z10) {
                return;
            }
            if (hVar.getMessagesController().starrefConnectAllowed) {
                arrayList.add(di.i.a(2, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, hVar.resourceProvider), R.drawable.filled_earn_stars, yo.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                arrayList.add(v51.A(-4, null));
            }
            arrayList.add(v51.p(hVar.F, 0, false));
            return;
        }
        if (i13 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            if (!z10) {
                if (hVar.b0 == null) {
                    hVar.b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(hVar, 2), hVar.resourceProvider), true);
                }
                arrayList.add(v51.g(hVar.b0));
            }
            if (hVar.f0 == null && j10 != null) {
                ra1 f02 = fb1.f0(j10.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                hVar.f0 = f02;
                if (f02 != null) {
                    f02.n = true;
                }
            }
            ra1 ra1Var = hVar.f0;
            if (ra1Var != null && !ra1Var.l) {
                arrayList.add(v51.h(5, i12, ra1Var));
                arrayList.add(v51.A(-1, null));
            }
            if (hVar.g0 != null || j10 == null) {
                i10 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i10 = 2;
                hVar.g0 = fb1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            }
            ra1 ra1Var2 = hVar.g0;
            if (ra1Var2 != null && !ra1Var2.l) {
                arrayList.add(v51.h(i10, i12, ra1Var2));
                arrayList.add(v51.A(-2, null));
            }
            if (!hVar.e0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d12 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                ieVar6.d = j11;
                double d13 = j11 / 1.0E9d;
                long j12 = (long) (d13 * d12 * 100.0d);
                ieVar6.e = j12;
                if (hVar.l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d12;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    hVar.l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i11 = 6;
                    hVar.l0.setMaximumFractionDigits(6);
                    hVar.l0.setGroupingUsed(false);
                } else {
                    d = d12;
                    i11 = 6;
                }
                DecimalFormat decimalFormat2 = hVar.l0;
                if (d13 > 1.5d) {
                    i11 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(le.f0("TON " + hVar.l0.format(d13), hVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(hVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                hVar.W.setText(spannableStringBuilder);
                hVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j12, "USD"));
                ieVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                ieVar.d = j13;
                ieVar.e = (long) ((j13 / 1.0E9d) * d * 100.0d);
                ieVar.f = "USD";
                ieVar2.a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                ieVar2.d = j14;
                ieVar2.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                ieVar2.f = "USD";
                hVar.e0 = true;
                hVar.Y.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (hVar.e0) {
                arrayList.add(v51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(v51.u(ieVar6));
                arrayList.add(v51.u(ieVar));
                arrayList.add(v51.u(ieVar2));
                if (hVar.c0 == null) {
                    hVar.c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new pg.f2(hVar, R.string.BotMonetizationProceedsTONInfoLink, 3), hVar.resourceProvider), true);
                }
                arrayList.add(v51.A(-4, hVar.c0));
            }
            arrayList.add(v51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(v51.k(hVar.U));
            if (hVar.d0 == null) {
                hVar.d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(hVar.currentAccount).channelRevenueWithdrawalEnabled ? R.string.BotMonetizationBalanceInfo : R.string.BotMonetizationBalanceInfoNotAvailable), -1, 3, new b(hVar, 3)), true);
            }
            arrayList.add(v51.A(-5, hVar.d0));
            if (!hVar.i0 || !arrayList2.isEmpty()) {
                arrayList.add(v51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    int i15 = s7.a;
                    v51 J = v51.J(s7.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.q = true;
                    arrayList.add(J);
                }
                if (!hVar.i0) {
                    arrayList.add(v51.o(1, 7));
                    arrayList.add(v51.o(2, 7));
                    arrayList.add(v51.o(3, 7));
                }
            }
            arrayList.add(v51.A(-6, null));
        }
    }

    public static void Z(h hVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        int i10;
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                nf.f.u(hVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    hVar.O = true;
                    nf.f.u(hVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(new TL_account.getPassword(), new ca(hVar, twoStepVerificationActivity, z10, j3, 3), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            wc.b0(tL_error);
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
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
        linearLayout.addView(textView, w7.a6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.a2.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.a6.n(-1, -2));
            linearLayout2.addView(imageView, w7.a6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.a6.n(-2, -2));
            linearLayout2.addView(textView2, w7.a6.n(-1, -2));
        }
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 0);
        linearLayout.addView(f7, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.a2.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            f7.addView(textView3, w7.a6.n(-1, -2));
            i10 = 5;
            f7.addView(imageView2, w7.a6.q(-2, -2, 5));
        } else {
            i10 = 5;
            f7.addView(imageView2, w7.a6.n(-2, -2));
            f7.addView(textView3, w7.a6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new e(hVar));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(activity);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(h hVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(hVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(hVar.currentAccount).putChats(starsStatus.chats, false);
            hVar.k0 = starsStatus.next_offset;
            hVar.j0.addAll(starsStatus.history);
            hVar.i0 = starsStatus.history.isEmpty() || starsStatus.next_offset == null;
        } else if (tL_error != null) {
            wc.b0(tL_error);
            hVar.i0 = true;
        }
        hVar.h0 = false;
        j61 j61Var = hVar.e.Y2;
        if (j61Var != null) {
            j61Var.N(true);
        }
    }

    public static void e0(h hVar) {
        if (hVar.h0 || hVar.i0 || hVar.k0 == null) {
            return;
        }
        hVar.h0 = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(hVar.currentAccount).getInputPeer(hVar.b);
        tL_payments_getStarsTransactions.offset = hVar.k0;
        tL_payments_getStarsTransactions.limit = hVar.j0.isEmpty() ? 5 : 20;
        ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new bi.c2(hVar, 21));
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        g gVar = new g(this, context);
        jo joVar = new jo(context, null, false, null);
        this.d = joVar;
        boolean z10 = true;
        joVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.d, 0, w7.a6.d(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 12));
        jo joVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        joVar2.i(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.F = new y7(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider());
        zd zdVar = new zd(context, 9);
        this.H = zdVar;
        zdVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.K = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.o6 o6Var2 = this.K;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.a6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.L = o6Var3;
        o6Var3.setGravity(17);
        org.telegram.ui.Components.o6 o6Var4 = this.L;
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        o6Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.a6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, context, 1);
        this.M = aeVar;
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        ei.o oVar = new ei.o(context, 5);
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
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.j6.vf));
        this.Q.setGravity(LocaleController.isRTL ? 5 : 3);
        this.Q.setOnFocusChangeListener(new hi.y5(this, 3));
        this.Q.addTextChangedListener(new bi.u2(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.a6.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.a6.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new gg.x0(this, 2));
        this.H.addView(this.M, w7.a6.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        ai.w wVar = new ai.w(2, context, getResourceProvider(), z10);
        wVar.setRoundRadius(24);
        this.R = wVar;
        wVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        final int i14 = 0;
        this.R.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f
            public final /* synthetic */ h b;

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
                            h hVar = this.b;
                            if (!hVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                sg.f0 f0Var = new sg.f0(10, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = f0Var;
                                hVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(hVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        bi.d dVar = new bi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new w71(25, this, context));
        this.I.addView(this.R, w7.a6.o(-1, 48, 1.0f, 119));
        boolean z11 = this.c;
        if (!z11) {
            this.I.addView(new Space(context), w7.a6.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.a6.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.a6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar2 = new zd(context, 10);
        this.U = zdVar2;
        zdVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.W = o6Var5;
        o6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.a6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.o6 o6Var6 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.X = o6Var6;
        o6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.a6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        bi.d dVar2 = new bi.d(context, this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.Y.g(LocaleController.getString(z11 ? R.string.MonetizationSelfWithdraw : R.string.MonetizationWithdraw), false, true);
        this.Y.setVisibility(8);
        final int i15 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: xh.f
            public final /* synthetic */ h b;

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
                            h hVar = this.b;
                            if (!hVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                sg.f0 f0Var = new sg.f0(10, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = f0Var;
                                hVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(hVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.U.addView(this.Y, w7.a6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        r61 r61Var = new r61(this, new gi.a(this, 21), new e(this), new e(this));
        this.e = r61Var;
        r61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.e.o1();
        gVar.addView(this.e, w7.a6.c(-1.0f, -1));
        this.e.setOnScrollListener(new al0(this, 15));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = gVar;
        return gVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.b) {
            g0();
        }
    }

    public final void g0() {
        ig.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(this.b, false);
        if (h == this.f) {
            if ((h == null ? null : h.status) == this.h) {
                return;
            }
        }
        this.f = h;
        this.h = h != null ? h.status : null;
        if (h != null) {
            this.Z = h.usd_rate;
            ra1 f02 = fb1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.n.d.d.get(0) != null) {
                ra1 ra1Var = this.n;
                ra1Var.h = true;
                ((ig.a) ra1Var.d.d.get(0)).g = org.telegram.ui.ActionBar.j6.yj;
                this.n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            i0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            r61 r61Var = this.e;
            if (r61Var != null) {
                r61Var.Y2.N(true);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new d(this, twoStepVerificationActivity, parentActivity, z10, j3));
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        if (this.K == null || this.L == null) {
            return;
        }
        long j3 = (long) (this.Z * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z7.X0(false, TextUtils.concat("XTR ", z7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
        }
        this.K.setText(spannableStringBuilder);
        this.L.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
        this.M.setVisibility(j3 > 0 ? 0 : 8);
        if (this.O) {
            this.N = true;
            ei.o oVar = this.Q;
            long j10 = starsAmount.amount;
            this.P = j10;
            oVar.setText(Long.toString(j10));
            ei.o oVar2 = this.Q;
            oVar2.setSelection(oVar2.getText().length());
            this.N = false;
            this.R.setEnabled(this.P > 0);
        }
        this.G = i10;
        b bVar = this.n0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)) > 0.721f;
    }

    public final void k0() {
        ai.w wVar = this.R;
        if (!wVar.W || wVar.N) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i10 = 1;
        if (this.G > currentTime) {
            this.a0 = wc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            return;
        }
        if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
            wc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, i10))).j();
            return;
        }
        long j3 = this.P;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        bb bbVar = new bb(this, j3, twoStepVerificationActivity, 10);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = bbVar;
        this.R.setLoading(true);
        twoStepVerificationActivity.s0(new c(this, twoStepVerificationActivity, i10));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
