// default package

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class vs7 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    public static String a(int i, long j) {
        return i + ":" + j;
    }

    public static boolean b(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = a;
        Long l = (Long) hashMap.get(valueOf);
        if (l != null && l.longValue() > elapsedRealtime) {
            return false;
        }
        hashMap.put(Long.valueOf(j), Long.valueOf(elapsedRealtime + 30000));
        c();
        return true;
    }

    public static void c() {
        jn7.e().k(jn7.L3, new Object[0]);
    }

    public static SpannableStringBuilder d(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? it7.i(starGift) : "").replace(' ', (char) 160);
        String replace2 = it7.l(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            return hl.S2(ob6.a0(null, null, 2131749541, replace2, replace));
        }
        String x = it7.x(tL_messageActionStarGiftOnchainOffer.amount);
        String replace3 = x == null ? null : x.replace(' ', (char) 160);
        return hl.S2(replace3 != null ? ob6.a0(null, null, 2131749552, replace2, replace3, replace) : ob6.a0(null, null, 2131749551, replace2, replace));
    }

    public static void e(final int i, final int i2, final d31 d31Var, final is7 is7Var, final vnb vnbVar, final Context context, final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        if (k(i, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            r(d31Var);
            return;
        }
        if (m(i, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            return;
        }
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String i3 = starGift != null ? it7.i(starGift) : "";
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131749564, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0(null, null, 2131749565, it7.l(tL_messageActionStarGiftOnchainOffer.amount), i3));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131749566, null), new fd() { // from class: us7
            @Override // fd
            public final void w(id idVar2, int i4) {
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = tL_messageActionStarGiftOnchainOffer;
                long j = tL_messageActionStarGiftOnchainOffer2.offer_id;
                int i5 = i;
                boolean k = vs7.k(i5, j);
                d31 d31Var2 = d31Var;
                if (k) {
                    vs7.r(d31Var2);
                    return;
                }
                if (vs7.m(i5, tL_messageActionStarGiftOnchainOffer2.offer_id)) {
                    return;
                }
                String a2 = vs7.a(i5, tL_messageActionStarGiftOnchainOffer2.offer_id);
                vs7.c.put(a2, Long.valueOf(SystemClock.elapsedRealtime() + 30000));
                vs7.c();
                TL_stars.declineStarGiftOnchainOffer declinestargiftonchainoffer = new TL_stars.declineStarGiftOnchainOffer();
                declinestargiftonchainoffer.offer_msg_id = i2;
                ConnectionsManager.getInstance(i5).sendRequestTyped(declinestargiftonchainoffer, new ic((byte) 0), new b55(a2, i5, is7Var, context, vnbVar, d31Var2));
            }
        });
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public static void f(Activity activity, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, vnb vnbVar, d31 d31Var) {
        e(i, i2, d31Var, null, vnbVar, activity, tL_messageActionStarGiftOnchainOffer);
    }

    public static void g(long j) {
        a.remove(Long.valueOf(j));
        b.remove(Long.valueOf(j));
        c();
    }

    public static d31 h() {
        e S = LaunchActivity.S();
        return S != null ? d31.b0(S) : d31.Y();
    }

    public static boolean i(int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        boolean z = tL_messageActionStarGiftOnchainOffer.buyer;
        return z ? (!z || tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.declined || tL_messageActionStarGiftOnchainOffer.cancelled || tL_messageActionStarGiftOnchainOffer.expired || tL_messageActionStarGiftOnchainOffer.settled || tL_messageActionStarGiftOnchainOffer.cancelling) ? false : true : n(i, tL_messageActionStarGiftOnchainOffer);
    }

    public static void j(long j, long j2) {
        a.put(Long.valueOf(j), Long.valueOf(j2 != Long.MAX_VALUE ? SystemClock.elapsedRealtime() + j2 : Long.MAX_VALUE));
        c();
    }

    public static boolean k(int i, long j) {
        String a2 = a(i, j);
        HashMap hashMap = d;
        Long l = (Long) hashMap.get(a2);
        if (l == null) {
            return false;
        }
        if (l.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i, j));
        return false;
    }

    public static boolean l(int i, long j) {
        Long l = (Long) a.get(Long.valueOf(j));
        return (l != null && l.longValue() > SystemClock.elapsedRealtime()) || k(i, j) || m(i, j);
    }

    public static boolean m(int i, long j) {
        String a2 = a(i, j);
        HashMap hashMap = c;
        Long l = (Long) hashMap.get(a2);
        if (l == null) {
            return false;
        }
        if (l.longValue() > SystemClock.elapsedRealtime()) {
            return true;
        }
        hashMap.remove(a(i, j));
        return false;
    }

    public static boolean n(int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        return (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.declined || tL_messageActionStarGiftOnchainOffer.cancelled || tL_messageActionStarGiftOnchainOffer.expired || tL_messageActionStarGiftOnchainOffer.settled || tL_messageActionStarGiftOnchainOffer.cancelling || tL_messageActionStarGiftOnchainOffer.expires_at <= ConnectionsManager.getInstance(i).getCurrentTime()) ? false : true;
    }

    public static boolean o(TLRPC.Message message) {
        TLRPC.MessageReplyHeader messageReplyHeader;
        return (message == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) || (messageReplyHeader = message.reply_to) == null || messageReplyHeader.reply_to_msg_id == 0) ? false : true;
    }

    public static a35 p(Context context, vnb vnbVar, d31 d31Var, int i, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx) {
        try {
            return a35.b(tL_payments_starGiftOnchainOfferTx.message);
        } catch (Exception e) {
            cc4.g(e, true);
            it7.t(context, i, vnbVar, d31Var, "WALLET_UNSUPPORTED_SEND_MODE", null);
            return null;
        }
    }

    public static SpannableStringBuilder q(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        ArrayList arrayList = new ArrayList();
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? it7.i(starGift) : "").replace(' ', (char) 160);
        String replace2 = it7.l(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        boolean z = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            if (z) {
                arrayList.add(hl.S2(ob6.a0(null, null, 2131749549, replace2, replace)));
            } else if (tL_messageActionStarGiftOnchainOffer.declined) {
                arrayList.add(hl.S2(ob6.a0(null, null, 2131749548, replace2, replace)));
            } else if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                arrayList.add(hl.S2(ob6.a0(null, null, 2131749545, replace2, replace)));
            }
            if (!z && (tL_messageActionStarGiftOnchainOffer.flags & 16) != 0) {
                arrayList.add(hl.S2(ob6.a0(null, null, 2131749546, it7.l(tL_messageActionStarGiftOnchainOffer.buyer_refund).replace(' ', (char) 160))));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled && (tL_messageActionStarGiftOnchainOffer.flags & 32) != 0) {
                long j = tL_messageActionStarGiftOnchainOffer.fine;
                if (j > 0) {
                    arrayList.add(hl.S2(ob6.a0(null, null, 2131749547, it7.l(j).replace(' ', (char) 160))));
                }
            }
        } else if (z) {
            arrayList.add(ob6.M0(2131749544, null));
            arrayList.add(hl.S2(ob6.a0(null, null, 2131749542, replace, replace2)));
        } else if (tL_messageActionStarGiftOnchainOffer.declined) {
            arrayList.add(ob6.M0(2131749543, null));
        }
        if (arrayList.isEmpty()) {
            return t(tL_messageActionStarGiftOnchainOffer);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i));
        }
        return spannableStringBuilder;
    }

    public static void r(d31 d31Var) {
        if (d31Var == null) {
            d31Var = h();
        }
        bs2.v(null, 2131749573, d31Var, R.raw.error, 36);
    }

    public static void s(int i, TL_stars.StarGift starGift) {
        hl.c3(new os7(i, starGift != null ? it7.i(starGift) : ""));
    }

    public static SpannableStringBuilder t(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? it7.i(starGift) : "").replace(' ', (char) 160);
        String replace2 = it7.l(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        boolean z = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        boolean z2 = tL_messageActionStarGiftOnchainOffer.buyer;
        if (z2) {
            if (z) {
                return hl.S2(ob6.a0(null, null, 2131749549, replace2, replace));
            }
            if (tL_messageActionStarGiftOnchainOffer.declined) {
                return hl.S2(ob6.a0(null, null, 2131749548, replace2, replace));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                return hl.S2(ob6.a0(null, null, 2131749545, replace2, replace));
            }
        } else if (z) {
            return hl.S2(ob6.a0(null, null, 2131749542, replace, replace2));
        }
        int i = tL_messageActionStarGiftOnchainOffer.declined ? 2131749516 : tL_messageActionStarGiftOnchainOffer.cancelled ? 2131749517 : tL_messageActionStarGiftOnchainOffer.expired ? z2 ? 2131749515 : 2131749518 : 0;
        return i == 0 ? d(tL_messageActionStarGiftOnchainOffer) : hl.S2(ob6.a0(null, null, i, replace2, replace));
    }
}
