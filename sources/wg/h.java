package wg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import bi.e4;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
import tg.o1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class h {
    public static void a(t1 t1Var, boolean z10) {
        xh.l lVar = t1Var.f;
        if (lVar != null) {
            lVar.setTextSize(1, 20);
        }
        zt ztVar = t1Var.n;
        if (ztVar != null) {
            ztVar.setTextSize(1, 14);
        }
        zt ztVar2 = t1Var.n;
        if (ztVar2 != null) {
            ztVar2.setLineSpacing(org.telegram.messenger.g0.L(2.5f), 1.0f);
        }
        if (z10) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) t1Var.u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-14.0f);
    }

    public static String b(gj gjVar) {
        if (gjVar == null) {
            return "";
        }
        String Y0 = gjVar.Y0();
        if (Y0 != null) {
            return Y0;
        }
        TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(-gj.B1(gjVar.k.peer_id)));
        return O0 != null ? O0.title : "";
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, h6 h6Var, Runnable runnable) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            return;
        }
        if (!str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            j(frameLayout.getContext(), tL_error);
            return;
        }
        String format = hd.E0().o0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(hd.N0(2131749504, "GiftPremiumActivateErrorText"), m6.xj, 0, runnable, null);
        new lc(frameLayout, h6Var).I(R.raw.chats_infotip, hd.N0(2131749503, null), org.telegram.messenger.g0.K2(R2, org.telegram.messenger.g0.W2("**" + format + "**"), "%1$s")).j();
        try {
            frameLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, h6 h6Var) {
        int i7;
        String str2;
        int i10 = tL_messageMediaGiveaway.quantity;
        String G = hd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = hd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = hd.E0().p0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = hd.E0().u0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131753491, "BoostingGiveAwayAbout");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            i7 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.K(z10 ? "BoostingStarsGiveawayHowItWorksText" : "BoostingStarsGiveawayHowItWorksTextGroup", (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i7 = 0;
            str2 = format;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, z10 ? "BoostingGiveawayHowItWorksText" : "BoostingGiveawayHowItWorksTextGroup", str, Integer.valueOf(i10), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i7] = str;
            objArr[1] = str4;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[i7] = format2;
                objArr2[1] = format3;
                String G2 = hd.G(size, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i10);
                Object[] objArr3 = new Object[4];
                objArr3[i7] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i10);
                Object[] objArr4 = new Object[5];
                objArr4[i7] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z11) {
            int i11 = i7;
            String G3 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i11]);
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr5 = new Object[4];
            objArr5[i11] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr6 = new Object[3];
            objArr6[i7] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i10, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tL_payments_giveawayInfo.participating) {
            String str5 = tL_payments_giveawayInfo.disallowed_country;
            if (str5 != null && !str5.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.N0(2131753399, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                f3.p(null, null, z10 ? 2131753401 : 2131753400, new Object[]{O0 != null ? O0.title : ""}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                f3.p("BoostingGiveawayNotEligible", null, 2131753402, new Object[]{hd.E0().u0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                f3.p("BoostingGiveawayTakePart", null, 2131753363, new Object[]{str, str2}, spannableStringBuilder);
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
        } else {
            f3.p("BoostingGiveawayParticipant", null, 2131753398, new Object[]{str}, spannableStringBuilder);
        }
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(hd.N0(2131747637, "OK"), new ug.x(17));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, h6 h6Var) {
        String str2;
        int i7;
        int i10;
        String N0;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = hd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = hd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = hd.E0().p0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = hd.E0().u0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N02 = hd.N0(2131753475, "BoostingGiveawayEnd");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            i10 = 2;
            i7 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.K(z10 ? "BoostingStarsGiveawayHowItWorksTextEnd" : "BoostingStarsGiveawayHowItWorksTextEndGroup", (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i7 = 1;
            i10 = 2;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, z10 ? "BoostingGiveawayHowItWorksTextEnd" : "BoostingGiveawayHowItWorksTextEndGroup", str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            objArr[i7] = str4;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i7] = format3;
                String G2 = hd.G(size, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i7] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i7] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z11) {
            String G3 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i7] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i7] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i12 = tL_payments_giveawayInfoResults.activated_count;
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(hd.G(i12, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String N03 = hd.N0(2131753480, "BoostingGiveawayCanceledByPayment");
            TextView textView = new TextView(context);
            textView.setTextSize(i7, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(N03);
            int i13 = m6.p7;
            t6.U(textView, i13, h6Var);
            ShapeDrawable e02 = m6.e0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), m6.r1(0.1f, m6.w0(i13, h6Var)));
            p6 K = t6.K(0.1f, i13);
            textView.setBackground(e02);
            t6.j(textView, e02, K, null, h6Var);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            t1Var.c = textView;
            t1Var.U = spannableStringBuilder;
            alertDialog$Builder.k(hd.N0(2131752029, "Close"), new ug.x(17));
            a(alertDialog$Builder.p(), true);
            return;
        }
        t1Var.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            N0 = hd.N0(2131753354, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(hd.N0(2131753356, "BoostingGiveawayViewPrize"), new o1(tL_payments_giveawayInfoResults, 11));
            }
            alertDialog$Builder.h(hd.N0(2131752029, "Close"), new ug.x(17));
        } else {
            N0 = hd.N0(2131753355, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(hd.N0(2131752029, "Close"), new ug.x(17));
        }
        zt ztVar = new zt(context);
        ls.i(ztVar);
        t6.U(ztVar, m6.j5, h6Var);
        ztVar.setTextSize(1, 14.0f);
        ztVar.setGravity(17);
        ztVar.setText(N0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i14 = m6.pi;
        ShapeDrawable e03 = m6.e0(L, L2, m6.w0(i14, h6Var));
        p6 M = t6.M(i14);
        ztVar.setBackground(e03);
        t6.j(ztVar, e03, M, null, h6Var);
        ztVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f));
        t1Var.d = ztVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(g2 g2Var, TLRPC.Chat chat, boolean z10) {
        if (g2Var == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new yn(lc.b0(g2Var), z10, chat, g2Var.getResourceProvider(), 17), 300L);
    }

    public static void g(int i7) {
        String str;
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i7 < 60) {
            str = hd.G(i7, "Seconds", new Object[0]);
        } else if (i7 < 3600) {
            str = hd.G(i7 / 60, "Minutes", new Object[0]);
        } else {
            int i10 = (i7 / 60) / 60;
            if (i10 > 2) {
                str = hd.G(i10, "Hours", new Object[0]);
            } else {
                str = hd.G(i10, "Hours", new Object[0]) + " " + hd.G(i7 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String N0 = hd.N0(2131752553, null);
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(hd.a0("CantBoostTooOftenDescription", null, 2131752552, str));
        alertDialog$Builder.k(hd.N0(2131747637, null), new ug.x(21));
        alertDialog$Builder.p();
    }

    public static void h(long j3) {
        org.telegram.messenger.g0.h3(new e4(j3 == k10.i(k10.t0).n ? org.telegram.messenger.g0.W2(hd.N0(2131753495, null)) : n5.z(j3) ? org.telegram.messenger.g0.W2(hd.a0("BoostingGiftLinkForwardedTo", null, 2131753496, np.u1(k10.t0).O0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.W2(hd.a0("BoostingGiftLinkForwardedTo", null, 2131753496, p10.k(np.u1(k10.t0).c2(Long.valueOf(j3)), true))), 1), 450L);
    }

    public static void i(long j3, w2 w2Var) {
        TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(-j3));
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String N0 = hd.N0(2131753335, null);
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(hd.G((int) np.u1(k10.t0).s0, "BoostingGetMoreBoostByGiftingCount", O0.title));
        alertDialog$Builder.h(hd.N0(2131749507, "GiftPremium"), new l2(w2Var));
        alertDialog$Builder.k(hd.N0(2131752029, "Close"), new ug.x(17));
        alertDialog$Builder.p();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context, tL_error.text, 1).show();
    }
}
