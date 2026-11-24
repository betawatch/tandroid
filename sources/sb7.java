// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class sb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public /* synthetic */ sb7(ad7 ad7Var, long j, long j2, String str, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
        this.e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        if (r12 != 0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        SQLiteCursor sQLiteCursor;
        long j2;
        ?? r5 = 0;
        switch (this.a) {
            case 0:
                ad7 ad7Var = this.b;
                long j3 = this.c;
                long j4 = this.d;
                String str = this.e;
                ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor2 = 0;
                sQLiteCursor2 = 0;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = " + j3 + " ORDER BY date DESC LIMIT 20", new Object[0]);
                        while (sQLiteCursor2.next()) {
                            try {
                                int intValue = sQLiteCursor2.intValue(r5);
                                NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(1);
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r5), r5);
                                if (TLdeserialize != null) {
                                    j2 = j3;
                                    try {
                                        TLdeserialize.readAttachPath(byteBufferValue, y6c.h(ad7Var.currentAccount).n);
                                    } catch (Exception e) {
                                        e = e;
                                        j = j2;
                                        fa4.g(e, true);
                                        sQLiteCursor = sQLiteCursor2;
                                        break;
                                    }
                                } else {
                                    j2 = j3;
                                }
                                if (cf3.n(TLdeserialize.from_id) == j4) {
                                    TLdeserialize.flags2 |= TLObject.FLAG_12;
                                    TLdeserialize.from_rank = str;
                                    arrayList.add(new Pair(Integer.valueOf(intValue), TLdeserialize));
                                }
                                j3 = j2;
                                r5 = 0;
                            } catch (Exception e2) {
                                e = e2;
                                j2 = j3;
                                j = j2;
                                fa4.g(e, true);
                                sQLiteCursor = sQLiteCursor2;
                            }
                        }
                        j2 = j3;
                        sQLiteCursor2.dispose();
                        int i = 0;
                        while (i < arrayList.size()) {
                            int intValue2 = ((Integer) ((Pair) arrayList.get(i)).first).intValue();
                            TLRPC.Message message = (TLRPC.Message) ((Pair) arrayList.get(i)).second;
                            SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            k27.p5(message);
                            message.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, intValue2);
                            j = j2;
                            try {
                                executeFast.bindLong(3, j);
                                executeFast.step();
                                executeFast.dispose();
                                nativeByteBuffer.reuse();
                                i++;
                                j2 = j;
                            } catch (Exception e3) {
                                e = e3;
                                fa4.g(e, true);
                                sQLiteCursor = sQLiteCursor2;
                            }
                        }
                        j = j2;
                        sQLiteCursor = sQLiteCursor2;
                    } catch (Exception e4) {
                        e = e4;
                        j = j3;
                    }
                    sQLiteCursor.dispose();
                    if (arrayList.size() > 0) {
                        gl.c3(new sb7(ad7Var, j, j4, str, (byte) 1));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursor2 != 0) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
            default:
                ad7 ad7Var2 = this.b;
                kk7.f(ad7Var2.currentAccount).k(2, 0);
                kk7.f(ad7Var2.currentAccount).k(kk7.Y3, Long.valueOf(-this.c), Long.valueOf(this.d), this.e);
                return;
        }
    }
}
