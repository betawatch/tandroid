// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class we7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;

    public /* synthetic */ we7(kf7 kf7Var, byte b) {
        this.a = b;
        this.b = kf7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[Catch: Exception -> 0x039e, TryCatch #0 {Exception -> 0x039e, blocks: (B:12:0x0029, B:13:0x0033, B:15:0x0039, B:18:0x0043, B:19:0x0048, B:20:0x004b, B:22:0x0395, B:25:0x0050, B:27:0x0062, B:29:0x0068, B:30:0x006d, B:31:0x0078, B:32:0x008e, B:33:0x00a0, B:34:0x00be, B:36:0x00cc, B:38:0x00d2, B:39:0x00d7, B:40:0x00e2, B:42:0x00f6, B:44:0x00fc, B:46:0x0102, B:47:0x010a, B:48:0x0115, B:49:0x012a, B:50:0x0173, B:52:0x0184, B:53:0x0189, B:54:0x0195, B:56:0x01a5, B:58:0x01b3, B:59:0x01be, B:61:0x01ce, B:63:0x01dc, B:64:0x01e7, B:65:0x01fe, B:66:0x0227, B:67:0x022c, B:69:0x0241, B:70:0x0249, B:71:0x0254, B:72:0x026e, B:74:0x027d, B:76:0x0283, B:77:0x0288, B:78:0x0293, B:79:0x02b2, B:80:0x02d0, B:81:0x02f3, B:83:0x032b, B:86:0x033b, B:89:0x0345, B:92:0x034f, B:93:0x0355, B:94:0x0368, B:95:0x037d, B:97:0x0387, B:100:0x039a), top: B:11:0x0029 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                final kf7 kf7Var = this.b;
                try {
                    SQLiteCursor queryFinalized = kf7Var.b.queryFinalized("SELECT id, data FROM pending_tasks WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        final long longValue = queryFinalized.longValue(0);
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                        if (byteBufferValue != null) {
                            final int readInt32 = byteBufferValue.readInt32(false);
                            switch (readInt32) {
                                case 0:
                                    TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        Utilities.d.c(new cq6((Object) kf7Var, (Object) TLdeserialize, longValue, (byte) 11));
                                        break;
                                    }
                                    break;
                                case 1:
                                    Utilities.d.c(new ae7(kf7Var, byteBufferValue.readInt32(false), byteBufferValue.readInt32(false), longValue));
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
                                    hl.c3(new ba7((Object) kf7Var, (Object) tL_dialog, (Object) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 19));
                                    break;
                                case 3:
                                    kf7Var.getSendMessagesHelper().o0(TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), (TLRPC.TL_inputMediaGame) TLRPC.InputMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), byteBufferValue.readInt64(false), longValue);
                                    break;
                                case 4:
                                    hl.c3(new vd7(kf7Var, byteBufferValue.readInt64(false), byteBufferValue.readBool(false), TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue));
                                    break;
                                case 6:
                                    final long readInt322 = byteBufferValue.readInt32(false);
                                    final int readInt323 = byteBufferValue.readInt32(false);
                                    final TLRPC.InputChannel TLdeserialize2 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    final byte b = 0;
                                    Utilities.d.c(new Runnable() { // from class: wd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b2 = b;
                                            kf7 kf7Var2 = kf7Var;
                                            switch (b2) {
                                                case 0:
                                                    kf7Var2.getMessagesController().J0(readInt322, readInt323, longValue, TLdeserialize2);
                                                    break;
                                                default:
                                                    kf7Var2.getMessagesController().J0(readInt322, readInt323, longValue, TLdeserialize2);
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
                                        kf7Var.r1(longValue);
                                        break;
                                    } else {
                                        final byte b2 = 0;
                                        hl.c3(new Runnable() { // from class: xd7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b3 = b2;
                                                kf7 kf7Var2 = kf7Var;
                                                switch (b3) {
                                                    case 0:
                                                        kf7Var2.getMessagesController().Y(null, null, null, -readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                        break;
                                                    default:
                                                        kf7Var2.getMessagesController().Y(null, null, null, readInt324, true, 0, false, longValue, TLdeserialize3, 0);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                case 9:
                                    hl.c3(new o30((Object) kf7Var, byteBufferValue.readInt64(false), (TLObject) TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), longValue, (byte) 10));
                                    break;
                                case 11:
                                    int readInt326 = byteBufferValue.readInt32(false);
                                    long readInt327 = byteBufferValue.readInt32(false);
                                    hl.c3(new pd7(kf7Var, readInt327, readInt326, readInt327 != 0 ? TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false) : null, byteBufferValue.readInt32(false), longValue));
                                    break;
                                case 12:
                                case 19:
                                case 20:
                                    kf7Var.r1(longValue);
                                    break;
                                case 13:
                                    final long readInt64 = byteBufferValue.readInt64(false);
                                    final boolean readBool = byteBufferValue.readBool(false);
                                    final int readInt328 = byteBufferValue.readInt32(false);
                                    final int readInt329 = byteBufferValue.readInt32(false);
                                    final boolean readBool2 = byteBufferValue.readBool(false);
                                    final TLRPC.InputPeer TLdeserialize4 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    hl.c3(new Runnable() { // from class: rd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            long j = longValue;
                                            uc7 messagesController = kf7.this.getMessagesController();
                                            long j2 = readInt64;
                                            boolean z = readBool;
                                            messagesController.W(j2, z ? 1 : 0, readInt328, readInt329, readBool2, TLdeserialize4, j);
                                        }
                                    });
                                    break;
                                case 15:
                                    final TLRPC.InputPeer TLdeserialize5 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    final byte b3 = 0;
                                    Utilities.d.c(new Runnable() { // from class: sd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b3;
                                            long j = longValue;
                                            TLRPC.InputPeer inputPeer = TLdeserialize5;
                                            kf7 kf7Var2 = kf7Var;
                                            switch (b4) {
                                                case 0:
                                                    kf7Var2.getMessagesController().n3(inputPeer, j);
                                                    break;
                                                default:
                                                    kf7Var2.getMessagesController().n4(inputPeer, j);
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
                                    hl.c3(new td7(kf7Var, readInt3210, arrayList, longValue, (byte) 0));
                                    break;
                                case 17:
                                    int readInt3212 = byteBufferValue.readInt32(false);
                                    int readInt3213 = byteBufferValue.readInt32(false);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i2 = 0; i2 < readInt3213; i2++) {
                                        arrayList2.add(TLRPC.TL_inputFolderPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                                    }
                                    hl.c3(new td7(kf7Var, readInt3212, arrayList2, longValue, (byte) 1));
                                    break;
                                case 18:
                                    long readInt642 = byteBufferValue.readInt64(false);
                                    byteBufferValue.readInt32(false);
                                    TLRPC.TL_messages_deleteScheduledMessages TLdeserialize6 = TLRPC.TL_messages_deleteScheduledMessages.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize6 == null) {
                                        kf7Var.r1(longValue);
                                        break;
                                    } else {
                                        hl.c3(new o30((Object) kf7Var, readInt642, longValue, (Object) TLdeserialize6, (byte) 9));
                                        break;
                                    }
                                case 21:
                                    unb unbVar = new unb();
                                    byteBufferValue.readInt64(false);
                                    unbVar.i = byteBufferValue.readBool(false);
                                    unbVar.j = byteBufferValue.readBool(false);
                                    unbVar.d = byteBufferValue.readInt32(false);
                                    unbVar.e = byteBufferValue.readInt32(false);
                                    unbVar.h = byteBufferValue.readInt32(false);
                                    unbVar.k = (float) byteBufferValue.readDouble(false);
                                    boolean readBool3 = byteBufferValue.readBool(false);
                                    unbVar.c = byteBufferValue.readString(false);
                                    unbVar.b = byteBufferValue.readString(false);
                                    hl.c3(new j61((rf0) kf7Var, (Object) unbVar, readBool3, longValue, (byte) 8));
                                    break;
                                case 22:
                                    final TLRPC.InputPeer TLdeserialize7 = TLRPC.InputPeer.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    final byte b4 = 1;
                                    hl.c3(new Runnable() { // from class: sd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b4;
                                            long j = longValue;
                                            TLRPC.InputPeer inputPeer = TLdeserialize7;
                                            kf7 kf7Var2 = kf7Var;
                                            switch (b42) {
                                                case 0:
                                                    kf7Var2.getMessagesController().n3(inputPeer, j);
                                                    break;
                                                default:
                                                    kf7Var2.getMessagesController().n4(inputPeer, j);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                case 23:
                                    final long readInt643 = byteBufferValue.readInt64(false);
                                    final int readInt3214 = byteBufferValue.readInt32(false);
                                    final int readInt3215 = byteBufferValue.readInt32(false);
                                    if (!wf3.B(readInt643) && wf3.y(readInt643) && byteBufferValue.hasRemaining()) {
                                        r4 = TLRPC.InputChannel.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    }
                                    final TLRPC.InputChannel inputChannel = r4;
                                    hl.c3(new Runnable() { // from class: qd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            kf7.this.getMessagesController().y3(readInt643, readInt3214, inputChannel, readInt3215, longValue, readInt32 == 23);
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
                                        kf7Var.r1(longValue);
                                        break;
                                    } else {
                                        final byte b5 = 1;
                                        hl.c3(new Runnable() { // from class: xd7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b32 = b5;
                                                kf7 kf7Var2 = kf7Var;
                                                switch (b32) {
                                                    case 0:
                                                        kf7Var2.getMessagesController().Y(null, null, null, -readInt644, true, 0, false, longValue, TLdeserialize8, 0);
                                                        break;
                                                    default:
                                                        kf7Var2.getMessagesController().Y(null, null, null, readInt644, true, 0, false, longValue, TLdeserialize8, 0);
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
                                    Utilities.d.c(new Runnable() { // from class: wd7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b22 = b6;
                                            kf7 kf7Var2 = kf7Var;
                                            switch (b22) {
                                                case 0:
                                                    kf7Var2.getMessagesController().J0(readInt645, readInt3217, longValue, TLdeserialize9);
                                                    break;
                                                default:
                                                    kf7Var2.getMessagesController().J0(readInt645, readInt3217, longValue, TLdeserialize9);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    switch (readInt32) {
                                        case jn7.k1 /* 100 */:
                                            final int readInt3218 = byteBufferValue.readInt32(false);
                                            final boolean readBool4 = byteBufferValue.readBool(false);
                                            hl.c3(new Runnable() { // from class: ud7
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    kf7.this.getSecretChatHelper().e(readInt3218, longValue, readBool4);
                                                }
                                            });
                                            break;
                                        case jn7.m1 /* 102 */:
                                            hl.c3(new ae7(kf7Var, longValue, byteBufferValue.readInt64(false), byteBufferValue.readInt32(false), (byte) 3));
                                            break;
                                        case jn7.n1 /* 103 */:
                                            long readInt646 = byteBufferValue.readInt64(false);
                                            int readInt3219 = byteBufferValue.readInt32(false);
                                            int readInt3220 = byteBufferValue.readInt32(false);
                                            Object TLdeserialize10 = TLRPC.TL_messages_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                            if (TLdeserialize10 == null) {
                                                TLdeserialize10 = TLRPC.TL_channels_deleteMessages.TLdeserialize(byteBufferValue, readInt3220, false);
                                            }
                                            if (TLdeserialize10 == null) {
                                                kf7Var.r1(longValue);
                                                break;
                                            } else {
                                                hl.c3(new jc2(kf7Var, readInt646, longValue, TLdeserialize10, readInt3219, (byte) 3));
                                                break;
                                            }
                                    }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    break;
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
                break;
            case 1:
                this.b.getNotificationCenter().k(79, new Object[0]);
                break;
            case 2:
                this.b.getMessagesController().X0();
                break;
            default:
                this.b.W0(1);
                break;
        }
    }
}
