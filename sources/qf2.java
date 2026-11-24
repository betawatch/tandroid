// default package

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qf2 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qf2(i30 i30Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = i30Var;
        this.c = j;
        this.d = z;
        this.f = document;
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r3 == null) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.UserFull userFull;
        String str;
        Exception exc;
        y25 y25Var;
        f35 s;
        TLRPC.WallPaper wallPaper = null;
        r3 = null;
        SQLiteCursor sQLiteCursor = null;
        r3 = null;
        r3 = null;
        y25 y25Var2 = null;
        switch (this.a) {
            case 0:
                uf2 uf2Var = (uf2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j = this.c;
                boolean z = this.d;
                String str2 = (String) this.b;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = uf2Var.currentAccount;
                    if (j >= 0) {
                        userFull = oc7.r1(i).X1(j);
                        M0 = null;
                    } else {
                        M0 = oc7.r1(i).M0(-j);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (M0 != null) {
                        wallPaper = M0.wallpaper;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 < updates.updates.size()) {
                            if (updates.updates.get(i2) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i2)).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    if (z) {
                                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str2;
                                        if (wallPaper != null && (str = wallPaper.uploadingImage) != null && str.equals(str2)) {
                                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                                        }
                                        if (userFull != null) {
                                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                            userFull.wallpaper = wallPaper2;
                                            userFull.flags |= 16777216;
                                            uf2Var.p(j, wallPaper2);
                                            uf2Var.getMessagesStorage().g2(userFull, false);
                                            nm7.f(uf2Var.currentAccount).k(68, Long.valueOf(j), userFull);
                                        } else if (M0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            M0.wallpaper = wallPaper3;
                                            M0.flags2 |= 128;
                                            uf2Var.p(j, wallPaper3);
                                            uf2Var.getMessagesStorage().K1(M0, false);
                                            nm7 f = nm7.f(uf2Var.currentAccount);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(31, M0, 0, bool, bool);
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    oc7.r1(uf2Var.currentAccount).S3(updates.updates, updates.users, updates.chats, false, updates.date);
                    nm7.f(uf2Var.currentAccount).k(nm7.y5, new Object[0]);
                    return;
                }
                return;
            case 1:
                l11.s((Context) this.e, Uri.parse((String) this.b), this.c == 0, this.d, (k11) this.f);
                return;
            case 2:
                i30 i30Var = (i30) this.e;
                long j2 = this.c;
                boolean z2 = this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                Runnable runnable = (Runnable) this.b;
                HashSet hashSet = oc7.r1(i30Var.a).F1().b;
                if (z2) {
                    hashSet.add(Long.valueOf(j2));
                } else {
                    hashSet.remove(Long.valueOf(j2));
                }
                long e = z8c.h(i30Var.a).e();
                TLRPC.UserFull X1 = oc7.r1(i30Var.a).X1(e);
                if (X1 != null) {
                    if (z2) {
                        X1.flags2 |= TLObject.FLAG_21;
                        X1.saved_music = document;
                    } else {
                        TLRPC.Document document2 = X1.saved_music;
                        if (document2 != null && document2.id == j2) {
                            X1.flags2 &= -2097153;
                            X1.saved_music = null;
                        }
                    }
                    cf7.Y(i30Var.a).g2(X1, true);
                    nm7.f(i30Var.a).k(nm7.Y3, Long.valueOf(e));
                }
                runnable.run();
                return;
            case 3:
                g35 g35Var = (g35) this.e;
                long j3 = this.c;
                String str3 = (String) this.b;
                boolean z3 = this.d;
                qac qacVar = (qac) this.f;
                try {
                    g35Var.f = null;
                    Object obj = g35.g;
                    synchronized (obj) {
                        g35Var.c(j3);
                        s = g35Var.s();
                    }
                    if (((LinkedHashMap) s.e).containsKey(str3)) {
                        y25Var = g35Var.h(s, str3, j3);
                        try {
                            synchronized (obj) {
                                g35Var.c(j3);
                                if (z3) {
                                    try {
                                        s.a = ConnectionsManager.getInstance(g35Var.b).getCurrentTime();
                                        if (g35Var.d.exists()) {
                                            g35Var.w(s, new LinkedHashMap());
                                        } else {
                                            if (!g35Var.r().edit().putInt("lastUsageDate", s.a).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            gm.c3(new bn3((byte) 9));
                                        }
                                    } catch (Exception e2) {
                                        g35Var.m(e2);
                                    }
                                }
                            }
                            y25Var2 = y25Var;
                        } catch (Exception e3) {
                            exc = e3;
                            g35Var.m(exc);
                            if (y25Var != null) {
                                y25Var.close();
                            }
                            gm.c3(new p97(g35Var, y25Var2, qacVar, j3));
                            return;
                        }
                    }
                } catch (Exception e4) {
                    exc = e4;
                    y25Var = null;
                }
                gm.c3(new p97(g35Var, y25Var2, qacVar, j3));
                return;
            default:
                cf7 cf7Var = (cf7) this.e;
                boolean z4 = this.d;
                long j4 = this.c;
                Integer[] numArr = (Integer[]) this.f;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = cf7Var.b;
                        if (z4) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j4, new Object[0]);
                            if (sQLiteCursor.next()) {
                                numArr[0] = Integer.valueOf(sQLiteCursor.intValue(0));
                            }
                        } else {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j4, new Object[0]);
                            if (sQLiteCursor.next()) {
                                int intValue = sQLiteCursor.intValue(0);
                                int intValue2 = sQLiteCursor.intValue(1);
                                if (intValue2 > intValue) {
                                    numArr[0] = 0;
                                } else {
                                    numArr[0] = Integer.valueOf(intValue2);
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Exception e5) {
                    cf7Var.n(e5, true);
                    break;
                }
                sQLiteCursor.dispose();
                countDownLatch.countDown();
                return;
        }
    }

    public /* synthetic */ qf2(uf2 uf2Var, TLObject tLObject, long j, boolean z, String str, jd jdVar) {
        this.e = uf2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public /* synthetic */ qf2(g35 g35Var, long j, String str, boolean z, qac qacVar) {
        this.e = g35Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = qacVar;
    }

    public /* synthetic */ qf2(cf7 cf7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = cf7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public /* synthetic */ qf2(Context context, String str, long j, boolean z, k11 k11Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = k11Var;
    }
}
