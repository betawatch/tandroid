// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class r77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r77(oc7 oc7Var, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        long j = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 1:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 2:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 3:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 4:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 5:
                nm7.f(oc7Var.currentAccount).k(nm7.I5, Long.valueOf(j));
                return;
            case 6:
                oc7Var.getNotificationsController().N(j);
                return;
            case 7:
                oc7Var.a3(0, j, true);
                return;
            case 8:
                long j2 = this.c;
                oc7 oc7Var2 = this.b;
                SQLiteCursor sQLiteCursor2 = null;
                r1 = null;
                r1 = null;
                r1 = null;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = null;
                try {
                    sQLiteCursor = oc7Var2.getMessagesStorage().b.queryFinalized("SELECT data FROM saved_reaction_tags WHERE topic_id = ?", Long.valueOf(j2));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                messages_savedreactiontags = TLRPC.messages_SavedReactionTags.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                            }
                        } catch (Exception e) {
                            e = e;
                            fc4.g(e, true);
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = sQLiteCursor;
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
                sQLiteCursor.dispose();
                gm.c3(new hq6((Object) oc7Var2, (Object) messages_savedreactiontags, j2, (byte) 4));
                return;
            case 9:
                long j3 = -j;
                oc7Var.P0.delete(j3);
                oc7Var.q0.delete(j3);
                oc7Var.r0.e(j3);
                oc7Var.s0.delete(j3);
                oc7Var.t0.e(j3);
                return;
            case 10:
                oc7Var.getNotificationCenter().k(80, Long.valueOf(j));
                return;
            case 11:
                oc7Var.a3(0, j, true);
                return;
            case 12:
                oc7Var.n.remove(Long.valueOf(j));
                return;
            case 13:
                oc7Var.getNotificationCenter().k(28, Long.valueOf(j));
                return;
            case 14:
                oc7Var.getNotificationCenter().k(nm7.a4, Long.valueOf(j));
                return;
            case 15:
                oc7Var.a3(0, j, true);
                return;
            case 16:
                oc7Var.a3(0, j, true);
                return;
            case 17:
                gm.c3(new r77(oc7Var, j, (byte) 5));
                return;
            case 18:
                oc7Var.getNotificationCenter().k(nm7.b5, Long.valueOf(j), 0L);
                return;
            case 19:
                gm.c3(new r77(oc7Var, j, (byte) 6));
                return;
            case 20:
                oc7Var.a3(0, j, true);
                return;
            case 21:
                oc7Var.a3(0, j, true);
                return;
            case 22:
                oc7Var.a3(0, j, true);
                return;
            default:
                oc7Var.a3(0, j, true);
                return;
        }
    }
}
