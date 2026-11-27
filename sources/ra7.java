// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ra7(i08 i08Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, j08 j08Var, TLRPC.TL_error tL_error, um4 um4Var) {
        this.a = (byte) 16;
        this.b = i08Var;
        this.f = tLObject;
        this.h = str;
        this.c = tL_secureRequiredType;
        this.e = j08Var;
        this.d = tL_error;
        this.n = um4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        boolean z;
        SecureRandom secureRandom;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        wx9 wx9Var = (wx9) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f;
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) this.h;
        TLRPC.Message message = (TLRPC.Message) this.c;
        TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.d;
        r47 r47Var = (r47) this.e;
        String str = (String) this.n;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            int i = encryptedChat.layer;
            Typeface typeface = hl.a;
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, i & 65535), Math.max(46, hl.W0(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            SecureRandom secureRandom2 = Utilities.b;
            secureRandom2.nextBytes(bArr);
            int i2 = encryptedChat.seq_in;
            if (i2 == 0) {
                try {
                    if (encryptedChat.seq_out == 0) {
                        if (encryptedChat.admin_id == wx9Var.getUserConfig().e()) {
                            encryptedChat.seq_out = 1;
                            i2 = -2;
                            encryptedChat.seq_in = -2;
                        } else {
                            i2 = -1;
                            encryptedChat.seq_in = -1;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    z = true;
                    cc4.g(e, z);
                    return;
                }
            }
            int i3 = message.seq_in;
            byte b = 4;
            boolean z2 = false;
            if (i3 == 0 && message.seq_out == 0) {
                if (i2 <= 0) {
                    i2 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i2;
                int i4 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i4;
                encryptedChat.seq_out = i4 + 2;
                int i5 = encryptedChat.key_create_date;
                if (i5 == 0) {
                    i5 = wx9Var.getConnectionsManager().getCurrentTime();
                    encryptedChat.key_create_date = i5;
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if (s < 100) {
                    if (i5 >= wx9Var.getConnectionsManager().getCurrentTime() - 604800) {
                        secureRandom = secureRandom2;
                        kf7 messagesStorage = wx9Var.getMessagesStorage();
                        messagesStorage.a.c(new yn6(messagesStorage, encryptedChat, z2, b));
                        message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                        message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                        kf7 messagesStorage2 = wx9Var.getMessagesStorage();
                        messagesStorage2.a.c(new hl2(messagesStorage2, message.id, message.seq_in, message.seq_out, (byte) 1));
                    }
                }
                secureRandom = secureRandom2;
                if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    wx9Var.o(encryptedChat);
                }
                kf7 messagesStorage3 = wx9Var.getMessagesStorage();
                messagesStorage3.a.c(new yn6(messagesStorage3, encryptedChat, z2, b));
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                kf7 messagesStorage22 = wx9Var.getMessagesStorage();
                messagesStorage22.a.c(new hl2(messagesStorage22, message.id, message.seq_in, message.seq_out, (byte) 1));
            } else {
                secureRandom = secureRandom2;
                tL_decryptedMessageLayer.in_seq_no = i3;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (f11.a) {
                cc4.b(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
            }
            int objectSize = tL_decryptedMessageLayer.getObjectSize();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
            nativeByteBuffer.writeInt32(objectSize);
            tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
            int length = nativeByteBuffer.length();
            int nextInt = (length % 16 != 0 ? 16 - (length % 16) : 0) + ((secureRandom.nextInt(3) + 2) << 4);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (nextInt != 0) {
                byte[] bArr2 = new byte[nextInt];
                secureRandom.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            boolean z3 = encryptedChat.admin_id != wx9Var.getUserConfig().e();
            byte[] bArr4 = encryptedChat.auth_key;
            int i6 = z3 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.p(bArr4, 88 + i6, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            um4 S = um4.S(2, z3, encryptedChat.auth_key, bArr3);
            Utilities.c(nativeByteBuffer2.buffer, (byte[]) S.b, (byte[]) S.c, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
            nativeByteBuffer2.position(0);
            nativeByteBuffer3.writeInt64(encryptedChat.key_fingerprint);
            nativeByteBuffer3.writeBytes(bArr3);
            nativeByteBuffer3.writeBytes(nativeByteBuffer2);
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.position(0);
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile2 = new TLRPC.TL_messages_sendEncryptedFile();
                tL_messages_sendEncryptedFile2.silent = message.silent;
                tL_messages_sendEncryptedFile2.data = nativeByteBuffer3;
                tL_messages_sendEncryptedFile2.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncryptedFile2.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = encryptedChat.id;
                tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile2.file = inputEncryptedFile;
                tL_messages_sendEncryptedFile = tL_messages_sendEncryptedFile2;
            } else if (decryptedMessage instanceof TLRPC.TL_decryptedMessageService) {
                TLRPC.TL_messages_sendEncryptedService tL_messages_sendEncryptedService = new TLRPC.TL_messages_sendEncryptedService();
                tL_messages_sendEncryptedService.data = nativeByteBuffer3;
                tL_messages_sendEncryptedService.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncryptedService.peer = tL_inputEncryptedChat2;
                tL_inputEncryptedChat2.chat_id = encryptedChat.id;
                tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile = tL_messages_sendEncryptedService;
            } else {
                TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                tL_messages_sendEncrypted.silent = message.silent;
                tL_messages_sendEncrypted.data = nativeByteBuffer3;
                tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat3 = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncrypted.peer = tL_inputEncryptedChat3;
                tL_inputEncryptedChat3.chat_id = encryptedChat.id;
                tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile = tL_messages_sendEncrypted;
            }
            wx9Var.getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new in0(wx9Var, decryptedMessage, encryptedChat, message, r47Var, str), 64);
        } catch (Exception e2) {
            e = e2;
            z = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07f6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p pVar;
        p pVar2;
        c8b m;
        char c;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        byte b2 = 21;
        byte b3 = 1;
        byte b4 = 0;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.h;
        Object obj6 = this.f;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj7;
                Context context = (Context) obj5;
                id idVar = (id) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                ((ff7) obj6).run(0L);
                if (context != null && !((Activity) context).isFinishing()) {
                    try {
                        idVar.dismiss();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    jj.c0(uc7Var.currentAccount, tL_error, eVar, tL_messages_migrateChat, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                uc7 uc7Var2 = (uc7) obj7;
                Activity activity = (Activity) obj5;
                id idVar2 = (id) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                e eVar2 = (e) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                uc7Var2.getClass();
                ((cf7) obj6).A(false);
                if (activity != null && !activity.isFinishing()) {
                    try {
                        idVar2.dismiss();
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    jj.c0(uc7Var2.currentAccount, tL_error2, eVar2, tL_channels_convertToGigagroup, Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                tn0 tn0Var = (tn0) obj6;
                TLObject tLObject = (TLObject) obj5;
                uc7 uc7Var3 = (uc7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                e eVar3 = (e) obj2;
                tn0 tn0Var2 = (tn0) obj;
                if (tL_error3 != null) {
                    tn0Var.a(tL_error3);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        uc7Var3.j4(paymentForm.users, false);
                        pVar = new p(paymentForm, tL_inputInvoicePremiumGiftCode, eVar3);
                    } else {
                        pVar = tLObject instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (pVar != null) {
                        pVar.a1 = new o(tn0Var2, tn0Var, b2);
                        LaunchActivity.Q().showAsSheet(pVar, new bg0());
                        break;
                    } else {
                        tn0Var.a(null);
                        break;
                    }
                }
            case 3:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                pcc pccVar = (pcc) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                uc7 uc7Var4 = (uc7) obj7;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj4;
                e eVar4 = (e) obj2;
                pcc pccVar2 = (pcc) obj;
                if (tL_error4 != null) {
                    pccVar.a(tL_error4);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        uc7Var4.j4(paymentForm2.users, false);
                        pVar2 = new p(paymentForm2, tL_inputInvoicePremiumGiftCode2, eVar4);
                    } else {
                        pVar2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (pVar2 != null) {
                        pVar2.a1 = new o(pccVar2, pccVar, (byte) 22);
                        LaunchActivity.Q().showAsSheet(pVar2, new bg0());
                        break;
                    } else {
                        pccVar.a(null);
                        break;
                    }
                }
            case 4:
                rv0 rv0Var = (rv0) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                id idVar3 = (id) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (iArr[4] > 0) {
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int Y0 = i5 > hl.Y0(false) ? hl.Y0(false) : i5;
                    int Y02 = i6 > hl.Y0(false) ? hl.Y0(false) : i6;
                    File w = c8b.w(yac.t0, "jpg");
                    lm lmVar = new lm(file, true, 0L, 0, null, null, null, 0L, yac.t0, true, Y0, Y02, null, 0, true);
                    Bitmap p = lmVar.p();
                    lmVar.u();
                    if (p != null) {
                        try {
                            c = 4;
                        } catch (Exception e3) {
                            e = e3;
                            c = 4;
                        }
                        try {
                            try {
                                p.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w));
                            } catch (Exception e4) {
                                e = e4;
                                cc4.g(e, true);
                                w = null;
                                m = c8b.o(file, w == null ? null : w.getAbsolutePath(), iArr[c]);
                                m.k0 = i5;
                                m.l0 = i6;
                                m.z();
                                if (m.k0 <= 0) {
                                }
                                idVar3.b(500L);
                                return;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            cc4.g(e, true);
                            w = null;
                            m = c8b.o(file, w == null ? null : w.getAbsolutePath(), iArr[c]);
                            m.k0 = i5;
                            m.l0 = i6;
                            m.z();
                            if (m.k0 <= 0) {
                            }
                            idVar3.b(500L);
                            return;
                        }
                    } else {
                        c = 4;
                    }
                    m = c8b.o(file, w == null ? null : w.getAbsolutePath(), iArr[c]);
                    m.k0 = i5;
                    m.l0 = i6;
                    m.z();
                } else {
                    m = c8b.m(file, ((Integer) hl.L0(file).first).intValue());
                }
                if (m.k0 <= 0 && m.l0 > 0) {
                    if (str != null) {
                        m.C0 = str;
                    }
                    if (!TextUtils.isEmpty(str2) && yac.h(rv0Var.N).p()) {
                        if (m.T0 == null) {
                            m.T0 = new ArrayList();
                        }
                        mec mecVar = new mec();
                        mecVar.a = (byte) 7;
                        mecVar.b = (byte) -1;
                        mecVar.l = -1;
                        g66 g66Var = new g66();
                        mecVar.a0 = g66Var;
                        g66Var.c = str2;
                        if (str3 != null) {
                            g66Var.a |= 2;
                            g66Var.b = str3;
                        }
                        m.T0.add(mecVar);
                    }
                    sbb.C(rv0Var.a0, yac.t0).T(null, m);
                    idVar3.b(500L);
                    break;
                } else {
                    idVar3.b(500L);
                }
                break;
            case 5:
                zu1 zu1Var = (zu1) obj7;
                r47 r47Var = (r47) obj5;
                wb2 wb2Var = (wb2) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                mu9 mu9Var = (mu9) obj;
                ((fu5) obj6).t0 = true;
                if (!TextUtils.isEmpty(r47Var.z)) {
                    str4 = wb2Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(r47Var.v)) {
                    str4 = wb2Var.getMessageObject().v.toString();
                }
                String concat = str4.length() > 21 ? str4.substring(0, 21).concat("...") : str4;
                Activity parentActivity = zu1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date * 1000;
                boolean z = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = hl.a;
                if (z) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j2);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    j2 = calendar.getTimeInMillis();
                    j = 86400000;
                } else {
                    j = 600000;
                }
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j2).putExtra("endTime", j + j2).putExtra("allDay", z);
                if (!TextUtils.isEmpty(concat)) {
                    putExtra.putExtra("title", concat);
                }
                if (!TextUtils.isEmpty(str4)) {
                    putExtra.putExtra("description", str4);
                }
                try {
                    parentActivity.startActivity(putExtra);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                mu9Var.dismiss();
                break;
            case 6:
                zu1 zu1Var2 = (zu1) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                pm1 pm1Var = (pm1) obj4;
                String str5 = (String) obj2;
                cq1 cq1Var = (cq1) obj;
                boolean z2 = tL_error5 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error5.text);
                if (tLObject3 != null || (tL_error5 == null && (tLObject4 instanceof TLRPC.TL_boolTrue))) {
                    pm1Var.a(tLObject3, Boolean.valueOf(z2));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str5;
                    cq1Var.b = new ul1(zu1Var2, zu1Var2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new si1((Object) zu1Var2, (Object) cq1Var, (Object) pm1Var, z2, (byte) 1)), (byte) 9);
                    cq1Var.d();
                    break;
                }
            case 7:
                TLObject tLObject5 = (TLObject) obj6;
                HashSet hashSet = (HashSet) obj5;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                r47 r47Var2 = (r47) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                zu1 zu1Var3 = ((ju1) obj7).a;
                ((id) obj4).dismiss();
                if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    zu1Var3.getMessagesController().j4(groupcall.users, false);
                    zu1Var3.getMessagesController().c4(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        zu1Var3.showDialog(new j13(zu1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = zu1Var3.getParentActivity();
                        i = ((e) zu1Var3).currentAccount;
                        xkc.g(parentActivity2, i, tL_inputGroupCallInviteMessage, r47Var2.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error6 != null) {
                    if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error6.text)) {
                        zu1Var3.showDialog(new j13(zu1Var3.getParentActivity(), hashSet));
                        break;
                    } else {
                        d31.b0(zu1Var3).g0(tL_error6, false);
                        break;
                    }
                }
                break;
            case 8:
                a55 a55Var = (a55) obj7;
                c35 c35Var = (c35) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str6 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                v45 v45Var = (v45) obj2;
                v35 v35Var = (v35) obj;
                a55Var.getClass();
                try {
                    hl.c3(new nn0((Object) a55Var, (Object) v45Var, (Object) tonconnectsession, (Object) str6, (Object) bArr, (Object) a55.r(c35Var, tonconnectsession, str6, bArr, v45Var.a, v45Var.b, v45Var.d, null, a55Var.f.getCurrentTime()), (Object) v35Var, (Object) c35Var, (byte) 3));
                    break;
                } catch (Exception e6) {
                    hl.c3(new y35(v35Var, a55.h("prepare connect", e6), b4));
                    return;
                }
            case 9:
                a55 a55Var2 = (a55) obj7;
                v45 v45Var2 = (v45) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                x45 x45Var = (x45) obj2;
                byte[] bArr2 = x45Var.b;
                v35 v35Var2 = (v35) obj;
                if (a55Var2.c(v45Var2, tonconnectsession2, (String) obj4, (byte[]) obj3)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = x45Var.c;
                    tonconnectsubmitconnectresult.trace_id = v45Var2.c;
                    a55Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new ic(b4), new p((Object) a55Var2, (Object) x45Var, (Object) v35Var2, (byte) 20));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    v35Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 10:
                a55 a55Var3 = (a55) obj7;
                c35 c35Var2 = (c35) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                String str7 = (String) obj4;
                byte[] bArr3 = (byte[]) obj3;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                v35 v35Var3 = (v35) obj;
                a55Var3.getClass();
                try {
                    hl.c3(new z87((Object) a55Var3, str7, (Object) bArr3, (Object) v35Var3, (Object) tonconnectsession3, (Object) a55.t(c35Var2, tonconnectsession3, str7, bArr3, tonconnectnexteventid.event_id), (byte) 10));
                    break;
                } catch (Exception e7) {
                    v35Var3.a(a55.h("prepare disconnect", e7));
                    return;
                }
            case 11:
                JSONObject jSONObject = (JSONObject) obj7;
                String str8 = (String) obj6;
                n55 n55Var = (n55) obj5;
                tk7 tk7Var = n55Var.a;
                l55 l55Var = n55Var.b;
                c cVar = (c) obj4;
                String str9 = (String) obj3;
                byte[] bArr4 = (byte[]) obj2;
                byte[] bArr5 = (byte[]) obj;
                if (jSONObject == null) {
                    d31.c0(str8);
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        l55Var.a();
                    }
                    if (!n55Var.e) {
                        tk7Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str9;
                    tL_userWallet.balance = cVar.z();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON;
                    tL_dataJSON.data = jSONObject.toString();
                    n55Var.d = false;
                    if (!n55Var.f) {
                        n55Var.f = true;
                        l55Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!n55Var.e) {
                        tk7Var.dismiss();
                        break;
                    }
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                String str10 = (String) obj6;
                Bundle bundle = (Bundle) obj5;
                TLObject tLObject6 = (TLObject) obj2;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                String str11 = LaunchActivity.C1;
                ((id) obj4).dismiss();
                if (tL_error7 == null) {
                    qh6 qh6Var = new qh6();
                    qh6Var.H = str10;
                    qh6Var.I = bundle;
                    qh6Var.J = (TLRPC.TL_auth_sentCode) tLObject6;
                    qh6Var.G = (byte) 1;
                    launchActivity.t0(qh6Var);
                    break;
                } else {
                    jj.c0(launchActivity.P, tL_error7, launchActivity.N().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 13:
                zg6 zg6Var = (zg6) obj7;
                List<Purchase> list = (List) obj5;
                String str12 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                g65 g65Var = (g65) obj;
                if (((gi0) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.c().contains(str12)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON2;
                            tL_dataJSON2.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            zg6Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new in0((Object) zg6Var, (Object) tL_inputStorePaymentAuthCode, (Object) purchase, (Object) tL_payments_canPurchaseStore, (Object) g65Var, (byte) 7), 74);
                            break;
                        }
                    }
                }
                g65Var.run();
                break;
            case 14:
                ph6 ph6Var = (ph6) obj7;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj6;
                Bundle bundle2 = (Bundle) obj5;
                String str13 = (String) obj4;
                pm3 pm3Var = (pm3) obj2;
                TLObject tLObject8 = (TLObject) obj;
                qh6 qh6Var2 = ph6Var.h0;
                ph6Var.N = false;
                if (tL_error8 != null) {
                    String str14 = tL_error8.text;
                    if (str14 != null) {
                        if (str14.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i3 = ((e) qh6Var2).currentAccount;
                            ConnectionsManager.getInstance(i3).sendRequest(getpassword, new mw3(ph6Var, str13, (byte) 23), 10);
                        } else if (tL_error8.text.contains("PHONE_NUMBER_INVALID")) {
                            qh6.A1(qh6Var2, str13, pm3Var, false);
                        } else if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131747013, "PhoneNumberFlood"));
                        } else if (tL_error8.text.contains("PHONE_NUMBER_BANNED")) {
                            qh6.A1(qh6Var2, str13, pm3Var, true);
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, null));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            qh6Var2.J1(0, true, null, true);
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                        } else if (tL_error8.code != -1000) {
                            i2 = ((e) qh6Var2).currentAccount;
                            jj.c0(i2, tL_error8, qh6Var2, tLObject8, (String) pm3Var.c);
                        }
                    }
                } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject7).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            qh6Var2.s0 = tL_help_termsOfService;
                        }
                        qh6Var2.J1(5, true, bundle2, false);
                    } else {
                        qh6Var2.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    qh6Var2.q1(bundle2, (TLRPC.auth_SentCode) tLObject7, true);
                }
                if (!qh6Var2.r0) {
                    qh6Var2.y1(false, true);
                    break;
                }
                break;
            case 15:
                ls6 ls6Var = (ls6) obj7;
                ls6Var.getMessagesController().j4((ArrayList) obj6, true);
                ls6Var.getMessagesController().c4((ArrayList) obj5, true);
                ls6Var.o1 = false;
                ls6Var.n1 = true;
                ls6Var.j1 = (ArrayList) obj4;
                ls6Var.k1 = (ArrayList) obj3;
                ls6Var.l1 = (ArrayList) obj2;
                ls6Var.m1 = (ArrayList) obj;
                ls6Var.o();
                ls6Var.getNotificationCenter().k(82, new Object[0]);
                ls6Var.getNotificationCenter().k(83, new Object[0]);
                ls6Var.getNotificationCenter().k(84, new Object[0]);
                ls6Var.getNotificationCenter().k(85, new Object[0]);
                if (Math.abs(ls6Var.getUserConfig().s - ((int) (System.currentTimeMillis() / 1000))) < 86400) {
                    boolean z3 = f11.a;
                    break;
                } else {
                    ls6Var.O0(false);
                    break;
                }
            case 16:
                TLObject tLObject9 = (TLObject) obj6;
                String str15 = (String) obj5;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                j08 j08Var = (j08) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                um4 um4Var = (um4) obj;
                b18 b18Var = ((i08) obj7).p.d;
                if (tLObject9 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str15);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    b18 b18Var2 = new b18(6, b18Var.E, b18Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i4 = ((e) b18Var).currentAccount;
                    ((e) b18Var2).currentAccount = i4;
                    b18Var2.U0 = sentemailcode.length;
                    b18Var2.f1 = b18Var.f1;
                    b18Var2.d1 = b18Var.d1;
                    b18Var2.C1 = j08Var;
                    b18Var.presentFragment(b18Var2, true);
                    break;
                } else {
                    b18Var.P1(ob6.M0(2131747302, null), tL_error9.text);
                    if (um4Var != null) {
                        um4Var.Z(tL_error9.text, str15);
                        break;
                    }
                }
                break;
            case 17:
                a();
                break;
            case 18:
                ((boolean[]) obj6)[0] = true;
                ((jxa) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new nva((boolean[]) obj3, (icc) obj2, (pcc) obj));
                break;
            case 19:
                jxa jxaVar = (jxa) obj7;
                List list2 = (List) obj6;
                iv4 iv4Var = (iv4) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                gi0 gi0Var = (gi0) obj2;
                Activity activity2 = (Activity) obj;
                if (list2.isEmpty()) {
                    hl.c3(new xva(iv4Var, b4));
                    break;
                } else {
                    wo8 wo8Var = (wo8) list2.get(0);
                    to8 a = wo8Var.a();
                    if (a == null) {
                        hl.c3(new xva(iv4Var, b3));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(jxaVar.a).sendRequest(tL_payments_canPurchaseStore2, new mn0(wo8Var, gi0Var, (icc) iv4Var, activity2, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list2, (byte) 3));
                        break;
                    }
                }
            case 20:
                jxa jxaVar2 = (jxa) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                r47 r47Var3 = (r47) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                pcc pccVar3 = (pcc) obj2;
                d31 d31Var = (d31) obj;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    jxaVar2.Y(r47Var3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, pccVar3);
                    break;
                } else {
                    pccVar3.a(Boolean.FALSE);
                    d31Var.Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, tL_error10 != null ? tL_error10.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 21:
                e0b e0bVar = (e0b) obj7;
                h96[] h96VarArr = (h96[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                x49 x49Var = (x49) obj2;
                u49 u49Var = (u49) obj;
                if (e0bVar.n1) {
                    h96 h96Var = h96VarArr[0];
                    if (h96Var == null) {
                        h96Var = e0bVar.J1.c(e0bVar.K1);
                        h96VarArr[0] = h96Var;
                    }
                    if (h96Var != null) {
                        h96Var.setDrawStar(false);
                        h96Var.getLocationInWindow(iArr2);
                        TextView textView = h96Var.F;
                        wm2[] wm2VarArr = h96Var.H;
                        if (wm2VarArr[0] != null && textView.getLayout() != null) {
                            float x = textView.getX() + textView.getPaddingLeft() + wm2VarArr[0].r;
                            float y = textView.getY() + textView.getPaddingTop() + wm2VarArr[0].s;
                            rectF.set(x, y, r1.c.getBounds().width() + x, wm2VarArr[0].c.getBounds().height() + y);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(hl.L(4.0f) + iArr2[0] + x49Var.b + u49Var.w, ((u49Var.A - hl.L(22.0f)) / 2.0f) + iArr2[1] + x49Var.c + u49Var.x, hl.L(26.0f) + iArr2[0] + x49Var.b + u49Var.w, ((hl.L(22.0f) + u49Var.A) / 2.0f) + iArr2[1] + x49Var.c + u49Var.x);
                    break;
                }
                break;
            default:
                a5c a5cVar = (a5c) obj7;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj6;
                a5cVar.getClass();
                storyItem.translatedLng = (String) obj5;
                storyItem.translatedText = r3c.M0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                a5cVar.getMessagesController().O1().k.h(storyItem.dialogId, storyItem);
                a5cVar.K.remove((y4c) obj2);
                ((kt) obj).run();
                break;
        }
    }

    public /* synthetic */ ra7(fn7 fn7Var, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = fn7Var;
        this.d = tL_error;
        this.f = tLObject;
        this.h = obj;
        this.c = obj2;
        this.e = obj3;
        this.n = obj4;
    }

    public /* synthetic */ ra7(ju1 ju1Var, id idVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, r47 r47Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.b = ju1Var;
        this.c = idVar;
        this.f = tLObject;
        this.h = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.n = r47Var;
        this.d = tL_error;
    }

    public /* synthetic */ ra7(jxa jxaVar, TLObject tLObject, r47 r47Var, TLRPC.InputInvoice inputInvoice, pcc pccVar, d31 d31Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 20;
        this.b = jxaVar;
        this.f = tLObject;
        this.h = r47Var;
        this.c = inputInvoice;
        this.e = pccVar;
        this.n = d31Var;
        this.d = tL_error;
    }

    public /* synthetic */ ra7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.n = obj7;
    }

    public /* synthetic */ ra7(TLRPC.TL_error tL_error, pcc pccVar, TLObject tLObject, uc7 uc7Var, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, e eVar, pcc pccVar2, byte b) {
        this.a = b;
        this.d = tL_error;
        this.f = pccVar;
        this.h = tLObject;
        this.b = uc7Var;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.e = eVar;
        this.n = pccVar2;
    }

    public /* synthetic */ ra7(LaunchActivity launchActivity, id idVar, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = (byte) 12;
        this.b = launchActivity;
        this.c = idVar;
        this.d = tL_error;
        this.f = str;
        this.h = bundle;
        this.e = tLObject;
        this.n = sendconfirmphonecode;
    }
}
