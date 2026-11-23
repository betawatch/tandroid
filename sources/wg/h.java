package wg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import bi.g4;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class h {
    public static void a(t1 t1Var, boolean z10) {
        xh.l lVar = t1Var.f;
        if (lVar != null) {
            lVar.setTextSize(1, 20);
        }
        xt xtVar = t1Var.n;
        if (xtVar != null) {
            xtVar.setTextSize(1, 14);
        }
        xt xtVar2 = t1Var.n;
        if (xtVar2 != null) {
            xtVar2.setLineSpacing(org.telegram.messenger.g0.L(2.5f), 1.0f);
        }
        if (z10) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) t1Var.u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-14.0f);
    }

    public static String b(fj fjVar) {
        if (fjVar == null) {
            return "";
        }
        String Y0 = fjVar.Y0();
        if (Y0 != null) {
            return Y0;
        }
        TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(-fj.B1(fjVar.k.peer_id)));
        return O0 != null ? O0.title : "";
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, i6 i6Var, Runnable runnable) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            return;
        }
        if (!str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            j(frameLayout.getContext(), tL_error);
            return;
        }
        String format = gd.E0().o0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(gd.N0(2131749504, "GiftPremiumActivateErrorText"), n6.xj, 0, runnable, null);
        new kc(frameLayout, i6Var).I(R.raw.chats_infotip, gd.N0(2131749503, null), org.telegram.messenger.g0.K2(R2, org.telegram.messenger.g0.W2("**" + format + "**"), "%1$s")).j();
        try {
            frameLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, i6 i6Var) {
        int i7;
        String str2;
        int i10 = tL_messageMediaGiveaway.quantity;
        String G = gd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = gd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = gd.E0().p0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = gd.E0().u0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = gd.N0(2131753491, "BoostingGiveAwayAbout");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            i7 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.K(z10 ? "BoostingStarsGiveawayHowItWorksText" : "BoostingStarsGiveawayHowItWorksTextGroup", (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i7 = 0;
            str2 = format;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, z10 ? "BoostingGiveawayHowItWorksText" : "BoostingGiveawayHowItWorksTextGroup", str, Integer.valueOf(i10), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i7] = str;
            objArr[1] = str4;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[i7] = format2;
                objArr2[1] = format3;
                String G2 = gd.G(size, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i10);
                Object[] objArr3 = new Object[4];
                objArr3[i7] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i10);
                Object[] objArr4 = new Object[5];
                objArr4[i7] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z11) {
            int i11 = i7;
            String G3 = gd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i11]);
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr5 = new Object[4];
            objArr5[i11] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr6 = new Object[3];
            objArr6[i7] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i10, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tL_payments_giveawayInfo.participating) {
            String str5 = tL_payments_giveawayInfo.disallowed_country;
            if (str5 != null && !str5.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.N0(2131753399, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                f3.p(null, null, z10 ? 2131753401 : 2131753400, new Object[]{O0 != null ? O0.title : ""}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                f3.p("BoostingGiveawayNotEligible", null, 2131753402, new Object[]{gd.E0().u0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                f3.p("BoostingGiveawayTakePart", null, 2131753363, new Object[]{str, str2}, spannableStringBuilder);
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
        } else {
            f3.p("BoostingGiveawayParticipant", null, 2131753398, new Object[]{str}, spannableStringBuilder);
        }
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(gd.N0(2131747637, "OK"), new ug.x(17));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, i6 i6Var) {
        String str2;
        int i7;
        int i10;
        String N0;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = gd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = gd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = gd.E0().p0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = gd.E0().u0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N02 = gd.N0(2131753475, "BoostingGiveawayEnd");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            i10 = 2;
            i7 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.K(z10 ? "BoostingStarsGiveawayHowItWorksTextEnd" : "BoostingStarsGiveawayHowItWorksTextEndGroup", (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i7 = 1;
            i10 = 2;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, z10 ? "BoostingGiveawayHowItWorksTextEnd" : "BoostingGiveawayHowItWorksTextEndGroup", str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            objArr[i7] = str4;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i7] = format3;
                String G2 = gd.G(size, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i7] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i7] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z11) {
            String G3 = gd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i7] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i7] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i11, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i12 = tL_payments_giveawayInfoResults.activated_count;
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.G(i12, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String N03 = gd.N0(2131753480, "BoostingGiveawayCanceledByPayment");
            TextView textView = new TextView(context);
            textView.setTextSize(i7, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(N03);
            int i13 = n6.p7;
            u6.U(textView, i13, i6Var);
            ShapeDrawable e02 = n6.e0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), n6.r1(0.1f, n6.w0(i13, i6Var)));
            q6 K = u6.K(0.1f, i13);
            textView.setBackground(e02);
            u6.j(textView, e02, K, null, i6Var);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            t1Var.c = textView;
            t1Var.U = spannableStringBuilder;
            alertDialog$Builder.k(gd.N0(2131752029, "Close"), new ug.x(17));
            a(alertDialog$Builder.p(), true);
            return;
        }
        t1Var.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            N0 = gd.N0(2131753354, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(gd.N0(2131753356, "BoostingGiveawayViewPrize"), new tg.s(tL_payments_giveawayInfoResults, 13));
            }
            alertDialog$Builder.h(gd.N0(2131752029, "Close"), new ug.x(17));
        } else {
            N0 = gd.N0(2131753355, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(gd.N0(2131752029, "Close"), new ug.x(17));
        }
        xt xtVar = new xt(context);
        ks.i(xtVar);
        u6.U(xtVar, n6.j5, i6Var);
        xtVar.setTextSize(1, 14.0f);
        xtVar.setGravity(17);
        xtVar.setText(N0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i14 = n6.pi;
        ShapeDrawable e03 = n6.e0(L, L2, n6.w0(i14, i6Var));
        q6 M = u6.M(i14);
        xtVar.setBackground(e03);
        u6.j(xtVar, e03, M, null, i6Var);
        xtVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f));
        t1Var.d = xtVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(g2 g2Var, TLRPC.Chat chat, boolean z10) {
        if (g2Var == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new xn(kc.b0(g2Var), z10, chat, g2Var.getResourceProvider(), 17), 300L);
    }

    public static void g(int i7) {
        String str;
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i7 < 60) {
            str = gd.G(i7, "Seconds", new Object[0]);
        } else if (i7 < 3600) {
            str = gd.G(i7 / 60, "Minutes", new Object[0]);
        } else {
            int i10 = (i7 / 60) / 60;
            if (i10 > 2) {
                str = gd.G(i10, "Hours", new Object[0]);
            } else {
                str = gd.G(i10, "Hours", new Object[0]) + " " + gd.G(i7 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String N0 = gd.N0(2131752553, null);
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(gd.a0("CantBoostTooOftenDescription", null, 2131752552, str));
        alertDialog$Builder.k(gd.N0(2131747637, null), new ug.x(21));
        alertDialog$Builder.p();
    }

    public static void h(long j3) {
        org.telegram.messenger.g0.h3(new g4(j3 == i10.i(i10.t0).n ? org.telegram.messenger.g0.W2(gd.N0(2131753495, null)) : n5.z(j3) ? org.telegram.messenger.g0.W2(gd.a0("BoostingGiftLinkForwardedTo", null, 2131753496, mp.u1(i10.t0).O0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.W2(gd.a0("BoostingGiftLinkForwardedTo", null, 2131753496, n10.k(mp.u1(i10.t0).c2(Long.valueOf(j3)), true))), 1), 450L);
    }

    public static void i(long j3, w2 w2Var) {
        TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(-j3));
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String N0 = gd.N0(2131753335, null);
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(gd.G((int) mp.u1(i10.t0).s0, "BoostingGetMoreBoostByGiftingCount", O0.title));
        alertDialog$Builder.h(gd.N0(2131749507, "GiftPremium"), new l2(w2Var));
        alertDialog$Builder.k(gd.N0(2131752029, "Close"), new ug.x(17));
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
