// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uf2 extends pg0 {
    public static volatile mp3 s = new mp3("chatThemeQueue");
    public static final uf2[] w = new uf2[4];
    public final HashMap a;
    public ArrayList b;
    public volatile long c;
    public volatile long d;
    public final HashMap e;
    public final tf2 f;
    public final LongSparseArray h;
    public final HashMap n;
    public final HashMap r;

    public uf2(int i) {
        super(i);
        this.a = new HashMap();
        this.e = new HashMap();
        this.f = new tf2();
        this.h = new LongSparseArray();
        this.n = new HashMap();
        this.r = new HashMap();
        i();
    }

    public static uf2 e(int i) {
        uf2 uf2Var;
        uf2[] uf2VarArr = w;
        uf2 uf2Var2 = uf2VarArr[i];
        if (uf2Var2 != null) {
            return uf2Var2;
        }
        synchronized (uf2.class) {
            uf2Var = uf2VarArr[i];
            if (uf2Var == null) {
                uf2Var = new uf2(i);
                uf2VarArr[i] = uf2Var;
            }
        }
        return uf2Var;
    }

    public static String h(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    public static void l(String str) {
        new ImageReceiver(null).d0(gn5.b(hs6.d0(z8c.t0).V(str)), "50_50", null, null, null, 0);
        gw3.k(str);
    }

    public static boolean t(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(h(wallPaper), h(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i = this.currentAccount;
        byte b = 0;
        if (j >= 0) {
            tL_messages_setChatWallPaper.peer = oc7.m1(oc7.r1(i).W1(Long.valueOf(j)));
            tL_messages_setChatWallPaper.revert = z2;
            if (!z2) {
                TLRPC.UserFull X1 = getMessagesController().X1(j);
                if (X1 != null) {
                    X1.wallpaper = null;
                    X1.flags &= -16777217;
                    getMessagesStorage().g2(X1, false);
                }
                p(j, null);
                if (z) {
                    nm7.f(this.currentAccount).k(nm7.E0, Long.valueOf(j), X1);
                }
            }
        } else {
            long j2 = -j;
            tL_messages_setChatWallPaper.peer = oc7.k1(oc7.r1(i).L0(Long.valueOf(j2)));
            TLRPC.ChatFull M0 = getMessagesController().M0(j2);
            if (M0 != null) {
                M0.wallpaper = null;
                M0.flags2 &= -129;
                getMessagesStorage().K1(M0, false);
            }
            p(j, null);
            if (z) {
                nm7 f = nm7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(nm7.T, M0, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new nf2(b));
    }

    public final ArrayList b() {
        SharedPreferences f = f();
        int i = f.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.v(f.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new tz3(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        return arrayList;
    }

    public final TLRPC.WallPaper c(long j) {
        if (j >= 0) {
            TLRPC.UserFull X1 = getMessagesController().X1(j);
            if (X1 != null) {
                return X1.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = getMessagesController().M0(-j);
            if (M0 != null) {
                return M0.wallpaper;
            }
        }
        String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatWallpaper_" + this.currentAccount + "_" + j, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        return null;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean hasFlag = TLObject.hasFlag(i, 1);
        boolean hasFlag2 = TLObject.hasFlag(i, 2);
        boolean hasFlag3 = TLObject.hasFlag(i, 4);
        ArrayList arrayList3 = new ArrayList();
        if (hasFlag3 && (arrayList2 = (ArrayList) this.f.d) != null) {
            arrayList3.addAll(arrayList2);
        }
        if (hasFlag2 && (arrayList = this.b) != null) {
            arrayList3.addAll(arrayList);
        }
        int i2 = 0;
        if (hasFlag && (arrayList3.isEmpty() || !((tz3) arrayList3.get(0)).a)) {
            tz3 tz3Var = new tz3(this.currentAccount);
            tz3Var.e = "❌";
            tz3Var.c = fnb.d("❌");
            tz3Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            tz3Var.a = true;
            sz3 sz3Var = new sz3();
            sz3Var.a = tz3.d(true);
            ArrayList arrayList4 = tz3Var.f;
            arrayList4.add(sz3Var);
            sz3 sz3Var2 = new sz3();
            sz3Var2.a = tz3.d(false);
            arrayList4.add(sz3Var2);
            arrayList3.add(0, tz3Var);
        }
        int size = arrayList3.size();
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            ((tz3) obj).k();
        }
        return arrayList3;
    }

    public final SharedPreferences f() {
        return aq1.k(new StringBuilder("chatthemeconfig_"), this.currentAccount, a.b, 0);
    }

    public final tz3 g(fnb fnbVar) {
        if (fnbVar == null) {
            return null;
        }
        String str = fnbVar.b;
        if (!TextUtils.isEmpty(str)) {
            return (tz3) this.e.get(str);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tz3 tz3Var = (tz3) obj;
            if (fnbVar.equals(tz3Var.c)) {
                return tz3Var;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        SharedPreferences f = f();
        this.c = 0L;
        this.d = 0L;
        try {
            this.c = f.getLong("hash", 0L);
            this.d = f.getLong("lastReload", 0L);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.b = b();
        cf7 messagesStorage = getMessagesStorage();
        int i = 0;
        mf2 mf2Var = new mf2(this, 0 == true ? 1 : 0);
        messagesStorage.getClass();
        messagesStorage.H(new q87(messagesStorage, mf2Var, (byte) 27));
        l("❌");
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l(((tz3) obj).e);
        }
    }

    public final void j(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tz3 tz3Var = (tz3) obj;
            if (tz3Var.h(z ? 1 : 0) != 0) {
                TLRPC.WallPaper j = tz3Var.j(z ? 1 : 0);
                if (!((j == null || j.document == null) ? true : j.pattern ? btc.b(mi5.c(zsc.b(j))).exists() : f0f.a(f0f.c(j.id)).exists())) {
                    tz3Var.n(z ? 1 : 0, null);
                }
            }
        }
    }

    public final void k(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tz3 tz3Var = (tz3) obj;
            long h = tz3Var.h(z ? 1 : 0);
            if (h != 0 && !this.a.containsKey(Long.valueOf(h))) {
                tz3Var.p(z ? 1 : 0, new cd1((Object) this, (byte) 26));
            }
        }
    }

    public final void m(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        byte b = 0;
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull M0 = getMessagesController().M0(-pg3.n(tL_updatePeerWallpaper.peer));
            if (M0 == null || t(M0.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j = -M0.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                M0.wallpaper = tL_updatePeerWallpaper.wallpaper;
                M0.flags2 |= 128;
            } else {
                M0.wallpaper = null;
                M0.flags2 &= -129;
            }
            getMessagesStorage().K1(M0, false);
            p(j, M0.wallpaper);
            gm.c3(new pf2(this, M0, b));
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(tL_updatePeerWallpaper.peer.user_id);
        if (X1 == null || t(X1.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j2 = X1.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            X1.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            X1.wallpaper = tL_updatePeerWallpaper.wallpaper;
            X1.flags |= 16777216;
        } else {
            X1.wallpaper_overridden = false;
            X1.wallpaper = null;
            X1.flags &= -16777217;
        }
        getMessagesStorage().g2(X1, false);
        p(j2, X1.wallpaper);
        gm.c3(new of2((Object) this, j2, (Object) X1, (byte) 0));
    }

    public final void n(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            String str = tL_chatThemeUniqueGift.gift.slug;
            HashMap hashMap = this.e;
            if (hashMap.containsKey(str)) {
                return;
            }
            tz3 tz3Var = new tz3(this.currentAccount, tL_chatThemeUniqueGift);
            tz3Var.k();
            hashMap.put(tL_chatThemeUniqueGift.gift.slug, tz3Var);
            cf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            messagesStorage.H(new q87(messagesStorage, Collections.singletonList(chatTheme), (byte) 26));
        }
    }

    public final void o(ResultCallback resultCallback, boolean z) {
        if (this.c == 0 || this.d == 0) {
            i();
        }
        byte b = 0;
        boolean z2 = System.currentTimeMillis() - this.d > 7200000;
        ArrayList arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty() || z2) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.c;
            ConnectionsManager connectionsManager = getConnectionsManager();
            mp3 mp3Var = s;
            Objects.requireNonNull(mp3Var);
            connectionsManager.sendRequestTyped(getchatthemes, new rf2(mp3Var, b), new jf2(this, resultCallback, z, b));
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(d((z ? 1 : 0) | 2));
    }

    public final void p(long j, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().remove("chatWallpaper_" + this.currentAccount + "_" + j).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String f = Utilities.f(serializedData.toByteArray());
        a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit().putString("chatWallpaper_" + this.currentAccount + "_" + j, f).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(long j, fnb fnbVar, TLRPC.ChatTheme chatTheme, boolean z) {
        String str;
        String str2;
        TLRPC.Tl_inputChatThemeEmpty tl_inputChatThemeEmpty;
        LongSparseArray longSparseArray = this.h;
        if (fnb.a((fnb) longSparseArray.get(j), fnbVar)) {
            return;
        }
        if (fnbVar == null) {
            longSparseArray.delete(j);
            str = null;
        } else {
            longSparseArray.put(j, fnbVar);
            str = fnbVar.b;
        }
        r(j, str);
        if (j >= 0) {
            TLRPC.UserFull X1 = getMessagesController().X1(j);
            if (X1 != null && (fnbVar == null || fnbVar.b() || chatTheme != null)) {
                X1.theme = chatTheme;
                getMessagesStorage().g2(X1, true);
            }
        } else {
            TLRPC.ChatFull M0 = getMessagesController().M0(-j);
            if (M0 != null) {
                M0.theme_emoticon = fnbVar != null ? fnbVar.a : null;
                getMessagesStorage().K1(M0, true);
            }
        }
        SharedPreferences.Editor edit = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).edit();
        String str3 = "chatTheme_" + this.currentAccount + "_" + j;
        if (fnbVar != null) {
            String str4 = fnbVar.a;
            String str5 = fnbVar.b;
            if (str5 != null) {
                str2 = "gift_".concat(str5);
            } else if (str4 != null) {
                str2 = "emoticon_".concat(str4);
            }
            edit.putString(str3, str2).apply();
            if (z) {
                return;
            }
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (fnbVar != null) {
                String str6 = fnbVar.a;
                if (TextUtils.isEmpty(str6)) {
                    String str7 = fnbVar.b;
                    if (!TextUtils.isEmpty(str7)) {
                        TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
                        tl_inputChatThemeUniqueGift.slug = str7;
                        tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift;
                    }
                } else {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str6;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                }
                tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
                tL_messages_setChatTheme.peer = getMessagesController().i1(j);
                getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new h92(this, (byte) 2));
                return;
            }
            tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().i1(j);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new h92(this, (byte) 2));
            return;
        }
        str2 = null;
        edit.putString(str3, str2).apply();
        if (z) {
        }
    }

    public final void r(long j, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.r;
        HashMap hashMap2 = this.n;
        if (isEmpty) {
            String str2 = (String) hashMap2.remove(Long.valueOf(j));
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            }
            return;
        }
        if (j == 0) {
            Long l = (Long) hashMap.remove(str);
            if (l != null) {
                hashMap2.remove(l);
                return;
            }
            return;
        }
        String str3 = (String) hashMap2.put(Long.valueOf(j), str);
        Long l2 = (Long) hashMap.put(str, Long.valueOf(j));
        if (str3 != null && !TextUtils.equals(str, str3)) {
            hashMap.remove(str3);
        }
        if (l2 == null || l2.longValue() == j) {
            return;
        }
        hashMap2.remove(l2);
    }

    public final int s(long j, String str, xlb xlbVar, k47 k47Var, jd jdVar) {
        boolean z;
        TLRPC.ChatFull M0;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i = this.currentAccount;
        if (j >= 0) {
            tL_messages_setChatWallPaper.peer = oc7.m1(oc7.r1(i).W1(Long.valueOf(j)));
        } else {
            tL_messages_setChatWallPaper.peer = oc7.k1(oc7.r1(i).L0(Long.valueOf(-j)));
        }
        tL_messages_setChatWallPaper.for_both = xlbVar.o;
        if (k47Var == null || !(k47Var.k.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = oc7.q1(xlbVar);
            z = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.id = k47Var.e1();
            int i2 = this.currentAccount;
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = oc7.r1(i2).X1(j);
                M0 = null;
            } else {
                M0 = oc7.r1(i2).M0(-j);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) k47Var.k.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper2.id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (xlbVar.k * 100.0f);
            tL_wallPaperSettings.motion = xlbVar.j;
            tL_wallPaperSettings.blur = xlbVar.i;
            tL_wallPaperSettings.background_color = xlbVar.d;
            tL_wallPaperSettings.second_background_color = xlbVar.e;
            tL_wallPaperSettings.third_background_color = xlbVar.f;
            tL_wallPaperSettings.fourth_background_color = xlbVar.g;
            tL_wallPaperSettings.rotation = xlbVar.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (M0 != null) {
                wallPaper = M0.wallpaper;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i3 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            TLRPC.ChatFull chatFull = M0;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i3 | 4;
            z = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().g2(userFull, false);
                nm7.f(this.currentAccount).k(nm7.E0, Long.valueOf(j), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().K1(chatFull, false);
                nm7 f = nm7.f(this.currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(nm7.T, chatFull, 0, bool, bool);
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = oc7.c2(xlbVar);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new rt0(this, j, z, str, jdVar));
    }
}
