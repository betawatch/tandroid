package zh;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.z2;
import org.telegram.ui.iq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean E;
    public final o0 F;
    public final o0 G;
    public TLRPC.ShareTheme H;
    public final int a;
    public final c1 b;
    public final p0 c;
    public int d = 0;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme v;
    public int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v1, types: [zh.o0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zh.o0] */
    public r0(int i10, c1 c1Var, p0 p0Var) {
        final int i11 = 0;
        this.F = new Runnable(this) { // from class: zh.o0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.n();
                        break;
                    default:
                        this.b.m();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.G = new Runnable(this) { // from class: zh.o0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.n();
                        break;
                    default:
                        this.b.m();
                        break;
                }
            }
        };
        this.a = i10;
        this.b = c1Var;
        this.c = p0Var;
    }

    public static LongSparseArray g(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] o(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        c1 c1Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = c1Var.v1;
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        i10 = -1;
                        break;
                    } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i10)).id == tL_starGiftUnique.id) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                z0 z0Var = c1Var.F;
                if (z0Var.a == 2 && z0Var.q == i10) {
                    return;
                }
                c1Var.e2 = true;
                c1Var.I.clear();
                Runnable runnable = c1Var.d2;
                if (runnable != null) {
                    runnable.run();
                }
                c1Var.M7 = i10;
                c1Var.O7 = c1Var.f2 ? 1.0f : 0.0f;
                c1Var.P7 = 1.0f;
                c1Var.I0(c1Var.getWidth() / 2.0f, (c1Var.l() / 2.0f) + c1Var.m(), i10);
                c1Var.e2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            c1Var.d(c1.H9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i11 = tL_shareThemeEmojiBackdrop.flags;
        c1Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i11 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i11 & 1) != 0);
    }

    public final void b() {
        this.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
        int i10 = this.a;
        LongSparseArray g10 = g(i10);
        long j10 = this.c.f;
        q0 q0Var = (q0) g10.get(j10);
        if (q0Var == null || q0Var.b != 0) {
            return;
        }
        g(i10).remove(j10);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        int i10 = this.a;
        String string = MessagesController.getMainSettings(i10).getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = MessagesController.getMainSettings(i10).getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        p0 p0Var = this.c;
        String str = p0Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || p0Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            p();
            return;
        }
        int i12 = NotificationCenter.userInfoDidLoad;
        p0 p0Var = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == p0Var.f) {
                h(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == p0Var.f) {
            h(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        p0 p0Var = this.c;
        if (p0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.a).getInputPeer(p0Var.f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    public final void f() {
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            if (user == null) {
                return;
            }
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
            messagesController.loadUserInfo(user, true, 0);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
        MessagesStorage.getInstance(i10).loadChatInfo(chat.id, ChatObject.isChannel(chat), null, true, false);
    }

    public final void h(TLRPC.ShareTheme shareTheme) {
        long j10 = this.c.f;
        if (this.E) {
            return;
        }
        if (shareTheme == null) {
            shareTheme = new TLRPC.TL_shareThemeDefault();
        }
        int i10 = this.a;
        q0 q0Var = (q0) g(i10).get(j10);
        if (q0Var != null) {
            TLRPC.ShareTheme shareTheme2 = q0Var.a;
            byte[] o10 = o(shareTheme);
            byte[] o11 = o(shareTheme2);
            if (o10 != null && Arrays.equals(o10, o11)) {
                g(i10).remove(j10);
            } else {
                if (q0Var.b == 0 || SystemClock.elapsedRealtime() - q0Var.b < 10000) {
                    j(q0Var.a);
                    return;
                }
                g(i10).remove(j10);
            }
        }
        if (this.x) {
            return;
        }
        TLRPC.ShareTheme shareTheme3 = this.H;
        if (shareTheme3 == null) {
            c1 c1Var = this.b;
            c1Var.setInstantTheme(true);
            a(shareTheme);
            c1Var.setInstantTheme(false);
            return;
        }
        byte[] o12 = o(shareTheme);
        byte[] o13 = o(shareTheme3);
        if (o12 == null || !Arrays.equals(o12, o13)) {
            a(shareTheme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    public final void i() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.x = true;
        boolean z10 = false;
        this.y = false;
        p0 p0Var = this.c;
        if (p0Var.g) {
            c1 c1Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = c1Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = c1Var.getPickedEmoji();
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            r6 = null;
            r6 = null;
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
            tL_shareThemeGift2 = null;
            if (themeGift != null) {
                if (!p0Var.e) {
                    long themeGiftSavedId = c1Var.getThemeGiftSavedId();
                    TLRPC.InputPeer e = e();
                    if (themeGiftSavedId != 0 && e != null) {
                        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                        tL_inputSavedStarGiftChat2.peer = e;
                        tL_inputSavedStarGiftChat2.saved_id = themeGiftSavedId;
                        tL_inputSavedStarGiftChat = tL_inputSavedStarGiftChat2;
                    }
                } else if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                }
                if (tL_inputSavedStarGiftChat == null) {
                    b();
                    return;
                }
                ?? tL_inputShareThemeGift = new TLRPC.TL_inputShareThemeGift();
                tL_inputShareThemeGift.stargift = tL_inputSavedStarGiftChat;
                tL_shareThemeGift2 = new TLRPC.TL_shareThemeGift();
                tL_shareThemeGift2.stargift = themeGift;
                tL_shareThemeGift = tL_inputShareThemeGift;
            } else {
                int themeBackdropIndex = c1Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != c1.H9) {
                    z10 = true;
                }
                if (z10 && a.h == null) {
                    b();
                    this.y = true;
                    return;
                } else if (z10 || !pickedEmoji.isEmpty()) {
                    ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                    if (z10) {
                        tL_shareThemeEmojiBackdrop.flags = 1 | tL_shareThemeEmojiBackdrop.flags;
                        tL_shareThemeEmojiBackdrop.backdrop_id = a.h[themeBackdropIndex];
                    }
                    if (!pickedEmoji.isEmpty()) {
                        tL_shareThemeEmojiBackdrop.flags |= 2;
                        tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
                    }
                    tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
                } else {
                    tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
                }
            }
            if (tL_shareThemeGift2 == null) {
                tL_shareThemeGift2 = tL_shareThemeGift;
            }
            this.H = tL_shareThemeGift2;
            q0 q0Var = new q0();
            q0Var.a = tL_shareThemeGift2;
            g(this.a).put(p0Var.f, q0Var);
            j(this.H);
            this.v = tL_shareThemeGift;
            o0 o0Var = this.G;
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var, 700L);
        }
    }

    public final void j(TLRPC.ShareTheme shareTheme) {
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.UserFull userFull = messagesController.getUserFull(j10);
            if (userFull != null) {
                userFull.share_theme = shareTheme;
                MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = messagesController.getChatFull(-j10);
        if (chatFull != null) {
            chatFull.share_theme = shareTheme;
            MessagesStorage.getInstance(i10).updateChatInfo(chatFull, false);
        }
    }

    public final void k() {
        this.E = true;
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        m();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void l(boolean z10, boolean z11) {
        int i10 = this.n;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new org.telegram.messenger.a(), new iq(this, r6, z11, 1));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void m() {
        if (this.v == null) {
            return;
        }
        TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
        TLRPC.InputPeer e = e();
        tL_messages_setShareTheme.peer = e;
        tL_messages_setShareTheme.theme = this.v;
        this.v = null;
        if (e == null) {
            return;
        }
        int i10 = this.w;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.w, true);
        }
        LongSparseArray g10 = g(i11);
        p0 p0Var = this.c;
        q0 q0Var = (q0) g10.get(p0Var.f);
        long j10 = p0Var.f;
        int i12 = this.a;
        int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new org.telegram.messenger.a(), new z2(this, r7, q0Var, i12, j10));
        this.w = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void n() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        o0 o0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.a;
        if (i10 == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f.expires - 5))) {
            l(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            this.s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new g(this, 2));
        }
        AndroidUtilities.runOnUIThread(o0Var, 1000L);
    }

    public final void p() {
        long j10;
        int i10 = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        c1 c1Var = this.b;
        c1Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            c1Var.v0 = true;
            c1Var.w0 = false;
            c1Var.B0 = 1.0f;
            c1Var.D0 = 1.0f;
            c1Var.C0 = 1.0f;
            c1Var.F0 = true;
            c1Var.G0 = 1.0f;
            c1Var.z2 = null;
            c1Var.A2 = -1;
            c1Var.u1(false);
            c1Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
            this.f = c10;
            if (c10 != null) {
                c1Var.setFreeLink(d(c10));
            }
            l(false, false);
        }
    }
}
