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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class re2 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ re2(j20 j20Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = j20Var;
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
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        String str;
        Exception exc;
        c35 c35Var;
        j35 s;
        TLRPC.WallPaper wallPaper = null;
        r3 = null;
        SQLiteCursor sQLiteCursor = null;
        r3 = null;
        r3 = null;
        c35 c35Var2 = null;
        switch (this.a) {
            case 0:
                af2 af2Var = (af2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j = this.c;
                boolean z = this.d;
                String str2 = (String) this.b;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = af2Var.currentAccount;
                    if (j >= 0) {
                        userFull = uc7.s1(i).Y1(j);
                        N0 = null;
                    } else {
                        N0 = uc7.s1(i).N0(-j);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (N0 != null) {
                        wallPaper = N0.wallpaper;
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
                                            af2Var.p(j, wallPaper2);
                                            af2Var.getMessagesStorage().g2(userFull, false);
                                            jn7.f(af2Var.currentAccount).k(68, Long.valueOf(j), userFull);
                                        } else if (N0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            N0.wallpaper = wallPaper3;
                                            N0.flags2 |= 128;
                                            af2Var.p(j, wallPaper3);
                                            af2Var.getMessagesStorage().K1(N0, false);
                                            jn7 f = jn7.f(af2Var.currentAccount);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(31, N0, 0, bool, bool);
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    uc7.s1(af2Var.currentAccount).X3(updates.updates, updates.users, updates.chats, false, updates.date);
                    jn7.f(af2Var.currentAccount).k(jn7.x5, new Object[0]);
                    return;
                }
                return;
            case 1:
                m01.s((Context) this.e, Uri.parse((String) this.b), this.c == 0, this.d, (l01) this.f);
                return;
            case 2:
                j20 j20Var = (j20) this.e;
                long j2 = this.c;
                boolean z2 = this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                Runnable runnable = (Runnable) this.b;
                HashSet hashSet = uc7.s1(j20Var.a).G1().b;
                if (z2) {
                    hashSet.add(Long.valueOf(j2));
                } else {
                    hashSet.remove(Long.valueOf(j2));
                }
                long e = yac.h(j20Var.a).e();
                TLRPC.UserFull Y1 = uc7.s1(j20Var.a).Y1(e);
                if (Y1 != null) {
                    if (z2) {
                        Y1.flags2 |= TLObject.FLAG_21;
                        Y1.saved_music = document;
                    } else {
                        TLRPC.Document document2 = Y1.saved_music;
                        if (document2 != null && document2.id == j2) {
                            Y1.flags2 &= -2097153;
                            Y1.saved_music = null;
                        }
                    }
                    jf7.Y(j20Var.a).g2(Y1, true);
                    jn7.f(j20Var.a).k(jn7.Y3, Long.valueOf(e));
                }
                runnable.run();
                return;
            case 3:
                k35 k35Var = (k35) this.e;
                long j3 = this.c;
                String str3 = (String) this.b;
                boolean z3 = this.d;
                pcc pccVar = (pcc) this.f;
                try {
                    k35Var.f = null;
                    Object obj = k35.g;
                    synchronized (obj) {
                        k35Var.c(j3);
                        s = k35Var.s();
                    }
                    if (((LinkedHashMap) s.e).containsKey(str3)) {
                        c35Var = k35Var.h(s, str3, j3);
                        try {
                            synchronized (obj) {
                                k35Var.c(j3);
                                if (z3) {
                                    try {
                                        s.a = ConnectionsManager.getInstance(k35Var.b).getCurrentTime();
                                        if (k35Var.d.exists()) {
                                            k35Var.w(s, new LinkedHashMap());
                                        } else {
                                            if (!k35Var.r().edit().putInt("lastUsageDate", s.a).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            hl.c3(new jm3((byte) 11));
                                        }
                                    } catch (Exception e2) {
                                        k35Var.m(e2);
                                    }
                                }
                            }
                            c35Var2 = c35Var;
                        } catch (Exception e3) {
                            exc = e3;
                            k35Var.m(exc);
                            if (c35Var != null) {
                                c35Var.close();
                            }
                            hl.c3(new ba7(k35Var, c35Var2, pccVar, j3));
                            return;
                        }
                    }
                } catch (Exception e4) {
                    exc = e4;
                    c35Var = null;
                }
                hl.c3(new ba7(k35Var, c35Var2, pccVar, j3));
                return;
            default:
                jf7 jf7Var = (jf7) this.e;
                boolean z4 = this.d;
                long j4 = this.c;
                Integer[] numArr = (Integer[]) this.f;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7Var.b;
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
                    jf7Var.n(e5, true);
                    break;
                }
                sQLiteCursor.dispose();
                countDownLatch.countDown();
                return;
        }
    }

    public /* synthetic */ re2(af2 af2Var, TLObject tLObject, long j, boolean z, String str, kc kcVar) {
        this.e = af2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public /* synthetic */ re2(k35 k35Var, long j, String str, boolean z, pcc pccVar) {
        this.e = k35Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = pccVar;
    }

    public /* synthetic */ re2(jf7 jf7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = jf7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public /* synthetic */ re2(Context context, String str, long j, boolean z, l01 l01Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = l01Var;
    }
}
