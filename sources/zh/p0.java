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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class p0 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final n0 F;
    public final n0 G;
    public TLRPC.ShareTheme H;
    public final int a;
    public final b1 b;
    public final o0 c;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [zh.n0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zh.n0] */
    public p0(int i10, b1 b1Var, o0 o0Var) {
        final int i11 = 0;
        this.F = new Runnable(this) { // from class: zh.n0
            public final /* synthetic */ p0 b;

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
        this.G = new Runnable(this) { // from class: zh.n0
            public final /* synthetic */ p0 b;

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
        this.b = b1Var;
        this.c = o0Var;
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        int i10 = -1;
        int i11 = 0;
        b1 b1Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = b1Var.v1;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i12)).id == tL_starGiftUnique.id) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                }
                if (i10 < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i10 = 0;
                }
                y0 y0Var = b1Var.F;
                if (y0Var.a == 2 && y0Var.j == i10) {
                    return;
                }
                b1Var.e2 = true;
                b1Var.I.clear();
                Runnable runnable = b1Var.d2;
                if (runnable != null) {
                    runnable.run();
                }
                b1Var.v7 = i10;
                b1Var.x7 = b1Var.f2 ? 1.0f : 0.0f;
                b1Var.y7 = 1.0f;
                b1Var.E0(b1Var.getWidth() / 2.0f, (b1Var.l() / 2.0f) + b1Var.m(), i10);
                b1Var.e2 = false;
                return;
            }
        }
        if (shareTheme instanceof TLRPC.TL_shareThemeBackdrop) {
            int i13 = ((TLRPC.TL_shareThemeBackdrop) shareTheme).backdrop_id;
            b1Var.getClass();
            if (a.h != null) {
                while (true) {
                    int[] iArr = a.h;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    if (iArr[i11] == i13) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
            }
            if (i10 < 0) {
                i10 = b1.q9;
            }
            b1Var.c(i10);
            return;
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmoji)) {
            b1Var.c(b1.q9);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_shareThemeEmoji) shareTheme).emojis;
        int size = arrayList3.size();
        while (i11 < size) {
            TLRPC.Reaction reaction = arrayList3.get(i11);
            i11++;
            TLRPC.Reaction reaction2 = reaction;
            if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                arrayList2.add(Long.valueOf(((TLRPC.TL_reactionCustomEmoji) reaction2).document_id));
            }
        }
        if (arrayList2.isEmpty()) {
            b1Var.c(b1.q9);
        } else {
            b1Var.d(arrayList2);
        }
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
        o0 o0Var = this.c;
        String str = o0Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || o0Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    public final TLRPC.InputPeer d() {
        o0 o0Var = this.c;
        if (o0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.a).getInputPeer(o0Var.f);
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
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeBackdrop] */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmoji] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r1v8, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        ?? tL_shareThemeBackdrop;
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat;
        this.x = true;
        int i10 = 0;
        this.y = false;
        o0 o0Var = this.c;
        if (o0Var.g) {
            b1 b1Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = b1Var.getThemeGift();
            ArrayList<Long> pickedCustomEmoji = b1Var.getPickedCustomEmoji();
            n0 n0Var = this.G;
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            if (themeGift == null) {
                if (pickedCustomEmoji.isEmpty()) {
                    int themeBackdropIndex = b1Var.getThemeBackdropIndex();
                    if (themeBackdropIndex < 0 || themeBackdropIndex == b1.q9) {
                        tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
                    } else {
                        if (a.h == null) {
                            this.v = null;
                            AndroidUtilities.cancelRunOnUIThread(n0Var);
                            this.y = true;
                            return;
                        }
                        tL_shareThemeBackdrop = new TLRPC.TL_shareThemeBackdrop();
                        tL_shareThemeBackdrop.backdrop_id = a.h[themeBackdropIndex];
                    }
                } else {
                    tL_shareThemeBackdrop = new TLRPC.TL_shareThemeEmoji();
                    int size = pickedCustomEmoji.size();
                    while (i10 < size) {
                        Long l4 = pickedCustomEmoji.get(i10);
                        i10++;
                        long longValue = l4.longValue();
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = longValue;
                        tL_shareThemeBackdrop.emojis.add(tL_reactionCustomEmoji);
                    }
                }
                tL_shareThemeGift = tL_shareThemeBackdrop;
            } else if (o0Var.e) {
                if (!TextUtils.isEmpty(themeGift.slug)) {
                    ?? tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = themeGift.slug;
                    tL_inputSavedStarGiftChat = tL_inputSavedStarGiftSlug;
                    if (tL_inputSavedStarGiftChat != null) {
                        this.v = null;
                        AndroidUtilities.cancelRunOnUIThread(n0Var);
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
                long themeGiftSavedId = b1Var.getThemeGiftSavedId();
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
            c1[] c1VarArr = c1.d;
            int i11 = this.a;
            if (c1VarArr[i11] == null) {
                c1VarArr[i11] = new c1(i11);
            }
            c1VarArr[i11].a(o0Var.f, this.H);
            this.v = tL_shareThemeGift;
            AndroidUtilities.cancelRunOnUIThread(n0Var);
            AndroidUtilities.runOnUIThread(n0Var, 700L);
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
        n0 n0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(n0Var);
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
            MessagesController.getInstance(i11).requestContactToken(new m(this, 3));
        }
        AndroidUtilities.runOnUIThread(n0Var, 1000L);
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
        b1 b1Var = this.b;
        b1Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && MessagesController.getMainSettings(i10).getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            b1Var.v0 = true;
            b1Var.w0 = false;
            b1Var.B0 = 1.0f;
            b1Var.D0 = 1.0f;
            b1Var.C0 = 1.0f;
            b1Var.F0 = true;
            b1Var.G0 = 1.0f;
            b1Var.z2 = null;
            b1Var.A2 = -1;
            b1Var.n1(false);
            b1Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken b10 = b();
            this.f = b10;
            if (b10 != null) {
                b1Var.setFreeLink(c(b10));
            }
            h(false, false);
        }
    }
}
