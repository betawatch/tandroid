// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class pg3 {
    public static boolean A(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return false;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        return (tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000));
    }

    public static boolean B(long j) {
        return (4611686018427387904L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean C(long j) {
        return (2305843009213693952L & j) != 0 && (j & Long.MIN_VALUE) == 0;
    }

    public static boolean D(long j) {
        return (B(j) || C(j) || j <= 0) ? false : true;
    }

    public static long E(long j) {
        return (j & 4294967295L) | 4611686018427387904L;
    }

    public static long F(int i) {
        return i | 2305843009213693952L;
    }

    public static String G(ImageReceiver imageReceiver, pc0 pc0Var, TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return "";
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str = chat.title;
            if (pc0Var != null) {
                pc0Var.p(chat);
            }
            if (imageReceiver != null) {
                imageReceiver.U(tLObject, pc0Var, null);
            }
            return str;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (m9c.B(user)) {
            String M0 = jb6.M0(2131745999, null);
            if (pc0Var != null) {
                pc0Var.f(12);
            }
            if (imageReceiver != null) {
                imageReceiver.U(null, pc0Var, null);
            }
            return M0;
        }
        if (m9c.D(user)) {
            String M02 = jb6.M0(2131745635, null);
            if (pc0Var != null) {
                pc0Var.f(1);
            }
            if (imageReceiver != null) {
                imageReceiver.U(null, pc0Var, null);
            }
            return M02;
        }
        String r = m9c.r(user);
        if (pc0Var != null) {
            pc0Var.q(user);
        }
        if (imageReceiver != null) {
            imageReceiver.U(tLObject, pc0Var, null);
        }
        return r;
    }

    public static double H(String str, String str2) {
        if (str.length() < str2.length()) {
            str2 = str;
            str = str2;
        }
        int length = str.length();
        if (length == 0) {
            return 1.0d;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int[] iArr = new int[lowerCase2.length() + 1];
        for (int i = 0; i <= lowerCase.length(); i++) {
            int i2 = i;
            for (int i3 = 0; i3 <= lowerCase2.length(); i3++) {
                if (i == 0) {
                    iArr[i3] = i3;
                } else if (i3 > 0) {
                    int i4 = i3 - 1;
                    int i5 = iArr[i4];
                    if (lowerCase.charAt(i - 1) != lowerCase2.charAt(i4)) {
                        i5 = Math.min(Math.min(i5, i2), iArr[i3]) + 1;
                    }
                    iArr[i4] = i2;
                    i2 = i5;
                }
            }
            if (i > 0) {
                iArr[lowerCase2.length()] = i2;
            }
        }
        return (length - iArr[lowerCase2.length()]) / length;
    }

    public static boolean a(TLRPC.EmojiStatus emojiStatus, TLRPC.EmojiStatus emojiStatus2) {
        return f(emojiStatus) == f(emojiStatus2) && e(emojiStatus) == e(emojiStatus2) && g(emojiStatus) == g(emojiStatus2);
    }

    public static TLRPC.TL_username b(String str, ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
            if (tL_username != null && TextUtils.equals(tL_username.username, str)) {
                return tL_username;
            }
        }
        return null;
    }

    public static long c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).bot_verification_icon;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).bot_verification_icon;
        }
        return 0L;
    }

    public static long d(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return -((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static long e(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.collectible_id;
        }
        return 0L;
    }

    public static long f(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                return tL_emojiStatus.document_id;
            }
            return 0L;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0L;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
            return tL_emojiStatusCollectible.document_id;
        }
        return 0L;
    }

    public static int g(TLRPC.EmojiStatus emojiStatus) {
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0) {
                return tL_emojiStatus.until;
            }
            return 0;
        }
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return 0;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        if ((tL_emojiStatusCollectible.flags & 1) != 0) {
            return tL_emojiStatusCollectible.until;
        }
        return 0;
    }

    public static int h(long j) {
        return (int) (j & 4294967295L);
    }

    public static long i(TLRPC.Dialog dialog, TLRPC.DraftMessage draftMessage) {
        int i;
        return (draftMessage == null || (i = draftMessage.date) < dialog.last_message_date) ? dialog.last_message_date : i;
    }

    public static long j(TL_account.RequirementToContact requirementToContact) {
        if (requirementToContact instanceof TL_account.requirementToContactPaidMessages) {
            return ((TL_account.requirementToContactPaidMessages) requirementToContact).stars_amount;
        }
        return 0L;
    }

    public static String k(int i, long j) {
        return l(oc7.r1(i).a2(j));
    }

    public static String l(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? gm.C2(gm.A2(m9c.r((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
    }

    public static long m(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return 0L;
        }
        long j = inputPeer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = inputPeer.chat_id;
        return j2 != 0 ? -j2 : -inputPeer.channel_id;
    }

    public static long n(TLRPC.Peer peer) {
        if (peer == null) {
            return 0L;
        }
        long j = peer.user_id;
        if (j != 0) {
            return j;
        }
        long j2 = peer.chat_id;
        return j2 != 0 ? -j2 : -peer.channel_id;
    }

    public static String o(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                if (tL_username != null && ((tL_username.active || tL_username.editable) && !TextUtils.isEmpty(tL_username.username))) {
                    return tL_username.username;
                }
            }
        }
        TextUtils.isEmpty(str);
        return null;
    }

    public static String p(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str2 = chat.username;
            ArrayList<TLRPC.TL_username> arrayList = chat.usernames;
            return str == null ? o(str2, arrayList) : u(str2, arrayList, str);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        String str3 = user.username;
        ArrayList<TLRPC.TL_username> arrayList2 = user.usernames;
        return str == null ? o(str3, arrayList2) : u(str3, arrayList2, str);
    }

    public static String q(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            return o(chat.username, chat.usernames);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            return null;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return o(user.username, user.usernames);
    }

    public static String r(int i, long j) {
        return t(oc7.r1(i).a2(j));
    }

    public static String s(long j) {
        return t(oc7.r1(z8c.t0).a2(j));
    }

    public static String t(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? gm.C2(gm.A2(m9c.l((TLRPC.User) tLObject))) : tLObject instanceof TLRPC.Chat ? gm.C2(gm.A2(((TLRPC.Chat) tLObject).title)) : "";
    }

    public static String u(String str, ArrayList arrayList, String str2) {
        double d = -1.0d;
        String str3 = null;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                    double H = d < 0.0d ? 0.0d : H(tL_username.username, str2);
                    if (H > d) {
                        str3 = tL_username.username;
                        d = H;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if ((d >= 0.0d ? H(str, str2) : 0.0d) > d) {
                return str;
            }
        }
        return str3;
    }

    public static String v(long j) {
        int i = z8c.t0;
        TLObject a2 = oc7.r1(i).a2(j);
        if (a2 instanceof TLRPC.User) {
            return jb6.d0(i, (TLRPC.User) a2, null, null);
        }
        if (!(a2 instanceof TLRPC.Chat)) {
            return "";
        }
        TLRPC.Chat chat = (TLRPC.Chat) a2;
        if (chat.participants_count <= 1) {
            return sd2.V(chat) ? jb6.M0(2131751327, null) : jb6.M0(2131754876, null);
        }
        boolean V = sd2.V(chat);
        int i2 = chat.participants_count;
        return V ? jb6.H(',', "Subscribers", i2) : jb6.H(',', "Members", i2);
    }

    public static void w(TLRPC.Dialog dialog) {
        if (dialog == null || dialog.id != 0) {
            return;
        }
        if (!(dialog instanceof TLRPC.TL_dialog)) {
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                dialog.id = ((TLRPC.TL_dialogFolder) dialog).folder.id | 2305843009213693952L;
                return;
            } else {
                if (dialog instanceof TLRPC.TL_dialogCommunity) {
                    dialog.id = -dialog.community_id;
                    return;
                }
                return;
            }
        }
        TLRPC.Peer peer = dialog.peer;
        if (peer != null) {
            long j = peer.user_id;
            if (j != 0) {
                dialog.id = j;
                return;
            }
            long j2 = peer.chat_id;
            if (j2 != 0) {
                dialog.id = -j2;
            } else {
                dialog.id = -peer.channel_id;
            }
        }
    }

    public static boolean x(TLRPC.Dialog dialog) {
        return (dialog == null || (dialog.flags & 1) == 0) ? false : true;
    }

    public static boolean y(long j) {
        return (B(j) || C(j) || j >= 0) ? false : true;
    }

    public static boolean z() {
        TLRPC.User W1 = oc7.r1(z8c.t0).W1(0L);
        if (W1 == null) {
            return false;
        }
        return A(W1.emoji_status);
    }
}
