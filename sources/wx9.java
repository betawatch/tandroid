// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLClassStore;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wx9 extends rf0 {
    public static volatile wx9[] r = new wx9[4];
    public final ArrayList a;
    public final SparseArray b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public boolean n;

    public wx9(int i) {
        super(i);
        this.a = new ArrayList();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
    
        if (r0 > 1024) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r0 > 15) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(NativeByteBuffer nativeByteBuffer, byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2) {
        byte[] bArr3;
        boolean z3 = false;
        boolean z4 = i == 1 ? false : z;
        um4 S = um4.S(i, z4, bArr, bArr2);
        Utilities.c(nativeByteBuffer.buffer, (byte[]) S.b, (byte[]) S.c, false, false, 24, nativeByteBuffer.limit() - 24);
        int readInt32 = nativeByteBuffer.readInt32(false);
        if (i == 2) {
            int i2 = z4 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.d(bArr2, Utilities.p(bArr, i2 + 88, byteBuffer, 24, byteBuffer.limit()), 8)) {
                if (z2) {
                    Utilities.c(nativeByteBuffer.buffer, (byte[]) S.b, (byte[]) S.c, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z3 = true;
            }
            if (readInt32 <= 0) {
                z3 = true;
            }
            if (readInt32 > nativeByteBuffer.limit() - 28) {
                z3 = true;
            }
            int limit = (nativeByteBuffer.limit() - 28) - readInt32;
            if (i != 2) {
                if (limit < 12) {
                    z3 = true;
                }
            }
            return !z3;
        }
        int i3 = readInt32 + 28;
        if (i3 < nativeByteBuffer.buffer.limit() - 15 || i3 > nativeByteBuffer.buffer.limit()) {
            i3 = nativeByteBuffer.buffer.limit();
        }
        ?? r6 = nativeByteBuffer.buffer;
        int position = r6.position();
        int limit2 = r6.limit();
        try {
            try {
                ?? messageDigest = MessageDigest.getInstance("SHA-1");
                r6.position(24);
                r6.limit(i3);
                messageDigest.update(r6);
                bArr3 = messageDigest.digest();
            } catch (Exception e) {
                cc4.g(e, true);
                r6.limit(limit2);
                r6.position(position);
                bArr3 = new byte[20];
            }
            r6 = bArr3.length - 16;
            if (!Utilities.d(bArr2, bArr3, r6)) {
                if (z2) {
                    Utilities.c(nativeByteBuffer.buffer, (byte[]) S.b, (byte[]) S.c, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z3 = true;
            }
            if (readInt32 <= 0) {
            }
            if (readInt32 > nativeByteBuffer.limit() - 28) {
            }
            int limit3 = (nativeByteBuffer.limit() - 28) - readInt32;
            if (i != 2) {
            }
            return !z3;
        } finally {
            r6.limit(limit2);
            r6.position(position);
        }
    }

    public static wx9 i(int i) {
        wx9 wx9Var;
        wx9 wx9Var2 = r[i];
        if (wx9Var2 != null) {
            return wx9Var2;
        }
        synchronized (wx9.class) {
            wx9Var = r[i];
            if (wx9Var == null) {
                wx9[] wx9VarArr = r;
                wx9 wx9Var3 = new wx9(i);
                wx9VarArr[i] = wx9Var3;
                wx9Var = wx9Var3;
            }
        }
        return wx9Var;
    }

    public final void A(Activity activity, TLRPC.User user) {
        if (user == null || activity == null) {
            return;
        }
        if (getMessagesController().x2()) {
            i5.b(this.currentAccount);
            return;
        }
        this.n = true;
        id idVar = new id(3, null, activity);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        tL_messages_getDhConfig.version = messagesStorage.x;
        idVar.setOnCancelListener(new gt0(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new au0((Object) this, (Object) activity, (Object) idVar, (Object) user, (byte) 17), 2), (byte) 8));
        try {
            idVar.show();
        } catch (Exception unused) {
        }
    }

    public final void a(TLRPC.EncryptedChat encryptedChat, int i) {
        int W0 = hl.W0(encryptedChat.layer);
        if (i <= W0) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] o = Utilities.o(r1.length, encryptedChat.auth_key);
                byte[] bArr = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr, 0, 16);
                System.arraycopy(o, 0, bArr, 16, 20);
                encryptedChat.key_hash = bArr;
                getMessagesStorage().S1(encryptedChat);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        encryptedChat.layer = (encryptedChat.layer & 65535) | (i << 16);
        jf7 messagesStorage = getMessagesStorage();
        byte b = 2;
        messagesStorage.a.c(new id7(messagesStorage, encryptedChat, b));
        if (W0 < 151) {
            w(encryptedChat, null);
        }
        hl.c3(new px9(this, encryptedChat, b));
    }

    public final void b(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList) {
        boolean z;
        vx9 vx9Var;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i;
        int i2;
        int i3 = encryptedChat.id;
        SparseArray sparseArray = this.b;
        ArrayList arrayList2 = (ArrayList) sparseArray.get(i3);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new qq7((byte) 21));
            boolean z2 = false;
            while (true) {
                z = true;
                if (arrayList2.size() <= 0 || !((i = (tL_decryptedMessageLayer = (vx9Var = (vx9) arrayList2.get(0)).b).out_seq_no) == (i2 = encryptedChat.seq_in) || i2 == i - 2)) {
                    break;
                }
                this.a(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = vx9Var.b;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (vx9Var.e == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                wx9 wx9Var = this;
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message l = wx9Var.l(encryptedChat2, vx9Var.c, vx9Var.a, vx9Var.b.message, vx9Var.d);
                if (l != null) {
                    arrayList.add(l);
                }
                z2 = true;
                this = wx9Var;
                encryptedChat = encryptedChat2;
            }
            wx9 wx9Var2 = this;
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                sparseArray.remove(encryptedChat3.id);
            }
            if (z2) {
                jf7 messagesStorage = wx9Var2.getMessagesStorage();
                messagesStorage.a.c(new yn6((Object) messagesStorage, (Object) encryptedChat3, z, (byte) 4));
            }
        }
    }

    public final TLRPC.TL_messageService c(int i, int i2, int i3, long j, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j));
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = wf3.E(encryptedChat.id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i3;
        tL_messageService.seq_out = i2;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        long j2 = encryptedChat.participant_id;
        long e = getUserConfig().e();
        TLRPC.Peer peer = tL_messageService.peer_id;
        if (j2 == e) {
            peer.user_id = encryptedChat.admin_id;
        } else {
            peer.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j;
        return tL_messageService;
    }

    public final TLRPC.TL_messageService d(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int i = getUserConfig().i();
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = wf3.E(encryptedChat.id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        long j = encryptedChat.participant_id;
        long e = getUserConfig().e();
        TLRPC.Peer peer = tL_messageService.peer_id;
        if (j == e) {
            peer.user_id = encryptedChat.admin_id;
        } else {
            peer.user_id = encryptedChat.participant_id;
        }
        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tL_messageService.date = 0;
        }
        getSendMessagesHelper().getClass();
        tL_messageService.random_id = r7a.D();
        getUserConfig().u(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().g1(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    public final void e(int i, long j, boolean z) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e2) {
                nativeByteBuffer = null;
                e = e2;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeBool(z);
            } catch (Exception e3) {
                e = e3;
                cc4.g(e, true);
                j = getMessagesStorage().y(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i;
                tL_messages_discardEncryption.delete_history = z;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new yu2(this, j, (byte) 4));
            }
            j = getMessagesStorage().y(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i;
        tL_messages_discardEncryption2.delete_history = z;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new yu2(this, j, (byte) 4));
    }

    public final void f(int i, boolean z) {
        e(i, 0L, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x020e, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_decryptedMessageService) r12).action instanceof org.telegram.tgnet.TLRPC.TL_decryptedMessageActionNotifyLayer) != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList g(TLRPC.EncryptedMessage encryptedMessage) {
        boolean z;
        boolean z2;
        byte[] bArr;
        byte b;
        byte b2;
        int i;
        SparseArray sparseArray = this.c;
        SparseArray sparseArray2 = this.b;
        TLRPC.EncryptedChat b1 = getMessagesController().b1(encryptedMessage.chat_id, true);
        if (b1 == null || (b1 instanceof TLRPC.TL_encryptedChatDiscarded)) {
            return null;
        }
        try {
            try {
                if (b1 instanceof TLRPC.TL_encryptedChatWaiting) {
                    ArrayList arrayList = (ArrayList) sparseArray.get(b1.id);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        sparseArray.put(b1.id, arrayList);
                    }
                    TL_update.TL_updateNewEncryptedMessage tL_updateNewEncryptedMessage = new TL_update.TL_updateNewEncryptedMessage();
                    tL_updateNewEncryptedMessage.message = encryptedMessage;
                    arrayList.add(tL_updateNewEncryptedMessage);
                    return null;
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedMessage.bytes.length);
                nativeByteBuffer.writeBytes(encryptedMessage.bytes);
                nativeByteBuffer.position(0);
                long readInt64 = nativeByteBuffer.readInt64(false);
                if (b1.key_fingerprint == readInt64) {
                    bArr = b1.auth_key;
                    z2 = false;
                } else {
                    long j = b1.future_key_fingerprint;
                    if (j == 0 || j != readInt64) {
                        z2 = false;
                        bArr = null;
                    } else {
                        bArr = b1.future_auth_key;
                        z2 = true;
                    }
                }
                if (bArr != null) {
                    byte[] readData = nativeByteBuffer.readData(16, false);
                    boolean z3 = z2;
                    boolean z4 = b1.admin_id == getUserConfig().e();
                    boolean z5 = b1.mtproto_seq == 0;
                    byte[] bArr2 = bArr;
                    if (h(nativeByteBuffer, bArr2, readData, 2, z4, z5)) {
                        b = 2;
                        b2 = 2;
                    } else {
                        if (!z5) {
                            return null;
                        }
                        b = 2;
                        try {
                            if (!h(nativeByteBuffer, bArr2, readData, 1, z4, false)) {
                                return null;
                            }
                            b2 = 1;
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            cc4.g(e, z);
                            return null;
                        }
                    }
                    TLObject TLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(false), false);
                    nativeByteBuffer.reuse();
                    if (!z3) {
                        b1.key_use_count_in = (short) (b1.key_use_count_in + 1);
                    }
                    if (TLdeserialize instanceof TLRPC.TL_decryptedMessageLayer) {
                        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = (TLRPC.TL_decryptedMessageLayer) TLdeserialize;
                        if (b1.seq_in == 0 && b1.seq_out == 0) {
                            if (b1.admin_id == getUserConfig().e()) {
                                b1.seq_out = 1;
                                b1.seq_in = -2;
                            } else {
                                b1.seq_in = -1;
                            }
                        }
                        if (tL_decryptedMessageLayer.random_bytes.length < 15) {
                            if (!f11.a) {
                                return null;
                            }
                            cc4.d("got random bytes less than needed");
                            return null;
                        }
                        if (f11.a) {
                            cc4.b("current chat in_seq = " + b1.seq_in + " out_seq = " + b1.seq_out);
                            cc4.b("got message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                        }
                        int i2 = tL_decryptedMessageLayer.out_seq_no;
                        int i3 = b1.seq_in;
                        if (i2 <= i3) {
                            return null;
                        }
                        if (b2 == 1 && (i = b1.mtproto_seq) != 0 && i2 >= i) {
                            return null;
                        }
                        byte b3 = 4;
                        if (i3 != i2 - b) {
                            if (f11.a) {
                                cc4.d("got hole");
                            }
                            y(b1, b1.seq_in + b, tL_decryptedMessageLayer.out_seq_no - b, null);
                            ArrayList arrayList2 = (ArrayList) sparseArray2.get(b1.id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                sparseArray2.put(b1.id, arrayList2);
                            }
                            if (arrayList2.size() < 4) {
                                vx9 vx9Var = new vx9();
                                vx9Var.b = tL_decryptedMessageLayer;
                                vx9Var.c = encryptedMessage.file;
                                vx9Var.a = encryptedMessage.date;
                                vx9Var.d = z3;
                                vx9Var.e = b2;
                                arrayList2.add(vx9Var);
                                return null;
                            }
                            sparseArray2.remove(b1.id);
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = b1.id;
                            tL_encryptedChatDiscarded.user_id = b1.user_id;
                            tL_encryptedChatDiscarded.auth_key = b1.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = b1.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = b1.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = b1.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = b1.seq_in;
                            tL_encryptedChatDiscarded.seq_out = b1.seq_out;
                            hl.c3(new qx9(this, tL_encryptedChatDiscarded, (byte) 1));
                            f(b1.id, false);
                            return null;
                        }
                        if (b2 == b) {
                            b1.mtproto_seq = Math.min(b1.mtproto_seq, i3);
                        }
                        a(b1, tL_decryptedMessageLayer.layer);
                        b1.seq_in = tL_decryptedMessageLayer.out_seq_no;
                        b1.in_seq_no = tL_decryptedMessageLayer.in_seq_no;
                        jf7 messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new yn6((Object) messagesStorage, (Object) b1, true, b3));
                        TLdeserialize = tL_decryptedMessageLayer.message;
                    } else if (TLdeserialize instanceof TLRPC.TL_decryptedMessageService) {
                    }
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.Message l = l(b1, encryptedMessage.file, encryptedMessage.date, TLdeserialize, z3);
                    if (l != null) {
                        arrayList3.add(l);
                    }
                    b(b1, arrayList3);
                    return arrayList3;
                }
                nativeByteBuffer.reuse();
                if (f11.a) {
                    cc4.d(String.format("fingerprint mismatch %x", Long.valueOf(readInt64)));
                    return null;
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                z = true;
            }
        } catch (Exception e3) {
            e = e3;
            z = true;
        }
    }

    public final void j(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, r47 r47Var) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().e0(message, false);
        Utilities.d.c(new ra7((Object) this, (Object) encryptedChat, (Object) decryptedMessage, (Object) message, (Object) inputEncryptedFile, (Object) r47Var, (Object) str, (byte) 17));
    }

    public final void k(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, d7a d7aVar) {
        for (int i = 0; i < tL_messages_sendEncryptedMultiMedia.files.size(); i++) {
            j(tL_messages_sendEncryptedMultiMedia.messages.get(i), (TLRPC.Message) d7aVar.z.get(i), d7aVar.n, tL_messages_sendEncryptedMultiMedia.files.get(i), (String) d7aVar.B.get(i), (r47) d7aVar.x.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.Message l(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedFile encryptedFile, int i, TLObject tLObject, boolean z) {
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        long g;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        TLRPC.PhotoSize tL_photoSizeEmpty;
        byte[] bArr5;
        TLRPC.PhotoSize tL_photoSizeEmpty2;
        byte[] bArr6;
        if (tLObject != null) {
            long j = encryptedChat.admin_id;
            if (j == getUserConfig().e()) {
                j = encryptedChat.participant_id;
            }
            if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0 && encryptedChat.key_use_count_in >= 120) {
                o(encryptedChat);
            }
            long j2 = encryptedChat.exchange_id;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (j2 == 0 && encryptedChat.future_key_fingerprint != 0 && !z) {
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                getMessagesStorage().S1(encryptedChat);
            } else if (j2 != 0 && z) {
                encryptedChat.key_fingerprint = encryptedChat.future_key_fingerprint;
                encryptedChat.auth_key = encryptedChat.future_auth_key;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                encryptedChat.key_use_count_in = (short) 0;
                encryptedChat.key_use_count_out = (short) 0;
                encryptedChat.exchange_id = 0L;
                getMessagesStorage().S1(encryptedChat);
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessage) {
                TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                TLRPC.TL_message_secret tL_message_secret = new TLRPC.TL_message_secret();
                tL_message_secret.ttl = tL_decryptedMessage.ttl;
                tL_message_secret.entities = tL_decryptedMessage.entities;
                tL_message_secret.message = tL_decryptedMessage.message;
                tL_message_secret.date = i;
                int i5 = getUserConfig().i();
                tL_message_secret.id = i5;
                tL_message_secret.local_id = i5;
                tL_message_secret.silent = tL_decryptedMessage.silent;
                getUserConfig().u(false);
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message_secret.from_id = tL_peerUser;
                tL_peerUser.user_id = j;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message_secret.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = getUserConfig().e();
                tL_message_secret.random_id = tL_decryptedMessage.random_id;
                tL_message_secret.unread = true;
                tL_message_secret.flags = 768;
                String str = tL_decryptedMessage.via_bot_name;
                if (str != null && str.length() > 0) {
                    tL_message_secret.via_bot_name = tL_decryptedMessage.via_bot_name;
                    tL_message_secret.flags |= 2048;
                }
                long j3 = tL_decryptedMessage.grouped_id;
                if (j3 != 0) {
                    tL_message_secret.grouped_id = j3;
                    tL_message_secret.flags |= 131072;
                }
                tL_message_secret.dialog_id = wf3.E(encryptedChat.id);
                if (tL_decryptedMessage.reply_to_random_id != 0) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_message_secret.reply_to = tL_messageReplyHeader;
                    tL_messageReplyHeader.reply_to_random_id = tL_decryptedMessage.reply_to_random_id;
                    tL_message_secret.flags |= 8;
                }
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                if (decryptedMessageMedia == null || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaEmpty)) {
                    tL_message_secret.media = new TLRPC.TL_messageMediaEmpty();
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaWebPage) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_message_secret.media = tL_messageMediaWebPage;
                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPageUrlPending();
                    tL_message_secret.media.webpage.url = tL_decryptedMessage.media.url;
                } else {
                    if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                        tL_message_secret.media = tL_messageMediaContact;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                        tL_messageMediaContact.last_name = decryptedMessageMedia2.last_name;
                        tL_messageMediaContact.first_name = decryptedMessageMedia2.first_name;
                        tL_messageMediaContact.phone_number = decryptedMessageMedia2.phone_number;
                        tL_messageMediaContact.user_id = decryptedMessageMedia2.user_id;
                        tL_messageMediaContact.vcard = "";
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaGeoPoint) {
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        tL_message_secret.media = tL_messageMediaGeo;
                        tL_messageMediaGeo.geo = new TLRPC.TL_geoPoint();
                        TLRPC.GeoPoint geoPoint = tL_message_secret.media.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia3 = tL_decryptedMessage.media;
                        geoPoint.lat = decryptedMessageMedia3.lat;
                        geoPoint._long = decryptedMessageMedia3._long;
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) {
                        byte[] bArr7 = decryptedMessageMedia.key;
                        if (bArr7 != null && bArr7.length == 32 && (bArr6 = decryptedMessageMedia.iv) != null && bArr6.length == 32) {
                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                            tL_message_secret.media = tL_messageMediaPhoto;
                            tL_messageMediaPhoto.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str2 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str2 != null ? str2 : "";
                            }
                            tL_message_secret.media.photo = new TLRPC.TL_photo();
                            TLRPC.Photo photo = tL_message_secret.media.photo;
                            photo.file_reference = new byte[0];
                            photo.date = tL_message_secret.date;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia4 = tL_decryptedMessage.media;
                            byte[] bArr8 = ((TLRPC.TL_decryptedMessageMediaPhoto) decryptedMessageMedia4).thumb;
                            if (bArr8 != null && bArr8.length != 0 && bArr8.length <= 6000 && decryptedMessageMedia4.thumb_w <= 100 && decryptedMessageMedia4.thumb_h <= 100) {
                                TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia5 = tL_decryptedMessage.media;
                                tL_photoCachedSize.w = decryptedMessageMedia5.thumb_w;
                                tL_photoCachedSize.h = decryptedMessageMedia5.thumb_h;
                                tL_photoCachedSize.bytes = bArr8;
                                tL_photoCachedSize.type = "s";
                                tL_photoCachedSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_message_secret.media.photo.sizes.add(tL_photoCachedSize);
                            }
                            int i6 = tL_message_secret.ttl;
                            if (i6 != 0) {
                                TLRPC.MessageMedia messageMedia = tL_message_secret.media;
                                messageMedia.ttl_seconds = i6;
                                messageMedia.flags |= 4;
                            }
                            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia6 = tL_decryptedMessage.media;
                            tL_photoSize_layer127.w = decryptedMessageMedia6.w;
                            tL_photoSize_layer127.h = decryptedMessageMedia6.h;
                            tL_photoSize_layer127.type = "x";
                            tL_photoSize_layer127.size = (int) encryptedFile.size;
                            TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                            tL_photoSize_layer127.location = tL_fileEncryptedLocation;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia7 = tL_decryptedMessage.media;
                            tL_fileEncryptedLocation.key = decryptedMessageMedia7.key;
                            tL_fileEncryptedLocation.iv = decryptedMessageMedia7.iv;
                            tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                            tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                            tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                            tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                            tL_message_secret.media.photo.sizes.add(tL_photoSize_layer127);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) {
                        byte[] bArr9 = decryptedMessageMedia.key;
                        if (bArr9 != null && bArr9.length == 32 && (bArr5 = decryptedMessageMedia.iv) != null && bArr5.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument;
                            tL_messageMediaDocument.flags |= 3;
                            tL_messageMediaDocument.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia8 = tL_decryptedMessage.media;
                            document.key = decryptedMessageMedia8.key;
                            document.iv = decryptedMessageMedia8.iv;
                            document.dc_id = encryptedFile.dc_id;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str3 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str3 != null ? str3 : "";
                            }
                            TLRPC.Document document2 = tL_message_secret.media.document;
                            document2.date = i;
                            document2.size = encryptedFile.size;
                            document2.id = encryptedFile.id;
                            document2.access_hash = encryptedFile.access_hash;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia9 = tL_decryptedMessage.media;
                            String str4 = decryptedMessageMedia9.mime_type;
                            document2.mime_type = str4;
                            if (str4 == null) {
                                document2.mime_type = "video/mp4";
                            }
                            byte[] bArr10 = ((TLRPC.TL_decryptedMessageMediaVideo) decryptedMessageMedia9).thumb;
                            if (bArr10 == null || bArr10.length == 0 || bArr10.length > 6000 || decryptedMessageMedia9.thumb_w > 100 || decryptedMessageMedia9.thumb_h > 100) {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty2.type = "s";
                            } else {
                                tL_photoSizeEmpty2 = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty2.bytes = bArr10;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia10 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty2.w = decryptedMessageMedia10.thumb_w;
                                tL_photoSizeEmpty2.h = decryptedMessageMedia10.thumb_h;
                                tL_photoSizeEmpty2.type = "s";
                                tL_photoSizeEmpty2.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty2);
                            tL_message_secret.media.document.flags |= 1;
                            TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia11 = tL_decryptedMessage.media;
                            tL_documentAttributeVideo_layer159.w = decryptedMessageMedia11.w;
                            tL_documentAttributeVideo_layer159.h = decryptedMessageMedia11.h;
                            tL_documentAttributeVideo_layer159.duration = decryptedMessageMedia11.duration;
                            tL_documentAttributeVideo_layer159.supports_streaming = false;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeVideo_layer159);
                            int i7 = tL_message_secret.ttl;
                            if (i7 != 0) {
                                TLRPC.MessageMedia messageMedia2 = tL_message_secret.media;
                                messageMedia2.ttl_seconds = i7;
                                messageMedia2.flags |= 4;
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i7);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument) {
                        byte[] bArr11 = decryptedMessageMedia.key;
                        if (bArr11 != null && bArr11.length == 32 && (bArr4 = decryptedMessageMedia.iv) != null && bArr4.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument2;
                            tL_messageMediaDocument2.flags |= 3;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str5 = tL_decryptedMessage.media.caption;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                tL_message_secret.message = str5;
                            }
                            tL_message_secret.media.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document3 = tL_message_secret.media.document;
                            document3.id = encryptedFile.id;
                            document3.access_hash = encryptedFile.access_hash;
                            document3.date = i;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia12 = tL_decryptedMessage.media;
                            document3.mime_type = decryptedMessageMedia12.mime_type;
                            if (decryptedMessageMedia12 instanceof TLRPC.TL_decryptedMessageMediaDocument_layer8) {
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = tL_decryptedMessage.media.file_name;
                                tL_message_secret.media.document.attributes.add(tL_documentAttributeFilename);
                            } else {
                                document3.attributes = decryptedMessageMedia12.attributes;
                            }
                            if (tL_message_secret.ttl > 0) {
                                int size = tL_message_secret.media.document.attributes.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    TLRPC.DocumentAttribute documentAttribute = tL_message_secret.media.document.attributes.get(i8);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        tL_message_secret.ttl = (int) Math.max(documentAttribute.duration + 1.0d, tL_message_secret.ttl);
                                        break;
                                    }
                                }
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, tL_message_secret.ttl);
                            }
                            TLRPC.Document document4 = tL_message_secret.media.document;
                            long j4 = tL_decryptedMessage.media.size;
                            long j5 = encryptedFile.size;
                            if (j4 != 0) {
                                j5 = Math.min(j4, j5);
                            }
                            document4.size = j5;
                            TLRPC.Document document5 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia13 = tL_decryptedMessage.media;
                            document5.key = decryptedMessageMedia13.key;
                            document5.iv = decryptedMessageMedia13.iv;
                            String str6 = document5.mime_type;
                            if (str6 == null) {
                                document5.mime_type = "";
                            } else if ("application/x-tgsticker".equals(str6) || "application/x-tgsdice".equals(tL_message_secret.media.document.mime_type)) {
                                tL_message_secret.media.document.mime_type = "application/x-bad_tgsticker";
                            }
                            byte[] bArr12 = ((TLRPC.TL_decryptedMessageMediaDocument) tL_decryptedMessage.media).thumb;
                            if (bArr12 == null || bArr12.length == 0 || bArr12.length > 20000) {
                                tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty.type = "s";
                            } else {
                                tL_photoSizeEmpty = new TLRPC.TL_photoCachedSize();
                                tL_photoSizeEmpty.bytes = bArr12;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia14 = tL_decryptedMessage.media;
                                tL_photoSizeEmpty.w = decryptedMessageMedia14.thumb_w;
                                tL_photoSizeEmpty.h = decryptedMessageMedia14.thumb_h;
                                tL_photoSizeEmpty.type = "s";
                                tL_photoSizeEmpty.location = new TLRPC.TL_fileLocationUnavailable();
                            }
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty);
                            TLRPC.Document document6 = tL_message_secret.media.document;
                            document6.flags |= 1;
                            document6.dc_id = encryptedFile.dc_id;
                            if (r47.Q4(tL_message_secret) || r47.i4(tL_message_secret)) {
                                tL_message_secret.media_unread = true;
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaExternalDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument3;
                        tL_messageMediaDocument3.flags |= 3;
                        tL_message_secret.message = "";
                        tL_messageMediaDocument3.document = new TLRPC.TL_document();
                        TLRPC.Document document7 = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia15 = tL_decryptedMessage.media;
                        document7.id = decryptedMessageMedia15.id;
                        document7.access_hash = decryptedMessageMedia15.access_hash;
                        document7.file_reference = new byte[0];
                        document7.date = decryptedMessageMedia15.date;
                        document7.attributes = decryptedMessageMedia15.attributes;
                        document7.mime_type = decryptedMessageMedia15.mime_type;
                        document7.dc_id = decryptedMessageMedia15.dc_id;
                        document7.size = decryptedMessageMedia15.size;
                        document7.thumbs.add(((TLRPC.TL_decryptedMessageMediaExternalDocument) decryptedMessageMedia15).thumb);
                        TLRPC.Document document8 = tL_message_secret.media.document;
                        document8.flags |= 1;
                        if (document8.mime_type == null) {
                            document8.mime_type = "";
                        }
                        if (r47.L2(tL_message_secret)) {
                            tL_message_secret.stickerVerified = 0;
                            getMediaDataController().p2(tL_message_secret, true);
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaAudio) {
                        byte[] bArr13 = decryptedMessageMedia.key;
                        if (bArr13 != null && bArr13.length == 32 && (bArr3 = decryptedMessageMedia.iv) != null && bArr3.length == 32) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                            tL_message_secret.media = tL_messageMediaDocument4;
                            tL_messageMediaDocument4.flags |= 3;
                            tL_messageMediaDocument4.document = new TLRPC.TL_documentEncrypted();
                            TLRPC.Document document9 = tL_message_secret.media.document;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia16 = tL_decryptedMessage.media;
                            document9.key = decryptedMessageMedia16.key;
                            document9.iv = decryptedMessageMedia16.iv;
                            document9.id = encryptedFile.id;
                            document9.access_hash = encryptedFile.access_hash;
                            document9.date = i;
                            document9.size = encryptedFile.size;
                            document9.dc_id = encryptedFile.dc_id;
                            document9.mime_type = decryptedMessageMedia16.mime_type;
                            if (TextUtils.isEmpty(tL_message_secret.message)) {
                                String str7 = tL_decryptedMessage.media.caption;
                                tL_message_secret.message = str7 != null ? str7 : "";
                            }
                            TLRPC.Document document10 = tL_message_secret.media.document;
                            if (document10.mime_type == null) {
                                document10.mime_type = "audio/ogg";
                            }
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = tL_decryptedMessage.media.duration;
                            tL_documentAttributeAudio.voice = true;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeAudio);
                            int i9 = tL_message_secret.ttl;
                            if (i9 != 0) {
                                tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i9);
                            }
                            if (tL_message_secret.media.document.thumbs.isEmpty()) {
                                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty3 = new TLRPC.TL_photoSizeEmpty();
                                tL_photoSizeEmpty3.type = "s";
                                tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty3);
                            }
                        }
                    } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVenue) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                        tL_message_secret.media = tL_messageMediaVenue;
                        tL_messageMediaVenue.geo = new TLRPC.TL_geoPoint();
                        TLRPC.MessageMedia messageMedia3 = tL_message_secret.media;
                        TLRPC.GeoPoint geoPoint2 = messageMedia3.geo;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia17 = tL_decryptedMessage.media;
                        geoPoint2.lat = decryptedMessageMedia17.lat;
                        geoPoint2._long = decryptedMessageMedia17._long;
                        messageMedia3.title = decryptedMessageMedia17.title;
                        messageMedia3.address = decryptedMessageMedia17.address;
                        messageMedia3.provider = decryptedMessageMedia17.provider;
                        messageMedia3.venue_id = decryptedMessageMedia17.venue_id;
                        messageMedia3.venue_type = "";
                    }
                }
                int i10 = tL_message_secret.ttl;
                if (i10 != 0) {
                    TLRPC.MessageMedia messageMedia4 = tL_message_secret.media;
                    if (messageMedia4.ttl_seconds == 0) {
                        messageMedia4.ttl_seconds = i10;
                        messageMedia4.flags |= 4;
                    }
                }
                String str8 = tL_message_secret.message;
                if (str8 != null) {
                    tL_message_secret.message = str8.replace((char) 8238, ' ');
                }
                return tL_message_secret;
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessageService) {
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = (TLRPC.TL_decryptedMessageService) tLObject;
                TLRPC.DecryptedMessageAction decryptedMessageAction = tL_decryptedMessageService.action;
                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages)) {
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    if (tL_decryptedMessageService.action instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction;
                        TLRPC.DecryptedMessageAction decryptedMessageAction2 = tL_decryptedMessageService.action;
                        int i11 = decryptedMessageAction2.ttl_seconds;
                        if (i11 < 0 || i11 > 31536000) {
                            decryptedMessageAction2.ttl_seconds = 31536000;
                            i11 = 31536000;
                        }
                        encryptedChat.ttl = i11;
                        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction2;
                        jf7 messagesStorage = getMessagesStorage();
                        messagesStorage.a.c(new id7(messagesStorage, encryptedChat, objArr == true ? 1 : 0));
                    } else {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction2 = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction2;
                        tL_messageEncryptedAction2.encryptedAction = tL_decryptedMessageService.action;
                    }
                    int i12 = getUserConfig().i();
                    tL_messageService.id = i12;
                    tL_messageService.local_id = i12;
                    getUserConfig().u(false);
                    tL_messageService.unread = true;
                    tL_messageService.flags = 256;
                    tL_messageService.date = i;
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser3;
                    tL_peerUser3.user_id = j;
                    TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                    tL_messageService.peer_id = tL_peerUser4;
                    tL_peerUser4.user_id = getUserConfig().e();
                    tL_messageService.dialog_id = wf3.E(encryptedChat.id);
                    return tL_messageService;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                    hl.c3(new ox9(this, wf3.E(encryptedChat.id), objArr2 == true ? 1 : 0));
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        this.h.addAll(tL_decryptedMessageService.action.random_ids);
                        return null;
                    }
                } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages)) {
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        a(encryptedChat, decryptedMessageAction.layer);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                        long j6 = encryptedChat.exchange_id;
                        if (j6 != 0) {
                            if (j6 <= decryptedMessageAction.exchange_id) {
                                p(encryptedChat, null, j6);
                            } else if (f11.a) {
                                cc4.b("we already have request key with higher exchange_id");
                                return null;
                            }
                        }
                        byte[] bArr14 = new byte[256];
                        Utilities.b.nextBytes(bArr14);
                        jf7 messagesStorage2 = getMessagesStorage();
                        messagesStorage2.G();
                        BigInteger bigInteger = new BigInteger(1, messagesStorage2.y);
                        getMessagesStorage().G();
                        BigInteger modPow = BigInteger.valueOf(r5.E).modPow(new BigInteger(1, bArr14), bigInteger);
                        BigInteger bigInteger2 = new BigInteger(1, tL_decryptedMessageService.action.g_a);
                        if (!Utilities.w(bigInteger2, bigInteger)) {
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray = modPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr15 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr15, 0, 256);
                            byteArray = bArr15;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr14), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr2 = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr2, 256 - byteArray2.length, byteArray2.length);
                                for (int i13 = 0; i13 < 256 - byteArray2.length; i13++) {
                                    bArr2[i13] = 0;
                                }
                            }
                            byte[] n = Utilities.n(byteArray2);
                            byte[] bArr16 = new byte[8];
                            System.arraycopy(n, n.length - 8, bArr16, 0, 8);
                            encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                            encryptedChat.future_auth_key = byteArray2;
                            encryptedChat.future_key_fingerprint = Utilities.g(bArr16);
                            encryptedChat.g_a_or_b = byteArray;
                            getMessagesStorage().S1(encryptedChat);
                            q(encryptedChat, null);
                            return null;
                        }
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr2, 0, 256);
                        byteArray2 = bArr2;
                        byte[] n2 = Utilities.n(byteArray2);
                        byte[] bArr162 = new byte[8];
                        System.arraycopy(n2, n2.length - 8, bArr162, 0, 8);
                        encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                        encryptedChat.future_auth_key = byteArray2;
                        encryptedChat.future_key_fingerprint = Utilities.g(bArr162);
                        encryptedChat.g_a_or_b = byteArray;
                        getMessagesStorage().S1(encryptedChat);
                        q(encryptedChat, null);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                        if (encryptedChat.exchange_id != decryptedMessageAction.exchange_id) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().S1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        jf7 messagesStorage3 = getMessagesStorage();
                        messagesStorage3.G();
                        BigInteger bigInteger3 = new BigInteger(1, messagesStorage3.y);
                        BigInteger bigInteger4 = new BigInteger(1, tL_decryptedMessageService.action.g_b);
                        if (!Utilities.w(bigInteger4, bigInteger3)) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().S1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray3 = bigInteger4.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger3).toByteArray();
                        if (byteArray3.length <= 256) {
                            if (byteArray3.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray3, 0, bArr, 256 - byteArray3.length, byteArray3.length);
                                for (int i14 = 0; i14 < 256 - byteArray3.length; i14++) {
                                    bArr[i14] = 0;
                                }
                            }
                            byte[] n3 = Utilities.n(byteArray3);
                            byte[] bArr17 = new byte[8];
                            System.arraycopy(n3, n3.length - 8, bArr17, 0, 8);
                            g = Utilities.g(bArr17);
                            if (tL_decryptedMessageService.action.key_fingerprint != g) {
                                encryptedChat.future_auth_key = byteArray3;
                                encryptedChat.future_key_fingerprint = g;
                                getMessagesStorage().S1(encryptedChat);
                                s(encryptedChat, null);
                                return null;
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().S1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        bArr = new byte[256];
                        System.arraycopy(byteArray3, byteArray3.length - 256, bArr, 0, 256);
                        byteArray3 = bArr;
                        byte[] n32 = Utilities.n(byteArray3);
                        byte[] bArr172 = new byte[8];
                        System.arraycopy(n32, n32.length - 8, bArr172, 0, 8);
                        g = Utilities.g(bArr172);
                        if (tL_decryptedMessageService.action.key_fingerprint != g) {
                        }
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                long j7 = encryptedChat.future_key_fingerprint;
                                if (j7 == decryptedMessageAction.key_fingerprint) {
                                    long j8 = encryptedChat.key_fingerprint;
                                    byte[] bArr18 = encryptedChat.auth_key;
                                    encryptedChat.key_fingerprint = j7;
                                    encryptedChat.auth_key = encryptedChat.future_auth_key;
                                    encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                                    encryptedChat.future_auth_key = bArr18;
                                    encryptedChat.future_key_fingerprint = j8;
                                    encryptedChat.key_use_count_in = (short) 0;
                                    encryptedChat.key_use_count_out = (short) 0;
                                    encryptedChat.exchange_id = 0L;
                                    getMessagesStorage().S1(encryptedChat);
                                    v(encryptedChat, null);
                                    return null;
                                }
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().S1(encryptedChat);
                            p(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                            if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                                encryptedChat.future_auth_key = new byte[256];
                                encryptedChat.future_key_fingerprint = 0L;
                                encryptedChat.exchange_id = 0L;
                                getMessagesStorage().S1(encryptedChat);
                                return null;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) && (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) && (i2 = decryptedMessageAction.end_seq_no) >= (i3 = encryptedChat.in_seq_no) && i2 >= (i4 = decryptedMessageAction.start_seq_no)) {
                            if (i4 < i3) {
                                decryptedMessageAction.start_seq_no = i3;
                            } else {
                                i3 = i4;
                            }
                            long j9 = i3;
                            long j10 = i2;
                            long j11 = j10 - j9;
                            if (j9 >= 0 && j10 >= 0 && j10 < 2147483647L && j11 >= 0 && j11 <= 10000) {
                                getMessagesStorage().a.c(new o30((Object) this, j9, (TLObject) encryptedChat, j10, (byte) 14));
                                return null;
                            }
                        }
                    }
                } else if (!decryptedMessageAction.random_ids.isEmpty()) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    jf7 messagesStorage4 = getMessagesStorage();
                    messagesStorage4.a.c(new ve7(messagesStorage4, encryptedChat.id, tL_decryptedMessageService.action.random_ids, 1, currentTime, currentTime));
                    return null;
                }
            } else if (f11.a) {
                cc4.d("unknown message " + tLObject);
                return null;
            }
        } else if (f11.a) {
            cc4.d("unknown TLObject");
        }
        return null;
    }

    public final void m() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        hl.c3(new tx9(this, new ArrayList(arrayList), (byte) 1));
        ArrayList arrayList2 = new ArrayList(arrayList);
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.getClass();
        if (!arrayList2.isEmpty()) {
            messagesStorage.a.c(new q41(messagesStorage, arrayList2, (byte) 2));
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap concurrentHashMap) {
        wx9 wx9Var;
        long j;
        TLRPC.EncryptedChat encryptedChat;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.EncryptedChat encryptedChat2 = tL_updateEncryption.chat;
        long E = wf3.E(encryptedChat2.id);
        byte b = 0;
        TLRPC.EncryptedChat b1 = getMessagesController().b1(encryptedChat2.id, false);
        if ((encryptedChat2 instanceof TLRPC.TL_encryptedChatRequested) && b1 == null) {
            long j2 = encryptedChat2.participant_id;
            if (j2 == getUserConfig().e()) {
                j2 = encryptedChat2.admin_id;
            }
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
            if (X1 == null) {
                X1 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(j2));
            }
            encryptedChat2.user_id = j2;
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = E;
            tL_dialog.folder_id = encryptedChat2.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().f4(encryptedChat2, false);
            wx9Var = this;
            j = E;
            hl.c3(new ue2((Object) this, (Object) tL_dialog, E, (byte) 7));
            jf7 messagesStorage = wx9Var.getMessagesStorage();
            encryptedChat = encryptedChat2;
            messagesStorage.a.c(new oy6(messagesStorage, encryptedChat, X1, tL_dialog, (byte) 10));
            int i = encryptedChat.id;
            SparseArray sparseArray = wx9Var.e;
            if (sparseArray.get(i) == null) {
                sparseArray.put(encryptedChat.id, encryptedChat);
                TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
                tL_messages_getDhConfig.random_length = 256;
                jf7 messagesStorage2 = wx9Var.getMessagesStorage();
                messagesStorage2.G();
                tL_messages_getDhConfig.version = messagesStorage2.x;
                wx9Var.getConnectionsManager().sendRequest(tL_messages_getDhConfig, new rx9(wx9Var, encryptedChat, b));
            }
        } else {
            wx9Var = this;
            j = E;
            encryptedChat = encryptedChat2;
            if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
                if (b1 != null) {
                    encryptedChat.user_id = b1.user_id;
                    encryptedChat.auth_key = b1.auth_key;
                    encryptedChat.key_create_date = b1.key_create_date;
                    encryptedChat.key_use_count_in = b1.key_use_count_in;
                    encryptedChat.key_use_count_out = b1.key_use_count_out;
                    encryptedChat.ttl = b1.ttl;
                    encryptedChat.seq_in = b1.seq_in;
                    encryptedChat.seq_out = b1.seq_out;
                    encryptedChat.admin_id = b1.admin_id;
                    encryptedChat.mtproto_seq = b1.mtproto_seq;
                }
                hl.c3(new jr9((Object) wx9Var, (Object) b1, (Object) encryptedChat, (byte) 5));
            } else if ((b1 instanceof TLRPC.TL_encryptedChatWaiting) && ((bArr = b1.auth_key) == null || bArr.length == 1)) {
                encryptedChat.a_or_b = b1.a_or_b;
                encryptedChat.user_id = b1.user_id;
                jf7 messagesStorage3 = wx9Var.getMessagesStorage();
                messagesStorage3.G();
                BigInteger bigInteger = new BigInteger(1, messagesStorage3.y);
                BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a_or_b);
                if (Utilities.w(bigInteger2, bigInteger)) {
                    byte[] byteArray = bigInteger2.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger).toByteArray();
                    if (byteArray.length > 256) {
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray, byteArray.length - 256, bArr2, 0, 256);
                    } else {
                        if (byteArray.length < 256) {
                            bArr2 = new byte[256];
                            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
                            for (int i2 = 0; i2 < 256 - byteArray.length; i2++) {
                                bArr2[i2] = 0;
                            }
                        }
                        byte[] n = Utilities.n(byteArray);
                        bArr3 = new byte[8];
                        System.arraycopy(n, n.length - 8, bArr3, 0, 8);
                        if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                            encryptedChat.auth_key = byteArray;
                            encryptedChat.key_create_date = wx9Var.getConnectionsManager().getCurrentTime();
                            encryptedChat.seq_in = -2;
                            encryptedChat.seq_out = 1;
                            wx9Var.getMessagesStorage().S1(encryptedChat);
                            wx9Var.getMessagesController().f4(encryptedChat, false);
                            int i3 = encryptedChat.id;
                            SparseArray sparseArray2 = wx9Var.c;
                            ArrayList arrayList = (ArrayList) sparseArray2.get(i3);
                            if (arrayList != null) {
                                wx9Var.getMessagesController().X3(arrayList, null, null, false, 0);
                                sparseArray2.remove(encryptedChat.id);
                            }
                            hl.c3(new px9(wx9Var, encryptedChat, b));
                        } else {
                            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                            tL_encryptedChatDiscarded.id = encryptedChat.id;
                            tL_encryptedChatDiscarded.user_id = encryptedChat.user_id;
                            tL_encryptedChatDiscarded.auth_key = encryptedChat.auth_key;
                            tL_encryptedChatDiscarded.key_create_date = encryptedChat.key_create_date;
                            tL_encryptedChatDiscarded.key_use_count_in = encryptedChat.key_use_count_in;
                            tL_encryptedChatDiscarded.key_use_count_out = encryptedChat.key_use_count_out;
                            tL_encryptedChatDiscarded.seq_in = encryptedChat.seq_in;
                            tL_encryptedChatDiscarded.seq_out = encryptedChat.seq_out;
                            tL_encryptedChatDiscarded.admin_id = encryptedChat.admin_id;
                            tL_encryptedChatDiscarded.mtproto_seq = encryptedChat.mtproto_seq;
                            wx9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                            hl.c3(new qx9(wx9Var, tL_encryptedChatDiscarded, b));
                            wx9Var.f(encryptedChat.id, false);
                        }
                    }
                    byteArray = bArr2;
                    byte[] n2 = Utilities.n(byteArray);
                    bArr3 = new byte[8];
                    System.arraycopy(n2, n2.length - 8, bArr3, 0, 8);
                    if (encryptedChat.key_fingerprint != Utilities.g(bArr3)) {
                    }
                } else {
                    wx9Var.f(encryptedChat.id, false);
                }
            } else if (b1 == null && wx9Var.n) {
                wx9Var.f.add(tL_updateEncryption);
            }
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            hl.c3(new ox9(wx9Var, j, (byte) 3));
        }
    }

    public final void o(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.b.nextBytes(bArr);
        getMessagesStorage().G();
        BigInteger valueOf = BigInteger.valueOf(r2.E);
        BigInteger bigInteger = new BigInteger(1, bArr);
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.G();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        getSendMessagesHelper().getClass();
        encryptedChat.exchange_id = r7a.D();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().S1(encryptedChat);
        x(encryptedChat, null);
    }

    public final void p(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
                tL_decryptedMessageActionAbortKey.exchange_id = j;
                message = d(encryptedChat, tL_decryptedMessageActionAbortKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void q(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAcceptKey tL_decryptedMessageActionAcceptKey = new TLRPC.TL_decryptedMessageActionAcceptKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAcceptKey;
                tL_decryptedMessageActionAcceptKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionAcceptKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                tL_decryptedMessageActionAcceptKey.g_b = encryptedChat.g_a_or_b;
                message = d(encryptedChat, tL_decryptedMessageActionAcceptKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void r(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionFlushHistory tL_decryptedMessageActionFlushHistory = new TLRPC.TL_decryptedMessageActionFlushHistory();
                tL_decryptedMessageService.action = tL_decryptedMessageActionFlushHistory;
                message = d(encryptedChat, tL_decryptedMessageActionFlushHistory);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void s(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionCommitKey tL_decryptedMessageActionCommitKey = new TLRPC.TL_decryptedMessageActionCommitKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionCommitKey;
                tL_decryptedMessageActionCommitKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionCommitKey.key_fingerprint = encryptedChat.future_key_fingerprint;
                message = d(encryptedChat, tL_decryptedMessageActionCommitKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void t(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionDeleteMessages tL_decryptedMessageActionDeleteMessages = new TLRPC.TL_decryptedMessageActionDeleteMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionDeleteMessages;
                tL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionDeleteMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void u(TLRPC.EncryptedChat encryptedChat, ArrayList arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionReadMessages tL_decryptedMessageActionReadMessages = new TLRPC.TL_decryptedMessageActionReadMessages();
                tL_decryptedMessageService.action = tL_decryptedMessageActionReadMessages;
                tL_decryptedMessageActionReadMessages.random_ids = arrayList;
                message = d(encryptedChat, tL_decryptedMessageActionReadMessages);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void v(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNoop tL_decryptedMessageActionNoop = new TLRPC.TL_decryptedMessageActionNoop();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNoop;
                message = d(encryptedChat, tL_decryptedMessageActionNoop);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void w(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            Integer valueOf = Integer.valueOf(encryptedChat.id);
            ArrayList arrayList = this.a;
            if (arrayList.contains(valueOf)) {
                return;
            }
            arrayList.add(Integer.valueOf(encryptedChat.id));
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionNotifyLayer tL_decryptedMessageActionNotifyLayer = new TLRPC.TL_decryptedMessageActionNotifyLayer();
                tL_decryptedMessageService.action = tL_decryptedMessageActionNotifyLayer;
                tL_decryptedMessageActionNotifyLayer.layer = jn7.g2;
                message = d(encryptedChat, tL_decryptedMessageActionNotifyLayer);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void x(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionRequestKey tL_decryptedMessageActionRequestKey = new TLRPC.TL_decryptedMessageActionRequestKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionRequestKey;
                tL_decryptedMessageActionRequestKey.exchange_id = encryptedChat.exchange_id;
                tL_decryptedMessageActionRequestKey.g_a = encryptedChat.g_a;
                message = d(encryptedChat, tL_decryptedMessageActionRequestKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void y(TLRPC.EncryptedChat encryptedChat, int i, int i2, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            int i3 = encryptedChat.id;
            SparseArray sparseArray = this.d;
            SparseIntArray sparseIntArray = (SparseIntArray) sparseArray.get(i3);
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                sparseArray.put(encryptedChat.id, sparseIntArray);
            } else if (sparseIntArray.indexOfKey(i) >= 0) {
                return;
            }
            sparseIntArray.put(i, i2);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i;
                tL_decryptedMessageActionResend.end_seq_no = i2;
                message = d(encryptedChat, tL_decryptedMessageActionResend);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public final void z(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = new TLRPC.TL_decryptedMessageActionSetMessageTTL();
                tL_decryptedMessageService.action = tL_decryptedMessageActionSetMessageTTL;
                tL_decryptedMessageActionSetMessageTTL.ttl_seconds = encryptedChat.ttl;
                message = d(encryptedChat, tL_decryptedMessageActionSetMessageTTL);
                r47 r47Var = new r47(this.currentAccount, message, false, false);
                r47Var.k.send_state = 1;
                r47Var.X1 = true;
                getMessagesController().z5(0, message.dialog_id, qd4.t(r47Var));
                getNotificationCenter().k(jn7.r, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            j(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }
}
