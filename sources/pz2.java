// default package

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ExternalActionActivity;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pz2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pz2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x060e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.User user;
        SQLiteCursor sQLiteCursor2;
        int i;
        SQLiteDatabase sQLiteDatabase;
        long j = 0;
        byte b = 4;
        byte b2 = 3;
        b2 = 3;
        int i2 = 0;
        SQLiteCursor sQLiteCursor3 = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r9 = null;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                zd1 zd1Var = (zd1) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                nz2 nz2Var = (nz2) zd1Var.f;
                nz2Var.getClass();
                try {
                    ((yh4) nz2Var.d.d).H(str2, str3);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = nz2Var.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                njb njbVar = (njb) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                ylb ylbVar = (ylb) this.d;
                njbVar.setText(charSequence);
                anb.X(njbVar.getTextView(), cmb.A6, ylbVar);
                return;
            case 2:
                nk3 nk3Var = (nk3) this.b;
                fj1 fj1Var = (fj1) this.c;
                d dVar = (d) this.d;
                nk3Var.removeSelfFromStack();
                fj1Var.removeSelfFromStack();
                dVar.finishFragment();
                return;
            case 3:
                nk3 nk3Var2 = (nk3) this.b;
                mk3 mk3Var = (mk3) this.c;
                int length = ((Object[]) this.d).length;
                nk3Var2.O4(mk3Var);
                ak3 ak3Var = nk3Var2.A0;
                if (ak3Var == null || ak3Var.getVisibility() != 0) {
                    return;
                }
                nk3Var2.A0.c();
                return;
            case 4:
                dk3 dk3Var = (dk3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ub7 ub7Var = (ub7) this.d;
                dk3Var.getClass();
                boolean z = zArr[0];
                nk3 nk3Var3 = dk3Var.b;
                if (z) {
                    nk3Var3.presentFragment(new me4(ub7Var, null));
                    return;
                } else {
                    cf4.a1(nk3Var3, ub7Var, null);
                    return;
                }
            case 5:
                fl3 fl3Var = (fl3) this.b;
                cf7 cf7Var = (cf7) this.c;
                el3 el3Var = (el3) this.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = cf7Var.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList4.add(Long.valueOf(queryFinalized.longValue(0)));
                            j = Math.max(j, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor = queryFinalized;
                            try {
                                fc4.g(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                gm.c3(new r97((Object) fl3Var, (Object) arrayList3, j, (Object) str, (Object) el3Var, (byte) 6));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList i0 = cf7Var.i0(arrayList4);
                    int size = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList4.get(i3);
                        i3++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = i0.size();
                        int i4 = i2;
                        while (true) {
                            if (i2 < size2) {
                                Object obj2 = i0.get(i2);
                                i2++;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList = arrayList4;
                                    arrayList2 = i0;
                                    if (user.id == longValue) {
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    arrayList2 = i0;
                                }
                                arrayList4 = arrayList;
                                i0 = arrayList2;
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = i0;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList3.add(user);
                        }
                        arrayList4 = arrayList;
                        i2 = i4;
                        i0 = arrayList2;
                    }
                    queryFinalized.dispose();
                } catch (Exception e3) {
                    e = e3;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                gm.c3(new r97((Object) fl3Var, (Object) arrayList3, j, (Object) str, (Object) el3Var, (byte) 6));
                return;
            case 6:
                mm3 mm3Var = (mm3) this.b;
                HashSet hashSet = (HashSet) this.c;
                dm3 dm3Var = (dm3) this.d;
                int i5 = mm3Var.t0;
                oc7 r1 = oc7.r1(i5);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    Long l = (Long) pair.second;
                    long longValue2 = l.longValue();
                    ConcurrentHashMap concurrentHashMap = booleanValue ? r1.Q : r1.P;
                    cf7 Y = cf7.Y(i5);
                    try {
                        sQLiteDatabase = Y.b;
                    } catch (Exception e4) {
                        e = e4;
                        sQLiteCursor2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (booleanValue) {
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue2, new Object[0]);
                        try {
                            try {
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor3 = sQLiteCursor2;
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            Y.n(e, true);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            i = 0;
                            concurrentHashMap.put(l, Integer.valueOf(i));
                        }
                        if (sQLiteCursor2.next()) {
                            i = sQLiteCursor2.intValue(0);
                            sQLiteCursor2.dispose();
                            concurrentHashMap.put(l, Integer.valueOf(i));
                        }
                        i = 0;
                        sQLiteCursor2.dispose();
                        concurrentHashMap.put(l, Integer.valueOf(i));
                    } else {
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue2, new Object[0]);
                        if (sQLiteCursor2.next()) {
                            int intValue = sQLiteCursor2.intValue(0);
                            int intValue2 = sQLiteCursor2.intValue(1);
                            if (intValue2 <= intValue) {
                                i = intValue2;
                                sQLiteCursor2.dispose();
                                concurrentHashMap.put(l, Integer.valueOf(i));
                            }
                        }
                        i = 0;
                        sQLiteCursor2.dispose();
                        concurrentHashMap.put(l, Integer.valueOf(i));
                    }
                }
                gm.c3(dm3Var);
                return;
            case 7:
                ((km3) this.b).a((vh6) this.d, (ArrayList) this.c);
                return;
            case 8:
                wm3 wm3Var = (wm3) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                um3 um3Var = (um3) this.d;
                wm3Var.getClass();
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                wm3Var.b();
                um3Var.c(null, null);
                return;
            case 9:
                un3 un3Var = (un3) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                un3Var.getClass();
                DictationAsr.b0(str4, str5);
                un3Var.A(str4);
                return;
            case 10:
                un3 un3Var2 = (un3) this.b;
                String str6 = (String) this.c;
                vm3 vm3Var = (vm3) this.d;
                if (un3Var2.r == 4) {
                    un3Var2.r = (byte) 3;
                    un3Var2.w(str6);
                    un3Var2.w.d(vm3Var.a(), false);
                    un3Var2.w.setRevert(true);
                    return;
                }
                return;
            case 11:
                op3 op3Var = (op3) this.b;
                Runnable runnable = (Runnable) this.c;
                np3 np3Var = (np3) this.d;
                op3Var.getClass();
                runnable.run();
                Utilities.e.c(new rd3(op3Var, np3Var, (byte) 25));
                return;
            case 12:
                er3 er3Var = (er3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = er3Var.H;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                ArrayList arrayList8 = er3Var.I;
                arrayList8.clear();
                arrayList8.addAll(arrayList6);
                return;
            case 13:
                fs3 fs3Var = (fs3) this.b;
                ((gs3) this.c).i(fs3Var.a, fs3Var.b, (Exception) this.d);
                return;
            case 14:
                fs3 fs3Var2 = (fs3) this.b;
                ((gs3) this.c).N(fs3Var2.a, fs3Var2.b, (jk2) this.d);
                return;
            case 15:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 16:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 17:
                ((kw3) this.b).o((TLRPC.TL_messages_stickerSet) ((TLObject) this.c), (k47) this.d);
                return;
            case 18:
                dx3 dx3Var = (dx3) this.b;
                String str7 = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList9 = dx3Var.w;
                ex3 ex3Var = dx3Var.O;
                ArrayList arrayList10 = dx3Var.s;
                if (TextUtils.equals(str7, dx3Var.I)) {
                    dx3Var.y = 0;
                    arrayList10.clear();
                    arrayList9.clear();
                    dx3Var.E.clear();
                    dx3Var.n.clear();
                    dx3Var.y++;
                    arrayList10.add(null);
                    arrayList9.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList10.addAll(tL_messages_stickers.stickers);
                        dx3Var.y = tL_messages_stickers.stickers.size() + dx3Var.y;
                    }
                    dx3Var.J = dx3Var.I;
                    dx3Var.f();
                    uw3 uw3Var = ex3Var.b;
                    int i6 = uw3.q3;
                    uw3Var.z1(0, 0);
                    ex3Var.f.c(false);
                    ex3Var.e.n(false);
                    return;
                }
                return;
            case 19:
                uk0 uk0Var = (uk0) this.b;
                bhe bheVar = (bhe) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    sn4 a = jfe.a(uk0Var.a);
                    if (a == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    rn4 rn4Var = (rn4) a.a;
                    synchronized (rn4Var.c) {
                        try {
                            rn4Var.e = threadPoolExecutor;
                        } finally {
                        }
                    }
                    a.a.c(new yx3(bheVar, threadPoolExecutor));
                    return;
                } catch (Throwable th6) {
                    bheVar.a(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 20:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 21:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                he heVar = (he) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList11 = ExternalActionActivity.y;
                try {
                    heVar.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        he u0 = ik.u0(externalActionActivity, jb6.M0(2131743507, null), true);
                        if (u0 != null) {
                            u0.setOnDismissListener(new dg(externalActionActivity, tL_error, (byte) 9));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else if ("BOT_INVALID".equals(tL_error.text) || "PUBLIC_KEY_REQUIRED".equals(tL_error.text) || "PUBLIC_KEY_INVALID".equals(tL_error.text) || "SCOPE_EMPTY".equals(tL_error.text) || "PAYLOAD_EMPTY".equals(tL_error.text)) {
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    } else {
                        externalActionActivity.setResult(0);
                        externalActionActivity.finish();
                    }
                    return;
                } catch (Exception e6) {
                    fc4.g(e6, true);
                    return;
                }
            case 22:
                cf7 cf7Var2 = (cf7) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                s2c s2cVar = (s2c) this.d;
                ArrayList arrayList13 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                        ArrayList arrayList14 = new ArrayList();
                        int size3 = arrayList12.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj3 = arrayList12.get(i7);
                            i7++;
                            arrayList14.add(Long.valueOf(((d94) obj3).b));
                            arrayList13.add(null);
                        }
                        sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList14) + ")", new Object[0]);
                        while (true) {
                            if (sQLiteCursor4.next()) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor4.byteBufferValue(0);
                                TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                if (TLdeserialize != null) {
                                    int i8 = -1;
                                    while (i2 < arrayList12.size()) {
                                        if (TLdeserialize.hash == ((d94) arrayList12.get(i2)).b) {
                                            i8 = i2;
                                        }
                                        i2++;
                                    }
                                    if (i8 >= 0 && i8 < arrayList13.size()) {
                                        arrayList13.set(i8, TLdeserialize);
                                    }
                                }
                            }
                        }
                        sQLiteCursor4.dispose();
                    } catch (Exception e7) {
                        fc4.g(e7, true);
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                    }
                    gm.c3(new pv3(s2cVar, arrayList13, (byte) 15));
                    return;
                } catch (Throwable th7) {
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th7;
                }
            case 23:
                kb4 kb4Var = (kb4) this.b;
                int[] iArr = (int[]) this.c;
                bb4 bb4Var = (bb4) this.d;
                kb4Var.l = null;
                kb4Var.k = true;
                int i9 = iArr[0] - 1;
                iArr[0] = i9;
                if (i9 == 0) {
                    bb4Var.run();
                    return;
                }
                return;
            case 24:
                lb4 lb4Var = (lb4) this.b;
                File[] fileArr = (File[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                if (lb4Var.Y != 3 || lb4Var.z) {
                    fileArr[0] = lb4Var.J0;
                } else {
                    fileArr[0] = lb4Var.L0;
                }
                countDownLatch.countDown();
                return;
            case 25:
                bc4 bc4Var = (bc4) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                Object obj4 = this.d;
                if (document == null) {
                    ConcurrentHashMap concurrentHashMap2 = kd4.I;
                } else {
                    Integer num = (Integer) kd4.J.get(Long.valueOf(document.id));
                    if (num != null) {
                        b2 = num.intValue();
                    }
                }
                bc4Var.Y(document, null, null, null, null, obj4, null, 0L, b2, bc4.N, 0L, false, 0);
                return;
            case 26:
                bc4 bc4Var2 = (bc4) this.b;
                u30 u30Var = (u30) this.c;
                lb4 lb4Var2 = (lb4) this.d;
                if (((ArrayList) u30Var.d).remove(lb4Var2)) {
                    bc4Var2.w.remove(lb4Var2.r);
                    u30Var.b(lb4Var2.j);
                    return;
                }
                return;
            case 27:
                lc4 lc4Var = (lc4) this.b;
                File file = (File) this.c;
                kc4 kc4Var = (kc4) this.d;
                lc4Var.c();
                try {
                    try {
                        sQLitePreparedStatement = lc4Var.c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                        sQLitePreparedStatement.bindLong(2, kc4Var.a);
                        sQLitePreparedStatement.bindInteger(3, kc4Var.b);
                        sQLitePreparedStatement.bindInteger(4, kc4Var.c);
                        sQLitePreparedStatement.step();
                    } catch (Exception e8) {
                        fc4.g(e8, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th8) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th8;
                }
            case 28:
                qf4 qf4Var = (qf4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                qf4Var.getClass();
                qf4.x0(tL_error2, qf4Var, c41.b0(qf4Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    oc7.d1().edit().putBoolean("n_0", true).apply();
                    qf4Var.getMessagesController().g3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    me4 me4Var = new me4(qf4Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    me4Var.y = new re4(qf4Var, b2);
                    me4Var.x = new re4(qf4Var, b);
                    qf4Var.presentFragment(me4Var);
                    gm.d3(new ve4(qf4Var, tL_chatlists_exportedChatlistInvite, b), 200L);
                    return;
                }
                return;
            default:
                cf4 cf4Var = (cf4) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                d dVar2 = cf4Var.r1;
                qf4.x0(tL_error3, dVar2, new c41(cf4Var.V1, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    oc7.d1().edit().putBoolean("n_0", true).apply();
                    cf4Var.dismiss();
                    dVar2.getMessagesController().g3(true, null);
                    dVar2.presentFragment(new me4(cf4Var.T1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    return;
                }
                return;
        }
    }
}
