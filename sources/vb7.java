// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;

    public /* synthetic */ vb7(ad7 ad7Var, byte b) {
        this.a = b;
        this.b = ad7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d9  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        boolean z;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        ad7 ad7Var = this.b;
        int i = 1;
        try {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            arrayList2.add(Long.valueOf(ad7Var.getUserConfig().e()));
            ?? r10 = 0;
            SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT id, ord, unread_count, flags, title, color, entities, noanimate FROM dialog_filter WHERE 1", new Object[0]);
            boolean z2 = false;
            boolean z3 = false;
            while (queryFinalized.next()) {
                try {
                    try {
                        t97 t97Var = new t97();
                        t97Var.a = queryFinalized.intValue(r10);
                        t97Var.f = queryFinalized.intValue(i == true ? 1 : 0);
                        t97Var.d = -1;
                        t97Var.e = -1;
                        t97Var.g = queryFinalized.intValue(3);
                        t97Var.b = queryFinalized.stringValue(4);
                        t97Var.m = queryFinalized.intValue(5);
                        t97Var.c = new ArrayList();
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(6);
                        if (byteBufferValue != null) {
                            try {
                                t97Var.c = Vector.deserialize(byteBufferValue, new yw6((byte) 25), (boolean) r10);
                                byteBufferValue.reuse();
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                                z = i == true ? 1 : 0;
                                sQLitePreparedStatement = null;
                                try {
                                    ad7Var.n(e, z);
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
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            }
                        }
                        t97Var.n = queryFinalized.intValue(7) == i ? i == true ? 1 : 0 : r10;
                        ad7Var.I.add(t97Var);
                        ad7Var.J.put(t97Var.a, t97Var);
                        sparseArray.put(t97Var.a, t97Var);
                        boolean z4 = z3;
                        if (t97Var.e < 0) {
                            z4 = i == true ? 1 : 0;
                        }
                        int i2 = r10;
                        int i3 = r10;
                        while (i2 < 2) {
                            SQLiteDatabase sQLiteDatabase = ad7Var.b;
                            if (i2 == 0) {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT peer, pin FROM dialog_filter_pin_v2 WHERE id = " + t97Var.a, new Object[i3]);
                            } else {
                                sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT peer FROM dialog_filter_ep WHERE id = " + t97Var.a, new Object[i3]);
                            }
                            while (sQLiteCursor2.next()) {
                                long longValue = sQLiteCursor2.longValue(i3);
                                if (i2 == 0) {
                                    if (!cf3.B(longValue)) {
                                        t97Var.h.add(Long.valueOf(longValue));
                                        i = 1;
                                    }
                                    int intValue = sQLiteCursor2.intValue(i);
                                    if (intValue != Integer.MIN_VALUE) {
                                        t97Var.j.put(longValue, intValue);
                                        if (!arrayList5.contains(Long.valueOf(longValue))) {
                                            arrayList5.add(Long.valueOf(longValue));
                                        }
                                    }
                                } else if (!cf3.B(longValue)) {
                                    t97Var.i.add(Long.valueOf(longValue));
                                }
                                if (cf3.y(longValue)) {
                                    long j = -longValue;
                                    if (!arrayList3.contains(Long.valueOf(j))) {
                                        arrayList3.add(Long.valueOf(j));
                                    }
                                } else if (!cf3.D(longValue)) {
                                    int i4 = (int) (longValue & 4294967295L);
                                    if (!arrayList4.contains(Integer.valueOf(i4))) {
                                        arrayList4.add(Integer.valueOf(i4));
                                    }
                                } else if (!arrayList2.contains(Long.valueOf(longValue))) {
                                    arrayList2.add(Long.valueOf(longValue));
                                }
                                i = 1;
                                i3 = 0;
                            }
                            sQLiteCursor2.dispose();
                            i2++;
                            i = 1;
                            i3 = 0;
                        }
                        if (t97Var.a == 0) {
                            z2 = true;
                        }
                        i = 1;
                        r10 = 0;
                        z3 = z4;
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = null;
                        z = true;
                        ad7Var.n(e, z);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            }
            queryFinalized.dispose();
            if (!z2) {
                t97 t97Var2 = new t97();
                t97Var2.a = 0;
                t97Var2.f = 0;
                t97Var2.m = -1;
                t97Var2.b = "ALL_CHATS";
                int i5 = 0;
                while (true) {
                    int size = ad7Var.I.size();
                    arrayList = ad7Var.I;
                    if (i5 >= size) {
                        break;
                    }
                    ((t97) arrayList.get(i5)).f++;
                    i5++;
                }
                arrayList.add(t97Var2);
                ad7Var.J.put(t97Var2.a, t97Var2);
                sparseArray.put(t97Var2.a, t97Var2);
                SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    executeFast.bindInteger(1, t97Var2.a);
                    executeFast.bindInteger(2, t97Var2.f);
                    executeFast.bindInteger(3, t97Var2.d);
                    executeFast.bindInteger(4, t97Var2.g);
                    executeFast.bindString(5, t97Var2.b);
                    executeFast.bindInteger(6, t97Var2.m);
                    Vector vector = new Vector(new yw6((byte) 25));
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
                    vector.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(7, nativeByteBuffer);
                    executeFast.bindInteger(8, t97Var2.n ? 1 : 0);
                    executeFast.stepThis().dispose();
                    nativeByteBuffer.reuse();
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    z = true;
                    ad7Var.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
            }
            Collections.sort(ad7Var.I, new el6((byte) 23));
            if (z3) {
                ad7Var.i(true);
            }
            TLRPC.TL_messages_dialogs E0 = !arrayList5.isEmpty() ? ad7Var.E0(arrayList2, arrayList3, arrayList4, TextUtils.join(",", arrayList5)) : new TLRPC.TL_messages_dialogs();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (!arrayList4.isEmpty()) {
                ad7Var.T(TextUtils.join(",", arrayList4), arrayList8, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                ad7Var.k0(arrayList2, arrayList6, false);
            }
            if (!arrayList3.isEmpty()) {
                ad7Var.P(TextUtils.join(",", arrayList3), arrayList7);
            }
            na7 messagesController = ad7Var.getMessagesController();
            ArrayList arrayList9 = new ArrayList(ad7Var.I);
            messagesController.getClass();
            Utilities.d.c(new g87(messagesController, E0, arrayList8, null, 0, arrayList9, arrayList6, arrayList7, null));
        } catch (Exception e4) {
            e = e4;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[Catch: Exception -> 0x037b, TryCatch #0 {Exception -> 0x037b, blocks: (B:3:0x0005, B:4:0x0010, B:6:0x0016, B:9:0x0020, B:10:0x0025, B:11:0x0028, B:13:0x0372, B:16:0x002d, B:18:0x003f, B:20:0x0045, B:21:0x004a, B:22:0x0055, B:23:0x006b, B:24:0x007d, B:25:0x009b, B:27:0x00a9, B:29:0x00af, B:30:0x00b4, B:31:0x00bf, B:33:0x00d3, B:35:0x00d9, B:37:0x00df, B:38:0x00e7, B:39:0x00f2, B:40:0x0107, B:41:0x0150, B:43:0x0161, B:44:0x0166, B:45:0x0172, B:47:0x0182, B:49:0x0190, B:50:0x019b, B:52:0x01ab, B:54:0x01b9, B:55:0x01c4, B:56:0x01db, B:57:0x0204, B:58:0x0209, B:60:0x021e, B:61:0x0226, B:62:0x0231, B:63:0x024b, B:65:0x025a, B:67:0x0260, B:68:0x0265, B:69:0x0270, B:70:0x028f, B:71:0x02ad, B:72:0x02d0, B:74:0x0308, B:77:0x0318, B:80:0x0322, B:83:0x032c, B:84:0x0332, B:85:0x0345, B:86:0x035a, B:88:0x0364, B:91:0x0377), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        final ad7 ad7Var = this.b;
        try {
            SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                final long longValue = queryFinalized.longValue(0);
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    final int readInt32 = byteBufferValue.readInt32(false);
                    switch (readInt32) {
                        case 0:
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                Utilities.d.c(new go6((Object) ad7Var, (Object) TLdeserialize, longValue, (byte) 9));
                                break;
                            }
                            break;
                        case 1:
                            Utilities.d.c(new yb7(ad7Var, byteBufferValue.readInt32(false), byteBufferValue.readInt32(false), longValue));
                            break;
                        case 2:
                        case 5:
                        case 8:
                        case 10:
                        case 14:
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.id = byteBufferValue.readInt64(false);
                            tL_dialog.top_message = byteBufferValue.readInt32(false);
                            tL_dialog.read_inbox_max_id = byteBufferValue.readInt32(false);
                            tL_dialog.read_outbox_max_id = byteBufferValue.readInt32(false);
                            tL_dialog.unread_count = byteBufferValue.readInt32(false);
                            tL_dialog.last_message_date = byteBufferValue.readInt32(false);
                            tL_dialog.pts = byteBufferValue.readInt32(false);
                            tL_dialog.flags = byteBufferValue.readInt32(false);
                            if (readInt32 >= 5) {
                                tL_dialog.pinned = byteBufferValue.readBool(false);
                                tL_dialog.pinnedNum = byteBufferValue.readInt32(false);
                            }
                            if (readInt32 >= 8) {
                                tL_dialog.unread_mentions_count = byteBufferValue.readInt32(false);
                            }
                            if (readInt32 >= 10) {
                                tL_dialog.unread_mark = byteBufferValue.readBool(false);
                            }
                            if (readInt32 >= 14) {
                                tL_dialog.folder_id = byteBufferValue.readInt32(false);
                            }
                            gl.d3(new m77((Object) ad7Var, (Object) tL_dialog, (Object) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 19));
                            break;
                        case 3:
                            ad7Var.getSendMessagesHelper().o0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                            break;
                        case 4:
                            gl.d3(new nb7(ad7Var, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                            break;
                        case 6:
                            final long readInt322 = byteBufferValue.readInt32(false);
                            final int readInt323 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b = 0;
                            Utilities.d.c(new Runnable() { // from class: ob7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b2 = b;
                                    ad7 ad7Var2 = ad7Var;
                                    switch (b2) {
                                        case 0:
                                            ad7Var2.getMessagesController().H0(readInt322, readInt323, longValue, TLdeserialize2);
                                            break;
                                        default:
                                            ad7Var2.getMessagesController().H0(readInt322, readInt323, longValue, TLdeserialize2);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 7:
                            final long readInt324 = byteBufferValue.readInt32(false);
                            int readInt325 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize3 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt325, false);
                            if (TLdeserialize3 == null) {
                                TLdeserialize3 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt325, false);
                            }
                            if (TLdeserialize3 == null) {
                                ad7Var.n1(longValue);
                                break;
                            } else {
                                final byte b2 = 0;
                                gl.d3(new Runnable() { // from class: pb7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        ad7 ad7Var2 = ad7Var;
                                        switch (b3) {
                                            case 0:
                                                ad7Var2.getMessagesController().W(null, null, null, -readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                            default:
                                                ad7Var2.getMessagesController().W(null, null, null, readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        case 9:
                            gl.d3(new n30((Object) ad7Var, byteBufferValue.readInt64(false), (TLObject) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 10));
                            break;
                        case 11:
                            int readInt326 = byteBufferValue.readInt32(false);
                            long readInt327 = byteBufferValue.readInt32(false);
                            gl.d3(new hb7(ad7Var, readInt327, readInt326, readInt327 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null, byteBufferValue.readInt32(false), longValue));
                            break;
                        case 12:
                        case 19:
                        case 20:
                            ad7Var.n1(longValue);
                            break;
                        case 13:
                            final long readInt64 = byteBufferValue.readInt64(false);
                            final boolean readBool = byteBufferValue.readBool(false);
                            final int readInt328 = byteBufferValue.readInt32(false);
                            final int readInt329 = byteBufferValue.readInt32(false);
                            final boolean readBool2 = byteBufferValue.readBool(false);
                            final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            gl.d3(new Runnable() { // from class: jb7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    long j = longValue;
                                    na7 messagesController = ad7.this.getMessagesController();
                                    long j2 = readInt64;
                                    boolean z = readBool;
                                    messagesController.U(j2, z ? 1 : 0, readInt328, readInt329, readBool2, TLdeserialize4, j);
                                }
                            });
                            break;
                        case 15:
                            final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b3 = 0;
                            Utilities.d.c(new Runnable() { // from class: kb7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b4 = b3;
                                    long j = longValue;
                                    TLRPC.InputPeer inputPeer = TLdeserialize5;
                                    ad7 ad7Var2 = ad7Var;
                                    switch (b4) {
                                        case 0:
                                            ad7Var2.getMessagesController().g3(inputPeer, j);
                                            break;
                                        default:
                                            ad7Var2.getMessagesController().e4(inputPeer, j);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 16:
                            int readInt3210 = byteBufferValue.readInt32(false);
                            int readInt3211 = byteBufferValue.readInt32(false);
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < readInt3211; i++) {
                                arrayList.add(TLRPC.InputDialogPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            gl.d3(new lb7(ad7Var, readInt3210, arrayList, longValue, (byte) 0));
                            break;
                        case 17:
                            int readInt3212 = byteBufferValue.readInt32(false);
                            int readInt3213 = byteBufferValue.readInt32(false);
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < readInt3213; i2++) {
                                arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            gl.d3(new lb7(ad7Var, readInt3212, arrayList2, longValue, (byte) 1));
                            break;
                        case 18:
                            long readInt642 = byteBufferValue.readInt64(false);
                            byteBufferValue.readInt32(false);
                            TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize6 == null) {
                                ad7Var.n1(longValue);
                                break;
                            } else {
                                gl.d3(new n30((Object) ad7Var, readInt642, longValue, (Object) TLdeserialize6, (byte) 9));
                                break;
                            }
                        case 21:
                            vjb vjbVar = new vjb();
                            byteBufferValue.readInt64(false);
                            vjbVar.i = byteBufferValue.readBool(false);
                            vjbVar.j = byteBufferValue.readBool(false);
                            vjbVar.d = byteBufferValue.readInt32(false);
                            vjbVar.e = byteBufferValue.readInt32(false);
                            vjbVar.h = byteBufferValue.readInt32(false);
                            vjbVar.k = (float) byteBufferValue.readDouble(false);
                            boolean readBool3 = byteBufferValue.readBool(false);
                            vjbVar.c = byteBufferValue.readString(false);
                            vjbVar.b = byteBufferValue.readString(false);
                            gl.d3(new b61((pf0) ad7Var, (Object) vjbVar, readBool3, longValue, (byte) 8));
                            break;
                        case 22:
                            final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b4 = 1;
                            gl.d3(new Runnable() { // from class: kb7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b42 = b4;
                                    long j = longValue;
                                    TLRPC.InputPeer inputPeer = TLdeserialize7;
                                    ad7 ad7Var2 = ad7Var;
                                    switch (b42) {
                                        case 0:
                                            ad7Var2.getMessagesController().g3(inputPeer, j);
                                            break;
                                        default:
                                            ad7Var2.getMessagesController().e4(inputPeer, j);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 23:
                            final long readInt643 = byteBufferValue.readInt64(false);
                            final int readInt3214 = byteBufferValue.readInt32(false);
                            final int readInt3215 = byteBufferValue.readInt32(false);
                            if (!cf3.B(readInt643) && cf3.y(readInt643) && byteBufferValue.hasRemaining()) {
                                r0 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            }
                            final TLRPC.InputChannel inputChannel = r0;
                            gl.d3(new Runnable() { // from class: ib7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ad7.this.getMessagesController().r3(readInt643, readInt3214, inputChannel, readInt3215, longValue, readInt32 == 23);
                                }
                            });
                            break;
                        case 24:
                            final long readInt644 = byteBufferValue.readInt64(false);
                            int readInt3216 = byteBufferValue.readInt32(false);
                            final TLMethod TLdeserialize8 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3216, false);
                            if (TLdeserialize8 == null) {
                                TLdeserialize8 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3216, false);
                            }
                            if (TLdeserialize8 == null) {
                                ad7Var.n1(longValue);
                                break;
                            } else {
                                final byte b5 = 1;
                                gl.d3(new Runnable() { // from class: pb7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b5;
                                        ad7 ad7Var2 = ad7Var;
                                        switch (b32) {
                                            case 0:
                                                ad7Var2.getMessagesController().W(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                            default:
                                                ad7Var2.getMessagesController().W(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        case 25:
                            final long readInt645 = byteBufferValue.readInt64(false);
                            final int readInt3217 = byteBufferValue.readInt32(false);
                            final TLRPC.InputChannel TLdeserialize9 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            final byte b6 = 1;
                            Utilities.d.c(new Runnable() { // from class: ob7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b22 = b6;
                                    ad7 ad7Var2 = ad7Var;
                                    switch (b22) {
                                        case 0:
                                            ad7Var2.getMessagesController().H0(readInt645, readInt3217, longValue, TLdeserialize9);
                                            break;
                                        default:
                                            ad7Var2.getMessagesController().H0(readInt645, readInt3217, longValue, TLdeserialize9);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            switch (readInt32) {
                                case kk7.k1 /* 100 */:
                                    final int readInt3218 = byteBufferValue.readInt32(false);
                                    final boolean readBool4 = byteBufferValue.readBool(false);
                                    gl.d3(new Runnable() { // from class: mb7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ad7.this.getSecretChatHelper().e(readInt3218, longValue, readBool4);
                                        }
                                    });
                                    break;
                                case kk7.m1 /* 102 */:
                                    gl.d3(new yb7(ad7Var, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), (byte) 3));
                                    break;
                                case kk7.n1 /* 103 */:
                                    long readInt646 = byteBufferValue.readInt64(false);
                                    int readInt3219 = byteBufferValue.readInt32(false);
                                    int readInt3220 = byteBufferValue.readInt32(false);
                                    Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                    if (TLdeserialize10 == null) {
                                        TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                    }
                                    if (TLdeserialize10 == null) {
                                        ad7Var.n1(longValue);
                                        break;
                                    } else {
                                        gl.d3(new tb2(ad7Var, readInt646, longValue, TLdeserialize10, readInt3219, (byte) 3));
                                        break;
                                    }
                            }
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
        } catch (Exception e) {
            ad7Var.n(e, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        int i = 0;
        switch (this.a) {
            case 0:
                ad7 ad7Var = this.b;
                try {
                    vf6 vf6Var = new vf6();
                    Map<String, ?> all = na7.q1(ad7Var.currentAccount).W3.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num = (Integer) entry.getValue();
                            if (num.intValue() == 2 || num.intValue() == 3) {
                                String replace = key.replace("notify2_", "");
                                long j = 1;
                                if (num.intValue() != 2) {
                                    if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                        j = 1 | (r0.intValue() << 32);
                                    }
                                }
                                try {
                                    vf6Var.k(Long.valueOf(j), Long.parseLong(replace));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    try {
                        ad7Var.b.beginTransaction();
                        SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i < vf6Var.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, vf6Var.j(i));
                            executeFast.bindLong(2, ((Long) vf6Var.n(i)).longValue());
                            executeFast.step();
                            i++;
                        }
                        executeFast.dispose();
                        ad7Var.b.commitTransaction();
                        return;
                    } catch (Exception e2) {
                        ad7Var.n(e2, true);
                        return;
                    }
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            case 1:
                ad7 ad7Var2 = this.b;
                try {
                    ad7Var2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e3) {
                    ad7Var2.n(e3, true);
                }
                int i2 = ad7Var2.currentAccount;
                ConcurrentHashMap concurrentHashMap = vvc.a;
                gl.d3(new xv0(i2, (byte) 14));
                return;
            case 2:
                ad7 ad7Var3 = this.b;
                if (ad7Var3.R) {
                    ad7Var3.R = false;
                    kk7.f(ad7Var3.currentAccount).k(kk7.U4, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                kk7.f(this.b.currentAccount).k(kk7.c5, new Object[0]);
                return;
            case 4:
                ad7 ad7Var4 = this.b;
                ad7Var4.R = true;
                kk7.f(ad7Var4.currentAccount).k(kk7.U4, Boolean.TRUE);
                return;
            case 5:
                ad7 ad7Var5 = this.b;
                ad7Var5.R = false;
                kk7.f(ad7Var5.currentAccount).k(kk7.U4, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                    return;
                }
            case 7:
                ad7 ad7Var6 = this.b;
                ArrayList arrayList = ad7Var6.getMessagesController().G0;
                int size = arrayList.size();
                while (i < size) {
                    ((t97) arrayList.get(i)).d = ((t97) arrayList.get(i)).e;
                    i++;
                }
                ad7Var6.L = ad7Var6.N;
                ad7Var6.M = ad7Var6.O;
                return;
            case 8:
                this.b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 9:
                this.b.S0(1);
                return;
            case 10:
                ad7 ad7Var7 = this.b;
                for (int i3 = 0; i3 < 2; i3++) {
                    ad7Var7.getUserConfig().w(i3, 0, 0, 0L, 0L, 0L, 0L);
                    ad7Var7.getUserConfig().y(i3, 0);
                }
                y6c userConfig = ad7Var7.getUserConfig();
                userConfig.j().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                y6c userConfig2 = ad7Var7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.j().edit();
                for (String str : userConfig2.j().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                ad7Var7.getNotificationCenter().k(kk7.N4, new Object[0]);
                ad7Var7.getMediaDataController().G0(false, true, null);
                ad7Var7.getNotificationCenter().k(kk7.v5, new Object[0]);
                ad7Var7.getMessagesController().M1().p();
                return;
            case 11:
                ad7 ad7Var8 = this.b;
                try {
                    ad7Var8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    ad7Var8.n(e5, true);
                    return;
                }
            case 12:
                ad7 ad7Var9 = this.b;
                ad7Var9.o(true);
                ad7Var9.r();
                ad7Var9.S0(1);
                gl.d3(new vb7(ad7Var9, (byte) 20));
                return;
            case 13:
                this.b.getNotificationCenter().k(kk7.E1, new Object[0]);
                return;
            case 14:
                ad7 ad7Var10 = this.b;
                try {
                    ad7Var10.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    ad7Var10.n(e6, true);
                    return;
                }
            case 15:
                ad7 ad7Var11 = this.b;
                ArrayList arrayList2 = ad7Var11.getMessagesController().G0;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((t97) arrayList2.get(i4)).d = ((t97) arrayList2.get(i4)).e;
                }
                ad7Var11.L = ad7Var11.N;
                ad7Var11.M = ad7Var11.O;
                kk7 notificationCenter = ad7Var11.getNotificationCenter();
                int i5 = na7.q5;
                notificationCenter.k(2, 256);
                return;
            case 16:
                this.b.w0();
                return;
            case 17:
                this.b.getMessagesController().D1().a();
                return;
            case 18:
                ad7 ad7Var12 = this.b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i6 = 1;
                try {
                    try {
                        queryFinalized = ad7Var12.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (queryFinalized.next()) {
                        long intValue = queryFinalized.intValue(0);
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = intValue;
                        tL_contact.mutual = queryFinalized.intValue(1) == 1;
                        arrayList3.add(tL_contact);
                        arrayList5.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        ad7Var12.k0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e8) {
                    e = e8;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    ad7Var12.n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    qu2 contactsController = ad7Var12.getContactsController();
                    contactsController.getClass();
                    gl.d3(new hu2(contactsController, arrayList4, i6, arrayList3, (byte) 0));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                qu2 contactsController2 = ad7Var12.getContactsController();
                contactsController2.getClass();
                gl.d3(new hu2(contactsController2, arrayList4, i6, arrayList3, (byte) 0));
                return;
            case 19:
                ad7 ad7Var13 = this.b;
                try {
                    ad7Var13.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    ad7Var13.n(e9, true);
                    return;
                }
            case 20:
                ad7 ad7Var14 = this.b;
                ad7Var14.getNotificationCenter().k(kk7.v5, new Object[0]);
                ad7Var14.getNotificationCenter().k(kk7.N4, new Object[0]);
                ad7Var14.getMessagesController().D1().a();
                return;
            case 21:
                this.b.A0();
                return;
            case 22:
                this.b.z0();
                return;
            case 23:
                ad7 ad7Var15 = this.b;
                try {
                    try {
                        sQLiteCursor = ad7Var15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                        ArrayList arrayList6 = new ArrayList();
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    arrayList6.add(TLdeserialize);
                                }
                            }
                        }
                        gl.d3(new se(arrayList6, (byte) 7));
                    } catch (Exception e10) {
                        ad7Var15.n(e10, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th4) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th4;
                }
            case 24:
                this.b.getNotificationCenter().k(kk7.v5, new Object[0]);
                return;
            case 25:
                ad7 ad7Var16 = this.b;
                ArrayList arrayList7 = ad7Var16.getMessagesController().G0;
                int size3 = arrayList7.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ((t97) arrayList7.get(i7)).d = ((t97) arrayList7.get(i7)).e;
                }
                ad7Var16.L = ad7Var16.N;
                ad7Var16.M = ad7Var16.O;
                kk7 notificationCenter2 = ad7Var16.getNotificationCenter();
                int i8 = na7.q5;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.b.q1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.b.getMessagesController().V0();
                return;
        }
    }
}
