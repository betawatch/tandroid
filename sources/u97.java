// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w97 b;

    public /* synthetic */ u97(w97 w97Var, byte b) {
        this.a = b;
        this.b = w97Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int readInt32;
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r1 = null;
        SQLiteCursor sQLiteCursor2 = null;
        int i2 = 0;
        w97 w97Var = this.b;
        switch (b) {
            case 0:
                long j = w97Var.a;
                SQLiteDatabase sQLiteDatabase = w97Var.h.getMessagesStorage().b;
                HashMap hashMap = new HashMap();
                try {
                    try {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT count FROM dialog_photos_count WHERE uid = " + j, new Object[0]);
                        try {
                            try {
                                i = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                try {
                                    queryFinalized.dispose();
                                    try {
                                        SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT num, data FROM dialog_photos WHERE uid = " + j, new Object[0]);
                                        while (queryFinalized2.next()) {
                                            try {
                                                try {
                                                    int intValue = queryFinalized2.intValue(0);
                                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                                    TLRPC.Photo TLdeserialize = (byteBufferValue == null || (readInt32 = byteBufferValue.readInt32(false)) == 1450380236) ? null : TLRPC.Photo.TLdeserialize(byteBufferValue, readInt32, false);
                                                    if (TLdeserialize != null) {
                                                        int max = Math.max(intValue + 1, i);
                                                        try {
                                                            hashMap.put(Integer.valueOf(intValue), TLdeserialize);
                                                            i = max;
                                                        } catch (Exception unused) {
                                                            sQLiteCursor2 = queryFinalized2;
                                                            i2 = max;
                                                            if (sQLiteCursor2 != null) {
                                                            }
                                                            i = i2;
                                                            gl.d3(new j45((Object) w97Var, Math.max(i, hashMap.size()), (Object) hashMap, (byte) 13));
                                                            return;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    sQLiteCursor2 = queryFinalized2;
                                                    i2 = i;
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    i = i2;
                                                    gl.d3(new j45((Object) w97Var, Math.max(i, hashMap.size()), (Object) hashMap, (byte) 13));
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteCursor = queryFinalized2;
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                throw th;
                                            }
                                        }
                                        queryFinalized2.dispose();
                                    } catch (Exception unused3) {
                                    }
                                } catch (Exception unused4) {
                                    sQLiteCursor2 = queryFinalized;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Exception unused5) {
                            sQLiteCursor2 = queryFinalized;
                        }
                    } catch (Exception unused6) {
                    }
                    gl.d3(new j45((Object) w97Var, Math.max(i, hashMap.size()), (Object) hashMap, (byte) 13));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                ArrayList arrayList = w97Var.b;
                long j2 = w97Var.a;
                SQLiteDatabase sQLiteDatabase2 = w97Var.h.getMessagesStorage().b;
                try {
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos WHERE uid = " + j2).stepThis().dispose();
                    sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j2).stepThis().dispose();
                    sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos_count VALUES(" + j2 + ", " + arrayList.size() + ")").stepThis().dispose();
                    sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO dialog_photos VALUES(?, ?, ?, ?)");
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i3);
                        if (photo != null) {
                            if (photo.file_reference == null) {
                                photo.file_reference = new byte[0];
                            }
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(photo.getObjectSize());
                            photo.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindLong(1, j2);
                            sQLitePreparedStatement.bindLong(2, photo.id);
                            sQLitePreparedStatement.bindInteger(3, i3);
                            sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                            nativeByteBuffer.reuse();
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Exception unused7) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th4;
                }
        }
    }
}
