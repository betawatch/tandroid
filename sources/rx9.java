// default package

import android.util.SparseArray;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class rx9 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx9 b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ rx9(wx9 wx9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = encryptedChat;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte[] bArr;
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        wx9 wx9Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                SparseArray sparseArray = wx9Var.e;
                if (tL_error != null) {
                    sparseArray.remove(encryptedChat.id);
                    break;
                } else {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr2 = messages_dhconfig.p;
                        int i = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr2, i)) {
                            sparseArray.remove(encryptedChat.id);
                            wx9Var.f(encryptedChat.id, false);
                            break;
                        } else {
                            jf7 messagesStorage = wx9Var.getMessagesStorage();
                            byte[] bArr3 = messages_dhconfig.p;
                            messagesStorage.G();
                            messagesStorage.y = bArr3;
                            jf7 messagesStorage2 = wx9Var.getMessagesStorage();
                            int i2 = messages_dhconfig.g;
                            messagesStorage2.G();
                            messagesStorage2.E = i2;
                            jf7 messagesStorage3 = wx9Var.getMessagesStorage();
                            int i3 = messages_dhconfig.version;
                            messagesStorage3.G();
                            messagesStorage3.x = i3;
                            jf7 messagesStorage4 = wx9Var.getMessagesStorage();
                            jf7 messagesStorage5 = wx9Var.getMessagesStorage();
                            messagesStorage5.G();
                            int i4 = messagesStorage5.x;
                            jf7 messagesStorage6 = wx9Var.getMessagesStorage();
                            messagesStorage6.G();
                            int i5 = messagesStorage6.E;
                            jf7 messagesStorage7 = wx9Var.getMessagesStorage();
                            messagesStorage7.G();
                            messagesStorage4.a.c(new aq1(messagesStorage4, i4, i5, messagesStorage7.y, (byte) 10));
                        }
                    }
                    byte[] bArr4 = new byte[256];
                    for (int i6 = 0; i6 < 256; i6++) {
                        bArr4[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
                    }
                    encryptedChat.a_or_b = bArr4;
                    encryptedChat.seq_in = -1;
                    encryptedChat.seq_out = 0;
                    jf7 messagesStorage8 = wx9Var.getMessagesStorage();
                    messagesStorage8.G();
                    BigInteger bigInteger = new BigInteger(1, messagesStorage8.y);
                    wx9Var.getMessagesStorage().G();
                    BigInteger modPow = BigInteger.valueOf(r5.E).modPow(new BigInteger(1, bArr4), bigInteger);
                    BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
                    if (!Utilities.w(bigInteger2, bigInteger)) {
                        sparseArray.remove(encryptedChat.id);
                        wx9Var.f(encryptedChat.id, false);
                        break;
                    } else {
                        byte[] byteArray = modPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr5 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr5, 0, 256);
                            byteArray = bArr5;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr4), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                                for (int i7 = 0; i7 < 256 - byteArray2.length; i7++) {
                                    bArr[i7] = 0;
                                }
                            }
                            byte[] n = Utilities.n(byteArray2);
                            byte[] bArr6 = new byte[8];
                            System.arraycopy(n, n.length - 8, bArr6, 0, 8);
                            encryptedChat.auth_key = byteArray2;
                            encryptedChat.key_create_date = wx9Var.getConnectionsManager().getCurrentTime();
                            TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                            tL_messages_acceptEncryption.g_b = byteArray;
                            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                            tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                            tL_inputEncryptedChat.chat_id = encryptedChat.id;
                            tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                            tL_messages_acceptEncryption.key_fingerprint = Utilities.g(bArr6);
                            wx9Var.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new rx9(wx9Var, encryptedChat, b2), 64);
                            break;
                        } else {
                            bArr = new byte[256];
                            System.arraycopy(byteArray2, byteArray2.length - 256, bArr, 0, 256);
                        }
                        byteArray2 = bArr;
                        byte[] n2 = Utilities.n(byteArray2);
                        byte[] bArr62 = new byte[8];
                        System.arraycopy(n2, n2.length - 8, bArr62, 0, 8);
                        encryptedChat.auth_key = byteArray2;
                        encryptedChat.key_create_date = wx9Var.getConnectionsManager().getCurrentTime();
                        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
                        tL_messages_acceptEncryption2.g_b = byteArray;
                        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                        tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
                        tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                        tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                        tL_messages_acceptEncryption2.key_fingerprint = Utilities.g(bArr62);
                        wx9Var.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new rx9(wx9Var, encryptedChat, b2), 64);
                    }
                }
            default:
                wx9Var.e.remove(encryptedChat.id);
                if (tL_error == null) {
                    TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
                    encryptedChat2.auth_key = encryptedChat.auth_key;
                    encryptedChat2.user_id = encryptedChat.user_id;
                    encryptedChat2.seq_in = encryptedChat.seq_in;
                    encryptedChat2.seq_out = encryptedChat.seq_out;
                    encryptedChat2.key_create_date = encryptedChat.key_create_date;
                    encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
                    encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
                    wx9Var.getMessagesStorage().S1(encryptedChat2);
                    wx9Var.getMessagesController().f4(encryptedChat2, false);
                    hl.c3(new px9(wx9Var, encryptedChat2, (byte) 1));
                    break;
                }
                break;
        }
    }
}
