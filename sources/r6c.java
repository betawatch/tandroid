// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class r6c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v6c b;

    public /* synthetic */ r6c(v6c v6cVar, byte b) {
        this.a = b;
        this.b = v6cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        gm.c3(new r6c(r3, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00de, code lost:
    
        if (r1 == null) goto L45;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        v6c v6cVar = this.b;
        int i = 0;
        switch (b) {
            case 0:
                ArrayList arrayList = v6cVar.b;
                while (i < arrayList.size()) {
                    if (((u6c) arrayList.get(i)).a() <= 0) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                v6cVar.d();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                v6c v6cVar2 = this.b;
                int i2 = v6cVar2.a;
                SQLiteDatabase sQLiteDatabase = cf7.Y(i2).b;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    u6c u6cVar = new u6c(v6cVar2, byteBufferValue);
                                    long j = u6cVar.c;
                                    arrayList4.add(u6cVar);
                                    hashSet.add(Long.valueOf(u6cVar.b));
                                    if (u6cVar.a && !arrayList3.contains(Long.valueOf(j))) {
                                        arrayList3.add(Long.valueOf(j));
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                            }
                        }
                        cf7.Y(i2).k0(arrayList3, arrayList2, false);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    gm.c3(new hza(v6cVar2, arrayList2, hashSet, arrayList4, (byte) 19));
                    return;
                } finally {
                }
            case 2:
                SQLiteDatabase sQLiteDatabase2 = cf7.Y(v6cVar.a).b;
                try {
                    try {
                        sQLiteDatabase2.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList5 = v6cVar.b;
                        int size = arrayList5.size();
                        while (i < size) {
                            Object obj = arrayList5.get(i);
                            i++;
                            u6c u6cVar2 = (u6c) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(u6cVar2.getObjectSize());
                            u6cVar2.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } finally {
                    }
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    break;
                }
            default:
                v6cVar.g = false;
                return;
        }
    }
}
