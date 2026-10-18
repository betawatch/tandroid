package zh;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.iq;
import yh.u3;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i0 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final g0 F;
    public final g0 G;
    public TLRPC.ShareTheme H;
    public final int a;
    public final t0 b;
    public final h0 c;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [zh.g0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zh.g0] */
    public i0(int i10, t0 t0Var, h0 h0Var) {
        final int i11 = 0;
        this.F = new Runnable(this) { // from class: zh.g0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.j();
                        break;
                    default:
                        this.b.i();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.G = new Runnable(this) { // from class: zh.g0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.j();
                        break;
                    default:
                        this.b.i();
                        break;
                }
            }
        };
        this.a = i10;
        this.b = t0Var;
        this.c = h0Var;
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        t0 t0Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = t0Var.v1;
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
                q0 q0Var = t0Var.F;
                if (q0Var.a == 2 && q0Var.q == i10) {
                    return;
                }
                t0Var.d2 = true;
                t0Var.I.clear();
                Runnable runnable = t0Var.c2;
                if (runnable != null) {
                    runnable.run();
                }
                t0Var.M7 = i10;
                t0Var.O7 = t0Var.e2 ? 1.0f : 0.0f;
                t0Var.P7 = 1.0f;
                t0Var.I0(t0Var.getWidth() / 2.0f, (t0Var.l() / 2.0f) + t0Var.m(), i10);
                t0Var.d2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            t0Var.d(t0.H9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i11 = tL_shareThemeEmojiBackdrop.flags;
        t0Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i11 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i11 & 1) != 0);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken b() {
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

    public final String c(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        h0 h0Var = this.c;
        String str = h0Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || h0Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    public final TLRPC.InputPeer d() {
        h0 h0Var = this.c;
        if (h0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.a).getInputPeer(h0Var.f);
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return inputPeer;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            k();
        }
    }

    public final void e() {
        TLRPC.TL_messages_getShareTheme tL_messages_getShareTheme = new TLRPC.TL_messages_getShareTheme();
        TLRPC.InputPeer d = d();
        tL_messages_getShareTheme.peer = d;
        if (d == null) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getShareTheme, new org.telegram.messenger.a(), new u3(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat;
        this.x = true;
        boolean z10 = false;
        this.y = false;
        h0 h0Var = this.c;
        if (h0Var.g) {
            t0 t0Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = t0Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = t0Var.getPickedEmoji();
            g0 g0Var = this.G;
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            if (themeGift == null) {
                int themeBackdropIndex = t0Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != t0.H9) {
                    z10 = true;
                }
                if (z10 && a.h == null) {
                    this.v = null;
                    AndroidUtilities.cancelRunOnUIThread(g0Var);
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
            } else if (h0Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                    if (tL_inputSavedStarGiftChat != null) {
                        this.v = null;
                        AndroidUtilities.cancelRunOnUIThread(g0Var);
                        return;
                    } else {
                        ?? tL_inputShareThemeGift = new TLRPC.TL_inputShareThemeGift();
                        tL_inputShareThemeGift.stargift = tL_inputSavedStarGiftChat;
                        tL_shareThemeGift2 = new TLRPC.TL_shareThemeGift();
                        tL_shareThemeGift2.stargift = themeGift;
                        tL_shareThemeGift = tL_inputShareThemeGift;
                    }
                }
                tL_inputSavedStarGiftChat = null;
                if (tL_inputSavedStarGiftChat != null) {
                }
            } else {
                long themeGiftSavedId = t0Var.getThemeGiftSavedId();
                TLRPC.InputPeer d = d();
                if (themeGiftSavedId != 0 && d != null) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat2.peer = d;
                    tL_inputSavedStarGiftChat2.saved_id = themeGiftSavedId;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftChat2;
                    if (tL_inputSavedStarGiftChat != null) {
                    }
                }
                tL_inputSavedStarGiftChat = null;
                if (tL_inputSavedStarGiftChat != null) {
                }
            }
            if (tL_shareThemeGift2 == null) {
                tL_shareThemeGift2 = tL_shareThemeGift;
            }
            this.H = tL_shareThemeGift2;
            u0[] u0VarArr = u0.d;
            int i10 = this.a;
            if (u0VarArr[i10] == null) {
                u0VarArr[i10] = new u0(i10);
            }
            u0VarArr[i10].a(h0Var.f, this.H);
            this.v = tL_shareThemeGift;
            AndroidUtilities.cancelRunOnUIThread(g0Var);
            AndroidUtilities.runOnUIThread(g0Var, 700L);
        }
    }

    public final void g() {
        this.E = true;
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        AndroidUtilities.cancelRunOnUIThread(this.F);
        AndroidUtilities.cancelRunOnUIThread(this.G);
        i();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void h(boolean z10, boolean z11) {
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

    public final void i() {
        if (this.v == null) {
            return;
        }
        TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
        TLRPC.InputPeer d = d();
        tL_messages_setShareTheme.peer = d;
        tL_messages_setShareTheme.theme = this.v;
        this.v = null;
        if (d == null) {
            return;
        }
        int i10 = this.w;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.w, true);
        }
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_setShareTheme, new org.telegram.messenger.a(), new s1(8, this, r1));
        this.w = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void j() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        g0 g0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(g0Var);
        if (this.E) {
            return;
        }
        int i10 = this.d;
        int i11 = this.a;
        if (i10 == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(i11).getCurrentTime() >= this.f.expires - 5))) {
            h(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            this.s = SystemClock.elapsedRealtime();
            MessagesController.getInstance(i11).requestContactToken(new g(this, 3));
        }
        AndroidUtilities.runOnUIThread(g0Var, 1000L);
    }

    public final void k() {
        long j10;
        int i10 = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i10).getGlobalPrivacySettings();
        if (globalPrivacySettings == null) {
            ContactsController.getInstance(i10).loadGlobalPrivacySetting();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        t0 t0Var = this.b;
        t0Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            t0Var.v0 = true;
            t0Var.w0 = false;
            t0Var.B0 = 1.0f;
            t0Var.D0 = 1.0f;
            t0Var.C0 = 1.0f;
            t0Var.F0 = true;
            t0Var.G0 = 1.0f;
            t0Var.y2 = null;
            t0Var.z2 = -1;
            t0Var.t1(false);
            t0Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken b10 = b();
            this.f = b10;
            if (b10 != null) {
                t0Var.setFreeLink(c(b10));
            }
            h(false, false);
        }
    }
}
