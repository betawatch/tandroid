package vh;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.is;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ q0(is isVar, s0 s0Var, int i10) {
        this.a = i10;
        this.b = isVar;
        this.c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.a) {
            case 0:
                is isVar = this.b;
                s0 s0Var = this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = isVar.b;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    s0Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    s0Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, s0Var.a);
                    int i10 = 2;
                    sQLitePreparedStatement.bindLong(2, s0Var.b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (s0Var.G) {
                        i10 = 1;
                    } else if (!s0Var.M) {
                        i10 = 0;
                    }
                    sQLitePreparedStatement.bindInteger(4, i10);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer2.reuse();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                is isVar2 = this.b;
                s0 s0Var2 = this.c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = isVar2.b;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2 = sQLiteDatabase2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement2.requery();
                    NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                    s0Var2.b(nativeByteBuffer3);
                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                    s0Var2.b(nativeByteBuffer4);
                    sQLitePreparedStatement2.bindLong(1, s0Var2.a);
                    int i11 = 2;
                    sQLitePreparedStatement2.bindLong(2, s0Var2.b);
                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                    if (s0Var2.G) {
                        i11 = 1;
                    } else if (!s0Var2.M) {
                        i11 = 0;
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
