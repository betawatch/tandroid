// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vz8 implements fn7 {
    public static final LongSparseArray[] J = new LongSparseArray[4];
    public boolean E;
    public boolean F;
    public final sz8 G;
    public final sz8 H;
    public TLRPC.ShareTheme I;
    public final int a;
    public final g09 b;
    public final tz8 c;
    public byte d = 0;
    public boolean e;
    public TLRPC.TL_exportedNoPaidMessagesToken f;
    public long h;
    public int n;
    public TLRPC.TL_exportedContactToken r;
    public long s;
    public TLRPC.ShareTheme w;
    public int x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v1, types: [sz8] */
    /* JADX WARN: Type inference failed for: r1v0, types: [sz8] */
    public vz8(int i, g09 g09Var, tz8 tz8Var) {
        final byte b = 0;
        this.G = new Runnable(this) { // from class: sz8
            public final /* synthetic */ vz8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                vz8 vz8Var = this.b;
                switch (b2) {
                    case 0:
                        vz8Var.p();
                        break;
                    default:
                        vz8Var.o();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new Runnable(this) { // from class: sz8
            public final /* synthetic */ vz8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                vz8 vz8Var = this.b;
                switch (b22) {
                    case 0:
                        vz8Var.p();
                        break;
                    default:
                        vz8Var.o();
                        break;
                }
            }
        };
        this.a = i;
        this.b = g09Var;
        this.c = tz8Var;
    }

    public static LongSparseArray h(int i) {
        LongSparseArray[] longSparseArrayArr = J;
        if (longSparseArrayArr[i] == null) {
            longSparseArrayArr[i] = new LongSparseArray();
        }
        return longSparseArrayArr[i];
    }

    public static byte[] q(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void a(TLRPC.ShareTheme shareTheme) {
        this.I = shareTheme;
        boolean z = shareTheme instanceof TLRPC.TL_shareThemeGift;
        g09 g09Var = this.b;
        if (z) {
            TL_stars.StarGift starGift = ((TLRPC.TL_shareThemeGift) shareTheme).stargift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ArrayList arrayList = g09Var.w1;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        i = -1;
                        break;
                    } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i)).id == tL_starGiftUnique.id) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    arrayList.add(0, tL_starGiftUnique);
                    i = 0;
                }
                d09 d09Var = g09Var.G;
                if (d09Var.a == 2 && d09Var.q == i) {
                    return;
                }
                g09Var.f2 = true;
                g09Var.J.clear();
                Runnable runnable = g09Var.e2;
                if (runnable != null) {
                    runnable.run();
                }
                g09Var.L7 = i;
                g09Var.N7 = g09Var.g2 ? 1.0f : 0.0f;
                g09Var.O7 = 1.0f;
                g09Var.I0(g09Var.getWidth() / 2.0f, (g09Var.l() / 2.0f) + g09Var.m(), i);
                g09Var.f2 = false;
                return;
            }
        }
        if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop)) {
            g09Var.d(g09.F9);
            return;
        }
        TLRPC.TL_shareThemeEmojiBackdrop tL_shareThemeEmojiBackdrop = (TLRPC.TL_shareThemeEmojiBackdrop) shareTheme;
        int i2 = tL_shareThemeEmojiBackdrop.flags;
        g09Var.e(tL_shareThemeEmojiBackdrop.backdrop_id, (i2 & 2) != 0 ? tL_shareThemeEmojiBackdrop.emojis : null, (i2 & 1) != 0);
    }

    public final void b() {
        this.w = null;
        hl.r(this.H);
        int i = this.a;
        LongSparseArray h = h(i);
        long j = this.c.f;
        uz8 uz8Var = (uz8) h.get(j);
        if (uz8Var == null || uz8Var.b != 0) {
            return;
        }
        h(i).remove(j);
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
        tz8 tz8Var = this.c;
        String str = tz8Var.a;
        if (!TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url) || str == null || tz8Var.d) {
            if (TextUtils.isEmpty(tL_exportedNoPaidMessagesToken.url)) {
                return null;
            }
            return tL_exportedNoPaidMessagesToken.url;
        }
        return str + "?free=" + tL_exportedNoPaidMessagesToken.token;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        long j = this.c.f;
        if (i == jn7.k0) {
            r();
            return;
        }
        if (i == jn7.E0) {
            if (((Long) objArr[0]).longValue() == j) {
                i(((TLRPC.UserFull) objArr[1]).share_theme);
            }
        } else if (i == jn7.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (-chatFull.id) == j) {
            i(chatFull.share_theme);
        }
    }

    public final TLRPC.InputPeer e() {
        tz8 tz8Var = this.c;
        if (tz8Var.e) {
            return new TLRPC.TL_inputPeerSelf();
        }
        TLRPC.InputPeer j1 = uc7.s1(this.a).j1(tz8Var.f);
        if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
            return null;
        }
        return j1;
    }

    public final SharedPreferences f() {
        return uc7.s1(this.a).Y3;
    }

    public final void g() {
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.User X1 = s1.X1(Long.valueOf(j));
            if (X1 != null) {
                jn7.f(i).b(this, jn7.E0);
                s1.o3(0, X1, true);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        if (M0 == null) {
            return;
        }
        jn7.f(i).b(this, jn7.T);
        kf7.a0(i).F0(M0.id, xc2.T(M0), null, true, false, 0);
    }

    public final void i(TLRPC.ShareTheme shareTheme) {
        long j = this.c.f;
        if (this.F) {
            return;
        }
        if (shareTheme == null) {
            shareTheme = new TLRPC.TL_shareThemeDefault();
        }
        int i = this.a;
        uz8 uz8Var = (uz8) h(i).get(j);
        if (uz8Var != null) {
            TLRPC.ShareTheme shareTheme2 = uz8Var.a;
            byte[] q = q(shareTheme);
            byte[] q2 = q(shareTheme2);
            if (q != null && Arrays.equals(q, q2)) {
                h(i).remove(j);
            } else {
                if (uz8Var.b == 0 || SystemClock.elapsedRealtime() - uz8Var.b < 10000) {
                    k(uz8Var.a);
                    return;
                }
                h(i).remove(j);
            }
        }
        if (this.y) {
            return;
        }
        TLRPC.ShareTheme shareTheme3 = this.I;
        if (shareTheme3 == null) {
            g09 g09Var = this.b;
            g09Var.setInstantTheme(true);
            a(shareTheme);
            g09Var.setInstantTheme(false);
            return;
        }
        byte[] q3 = q(shareTheme);
        byte[] q4 = q(shareTheme3);
        if (q3 == null || !Arrays.equals(q3, q4)) {
            a(shareTheme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.tgnet.TLRPC$TL_shareThemeDefault] */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLRPC$TL_inputShareThemeGift] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLRPC$TL_shareThemeEmojiBackdrop] */
    /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.tgnet.tl.TL_stars$TL_inputSavedStarGiftSlug] */
    public final void j() {
        TLRPC.TL_shareThemeGift tL_shareThemeGift;
        this.y = true;
        boolean z = false;
        this.E = false;
        tz8 tz8Var = this.c;
        if (tz8Var.g) {
            g09 g09Var = this.b;
            TL_stars.TL_starGiftUnique themeGift = g09Var.getThemeGift();
            ArrayList<TLRPC.Reaction> pickedEmoji = g09Var.getPickedEmoji();
            TLRPC.TL_shareThemeGift tL_shareThemeGift2 = null;
            r6 = null;
            r6 = null;
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = null;
            tL_shareThemeGift2 = null;
            if (themeGift != null) {
                if (!tz8Var.e) {
                    long themeGiftSavedId = g09Var.getThemeGiftSavedId();
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
                int themeBackdropIndex = g09Var.getThemeBackdropIndex();
                if (themeBackdropIndex >= 0 && themeBackdropIndex != g09.F9) {
                    z = true;
                }
                if (z) {
                    if (nd0.h == null) {
                        b();
                        this.E = true;
                        return;
                    }
                } else if (pickedEmoji.isEmpty()) {
                    tL_shareThemeGift = new TLRPC.TL_shareThemeDefault();
                }
                ?? tL_shareThemeEmojiBackdrop = new TLRPC.TL_shareThemeEmojiBackdrop();
                if (z) {
                    tL_shareThemeEmojiBackdrop.flags |= 1;
                    tL_shareThemeEmojiBackdrop.backdrop_id = nd0.h[themeBackdropIndex];
                }
                if (!pickedEmoji.isEmpty()) {
                    tL_shareThemeEmojiBackdrop.flags |= 2;
                    tL_shareThemeEmojiBackdrop.emojis = pickedEmoji;
                }
                tL_shareThemeGift = tL_shareThemeEmojiBackdrop;
            }
            if (tL_shareThemeGift2 == null) {
                tL_shareThemeGift2 = tL_shareThemeGift;
            }
            this.I = tL_shareThemeGift2;
            uz8 uz8Var = new uz8();
            uz8Var.a = tL_shareThemeGift2;
            h(this.a).put(tz8Var.f, uz8Var);
            k(this.I);
            this.w = tL_shareThemeGift;
            sz8 sz8Var = this.H;
            hl.r(sz8Var);
            hl.d3(sz8Var, 700L);
        }
    }

    public final void k(TLRPC.ShareTheme shareTheme) {
        int i = this.a;
        uc7 s1 = uc7.s1(i);
        long j = this.c.f;
        if (j > 0) {
            TLRPC.UserFull Y1 = s1.Y1(j);
            if (Y1 != null) {
                Y1.share_theme = shareTheme;
                kf7.a0(i).l2(Y1, false);
                return;
            }
            return;
        }
        TLRPC.ChatFull N0 = s1.N0(-j);
        if (N0 != null) {
            N0.share_theme = shareTheme;
            kf7.a0(i).P1(N0, false);
        }
    }

    public final void l() {
        this.F = true;
        int i = this.a;
        jn7.f(i).n(this, jn7.k0);
        jn7.f(i).n(this, jn7.E0);
        jn7.f(i).n(this, jn7.T);
        hl.r(this.G);
        hl.r(this.H);
        o();
        if (this.n != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.n, true);
            this.n = 0;
        }
    }

    public final void m() {
        this.s = SystemClock.elapsedRealtime();
        uc7 s1 = uc7.s1(this.a);
        ji7 ji7Var = new ji7(this, (byte) 22);
        if (s1.M4) {
            return;
        }
        if (s1.N4 != null && r8.expires > System.currentTimeMillis() / 1000) {
            ji7Var.a(s1.N4);
            return;
        }
        s1.M4 = true;
        s1.getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new p87((Object) s1, (Object) ji7Var, System.currentTimeMillis(), (byte) 8));
    }

    public final void n(boolean z, boolean z2) {
        int i = this.n;
        int i2 = this.a;
        if (i != 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.n, true);
        }
        TLRPC.TL_contacts_exportNoPaidMessagesToken tL_contacts_exportNoPaidMessagesToken = new TLRPC.TL_contacts_exportNoPaidMessagesToken();
        tL_contacts_exportNoPaidMessagesToken.revoke = z;
        tL_contacts_exportNoPaidMessagesToken.temporary = z2;
        int sendRequestTyped = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_contacts_exportNoPaidMessagesToken, new ic((byte) 0), new se2(this, r6, z2, (byte) 2));
        this.n = sendRequestTyped;
        int[] iArr = {sendRequestTyped};
    }

    public final void o() {
        if (this.w != null) {
            TLRPC.TL_messages_setShareTheme tL_messages_setShareTheme = new TLRPC.TL_messages_setShareTheme();
            TLRPC.InputPeer e = e();
            tL_messages_setShareTheme.peer = e;
            tL_messages_setShareTheme.theme = this.w;
            this.w = null;
            if (e == null) {
                return;
            }
            int i = this.x;
            int i2 = this.a;
            if (i != 0) {
                ConnectionsManager.getInstance(i2).cancelRequest(this.x, true);
            }
            LongSparseArray h = h(i2);
            tz8 tz8Var = this.c;
            uz8 uz8Var = (uz8) h.get(tz8Var.f);
            long j = tz8Var.f;
            int i3 = this.a;
            int sendRequestTyped = ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_setShareTheme, new ic((byte) 0), new ng(this, r7, uz8Var, i3, j));
            this.x = sendRequestTyped;
            int[] iArr = {sendRequestTyped};
        }
    }

    public final void p() {
        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken;
        sz8 sz8Var = this.G;
        hl.r(sz8Var);
        if (this.F) {
            return;
        }
        if (this.d == 1 && this.n == 0 && (this.f == null || SystemClock.elapsedRealtime() - this.h >= 30000 || ((tL_exportedNoPaidMessagesToken = this.f) != null && tL_exportedNoPaidMessagesToken.expires != 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.f.expires - 5))) {
            n(false, true);
        }
        if (this.c.d && ((this.r == null || System.currentTimeMillis() / 1000 >= this.r.expires) && SystemClock.elapsedRealtime() - this.s >= 5000)) {
            m();
        }
        hl.d3(sz8Var, 1000L);
    }

    public final void r() {
        long j;
        int i = this.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i).Y;
        if (globalPrivacySettings == null) {
            lv2.r(i).B();
            j = 0;
        } else {
            j = globalPrivacySettings.noncontact_peers_paid_stars;
        }
        g09 g09Var = this.b;
        g09Var.setFeeStars(j);
        if (j <= 0 || this.e) {
            return;
        }
        this.e = true;
        if (!this.c.d && this.d == 0 && f().getBoolean("qrNoPaidPermanent", false)) {
            this.d = (byte) 2;
            g09Var.w0 = true;
            g09Var.x0 = false;
            g09Var.C0 = 1.0f;
            g09Var.E0 = 1.0f;
            g09Var.D0 = 1.0f;
            g09Var.G0 = true;
            g09Var.H0 = 1.0f;
            g09Var.A2 = null;
            g09Var.B2 = -1;
            g09Var.t1(false);
            g09Var.invalidate();
            TLRPC.TL_exportedNoPaidMessagesToken c = c();
            this.f = c;
            if (c != null) {
                g09Var.setFreeLink(d(c));
            }
            n(false, false);
        }
    }
}
