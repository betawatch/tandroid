// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class t77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ t77(uc7 uc7Var, long j, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [rf0, uc7] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        long j = this.c;
        ?? r6 = this.b;
        switch (b) {
            case 0:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 1:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 2:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 3:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 4:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 5:
                jn7.f(r6.currentAccount).k(jn7.H5, Long.valueOf(j));
                return;
            case 6:
                r6.e3(0, j, true);
                return;
            case 7:
                long j2 = -j;
                r6.P0.delete(j2);
                r6.q0.delete(j2);
                r6.r0.e(j2);
                r6.s0.delete(j2);
                r6.t0.e(j2);
                return;
            case 8:
                r6.getNotificationCenter().k(80, Long.valueOf(j));
                return;
            case 9:
                long j3 = this.c;
                uc7 uc7Var = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    try {
                        sQLiteCursor = uc7Var.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j3));
                        try {
                            boolean next = sQLiteCursor.next();
                            r6 = sQLiteCursor;
                            if (next) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                r6 = sQLiteCursor;
                                if (byteBufferValue != null) {
                                    messages_savedreactiontags = TLRPC.messages_SavedReactionTags.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                    r6 = sQLiteCursor;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            cc4.g(e, true);
                            r6 = sQLiteCursor;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = r6;
                        if (sQLiteCursor2 != null) {
                            throw th;
                        }
                        sQLiteCursor2.dispose();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor2 != null) {
                    }
                }
                r6.dispose();
                hl.c3(new cq6((Object) uc7Var, (Object) messages_savedreactiontags, j3, (byte) 4));
                return;
            case 10:
                r6.n.remove(Long.valueOf(j));
                return;
            case 11:
                r6.getNotificationCenter().k(28, Long.valueOf(j));
                return;
            case 12:
                r6.getNotificationCenter().k(jn7.a4, Long.valueOf(j));
                return;
            case 13:
                r6.e3(0, j, true);
                return;
            case 14:
                r6.e3(0, j, true);
                return;
            case 15:
                hl.c3(new t77(r6, j, (byte) 5));
                return;
            case 16:
                r6.getNotificationCenter().k(jn7.a5, Long.valueOf(j), 0L);
                return;
            case 17:
                r6.e3(0, j, true);
                return;
            case 18:
                r6.e3(0, j, true);
                return;
            case 19:
                hl.c3(new t77(r6, j, (byte) 23));
                return;
            case 20:
                r6.e3(0, j, true);
                return;
            case 21:
                r6.e3(0, j, true);
                return;
            case 22:
                r6.e3(0, j, true);
                return;
            default:
                r6.getNotificationsController().N(j);
                return;
        }
    }
}
