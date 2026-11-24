// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class r57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r57(na7 na7Var, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r6v0, types: [na7, pf0] */
    /* JADX WARN: Type inference failed for: r9v13, types: [im7] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        ?? r4 = this.c;
        ?? r6 = this.b;
        switch (b) {
            case 0:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 1:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 2:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 3:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 4:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 5:
                kk7.f(r6.currentAccount).k(kk7.G5, Long.valueOf((long) r4));
                return;
            case 6:
                r6.getNotificationsController().N(r4);
                return;
            case 7:
                r6.Y2(0, r4, true);
                return;
            case 8:
                long j = this.c;
                na7 na7Var = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    try {
                        sQLiteCursor = na7Var.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j));
                        try {
                            boolean next = sQLiteCursor.next();
                            r4 = sQLiteCursor;
                            if (next) {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                r4 = sQLiteCursor;
                                if (byteBufferValue != null) {
                                    messages_savedreactiontags = TLRPC.messages_SavedReactionTags.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                                    r4 = sQLiteCursor;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            fa4.g(e, true);
                            r4 = sQLiteCursor;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = r4;
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
                r4.dispose();
                gl.c3(new go6((Object) na7Var, (Object) messages_savedreactiontags, j, (byte) 4));
                return;
            case 9:
                long j2 = -r4;
                r6.P0.delete(j2);
                r6.q0.delete(j2);
                r6.r0.e(j2);
                r6.s0.delete(j2);
                r6.t0.e(j2);
                return;
            case 10:
                r6.getNotificationCenter().k(79, Long.valueOf((long) r4));
                return;
            case 11:
                r6.Y2(0, r4, true);
                return;
            case 12:
                r6.n.remove(Long.valueOf((long) r4));
                return;
            case 13:
                r6.getNotificationCenter().k(kk7.Z3, Long.valueOf((long) r4));
                return;
            case 14:
                r6.Y2(0, r4, true);
                return;
            case 15:
                r6.Y2(0, r4, true);
                return;
            case 16:
                r6.getNotificationCenter().k(kk7.Z4, Long.valueOf((long) r4), 0L);
                return;
            case 17:
                gl.c3(new r57(r6, r4, (byte) 5));
                return;
            case 18:
                r6.Y2(0, r4, true);
                return;
            case 19:
                gl.c3(new r57(r6, r4, (byte) 6));
                return;
            case 20:
                r6.Y2(0, r4, true);
                return;
            case 21:
                r6.Y2(0, r4, true);
                return;
            default:
                r6.Y2(0, r4, true);
                return;
        }
    }
}
