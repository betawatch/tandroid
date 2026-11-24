// default package

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z8c extends pg0 {
    public static int t0;
    public static volatile z8c[] u0 = new z8c[4];
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Object a;
    public TLRPC.TL_help_termsOfService a0;
    public volatile boolean b;
    public long b0;
    public TLRPC.User c;
    public String c0;
    public boolean d;
    public String d0;
    public int e;
    public String e0;
    public int f;
    public String f0;
    public long g0;
    public int h;
    public long h0;
    public long i0;
    public long j0;
    public volatile byte[] k0;
    public volatile byte[] l0;
    public volatile long m0;
    public long n;
    public LongSparseArray n0;
    public LongSparseArray o0;
    public LongSparseArray p0;
    public int q0;
    public int r;
    public boolean r0;
    public int s;
    public long s0;
    public boolean w;
    public boolean x;
    public TL_account.tmpPassword y;

    public z8c(int i) {
        super(i);
        this.a = new Object();
        this.e = -210000;
        this.f = -1;
        this.x = true;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.V = true;
        this.W = true;
        this.q0 = 0;
        this.r0 = false;
    }

    public static int c() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (h(j5.a(i2).a).o()) {
                i++;
            }
        }
        return i;
    }

    public static z8c h(int i) {
        z8c z8cVar;
        z8c z8cVar2 = u0[i];
        if (z8cVar2 != null) {
            return z8cVar2;
        }
        synchronized (z8c.class) {
            z8cVar = u0[i];
            if (z8cVar == null) {
                z8c[] z8cVarArr = u0;
                z8c z8cVar3 = new z8c(i);
                z8cVarArr[i] = z8cVar3;
                z8cVar = z8cVar3;
            }
        }
        return z8cVar;
    }

    public static int k() {
        int i = -1;
        while (i < 4) {
            int i2 = i < 0 ? t0 : i;
            if (h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                return i2;
            }
            i++;
        }
        return t0;
    }

    public static boolean n() {
        for (int i = 0; i < 4; i++) {
            if (h(j5.a(i).a).o() && h(j5.a(i).a).getUserConfig().p()) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(int i) {
        return i >= 0 && i < 4 && h(i).o();
    }

    public final void a(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            final byte b = 0;
            gm.c3(new Runnable(this) { // from class: x8c
                public final /* synthetic */ z8c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    TLRPC.User user3 = user2;
                    z8c z8cVar = this.b;
                    switch (b2) {
                        case 0:
                            z8cVar.getMessagesController().u5(user3.premium);
                            nm7.f(z8cVar.currentAccount).k(nm7.j5, new Object[0]);
                            nm7.e().k(nm7.l5, new Object[0]);
                            z8cVar.getMediaDataController().T0(false);
                            z8cVar.getMediaDataController().U0(false, null);
                            h4b N1 = z8cVar.getMessagesController().N1();
                            N1.R = false;
                            N1.S = null;
                            break;
                        default:
                            z8cVar.getMessagesController().u5(user3.premium);
                            nm7.f(z8cVar.currentAccount).k(nm7.j5, new Object[0]);
                            z8cVar.getMediaDataController().T0(true);
                            break;
                    }
                }
            });
        } else if (user == null) {
            final byte b2 = 1;
            gm.c3(new Runnable(this) { // from class: x8c
                public final /* synthetic */ z8c b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    TLRPC.User user3 = user2;
                    z8c z8cVar = this.b;
                    switch (b22) {
                        case 0:
                            z8cVar.getMessagesController().u5(user3.premium);
                            nm7.f(z8cVar.currentAccount).k(nm7.j5, new Object[0]);
                            nm7.e().k(nm7.l5, new Object[0]);
                            z8cVar.getMediaDataController().T0(false);
                            z8cVar.getMediaDataController().U0(false, null);
                            h4b N1 = z8cVar.getMessagesController().N1();
                            N1.R = false;
                            N1.S = null;
                            break;
                        default:
                            z8cVar.getMessagesController().u5(user3.premium);
                            nm7.f(z8cVar.currentAccount).k(nm7.j5, new Object[0]);
                            z8cVar.getMediaDataController().T0(true);
                            break;
                    }
                }
            });
        }
    }

    public final void b() {
        j().edit().clear().apply();
        this.R = 0;
        this.S = 0;
        this.c = null;
        this.n = 0L;
        this.d = false;
        this.h = 0;
        this.e = -210000;
        this.f = -1;
        this.T = false;
        this.U = false;
        this.K = -1;
        this.L = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.w = false;
        this.I = true;
        this.V = true;
        this.X = false;
        this.W = true;
        this.x = true;
        this.J = true;
        this.a0 = null;
        this.Q = false;
        this.Y = false;
        this.Z = (int) (System.currentTimeMillis() / 1000);
        this.r = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.s = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        t();
        int i = 0;
        while (true) {
            if (i >= 4) {
                gda.y = false;
                gda.w = false;
                gda.q = 0;
                gda.s = 0L;
                gda.t = 0L;
                gda.u = 0;
                gda.r = "";
                gda.v = new byte[0];
                gda.x = 3600;
                gda.A = 0;
                gda.C = true;
                gda.d0 = true;
                gda.B = false;
                gda.z = false;
                gda.I = 0;
                gda.J = 0;
                gda.K = 0L;
                gda.L = 0;
                gda.M = 0L;
                gda.N = 0;
                gda.O = false;
                gda.P = false;
                gda.Y0 = 3;
                gda.Z0 = 3;
                gda.a1 = 3;
                gda.b0 = 2;
                gda.R = 0;
                gda.x();
                break;
            }
            if (h(j5.a(i).a).o()) {
                break;
            } else {
                i++;
            }
        }
        u(true);
    }

    public final String d() {
        String str;
        synchronized (this.a) {
            TLRPC.User user = this.c;
            if (user == null || (str = user.phone) == null) {
                str = "";
            }
        }
        return str;
    }

    public final long e() {
        long j;
        synchronized (this.a) {
            TLRPC.User user = this.c;
            j = user != null ? user.id : 0L;
        }
        return j;
    }

    public final TLRPC.User f() {
        TLRPC.User user;
        synchronized (this.a) {
            user = this.c;
        }
        return user;
    }

    public final long[] g(int i) {
        SharedPreferences j = j();
        StringBuilder sb = new StringBuilder("2dialogsLoadOffsetId");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        int i2 = j.getInt(sb.toString(), this.J ? 0 : -1);
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetDate");
        sb2.append(i == 0 ? "" : Integer.valueOf(i));
        int i3 = j.getInt(sb2.toString(), this.J ? 0 : -1);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb3.append(i == 0 ? "" : Integer.valueOf(i));
        long a1 = gm.a1(j, sb3.toString(), this.J ? 0L : -1L);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb4.append(i == 0 ? "" : Integer.valueOf(i));
        long a12 = gm.a1(j, sb4.toString(), this.J ? 0L : -1L);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb5.append(i == 0 ? "" : Integer.valueOf(i));
        long a13 = gm.a1(j, sb5.toString(), this.J ? 0L : -1L);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb6.append(i != 0 ? Integer.valueOf(i) : "");
        return new long[]{i2, i3, a1, a12, a13, j.getLong(sb6.toString(), this.J ? 0L : -1L)};
    }

    public final int i() {
        int i;
        synchronized (this.a) {
            i = this.e;
            this.e = i - 1;
        }
        return i;
    }

    public final SharedPreferences j() {
        if (this.currentAccount == 0) {
            return a.b.getSharedPreferences("userconfing", 0);
        }
        return aq1.k(new StringBuilder("userconfig"), this.currentAccount, a.b, 0);
    }

    public final LongSparseArray l(int i) {
        if (i == 1) {
            LongSparseArray longSparseArray = this.n0;
            if (longSparseArray != null) {
                return longSparseArray;
            }
            LongSparseArray c = pve.c(a.b.getSharedPreferences("users_save_gallery_exceptions_" + this.currentAccount, 0));
            this.n0 = c;
            return c;
        }
        if (i == 2) {
            LongSparseArray longSparseArray2 = this.p0;
            if (longSparseArray2 != null) {
                return longSparseArray2;
            }
            LongSparseArray c2 = pve.c(a.b.getSharedPreferences("groups_save_gallery_exceptions_" + this.currentAccount, 0));
            this.p0 = c2;
            return c2;
        }
        if (i != 4) {
            return null;
        }
        LongSparseArray longSparseArray3 = this.o0;
        if (longSparseArray3 != null) {
            return longSparseArray3;
        }
        LongSparseArray c3 = pve.c(a.b.getSharedPreferences("channels_save_gallery_exceptions_" + this.currentAccount, 0));
        this.o0 = c3;
        return c3;
    }

    public final int m(int i) {
        SharedPreferences j = j();
        StringBuilder sb = new StringBuilder("2totalDialogsLoadCount");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        return j.getInt(sb.toString(), 0);
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = this.c != null;
        }
        return z;
    }

    public final boolean p() {
        TLRPC.User user = this.c;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public final void r() {
        byte[] decode;
        byte[] decode2;
        byte[] decode3;
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            SharedPreferences j = j();
            if (this.currentAccount == 0) {
                t0 = j.getInt("selectedAccount", 0);
            }
            this.d = j.getBoolean("registeredForPush", false);
            this.e = j.getInt("lastSendMessageId", -210000);
            this.h = j.getInt("contactsSavedCount", 0);
            this.f = j.getInt("lastBroadcastId", -1);
            this.r = j.getInt("lastContactsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 82800);
            this.s = j.getInt("lastHintsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 90000);
            this.w = j.getBoolean("draftsLoaded", false);
            this.x = j.getBoolean("unreadDialogsLoaded", false);
            this.I = j.getBoolean("contactsReimported", false);
            this.E = j.getInt("ratingLoadTime", 0);
            this.F = j.getInt("botRatingLoadTime", 0);
            this.G = j.getInt("botGuestRatingLoadTime", 0);
            this.H = j.getInt("webappRatingLoadTime", 0);
            this.Z = j.getInt("loginTime", this.currentAccount);
            this.V = j.getBoolean("syncContacts", true);
            this.X = j.getBoolean("showCallsTab", false);
            this.W = j.getBoolean("suggestContacts", true);
            this.Y = j.getBoolean("hasSecureData", false);
            this.T = j.getBoolean("notificationsSettingsLoaded4", false);
            this.U = j.getBoolean("notificationsSignUpSettingsLoaded", false);
            this.b0 = j.getLong("autoDownloadConfigLoadTime", 0L);
            this.J = j.contains("2dialogsLoadOffsetId") || j.getBoolean("hasValidDialogLoadIds", false);
            this.R = j.getInt("sharingMyLocationUntil", 0);
            this.S = j.getInt("lastMyLocationShareTime", 0);
            this.Q = j.getBoolean("filtersLoaded", false);
            this.c0 = j.getString("premiumGiftsStickerPack", null);
            this.g0 = j.getLong("lastUpdatedPremiumGiftsStickerPack", 0L);
            this.e0 = j.getString("genericAnimationsStickerPack", null);
            this.i0 = j.getLong("lastUpdatedGenericAnimations", 0L);
            try {
                String string = j.getString("terms", null);
                if (string != null && (decode3 = Base64.decode(string, 0)) != null) {
                    SerializedData serializedData = new SerializedData(decode3);
                    this.a0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            int i = j.getInt("6migrateOffsetId", 0);
            this.K = i;
            if (i != -1) {
                this.L = j.getInt("6migrateOffsetDate", 0);
                this.M = gm.a1(j, "6migrateOffsetUserId", 0L);
                this.N = gm.a1(j, "6migrateOffsetChatId", 0L);
                this.O = gm.a1(j, "6migrateOffsetChannelId", 0L);
                this.P = j.getLong("6migrateOffsetAccess", 0L);
            }
            String string2 = j.getString("tmpPassword", null);
            if (string2 != null && (decode2 = Base64.decode(string2, 0)) != null) {
                SerializedData serializedData2 = new SerializedData(decode2);
                this.y = TL_account.tmpPassword.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                serializedData2.cleanup();
            }
            String string3 = j.getString("user", null);
            if (string3 != null && (decode = Base64.decode(string3, 0)) != null) {
                SerializedData serializedData3 = new SerializedData(decode);
                this.c = TLRPC.User.TLdeserialize(serializedData3, serializedData3.readInt32(false), false);
                serializedData3.cleanup();
            }
            TLRPC.User user = this.c;
            if (user != null) {
                a(null, user);
                this.n = this.c.id;
            }
            this.b = true;
        }
    }

    public final void s() {
        if (this.r0 || System.currentTimeMillis() - this.s0 < 60000) {
            return;
        }
        this.r0 = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new go9(this, (byte) 20));
    }

    public final void t() {
        this.m0 = 0L;
        if (this.k0 != null) {
            Arrays.fill(this.k0, (byte) 0);
            this.k0 = null;
        }
        if (this.l0 != null) {
            Arrays.fill(this.l0, (byte) 0);
            this.l0 = null;
        }
    }

    public final void u(boolean z) {
        nm7.f(this.currentAccount).d(new y8c((byte) 0, this, z));
    }

    public final void v(TLRPC.User user) {
        synchronized (this.a) {
            TLRPC.User user2 = this.c;
            this.c = user;
            this.n = user.id;
            a(user2, user);
        }
    }

    public final void w(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        SharedPreferences.Editor edit = j().edit();
        StringBuilder sb = new StringBuilder("2dialogsLoadOffsetId");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putInt(sb.toString(), i2);
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetDate");
        sb2.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putInt(sb2.toString(), i3);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb3.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putLong(sb3.toString(), j);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb4.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putLong(sb4.toString(), j2);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb5.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putLong(sb5.toString(), j3);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb6.append(i != 0 ? Integer.valueOf(i) : "");
        edit.putLong(sb6.toString(), j4);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public final void x(int i, boolean z) {
        j().edit().putBoolean("2pinnedDialogsLoaded" + i, z).commit();
    }

    public final void y(int i, int i2) {
        SharedPreferences.Editor edit = j().edit();
        StringBuilder sb = new StringBuilder("2totalDialogsLoadCount");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        edit.putInt(sb.toString(), i2).commit();
    }

    public final void z(int i, LongSparseArray longSparseArray) {
        if (i == 1) {
            this.n0 = longSparseArray;
            pve.e(aq1.k(new StringBuilder("users_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.n0);
        } else if (i == 2) {
            this.p0 = longSparseArray;
            pve.e(aq1.k(new StringBuilder("groups_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.p0);
        } else if (i == 4) {
            this.o0 = longSparseArray;
            pve.e(aq1.k(new StringBuilder("channels_save_gallery_exceptions_"), this.currentAccount, a.b, 0), this.o0);
        }
    }
}
