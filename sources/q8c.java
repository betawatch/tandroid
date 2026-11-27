// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class q8c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8c b;

    public /* synthetic */ q8c(u8c u8cVar, byte b) {
        this.a = b;
        this.b = u8cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        hl.c3(new q8c(r3, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r1 == null) goto L46;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r1 = null;
        SQLiteCursor sQLiteCursor = null;
        sQLitePreparedStatement = null;
        u8c u8cVar = this.b;
        int i = 0;
        switch (b) {
            case 0:
                ArrayList arrayList = u8cVar.b;
                while (i < arrayList.size()) {
                    if (((t8c) arrayList.get(i)).a() <= 0) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                u8cVar.d();
                return;
            case 1:
                SQLiteDatabase sQLiteDatabase = jf7.Y(u8cVar.a).b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList2 = u8cVar.b;
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            t8c t8cVar = (t8c) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(t8cVar.getObjectSize());
                            t8cVar.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        break;
                    }
                } finally {
                }
            case 2:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                u8c u8cVar2 = this.b;
                int i2 = u8cVar2.a;
                SQLiteDatabase sQLiteDatabase2 = jf7.Y(i2).b;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    t8c t8cVar2 = new t8c(u8cVar2, byteBufferValue);
                                    long j = t8cVar2.c;
                                    arrayList5.add(t8cVar2);
                                    hashSet.add(Long.valueOf(t8cVar2.b));
                                    if (t8cVar2.a && !arrayList4.contains(Long.valueOf(j))) {
                                        arrayList4.add(Long.valueOf(j));
                                    }
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                            }
                        }
                        jf7.Y(i2).k0(arrayList4, arrayList3, false);
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    hl.c3(new kta((Object) u8cVar2, arrayList3, (Object) hashSet, (Object) arrayList5, (byte) 20));
                    return;
                } finally {
                }
            default:
                u8cVar.g = false;
                return;
        }
    }
}
