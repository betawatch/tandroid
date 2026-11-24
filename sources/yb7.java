// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ yb7(ad7 ad7Var, long j, int i, long j2) {
        this.a = (byte) 2;
        this.b = ad7Var;
        this.d = j;
        this.c = i;
        this.e = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement executeFast;
        boolean z2;
        boolean z3;
        ad7 ad7Var = this.b;
        ad7Var.getClass();
        try {
            try {
                SparseArray sparseArray = new SparseArray();
                int i = 0;
                int i2 = 0;
                while (true) {
                    j = this.d;
                    if (i2 >= 2) {
                        break;
                    }
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    int i3 = this.c;
                    if (i3 != 0) {
                        if (i2 == 0) {
                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + i3, new Object[i]);
                        } else {
                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j + " AND mid = " + i3, new Object[i]);
                        }
                    } else if (i2 == 0) {
                        sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " ORDER BY mid DESC LIMIT 500", new Object[i]);
                    } else {
                        sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j + " ORDER BY mid DESC LIMIT 500", new Object[i]);
                    }
                    try {
                        try {
                            ArrayList arrayList = new ArrayList();
                            ?? r3 = i;
                            while (sQLiteCursor2.next()) {
                                try {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r3);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r3), r3);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                            TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                                            if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
                                                z3 = false;
                                            } else {
                                                boolean z4 = r3;
                                                z3 = z4;
                                                int i4 = z4;
                                                while (i4 < TLdeserialize.reactions.recent_reactions.size()) {
                                                    TLRPC.MessagePeerReaction messagePeerReaction = TLdeserialize.reactions.recent_reactions.get(i4);
                                                    boolean z5 = true;
                                                    if (k27.B1(messagePeerReaction.peer_id) == this.e) {
                                                        try {
                                                            TLdeserialize.reactions.recent_reactions.remove(i4);
                                                            i4--;
                                                            if (TLdeserialize.reactions.results != null) {
                                                                int i5 = 0;
                                                                while (i5 < TLdeserialize.reactions.results.size()) {
                                                                    TLRPC.ReactionCount reactionCount = TLdeserialize.reactions.results.get(i5);
                                                                    z2 = z5;
                                                                    try {
                                                                        if (k19.d(messagePeerReaction.reaction, reactionCount.reaction)) {
                                                                            int i6 = reactionCount.count - 1;
                                                                            reactionCount.count = i6;
                                                                            if (i6 <= 0) {
                                                                                TLdeserialize.reactions.results.remove(i5);
                                                                                i5--;
                                                                            }
                                                                        }
                                                                        i5++;
                                                                        z5 = z2;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        sQLiteCursor = sQLiteCursor2;
                                                                        z = z2;
                                                                        sQLitePreparedStatement = null;
                                                                        try {
                                                                            ad7Var.n(e, z);
                                                                            sQLiteDatabase2 = ad7Var.b;
                                                                            if (sQLiteDatabase2 != null) {
                                                                                sQLiteDatabase2.commitTransaction();
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                                sQLiteCursor.dispose();
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                                sQLitePreparedStatement.dispose();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            sQLiteDatabase = ad7Var.b;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            if (sQLiteCursor != null) {
                                                                            }
                                                                            if (sQLitePreparedStatement != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z3 = z5;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z2 = true;
                                                        }
                                                    }
                                                    i4++;
                                                }
                                            }
                                            if (z3) {
                                                arrayList.add(TLdeserialize);
                                                sparseArray.put(TLdeserialize.id, TLdeserialize.reactions);
                                            }
                                        }
                                        byteBufferValue.reuse();
                                    }
                                    r3 = 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    z2 = true;
                                }
                            }
                            boolean z6 = true;
                            sQLiteCursor2.dispose();
                            if (!arrayList.isEmpty()) {
                                ad7Var.b.beginTransaction();
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    TLRPC.Message message = (TLRPC.Message) obj;
                                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                    if (i2 == 0) {
                                        try {
                                            executeFast = sQLiteDatabase4.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                                        } catch (Exception e4) {
                                            e = e4;
                                            z = z6;
                                            sQLiteCursor = null;
                                            sQLitePreparedStatement = null;
                                            ad7Var.n(e, z);
                                            sQLiteDatabase2 = ad7Var.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                        }
                                    } else {
                                        executeFast = sQLiteDatabase4.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                    }
                                    SQLitePreparedStatement sQLitePreparedStatement2 = executeFast;
                                    try {
                                        k27.p5(message);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                        message.serializeToStream(nativeByteBuffer);
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(z6 ? 1 : 0, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(2, message.id);
                                        sQLitePreparedStatement2.bindLong(3, j);
                                        sQLitePreparedStatement2.step();
                                        nativeByteBuffer.reuse();
                                        sQLitePreparedStatement2.dispose();
                                        z6 = true;
                                    } catch (Exception e5) {
                                        e = e5;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        z = true;
                                        sQLiteCursor = null;
                                        ad7Var.n(e, z);
                                        sQLiteDatabase2 = ad7Var.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        sQLiteCursor = null;
                                        sQLiteDatabase = ad7Var.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                ad7Var.b.commitTransaction();
                            }
                            i2++;
                            i = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = sQLiteCursor2;
                            sQLitePreparedStatement = null;
                            sQLiteDatabase = ad7Var.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        sQLiteCursor = sQLiteCursor2;
                        z = true;
                    }
                }
                gl.d3(new go6((Object) ad7Var, (Object) sparseArray, j, (byte) 14));
                SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                if (sQLiteDatabase5 != null) {
                    sQLiteDatabase5.commitTransaction();
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = null;
            }
        } catch (Exception e7) {
            e = e7;
            z = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Type inference failed for: r12v10, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r12v11, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v13, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v14, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        LongSparseIntArray longSparseIntArray;
        ?? r12;
        LongSparseIntArray longSparseIntArray2;
        boolean z;
        int max;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        long j = this.d;
        int i = this.c;
        long j2 = this.e;
        ad7 ad7Var = this.b;
        try {
            switch (b) {
                case 0:
                    long j3 = this.d;
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid = " + i + " AND uid = " + j3).stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                        StringBuilder sb = new StringBuilder("SELECT unread_count_i FROM dialogs WHERE did = ");
                        sb.append(j2);
                        ?? queryFinalized = sQLiteDatabase2.queryFinalized(sb.toString(), new Object[0]);
                        try {
                            try {
                                if (queryFinalized.next()) {
                                    try {
                                        max = Math.max(0, queryFinalized.intValue(0) - 1);
                                    } catch (Exception e) {
                                        e = e;
                                        r12 = queryFinalized;
                                        z = true;
                                        try {
                                            ad7Var.n(e, z);
                                            if (r12 != 0) {
                                                r12.dispose();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (r12 != 0) {
                                                r12.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    max = 0;
                                }
                                queryFinalized.dispose();
                                ad7Var.b.executeFast("UPDATE dialogs SET unread_count_i = " + max + " WHERE did = " + j2).stepThis().dispose();
                                LongSparseIntArray longSparseIntArray3 = new LongSparseIntArray(1);
                                longSparseIntArray3.put(j2, max);
                                if (max == 0) {
                                    longSparseIntArray = null;
                                    try {
                                        ad7Var.T1(null, longSparseIntArray3, true);
                                    } catch (Exception e2) {
                                        e = e2;
                                        longSparseIntArray2 = longSparseIntArray;
                                        z = true;
                                        r12 = longSparseIntArray2;
                                        ad7Var.n(e, z);
                                        if (r12 != 0) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r12 = longSparseIntArray;
                                        if (r12 != 0) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    longSparseIntArray = null;
                                }
                                ad7Var.getMessagesController().J3(longSparseIntArray, longSparseIntArray3);
                                ad7Var.b.executeFast("UPDATE messages_topics SET read_state = read_state | 2 WHERE mid = " + i + " AND uid = " + j3).stepThis().dispose();
                                ?? r8 = 0;
                                queryFinalized = ad7Var.b.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i + " AND uid = " + j3, new Object[0]);
                                long j4 = 0;
                                while (queryFinalized.next()) {
                                    ?? byteBufferValue = queryFinalized.byteBufferValue(r8);
                                    if (byteBufferValue != 0) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r8), r8);
                                        byteBufferValue.reuse();
                                        j4 = k27.Z1(ad7Var.currentAccount, TLdeserialize, ad7Var.X(j3));
                                    }
                                    r8 = 0;
                                }
                                queryFinalized.dispose();
                                if (j4 == 0) {
                                    return;
                                }
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                Locale locale2 = Locale.US;
                                ?? queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j2 + " AND topic_id = " + j4, new Object[0]);
                                try {
                                    int max2 = queryFinalized2.next() ? Math.max(0, queryFinalized2.intValue(0) - 1) : 0;
                                    queryFinalized2.dispose();
                                    ad7Var.b.executeFast("UPDATE topics SET unread_mentions = " + max2 + " WHERE did = " + j3 + " AND topic_id = " + j4).stepThis().dispose();
                                    pub pubVar = ad7Var.getMessagesController().g4;
                                    pubVar.getClass();
                                    gl.d3(new l30((pf0) pubVar, j3, j4, max2, (byte) 5));
                                    return;
                                } catch (Exception e3) {
                                    e = e3;
                                    longSparseIntArray2 = queryFinalized2;
                                    z = true;
                                    r12 = longSparseIntArray2;
                                    ad7Var.n(e, z);
                                    if (r12 != 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r12 = queryFinalized2;
                                    if (r12 != 0) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                longSparseIntArray2 = queryFinalized;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r12 = queryFinalized;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        longSparseIntArray = null;
                    } catch (Throwable th5) {
                        th = th5;
                        longSparseIntArray = null;
                    }
                case 1:
                    a();
                    return;
                case 2:
                    ad7Var.getMessagesController().H0(this.d, this.c, this.e, null);
                    return;
                case 3:
                    ad7Var.getMessagesController().m0(this.d, this.c, this.e);
                    return;
                case 4:
                    try {
                        sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                        try {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, i);
                            sQLitePreparedStatement.bindLong(2, j);
                            sQLitePreparedStatement.bindLong(3, j2);
                            sQLitePreparedStatement.step();
                            sQLitePreparedStatement.dispose();
                        } catch (Exception e6) {
                            e = e6;
                            ad7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            return;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        sQLitePreparedStatement = null;
                    } catch (Throwable th6) {
                        th = th6;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                    return;
                case 5:
                    this.b.L0("poll_votes_mentions", "poll_votes_mentions_topics", this.d, this.e, this.c, false);
                    return;
                case 6:
                    this.b.L0("reaction_mentions", "reaction_mentions_topics", this.d, this.e, this.c, true);
                    return;
                default:
                    try {
                        SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                        if (j != 0) {
                            Locale locale3 = Locale.US;
                            sQLiteDatabase4.executeFast("UPDATE topics SET unread_mentions = " + i + " WHERE did = " + j2 + " AND topic_id = " + j).stepThis().dispose();
                            mub mubVar = new mub();
                            mubVar.b = j2;
                            mubVar.c = j;
                            mubVar.j = true;
                            mubVar.d = i;
                            mubVar.e = -1;
                            pub pubVar2 = ad7Var.getMessagesController().g4;
                            List singletonList = Collections.singletonList(mubVar);
                            pubVar2.getClass();
                            gl.d3(new ee2(pubVar2, singletonList, (byte) 13));
                            return;
                        }
                        SQLiteCursor queryFinalized3 = sQLiteDatabase4.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j2, new Object[0]);
                        try {
                            int intValue = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                            queryFinalized3.dispose();
                            if (intValue == 0 && i == 0) {
                                return;
                            }
                            if (i == 0) {
                                SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = " + j2 + " AND mention = 1 AND read_state IN(0, 1)").stepThis().dispose();
                            }
                            SQLiteDatabase sQLiteDatabase6 = ad7Var.b;
                            Locale locale5 = Locale.US;
                            sQLiteDatabase6.executeFast("UPDATE dialogs SET unread_count_i = " + i + " WHERE did = " + j2).stepThis().dispose();
                            LongSparseIntArray longSparseIntArray4 = new LongSparseIntArray(1);
                            longSparseIntArray4.put(j2, i);
                            ad7Var.getMessagesController().J3(null, longSparseIntArray4);
                            if (i == 0) {
                                ad7Var.T1(null, longSparseIntArray4, true);
                                return;
                            }
                            return;
                        } catch (Exception e8) {
                            e = e8;
                            sQLiteCursor = queryFinalized3;
                            try {
                                ad7Var.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor = queryFinalized3;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        sQLiteCursor = null;
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteCursor = null;
                    }
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    public /* synthetic */ yb7(ad7 ad7Var, int i, long j, long j2, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    public /* synthetic */ yb7(ad7 ad7Var, long j, long j2, int i, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.d = j;
        this.e = j2;
        this.c = i;
    }
}
