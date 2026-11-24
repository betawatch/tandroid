// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class un6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;

    public /* synthetic */ un6(hq6 hq6Var, byte b) {
        this.a = b;
        this.b = hq6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.tgnet.TLRPC$TL_help_premiumPromo] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [hq6, pf0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor queryFinalized;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        ArrayList arrayList3;
        int i3;
        SQLiteCursor queryFinalized2;
        int i4;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i5;
        long j;
        int i6;
        SQLiteCursor queryFinalized3;
        int i7;
        long j2;
        byte b = this.a;
        ?? r5 = 0;
        r5 = null;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor = null;
        r5 = null;
        r5 = null;
        ArrayList arrayList4 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor2 = null;
        r5 = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo3 = null;
        SQLiteCursor sQLiteCursor3 = null;
        int i8 = 0;
        ?? r9 = this.b;
        try {
            switch (b) {
                case 0:
                    kk7.f(r9.currentAccount).k(kk7.Y4, new Object[0]);
                    return;
                case 1:
                    r9.getNotificationCenter().k(kk7.B1, new Object[0]);
                    return;
                case 2:
                    r9.getMediaDataController().X0(false, false, true, 2);
                    return;
                case 3:
                    r9.getNotificationCenter().k(kk7.B1, new Object[0]);
                    return;
                case 4:
                    r9.getNotificationCenter().k(kk7.i5, new Object[0]);
                    return;
                case 5:
                    try {
                        long currentTimeMillis = System.currentTimeMillis() - 604800000;
                        r9.getMessagesStorage().b.executeFast("DELETE FROM stickersets2 WHERE date < " + currentTimeMillis).stepThis().dispose();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                case 6:
                    r9.getNotificationCenter().k(81, new Object[0]);
                    r9.getNotificationCenter().k(82, new Object[0]);
                    r9.getNotificationCenter().k(83, new Object[0]);
                    r9.getNotificationCenter().k(84, new Object[0]);
                    return;
                case 7:
                    r9.getUserConfig().W = true;
                    r9.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                    r9.getUserConfig().u(false);
                    return;
                case 8:
                    r9.l1();
                    kk7.e().k(kk7.X4, new Object[0]);
                    return;
                case 9:
                    try {
                        r9.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 10:
                    r9.getNotificationCenter().k(kk7.m3, new Object[0]);
                    return;
                case 11:
                    r9.x1 = false;
                    return;
                case 12:
                    r9.x1 = false;
                    y6c userConfig = r9.getUserConfig();
                    userConfig.w = true;
                    userConfig.u(false);
                    return;
                case 13:
                    try {
                        r9.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                case 14:
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    hq6 hq6Var = this.b;
                    long e3 = hq6Var.getUserConfig().e();
                    try {
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        SQLiteCursor queryFinalized4 = hq6Var.getMessagesStorage().b.queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
                        while (queryFinalized4.next()) {
                            long j3 = e3;
                            long longValue = queryFinalized4.longValue(i8);
                            if (longValue == j3) {
                                e3 = j3;
                            } else {
                                int intValue = queryFinalized4.intValue(1);
                                TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                                hq6 hq6Var2 = hq6Var;
                                ArrayList arrayList13 = arrayList9;
                                tL_topPeer.rating = queryFinalized4.doubleValue(2);
                                if (longValue > 0) {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_topPeer.peer = tL_peerUser;
                                    tL_peerUser.user_id = longValue;
                                    arrayList11.add(Long.valueOf(longValue));
                                } else {
                                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                    tL_topPeer.peer = tL_peerChat;
                                    long j4 = -longValue;
                                    tL_peerChat.chat_id = j4;
                                    arrayList12.add(Long.valueOf(j4));
                                }
                                if (intValue == 0) {
                                    arrayList5.add(tL_topPeer);
                                } else if (intValue == 1) {
                                    arrayList6.add(tL_topPeer);
                                } else if (intValue == 2) {
                                    arrayList8.add(tL_topPeer);
                                } else if (intValue == 3) {
                                    arrayList7.add(tL_topPeer);
                                }
                                i8 = 0;
                                hq6Var = hq6Var2;
                                e3 = j3;
                                arrayList9 = arrayList13;
                            }
                        }
                        hq6 hq6Var3 = hq6Var;
                        ArrayList arrayList14 = arrayList9;
                        queryFinalized4.dispose();
                        if (arrayList11.isEmpty()) {
                            arrayList = arrayList14;
                        } else {
                            arrayList = arrayList14;
                            hq6Var3.getMessagesStorage().k0(arrayList11, arrayList, false);
                        }
                        if (!arrayList12.isEmpty()) {
                            hq6Var3.getMessagesStorage().P(TextUtils.join(",", arrayList12), arrayList10);
                        }
                        gl.d3(new i87((Object) hq6Var3, (Object) arrayList, (Object) arrayList10, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, (Object) arrayList8, (byte) 15));
                        return;
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                        return;
                    }
                case 15:
                    hq6 hq6Var4 = this.b;
                    try {
                        try {
                            queryFinalized2 = hq6Var4.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                        } catch (Exception e5) {
                            e = e5;
                            arrayList2 = null;
                        }
                        try {
                            try {
                                if (queryFinalized2.next()) {
                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        int readInt32 = byteBufferValue.readInt32(false);
                                        arrayList2 = new ArrayList(readInt32);
                                        for (int i9 = 0; i9 < readInt32; i9++) {
                                            try {
                                                arrayList2.add(TLRPC.TL_availableReaction.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true));
                                            } catch (Exception e6) {
                                                e = e6;
                                                sQLiteCursor2 = queryFinalized2;
                                                i3 = 0;
                                                fa4.g(e, false);
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                i2 = i3;
                                                i = 0;
                                                arrayList3 = arrayList2;
                                                gl.d3(new bo6(hq6Var4, arrayList3, i2, i, (byte) 0));
                                                return;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                        arrayList4 = arrayList2;
                                    }
                                    i3 = queryFinalized2.intValue(1);
                                    try {
                                        i4 = queryFinalized2.intValue(2);
                                        i8 = i3;
                                    } catch (Exception e7) {
                                        e = e7;
                                        arrayList2 = arrayList4;
                                        sQLiteCursor2 = queryFinalized2;
                                        fa4.g(e, false);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        i2 = i3;
                                        i = 0;
                                        arrayList3 = arrayList2;
                                        gl.d3(new bo6(hq6Var4, arrayList3, i2, i, (byte) 0));
                                        return;
                                    }
                                } else {
                                    i4 = 0;
                                }
                                queryFinalized2.dispose();
                                i = i4;
                                i2 = i8;
                                arrayList3 = arrayList4;
                            } catch (Exception e8) {
                                e = e8;
                                arrayList2 = arrayList4;
                                i3 = 0;
                            }
                            gl.d3(new bo6(hq6Var4, arrayList3, i2, i, (byte) 0));
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor2 = queryFinalized2;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                case 16:
                    hq6 hq6Var5 = this.b;
                    try {
                        try {
                            queryFinalized3 = hq6Var5.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                        } catch (Exception e9) {
                            e = e9;
                            tL_attachMenuBots = null;
                            i5 = 0;
                            j = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        try {
                            if (queryFinalized3.next()) {
                                NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.AttachMenuBots TLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    tL_attachMenuBots2 = TLdeserialize instanceof TLRPC.TL_attachMenuBots ? (TLRPC.TL_attachMenuBots) TLdeserialize : null;
                                    byteBufferValue2.reuse();
                                }
                                j = queryFinalized3.longValue(1);
                                try {
                                    tL_attachMenuBots = tL_attachMenuBots2;
                                    j2 = j;
                                    i7 = queryFinalized3.intValue(2);
                                } catch (Exception e10) {
                                    e = e10;
                                    tL_attachMenuBots = tL_attachMenuBots2;
                                    sQLiteCursor = queryFinalized3;
                                    i5 = 0;
                                    fa4.g(e, false);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i6 = i5;
                                    hq6Var5.w1(tL_attachMenuBots, j, i6, true);
                                    return;
                                }
                            } else {
                                tL_attachMenuBots = null;
                                i7 = 0;
                                j2 = 0;
                            }
                            if (tL_attachMenuBots != null) {
                                try {
                                    ArrayList arrayList15 = new ArrayList();
                                    for (int i10 = 0; i10 < tL_attachMenuBots.bots.size(); i10++) {
                                        arrayList15.add(Long.valueOf(tL_attachMenuBots.bots.get(i10).bot_id));
                                    }
                                    tL_attachMenuBots.users.addAll(hq6Var5.getMessagesStorage().i0(arrayList15));
                                } catch (Exception e11) {
                                    e = e11;
                                    sQLiteCursor = queryFinalized3;
                                    i5 = i7;
                                    j = j2;
                                    fa4.g(e, false);
                                    if (sQLiteCursor != null) {
                                    }
                                    i6 = i5;
                                    hq6Var5.w1(tL_attachMenuBots, j, i6, true);
                                    return;
                                }
                            }
                            queryFinalized3.dispose();
                            i6 = i7;
                            j = j2;
                        } catch (Exception e12) {
                            e = e12;
                            tL_attachMenuBots = tL_attachMenuBots2;
                            j = 0;
                        }
                        hq6Var5.w1(tL_attachMenuBots, j, i6, true);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = queryFinalized3;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                case 17:
                    try {
                        r9.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                default:
                    try {
                        queryFinalized = r9.getMessagesStorage().b.queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
                    } catch (Exception e13) {
                        e = e13;
                        tL_help_premiumPromo = null;
                    }
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue3 != null) {
                                TLRPC.TL_help_premiumPromo TLdeserialize2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), true);
                                byteBufferValue3.reuse();
                                tL_help_premiumPromo3 = TLdeserialize2;
                            }
                            i8 = queryFinalized.intValue(1);
                            tL_help_premiumPromo2 = tL_help_premiumPromo3;
                        }
                        queryFinalized.dispose();
                        r5 = tL_help_premiumPromo2;
                    } catch (Exception e14) {
                        e = e14;
                        TLRPC.TL_help_premiumPromo tL_help_premiumPromo4 = tL_help_premiumPromo3;
                        sQLiteCursor3 = queryFinalized;
                        tL_help_premiumPromo = tL_help_premiumPromo4;
                        fa4.g(e, false);
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        r5 = tL_help_premiumPromo;
                        r9.x1(r5, i8, true);
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = queryFinalized;
                        if (r5 != 0) {
                            r5.dispose();
                        }
                        throw th;
                    }
                    r9.x1(r5, i8, true);
                    return;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
