package qh;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ r0(MessagesStorage messagesStorage, s0 s0Var, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = this.b;
                s0 s0Var = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database == null) {
                    return;
                }
                sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                int i10 = 1;
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                s0Var.b(nativeByteBuffer);
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                s0Var.b(nativeByteBuffer2);
                sQLitePreparedStatement.bindLong(1, s0Var.a);
                sQLitePreparedStatement.bindLong(2, s0Var.b);
                sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                if (!s0Var.G) {
                    i10 = s0Var.M ? 2 : 0;
                }
                sQLitePreparedStatement.bindInteger(4, i10);
                sQLitePreparedStatement.step();
                nativeByteBuffer2.reuse();
                sQLitePreparedStatement.dispose();
                sQLitePreparedStatement.dispose();
                return;
            default:
                MessagesStorage messagesStorage2 = this.b;
                s0 s0Var2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        database2 = messagesStorage2.getDatabase();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (database2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement2.requery();
                    int i11 = 1;
                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                    s0Var2.b(nativeByteBuffer3);
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                    s0Var2.b(nativeByteBuffer4);
                    sQLitePreparedStatement2.bindLong(1, s0Var2.a);
                    sQLitePreparedStatement2.bindLong(2, s0Var2.b);
                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                    if (!s0Var2.G) {
                        i11 = s0Var2.M ? 2 : 0;
                    }
                    sQLitePreparedStatement2.bindInteger(4, i11);
                    sQLitePreparedStatement2.step();
                    nativeByteBuffer4.reuse();
                    sQLitePreparedStatement2.dispose();
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
        }
    }
}
