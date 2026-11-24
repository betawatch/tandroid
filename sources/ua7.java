// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ua7(ad7 ad7Var, long j, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vf6 vf6Var;
        na7 messagesController;
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        long j = this.c;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                try {
                    ad7Var.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j).stepThis().dispose();
                    ad7Var.b.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    ad7Var.n(e, true);
                    return;
                }
            case 1:
                try {
                    ad7Var.b.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    ad7Var.n(e2, true);
                    return;
                }
            case 2:
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (SQLiteException e3) {
                    e3.printStackTrace();
                    return;
                }
            case 3:
                ad7 ad7Var2 = this.b;
                try {
                    try {
                        long e4 = ad7Var2.getUserConfig().e();
                        SQLiteDatabase sQLiteDatabase2 = ad7Var2.b;
                        Long valueOf = Long.valueOf(e4);
                        Long valueOf2 = Long.valueOf(j);
                        Object[] objArr = new Object[2];
                        try {
                            objArr[0] = valueOf;
                            objArr[1] = valueOf2;
                            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", objArr);
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (queryFinalized.next()) {
                                    arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                                }
                                queryFinalized.dispose();
                                queryFinalized = ad7Var2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e4));
                                while (queryFinalized.next()) {
                                    int intValue = queryFinalized.intValue(0);
                                    if (!arrayList.contains(Integer.valueOf(intValue))) {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                                        if (k27.Q1(e4, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j) {
                                            arrayList.add(Integer.valueOf(intValue));
                                        }
                                        byteBufferValue.reuse();
                                    }
                                }
                                queryFinalized.dispose();
                                if (!arrayList.isEmpty()) {
                                    ad7Var2.N0(0, 0, e4, arrayList, true);
                                    ad7Var2.O1(e4, -e4, arrayList, null);
                                    try {
                                        jc7 jc7Var = new jc7(ad7Var2, e4, arrayList, (byte) 9);
                                        ad7Var2 = ad7Var2;
                                        gl.d3(jc7Var);
                                    } catch (Exception e5) {
                                        e = e5;
                                        ad7Var2 = ad7Var2;
                                        ad7Var2.n(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        return;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
                return;
            case 4:
                try {
                    ad7Var.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    ad7Var.n(e9, true);
                    return;
                }
            case 5:
                try {
                    ad7Var.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    ad7Var.n(e10, true);
                    return;
                }
            case 6:
                try {
                    ad7Var.b.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    ad7Var.n(e11, true);
                    return;
                }
            default:
                long j2 = this.c;
                boolean z = true;
                try {
                    try {
                        SQLiteCursor queryFinalized2 = ad7Var.b.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j2, new Object[0]);
                        try {
                            vf6Var = new vf6();
                            while (queryFinalized2.next()) {
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                                if (byteBufferValue2 != null) {
                                    TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    if (TLdeserialize != null) {
                                        vf6Var.k(TLdeserialize, queryFinalized2.longValue(0));
                                    }
                                }
                            }
                            queryFinalized2.dispose();
                            messagesController = ad7Var.getMessagesController();
                            messagesController.getClass();
                        } catch (Exception e12) {
                            e = e12;
                            sQLiteCursor = queryFinalized2;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized2;
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    gl.d3(new b61((Object) messagesController, j2, (Object) vf6Var, z, (byte) 5));
                    return;
                } catch (Exception e14) {
                    e = e14;
                    ad7Var.n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
        }
    }
}
