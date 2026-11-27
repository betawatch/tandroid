// default package

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class yq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ zq3 c;

    public /* synthetic */ yq3(jf7 jf7Var, zq3 zq3Var, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = zq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        byte b = this.a;
        int i = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        zq3 zq3Var = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        sQLiteDatabase2 = jf7Var.b;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        zq3Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        zq3Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, zq3Var.a);
                        sQLitePreparedStatement.bindLong(2, zq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (zq3Var.G) {
                            i = 1;
                        } else if (zq3Var.M) {
                            i = 2;
                        }
                        sQLitePreparedStatement.bindInteger(4, i);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer2.reuse();
                        sQLitePreparedStatement.dispose();
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    try {
                        sQLiteDatabase = jf7Var.b;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        zq3Var.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        zq3Var.b(nativeByteBuffer4);
                        sQLitePreparedStatement.bindLong(1, zq3Var.a);
                        sQLitePreparedStatement.bindLong(2, zq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer4);
                        if (zq3Var.G) {
                            i = 1;
                        } else if (zq3Var.M) {
                            i = 2;
                        }
                        sQLitePreparedStatement.bindInteger(4, i);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatement.dispose();
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
        }
    }
}
