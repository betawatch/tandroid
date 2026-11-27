// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class re7 implements Runnable {
    public final /* synthetic */ jf7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zh6 e;
    public final /* synthetic */ zh6 f;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ CountDownLatch r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ re7(jf7 jf7Var, int i, ArrayList arrayList, int i2, zh6 zh6Var, zh6 zh6Var2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.a = jf7Var;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = zh6Var;
        this.f = zh6Var2;
        this.h = arrayList2;
        this.n = arrayList3;
        this.r = countDownLatch;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(8:4|5|6|(4:8|9|(3:11|12|(3:18|19|20)(3:14|15|16))(1:21)|17)(1:37)|22|23|28|29)|24|25|(1:27)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x021b, code lost:
    
        r9.dispose();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021b  */
    /* JADX WARN: Type inference failed for: r12v10, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, org.telegram.tgnet.TLRPC$Message] */
    /* JADX WARN: Type inference failed for: r2v13, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v23, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [zh6] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? r7;
        ?? queryFinalized;
        ArrayList arrayList3;
        boolean z2;
        zh6 zh6Var;
        boolean z3;
        ArrayList arrayList4;
        TLRPC.TL_dialog tL_dialog;
        jf7 jf7Var = this.a;
        int i = this.b;
        ?? r3 = this.f;
        ArrayList arrayList5 = this.h;
        ArrayList arrayList6 = this.n;
        CountDownLatch countDownLatch = this.r;
        try {
            try {
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                r7 = 0;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i + " ORDER BY ord ASC", new Object[0]);
            } catch (Exception e) {
                e = e;
                sQLiteCursor = null;
            }
            while (true) {
                try {
                    try {
                        boolean next = queryFinalized.next();
                        arrayList3 = this.c;
                        if (!next) {
                            break;
                        }
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue != -1) {
                                arrayList3.add(Long.valueOf(longValue));
                                if (wf3.D(longValue)) {
                                    arrayList.add(Long.valueOf(longValue));
                                } else {
                                    arrayList2.add(Long.valueOf(-longValue));
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor = queryFinalized;
                            z = true;
                        }
                        e = e2;
                        sQLiteCursor = queryFinalized;
                        z = true;
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteCursor = queryFinalized;
                        z = true;
                        jf7Var.n(e, z);
                        if (sQLiteCursor != null) {
                        }
                        countDownLatch.countDown();
                    }
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                    }
                    countDownLatch.countDown();
                    throw th;
                }
                jf7Var.n(e, z);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            queryFinalized.dispose();
            if (arrayList3.isEmpty() && this.d) {
                try {
                    queryFinalized = jf7Var.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                    while (queryFinalized.next()) {
                        long longValue2 = queryFinalized.longValue(0);
                        arrayList3.add(Long.valueOf(longValue2));
                        if (wf3.D(longValue2)) {
                            arrayList.add(Long.valueOf(longValue2));
                        } else {
                            arrayList2.add(Long.valueOf(-longValue2));
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e4) {
                    e = e4;
                    z = true;
                    sQLiteCursor = null;
                }
            }
            boolean isEmpty = arrayList3.isEmpty();
            SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
            if (isEmpty) {
                z2 = true;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
            } else {
                Locale locale2 = Locale.US;
                z2 = false;
                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
            }
            while (true) {
                boolean next2 = queryFinalized.next();
                zh6Var = this.e;
                z3 = z2;
                if (!next2) {
                    break;
                }
                long longValue3 = queryFinalized.longValue(r7);
                if (wf3.C(longValue3)) {
                    arrayList4 = arrayList3;
                } else {
                    if (z3) {
                        arrayList3.add(Long.valueOf(longValue3));
                    }
                    TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                    tL_dialog2.id = longValue3;
                    tL_dialog2.top_message = queryFinalized.intValue(1);
                    tL_dialog2.unread_count = queryFinalized.intValue(2);
                    tL_dialog2.last_message_date = queryFinalized.intValue(3);
                    arrayList4 = arrayList3;
                    zh6Var.k(tL_dialog2.id, tL_dialog2);
                    ?? byteBufferValue = queryFinalized.byteBufferValue(4);
                    if (byteBufferValue != 0) {
                        ?? TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r7), r7);
                        TLdeserialize.readAttachPath(byteBufferValue, jf7Var.getUserConfig().n);
                        byteBufferValue.reuse();
                        r47.L5(queryFinalized.intValue(5), TLdeserialize);
                        TLdeserialize.id = queryFinalized.intValue(6);
                        TLdeserialize.send_state = queryFinalized.intValue(7);
                        int intValue = queryFinalized.intValue(8);
                        if (intValue != 0) {
                            tL_dialog = tL_dialog2;
                            tL_dialog.last_message_date = intValue;
                        } else {
                            tL_dialog = tL_dialog2;
                        }
                        long j = tL_dialog.id;
                        TLdeserialize.dialog_id = j;
                        r3.k(j, TLdeserialize);
                        jf7.d(TLdeserialize, arrayList, arrayList2, null);
                    }
                }
                arrayList3 = arrayList4;
                z2 = z3;
                r7 = 0;
            }
            ArrayList arrayList7 = arrayList3;
            queryFinalized.dispose();
            if (!z3 && arrayList7.size() > zh6Var.m()) {
                int size = arrayList7.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Long l = (Long) arrayList7.get(i2);
                    long longValue4 = l.longValue();
                    if (zh6Var.f(((Long) arrayList7.get(i2)).longValue()) == null) {
                        TLRPC.TL_dialog tL_dialog3 = new TLRPC.TL_dialog();
                        tL_dialog3.id = longValue4;
                        zh6Var.k(longValue4, tL_dialog3);
                        if (wf3.y(longValue4)) {
                            long j2 = -longValue4;
                            if (arrayList2.contains(Long.valueOf(j2))) {
                                arrayList2.add(Long.valueOf(j2));
                            }
                        } else if (arrayList.contains(l)) {
                            arrayList.add(l);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                jf7Var.P(TextUtils.join(",", arrayList2), arrayList5);
            }
            if (!arrayList.isEmpty()) {
                jf7Var.k0(arrayList, arrayList6, false);
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = null;
        }
    }
}
