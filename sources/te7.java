// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class te7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ te7(kf7 kf7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
        this.d = arrayList;
    }

    private final void a() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = this.d;
        long j = this.c;
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                kf7Var.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
            Locale locale2 = Locale.US;
            sQLiteDatabase2.executeFast("DELETE FROM messages_topics WHERE uid = " + j + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    private final void b() {
        Exception exc;
        Throwable th;
        SQLitePreparedStatement executeFast;
        kf7 kf7Var = this.b;
        long j = this.c;
        ArrayList arrayList = this.d;
        long j2 = -j;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                kf7Var.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j2).stepThis().dispose();
                kf7Var.b.beginTransaction();
                executeFast = kf7Var.b.executeFast("REPLACE INTO channel_users_v2 VALUES(?, ?, ?, ?)");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            exc = e;
        }
        try {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) arrayList.get(i);
                executeFast.requery();
                executeFast.bindLong(1, j2);
                executeFast.bindLong(2, r47.B1(channelParticipant.peer));
                executeFast.bindInteger(3, currentTimeMillis);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                channelParticipant.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(4, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                currentTimeMillis--;
            }
            executeFast.dispose();
            kf7Var.b.commitTransaction();
            kf7Var.F0(j, true, null, false, true, 0);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            exc = e2;
            sQLitePreparedStatement = executeFast;
            kf7Var.p(exc, true);
            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement == null) {
                throw th;
            }
            sQLitePreparedStatement.dispose();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        ArrayList arrayList2;
        long j;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        SQLitePreparedStatement sQLitePreparedStatement2;
        byte b = this.a;
        int i = 4;
        int i2 = 7;
        int i3 = 3;
        kf7 kf7Var = this.b;
        ArrayList arrayList6 = this.d;
        long j2 = this.c;
        int i4 = 0;
        switch (b) {
            case 0:
                ArrayList arrayList7 = new ArrayList();
                try {
                    String join = TextUtils.join(",", arrayList6);
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    Locale locale = Locale.US;
                    boolean z = false;
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j2 + " AND mid IN (" + join + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        try {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(z ? 1 : 0);
                                if (byteBufferValue != null) {
                                    try {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.readAttachPath(byteBufferValue, kf7Var.getUserConfig().n);
                                            if (!TLdeserialize.out && TLdeserialize.media_unread && r47.Q4(TLdeserialize)) {
                                                arrayList7.add(new r47(kf7Var.currentAccount, TLdeserialize, false, false));
                                                byteBufferValue.reuse();
                                                z = false;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                        z = false;
                                    } catch (Throwable th) {
                                        byteBufferValue.reuse();
                                        throw th;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                kf7Var.p(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (arrayList7.isEmpty()) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor.dispose();
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                if (arrayList7.isEmpty()) {
                    hl.c3(new q41(kf7Var, arrayList7, (byte) 22));
                    return;
                }
                return;
            case 1:
                kf7 kf7Var2 = this.b;
                long j3 = this.c;
                ArrayList arrayList8 = this.d;
                kf7Var2.S0(0, 0, j3, arrayList8);
                kf7Var2.getNotificationCenter().k(66, Long.valueOf(j3), arrayList8);
                return;
            case 2:
                kf7 kf7Var3 = this.b;
                try {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase2 = kf7Var3.b;
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, uid, custom_params FROM messages_v2 WHERE mid IN (" + TextUtils.join(",", arrayList6) + ") AND uid = " + j2, new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, kf7Var3.getUserConfig().n);
                                    byteBufferValue2.reuse();
                                    if (TLdeserialize2.media != null) {
                                        try {
                                            boolean a = kf7Var3.a(TLdeserialize2, arrayList9, arrayList11, arrayList10, true);
                                            arrayList3 = arrayList9;
                                            arrayList4 = arrayList11;
                                            arrayList5 = arrayList10;
                                            if (a) {
                                                TLRPC.MessageMedia messageMedia = TLdeserialize2.media;
                                                if (messageMedia.document != null) {
                                                    messageMedia.document = new TLRPC.TL_documentEmpty();
                                                } else if (messageMedia.photo != null) {
                                                    messageMedia.photo = new TLRPC.TL_photoEmpty();
                                                }
                                                TLdeserialize2.media.flags &= -2;
                                                TLdeserialize2.id = queryFinalized.intValue(1);
                                                TLdeserialize2.date = queryFinalized.intValue(2);
                                                TLdeserialize2.dialog_id = queryFinalized.longValue(3);
                                                NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(4);
                                                if (byteBufferValue3 != null) {
                                                    s37.b(TLdeserialize2, byteBufferValue3);
                                                    byteBufferValue3.reuse();
                                                }
                                                arrayList12.add(TLdeserialize2);
                                            }
                                            arrayList9 = arrayList3;
                                            arrayList10 = arrayList5;
                                            arrayList11 = arrayList4;
                                        } catch (Exception e3) {
                                            e = e3;
                                            kf7Var3 = kf7Var3;
                                            sQLiteCursor2 = queryFinalized;
                                            sQLitePreparedStatement = null;
                                            try {
                                                kf7Var3.p(e, true);
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement == null) {
                                                    return;
                                                }
                                                sQLitePreparedStatement.dispose();
                                                return;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList10;
                                arrayList9 = arrayList3;
                                arrayList10 = arrayList5;
                                arrayList11 = arrayList4;
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor2 = queryFinalized;
                            sQLitePreparedStatement = null;
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    ArrayList arrayList13 = arrayList9;
                    ArrayList arrayList14 = arrayList11;
                    ArrayList arrayList15 = arrayList10;
                    queryFinalized.dispose();
                    kf7Var3.E(arrayList14, true);
                    int i5 = 15;
                    if (arrayList12.isEmpty()) {
                        arrayList = arrayList13;
                        sQLitePreparedStatement = null;
                    } else {
                        sQLitePreparedStatement = kf7Var3.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                        int i6 = 0;
                        while (i6 < arrayList12.size()) {
                            try {
                                TLRPC.Message message = (TLRPC.Message) arrayList12.get(i6);
                                r47.p5(message);
                                NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer3);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, message.id);
                                sQLitePreparedStatement.bindLong(2, message.dialog_id);
                                sQLitePreparedStatement.bindInteger(i3, r47.c2(message));
                                sQLitePreparedStatement.bindInteger(i, message.send_state);
                                sQLitePreparedStatement.bindInteger(5, message.date);
                                sQLitePreparedStatement.bindByteBuffer(6, nativeByteBuffer3);
                                sQLitePreparedStatement.bindInteger(i2, (message.out || message.from_scheduled) ? 1 : 0);
                                sQLitePreparedStatement.bindInteger(8, message.ttl);
                                if ((message.flags & 1024) != 0) {
                                    sQLitePreparedStatement.bindInteger(9, message.views);
                                } else {
                                    sQLitePreparedStatement.bindInteger(9, kf7.d0(message));
                                }
                                if (message.replyStory != null) {
                                    nativeByteBuffer = new NativeByteBuffer(message.replyStory.getObjectSize());
                                    message.replyStory.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement.bindByteBuffer(10, nativeByteBuffer);
                                } else {
                                    sQLitePreparedStatement.bindNull(10);
                                    nativeByteBuffer = null;
                                }
                                int i7 = message.stickerVerified;
                                sQLitePreparedStatement.bindInteger(11, i7 == 0 ? 1 : i7 == 2 ? 2 : 0);
                                sQLitePreparedStatement.bindInteger(12, message.mentioned ? 1 : 0);
                                sQLitePreparedStatement.bindInteger(13, message.forwards);
                                if (message.replies != null) {
                                    nativeByteBuffer2 = new NativeByteBuffer(message.replies.getObjectSize());
                                    message.replies.serializeToStream(nativeByteBuffer2);
                                    sQLitePreparedStatement.bindByteBuffer(14, nativeByteBuffer2);
                                } else {
                                    sQLitePreparedStatement.bindNull(14);
                                    nativeByteBuffer2 = null;
                                }
                                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                                if (messageReplyHeader != null) {
                                    int i8 = messageReplyHeader.reply_to_top_id;
                                    if (i8 == 0) {
                                        i8 = messageReplyHeader.reply_to_msg_id;
                                    }
                                    sQLitePreparedStatement.bindInteger(i5, i8);
                                } else {
                                    sQLitePreparedStatement.bindInteger(i5, 0);
                                }
                                TLRPC.Peer peer = message.peer_id;
                                if (peer != null) {
                                    arrayList2 = arrayList13;
                                    j = peer.channel_id;
                                } else {
                                    arrayList2 = arrayList13;
                                    j = 0;
                                }
                                sQLitePreparedStatement.bindLong(16, j);
                                NativeByteBuffer c = s37.c(message);
                                if (c != null) {
                                    sQLitePreparedStatement.bindByteBuffer(16, c);
                                } else {
                                    sQLitePreparedStatement.bindNull(17);
                                }
                                NativeByteBuffer nativeByteBuffer4 = nativeByteBuffer2;
                                if ((message.flags & 131072) != 0) {
                                    sQLitePreparedStatement.bindLong(18, message.grouped_id);
                                } else {
                                    sQLitePreparedStatement.bindNull(18);
                                }
                                TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
                                if (messageReplyHeader2 != null) {
                                    sQLitePreparedStatement.bindInteger(19, messageReplyHeader2.story_id);
                                } else {
                                    sQLitePreparedStatement.bindInteger(19, 0);
                                }
                                sQLitePreparedStatement.step();
                                nativeByteBuffer3.reuse();
                                if (nativeByteBuffer4 != null) {
                                    nativeByteBuffer4.reuse();
                                }
                                if (c != null) {
                                    c.reuse();
                                }
                                if (nativeByteBuffer != null) {
                                    nativeByteBuffer.reuse();
                                }
                                i6++;
                                arrayList13 = arrayList2;
                                i5 = 15;
                                i = 4;
                                i2 = 7;
                                i3 = 3;
                            } catch (Exception e5) {
                                e = e5;
                                sQLiteCursor2 = null;
                                kf7Var3.p(e, true);
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement == null) {
                                }
                                sQLitePreparedStatement.dispose();
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                sQLiteCursor2 = null;
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        arrayList = arrayList13;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            sQLitePreparedStatement = null;
                        }
                        hl.c3(new q41(kf7Var3, arrayList12, (byte) 14));
                    }
                    hl.c3(new q41(kf7Var3, arrayList15, (byte) 15));
                    kf7Var3.getFileLoader().getClass();
                    xb4.p(0, arrayList);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor2 = null;
                }
                sQLitePreparedStatement.dispose();
                return;
            case 3:
                try {
                    kf7Var.b.beginTransaction();
                    kf7Var.b.executeFast("DELETE FROM profile_stories_albums WHERE dialog_id = " + j2).stepThis().dispose();
                    SQLitePreparedStatement executeFast = kf7Var.b.executeFast("REPLACE INTO profile_stories_albums VALUES(?, ?, ?, ?)");
                    while (i4 < arrayList6.size()) {
                        try {
                            w5b w5bVar = (w5b) arrayList6.get(i4);
                            executeFast.requery();
                            executeFast.bindLong(1, j2);
                            executeFast.bindInteger(2, w5bVar.a);
                            executeFast.bindInteger(3, i4);
                            TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                            tL_storyAlbum.album_id = w5bVar.a;
                            tL_storyAlbum.title = w5bVar.b;
                            tL_storyAlbum.icon_photo = w5bVar.c;
                            tL_storyAlbum.icon_video = w5bVar.d;
                            NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(tL_storyAlbum.getObjectSize());
                            tL_storyAlbum.serializeToStream(nativeByteBuffer5);
                            executeFast.bindByteBuffer(4, nativeByteBuffer5);
                            executeFast.step();
                            nativeByteBuffer5.reuse();
                            i4++;
                        } catch (Exception e7) {
                            e = e7;
                            sQLitePreparedStatement2 = executeFast;
                            try {
                                kf7Var.p(e, true);
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                                kf7Var.b.commitTransaction();
                                return;
                            } catch (Throwable th8) {
                                th = th8;
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                }
                                kf7Var.b.commitTransaction();
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            sQLitePreparedStatement2 = executeFast;
                            if (sQLitePreparedStatement2 != null) {
                            }
                            kf7Var.b.commitTransaction();
                            throw th;
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                    }
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement2 = null;
                } catch (Throwable th10) {
                    th = th10;
                    sQLitePreparedStatement2 = null;
                }
                kf7Var.b.commitTransaction();
                return;
            case 4:
                HashSet hashSet = new HashSet();
                int size = arrayList6.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList6.get(i9);
                    i9++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (kf7Var.getMessagesController().Q3(message2)) {
                        hashSet.add(Long.valueOf(r47.Q1(j2, message2)));
                        i4 = 1;
                    }
                }
                if (i4 != 0) {
                    kf7Var.getMessagesController().F5(hashSet);
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                kf7 kf7Var4 = this.b;
                long j4 = this.c;
                ArrayList arrayList16 = this.d;
                kf7Var4.S0(0, 0, j4, arrayList16);
                kf7Var4.getNotificationCenter().k(66, Long.valueOf(j4), arrayList16);
                return;
            case 8:
                kf7Var.getNotificationCenter().k(7, arrayList6, Long.valueOf(wf3.y(j2) ? -j2 : 0L), Boolean.FALSE);
                return;
            default:
                kf7Var.getMessagesController().t3(arrayList6, j2);
                kf7Var.getNotificationCenter().k(7, arrayList6, 0L, Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ te7(kf7 kf7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.d = arrayList;
        this.c = j;
    }
}
