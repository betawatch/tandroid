package qh;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.qj;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.s2;
import org.telegram.ui.nq;
import ph.h1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 implements us {
    public static final LongSparseArray[] I = new LongSparseArray[4];
    public boolean D;
    public boolean E;
    public final j0 F;
    public final j0 G;
    public TLRPC.ShareTheme H;
    public final int a;
    public final x0 b;
    public final k0 c;
    public int d = 0;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v1, types: [qh.j0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [qh.j0] */
    public m0(int i10, x0 x0Var, k0 k0Var) {
        final int i11 = 0;
        this.F = new Runnable(this) { // from class: qh.j0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.G = new Runnable(this) { // from class: qh.j0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.a = i10;
        this.b = x0Var;
        this.c = k0Var;
    }

    public static LongSparseArray h(int i10) {
        LongSparseArray[] longSparseArrayArr = I;
        if (longSparseArrayArr[i10] == null) {
            longSparseArrayArr[i10] = new LongSparseArray();
        }
        return longSparseArrayArr[i10];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.H = shareTheme;
        boolean z10 = shareTheme instanceof TLRPC.TL_shareThemeGift;
        x0 x0Var = this.b;
        if (z10) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = x0Var.v1;
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
                u0 u0Var = x0Var.F;
                if (u0Var.a == 2 && u0Var.q == i10) {
                    return;
                }
                x0Var.e2 = true;
                x0Var.I.clear();
                Runnable runnable = x0Var.d2;
                if (runnable != null) {
                    runnable.run();
                }
                x0Var.L7 = i10;
                x0Var.N7 = x0Var.f2 ? 1.0f : 0.0f;
                x0Var.O7 = 1.0f;
                x0Var.I0(x0Var.getWidth() / 2.0f, (x0Var.l() / 2.0f) + x0Var.m(), i10);
                x0Var.e2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            x0Var.d(x0.G9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i11 = tL_shareThemeEmojiBackdrop.flags;
        x0Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i11 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i11 & 1) != 0);
    }

    public final void b() {
        this.w = null;
        org.telegram.messenger.i0.r(this.G);
        int i10 = this.a;
        LongSparseArray h = h(i10);
        long j10 = this.c.f;
        l0 l0Var = (l0) h.get(j10);
        if (l0Var == null || l0Var.b != 0) {
            return;
        }
        h(i10).remove(j10);
    }

    public final TLRPC.TL_exportedNoPaidMessagesToken c() {
        String string = f().getString("qrNoPaidToken", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = new TLRPC.TL_exportedNoPaidMessagesToken();
        tL_exportedNoPaidMessagesToken.token = string;
        tL_exportedNoPaidMessagesToken.url = f().getString("qrNoPaidUrl", null);
        return tL_exportedNoPaidMessagesToken;
    }

    public final String d(TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken) {
        k0 k0Var = this.c;
        String str = k0Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || k0Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j10 = this.c.f;
        if (i10 == zs.k0) {
            r();
            return;
        }
        if (i10 == zs.E0) {
            if (((Long) objArr[0]).longValue() == j10) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i10 == zs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == j10) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        k0 k0Var = this.c;
        if (k0Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer i12 = vp.r1(this.a).i1(k0Var.f);
        if (i12 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return i12;
    }

    public final SharedPreferences f() {
        return vp.r1(this.a).f7;
    }

    public final void g() {
        int i10 = this.a;
        vp r12 = vp.r1(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
            if (Z1 == null) {
                return;
            }
            zs.f(i10).c(this, zs.E0);
            r12.e3(Z1, true, 0);
            return;
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        if (L0 == null) {
            return;
        }
        zs.f(i10).c(this, zs.T);
        hs.a0(i10).F0(L0.id, w3.T(L0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j10 = this.c.f;
        if (this.E) {
            return;
        }
        if (shareTheme == null) {
            shareTheme = new TLRPC.TL_shareThemeDefault();
        }
        int i10 = this.a;
        l0 l0Var = (l0) h(i10).get(j10);
        if (l0Var != null) {
            TLRPC.ShareTheme shareTheme2 = l0Var.a;
            byte[] q6 = q(shareTheme);
            byte[] q10 = q(shareTheme2);
            if (q6 != null && Arrays.equals(q6, q10)) {
                h(i10).remove(j10);
            } else {
                if (l0Var.b == 0 || SystemClock.elapsedRealtime() - l0Var.b < 10000) {
                    k(l0Var.a);
                    return;
                }
                h(i10).remove(j10);
            }
        }
        if (this.y) {
            return;
        }
        TLRPC.ShareTheme shareTheme3 = this.H;
        if (shareTheme3 == null) {
            x0 x0Var = this.b;
            x0Var.setInstantTheme(true);
            a(shareTheme);
            x0Var.setInstantTheme(false);
            return;
        }
        byte[] q11 = q(shareTheme);
        byte[] q12 = q(shareTheme3);
        if (q11 == null || !Arrays.equals(q11, q12)) {
            a(shareTheme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.y = true;
        boolean z10 = false;
        this.D = false;
        k0 k0Var = this.c;
        if (k0Var.g) {
            x0 x0Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = x0Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = x0Var.getPickedEmoji();
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            r6 = null;
            r6 = null;
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
            tL_shareThemeGift2 = null;
            if (themeGift != null) {
                if (!k0Var.e) {
                    long themeGiftSavedId = x0Var.getThemeGiftSavedId();
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
                int themeBackdropIndex = x0Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != x0.G9) {
                    z10 = true;
                }
                if (z10 && a.h == null) {
                    b();
                    this.D = true;
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
            l0 l0Var = new l0();
            l0Var.a = tL_shareThemeGift2;
            h(this.a).put(k0Var.f, l0Var);
            k(this.H);
            this.w = tL_shareThemeGift;
            j0 j0Var = this.G;
            org.telegram.messenger.i0.r(j0Var);
            org.telegram.messenger.i0.h3(j0Var, 700L);
        }
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i10 = this.a;
        vp r12 = vp.r1(i10);
        long j10 = this.c.f;
        if (j10 > 0) {
            TLRPC.UserFull a2 = r12.a2(j10);
            if (a2 != null) {
                a2.share_theme = shareTheme;
                hs.a0(i10).j2(a2, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull M0 = r12.M0(-j10);
        if (M0 != null) {
            M0.share_theme = shareTheme;
            hs.a0(i10).N1(M0, false);
        }
    }

    public final void l() {
        this.E = true;
        int i10 = this.a;
        zs.f(i10).n(this, zs.k0);
        zs.f(i10).n(this, zs.E0);
        zs.f(i10).n(this, zs.T);
        org.telegram.messenger.i0.r(this.F);
        org.telegram.messenger.i0.r(this.G);
        o();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void m() {
        this.s = SystemClock.elapsedRealtime();
        vp r12 = vp.r1(this.a);
        h1 h1Var = new h1(this, 6);
        if (r12.X7) {
            return;
        }
        if (r12.Y7 != null && r0.expires > System.currentTimeMillis() / 1000) {
            h1Var.a(r12.Y7);
            return;
        }
        r12.X7 = true;
        r12.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new qj(r12, h1Var, System.currentTimeMillis(), 7));
    }

    public final void n(boolean z10, boolean z11) {
        int i10 = this.n;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z10;
        tL_contacts_exportNoPaidMessagesToken.temporary = z11;
        int sendRequestTyped = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new a3.b(1), new nq(this, r6, z11, 1));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.w == null) {
            return;
        }
        TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
        TLRPC.InputPeer e = e();
        tL_messages_setShareTheme.peer = e;
        tL_messages_setShareTheme.theme = this.w;
        this.w = null;
        if (e == null) {
            return;
        }
        int i10 = this.x;
        int i11 = this.a;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.x, true);
        }
        LongSparseArray h = h(i11);
        k0 k0Var = this.c;
        l0 l0Var = (l0) h.get(k0Var.f);
        long j10 = k0Var.f;
        int i12 = this.a;
        int sendRequestTyped = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_setShareTheme, new a3.b(1), new s2(this, r7, l0Var, i12, j10));
        this.x = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        j0 j0Var = this.F;
        org.telegram.messenger.i0.r(j0Var);
        if (this.E) {
            return;
        }
        if (this.d == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.f.expires - 5))) {
            n(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            m();
        }
        org.telegram.messenger.i0.h3(j0Var, 1000L);
    }

    public final void r() {
        long j10;
        int i10 = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i10).X;
        if (globalPrivacySettings == null) {
            i5.r(i10).B();
            j10 = 0;
        } else {
            j10 = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        x0 x0Var = this.b;
        x0Var.setFeeStars(j10);
        if (j10 <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
            this.d = 2;
            x0Var.v0 = true;
            x0Var.w0 = false;
            x0Var.B0 = 1.0f;
            x0Var.D0 = 1.0f;
            x0Var.C0 = 1.0f;
            x0Var.F0 = true;
            x0Var.G0 = 1.0f;
            x0Var.z2 = null;
            x0Var.A2 = -1;
            x0Var.u1(false);
            x0Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken c10 = c();
            this.f = c10;
            if (c10 != null) {
                x0Var.setFreeLink(d(c10));
            }
            n(false, false);
        }
    }
}
