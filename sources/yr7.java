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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class yr7 {
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
        nm7.e().k(nm7.L3, new Object[0]);
    }

    public static SpannableStringBuilder d(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? fs7.h(starGift) : "").replace(' ', (char) 160);
        String replace2 = fs7.k(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            return gm.S2(jb6.a0(null, null, 2131749529, replace2, replace));
        }
        String t = fs7.t(tL_messageActionStarGiftOnchainOffer.amount);
        String replace3 = t == null ? null : t.replace(' ', (char) 160);
        return gm.S2(replace3 != null ? jb6.a0(null, null, 2131749540, replace2, replace3, replace) : jb6.a0(null, null, 2131749539, replace2, replace));
    }

    public static void e(final int i, final int i2, final c41 c41Var, final lr7 lr7Var, final ylb ylbVar, final Context context, final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        if (k(i, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            r(c41Var);
            return;
        }
        if (m(i, tL_messageActionStarGiftOnchainOffer.offer_id)) {
            return;
        }
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String h = starGift != null ? fs7.h(starGift) : "";
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131749552, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0(null, null, 2131749553, fs7.k(tL_messageActionStarGiftOnchainOffer.amount), h));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131749554, null), new ee() { // from class: xr7
            @Override // ee
            public final void r(he heVar2, int i3) {
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = tL_messageActionStarGiftOnchainOffer;
                long j = tL_messageActionStarGiftOnchainOffer2.offer_id;
                int i4 = i;
                boolean k = yr7.k(i4, j);
                c41 c41Var2 = c41Var;
                if (k) {
                    yr7.r(c41Var2);
                    return;
                }
                if (yr7.m(i4, tL_messageActionStarGiftOnchainOffer2.offer_id)) {
                    return;
                }
                String a2 = yr7.a(i4, tL_messageActionStarGiftOnchainOffer2.offer_id);
                yr7.c.put(a2, Long.valueOf(SystemClock.elapsedRealtime() + 30000));
                yr7.c();
                TL_stars.declineStarGiftOnchainOffer declinestargiftonchainoffer = new TL_stars.declineStarGiftOnchainOffer();
                declinestargiftonchainoffer.offer_msg_id = i2;
                ConnectionsManager.getInstance(i4).sendRequestTyped(declinestargiftonchainoffer, new kc((byte) 0), new e55(a2, i4, lr7Var, context, ylbVar, c41Var2));
            }
        });
        alertDialog$Builder.c(-1);
        alertDialog$Builder.o();
    }

    public static void f(Activity activity, int i, int i2, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, ylb ylbVar, c41 c41Var) {
        e(i, i2, c41Var, null, ylbVar, activity, tL_messageActionStarGiftOnchainOffer);
    }

    public static void g(long j) {
        a.remove(Long.valueOf(j));
        b.remove(Long.valueOf(j));
        c();
    }

    public static c41 h() {
        d S = LaunchActivity.S();
        return S != null ? c41.b0(S) : c41.Y();
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

    public static w25 p(Context context, ylb ylbVar, c41 c41Var, int i, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx) {
        try {
            return w25.b(tL_payments_starGiftOnchainOfferTx.message);
        } catch (Exception e) {
            fc4.g(e, true);
            fs7.q(context, i, ylbVar, c41Var, "WALLET_UNSUPPORTED_SEND_MODE", null);
            return null;
        }
    }

    public static SpannableStringBuilder q(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        ArrayList arrayList = new ArrayList();
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? fs7.h(starGift) : "").replace(' ', (char) 160);
        String replace2 = fs7.k(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        boolean z = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        if (tL_messageActionStarGiftOnchainOffer.buyer) {
            if (z) {
                arrayList.add(gm.S2(jb6.a0(null, null, 2131749537, replace2, replace)));
            } else if (tL_messageActionStarGiftOnchainOffer.declined) {
                arrayList.add(gm.S2(jb6.a0(null, null, 2131749536, replace2, replace)));
            } else if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                arrayList.add(gm.S2(jb6.a0(null, null, 2131749533, replace2, replace)));
            }
            if (!z && (tL_messageActionStarGiftOnchainOffer.flags & 16) != 0) {
                arrayList.add(gm.S2(jb6.a0(null, null, 2131749534, fs7.k(tL_messageActionStarGiftOnchainOffer.buyer_refund).replace(' ', (char) 160))));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled && (tL_messageActionStarGiftOnchainOffer.flags & 32) != 0) {
                long j = tL_messageActionStarGiftOnchainOffer.fine;
                if (j > 0) {
                    arrayList.add(gm.S2(jb6.a0(null, null, 2131749535, fs7.k(j).replace(' ', (char) 160))));
                }
            }
        } else if (z) {
            arrayList.add(jb6.M0(2131749532, null));
            arrayList.add(gm.S2(jb6.a0(null, null, 2131749530, replace, replace2)));
        } else if (tL_messageActionStarGiftOnchainOffer.declined) {
            arrayList.add(jb6.M0(2131749531, null));
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

    public static void r(c41 c41Var) {
        if (c41Var == null) {
            c41Var = h();
        }
        ts2.u(null, 2131749561, c41Var, R.raw.error, 36);
    }

    public static void s(int i, TL_stars.StarGift starGift) {
        gm.c3(new rr7(i, starGift != null ? fs7.h(starGift) : ""));
    }

    public static SpannableStringBuilder t(TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
        String replace = (starGift != null ? fs7.h(starGift) : "").replace(' ', (char) 160);
        String replace2 = fs7.k(tL_messageActionStarGiftOnchainOffer.amount).replace(' ', (char) 160);
        boolean z = tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled;
        boolean z2 = tL_messageActionStarGiftOnchainOffer.buyer;
        if (z2) {
            if (z) {
                return gm.S2(jb6.a0(null, null, 2131749537, replace2, replace));
            }
            if (tL_messageActionStarGiftOnchainOffer.declined) {
                return gm.S2(jb6.a0(null, null, 2131749536, replace2, replace));
            }
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                return gm.S2(jb6.a0(null, null, 2131749533, replace2, replace));
            }
        } else if (z) {
            return gm.S2(jb6.a0(null, null, 2131749530, replace, replace2));
        }
        int i = tL_messageActionStarGiftOnchainOffer.declined ? 2131749504 : tL_messageActionStarGiftOnchainOffer.cancelled ? 2131749505 : tL_messageActionStarGiftOnchainOffer.expired ? z2 ? 2131749503 : 2131749506 : 0;
        return i == 0 ? d(tL_messageActionStarGiftOnchainOffer) : gm.S2(jb6.a0(null, null, i, replace2, replace));
    }
}
