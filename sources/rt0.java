// default package

import android.app.Activity;
import android.os.SystemClock;
import android.util.LongSparseArray;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rt0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rt0(mf6 mf6Var, String str, String str2, String str3) {
        this.a = (byte) 8;
        this.b = mf6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                gl.d3(new b87(obj4, (Object) tLObject, obj3, obj2, obj, (byte) 6));
                break;
            case 1:
                hv0 hv0Var = (hv0) obj4;
                hv0Var.getClass();
                gl.d3(new e57((gk7) hv0Var, (Object) tLObject, obj3, (String) obj2, (TLObject) tL_error, obj, (byte) 3));
                break;
            case 2:
                if1 if1Var = (if1) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                hd hdVar = (hd) obj;
                nf1 nf1Var = if1Var.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i);
                        if (nf1Var.A0 == null) {
                            nf1Var.A0 = new HashMap();
                        }
                        nf1Var.A0.put(Long.valueOf(user.id), user);
                    }
                }
                gl.d3(new b87((Object) if1Var, (Object) tL_chatInviteExported, (Object) tL_messages_exportedChatInvite, (Object) zArr, (Object) hdVar, (byte) 14));
                break;
            case 3:
                gl.d3(new hn1((x92) obj4, (hd[]) obj3, (TLRPC.Chat) obj2, (wa5) obj, (byte) 8));
                break;
            case 4:
                gl.d3(new b87(obj4, tL_error, obj3, obj2, obj, (byte) 22));
                break;
            case 5:
                gl.d3(new b87(obj4, (Object) tLObject, obj3, obj2, obj, (byte) 27));
                break;
            case 6:
                gl.d3(new e57(obj4, obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 9));
                break;
            case 7:
                eb6 eb6Var = (eb6) obj4;
                db6 db6Var = (db6) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        eb6Var.b.remove(db6Var);
                        eb6Var.a.l(db6Var.a);
                        eb6Var.l(db6Var, 1);
                        eb6Var.G.delete(iArr[0]);
                        gl.d3(new xa6(eb6Var, db6Var, (byte) 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        db6Var.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i2);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            db6Var.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            db6Var.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else {
                            i2++;
                            z = z;
                        }
                        z = true;
                        i2++;
                        z = z;
                    }
                    if (z) {
                        eb6Var.l(db6Var, 0);
                    }
                    eb6Var.getMessagesController().Q3(updates, false);
                    break;
                }
                break;
            case 8:
                mf6 mf6Var = (mf6) obj4;
                mf6Var.getClass();
                gl.d3(new vz4(mf6Var, tL_error, (String) obj2, (String) obj, (String) obj3));
                break;
            case 9:
                gl.d3(new e57((dz6) obj4, (String) obj2, tL_error, tLObject, (na7) obj3, (ad7) obj));
                break;
            case 10:
                na7 na7Var = (na7) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    if (i3 > 0) {
                        na7Var.g0(chat, user2, chat2, i3);
                    }
                    na7Var.N3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 11:
                na7 na7Var2 = (na7) obj4;
                vjb vjbVar = (vjb) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj;
                String str = (String) obj2;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File e = sqc.e(vjbVar.b);
                if (wallPaper != null) {
                    try {
                        ba4 fileLoader = na7Var2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        gl.E(e, ba4.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                gl.d3(new e57((Object) na7Var2, (Object) wallPaper, (Object) tL_wallPaperSettings, (Object) vjbVar, (Object) e, (Object) str, (byte) 0));
                break;
            case 12:
                gl.d3(new e57((vx7) obj4, tL_error, (String) obj2, (bx7) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 13:
                gl.d3(new ex7(obj4, (Object) tL_error, obj3, obj2, obj, (byte) 0));
                break;
            case 14:
                gl.d3(new ex7((y28) obj4, (a5b) obj3, tL_error, (TL_stories.StoryItem) obj2, (w5b) obj));
                break;
            case 15:
                gl.d3(new ex7(obj4, (Object) tL_error, obj3, obj2, obj, (byte) 7));
                break;
            case 16:
                gl.d3(new e57(obj4, (Object) tLObject, obj3, (Object) tL_error, obj, obj2, (byte) 21));
                break;
            case 17:
                bu9 bu9Var = (bu9) obj4;
                Activity activity = (Activity) obj3;
                hd hdVar2 = (hd) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i4 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i4)) {
                            gl.d3(new x87(activity, hdVar2, (byte) 1));
                            break;
                        } else {
                            ad7 messagesStorage = bu9Var.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.G();
                            messagesStorage.y = bArr2;
                            ad7 messagesStorage2 = bu9Var.getMessagesStorage();
                            int i5 = messages_dhconfig.g;
                            messagesStorage2.G();
                            messagesStorage2.E = i5;
                            ad7 messagesStorage3 = bu9Var.getMessagesStorage();
                            int i6 = messages_dhconfig.version;
                            messagesStorage3.G();
                            messagesStorage3.x = i6;
                            ad7 messagesStorage4 = bu9Var.getMessagesStorage();
                            ad7 messagesStorage5 = bu9Var.getMessagesStorage();
                            messagesStorage5.G();
                            int i7 = messagesStorage5.x;
                            ad7 messagesStorage6 = bu9Var.getMessagesStorage();
                            messagesStorage6.G();
                            int i8 = messagesStorage6.E;
                            ad7 messagesStorage7 = bu9Var.getMessagesStorage();
                            messagesStorage7.G();
                            messagesStorage4.a.c(new mp1(messagesStorage4, i7, i8, messagesStorage7.y, (byte) 10));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i9 = 0; i9 < 256; i9++) {
                        bArr3[i9] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i9]);
                    }
                    bu9Var.getMessagesStorage().G();
                    BigInteger valueOf = BigInteger.valueOf(r0.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    ad7 messagesStorage8 = bu9Var.getMessagesStorage();
                    messagesStorage8.G();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = bu9Var.getMessagesController().o1(user3);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    bu9Var.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new fn0((Object) bu9Var, (Object) activity, (Object) hdVar2, (Object) bArr3, (Object) user3, (byte) 13), 2);
                    break;
                } else {
                    bu9Var.f.clear();
                    gl.d3(new yt9(bu9Var, activity, hdVar2, false ? 1 : 0));
                    break;
                }
            case 18:
                z3a z3aVar = (z3a) obj4;
                k27 k27Var = (k27) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                vf6 vf6Var = z3aVar.x;
                if (tL_error == null) {
                    vf6Var.k(0L, k27Var.D1());
                    z3aVar.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    vf6Var.k(Long.valueOf(SystemClock.elapsedRealtime()), k27Var.D1());
                }
                gl.d3(new gm8(z3aVar, str2, runnable, (byte) 28));
                break;
            case 19:
                gl.d3(new foa((vqa) obj4, tLObject, (xu4[]) obj3, (Long) obj2, (q3a) obj, tL_error, (byte) 1));
                break;
            case 20:
                vqa vqaVar = (vqa) obj4;
                vqaVar.getClass();
                gl.d3(new foa(vqaVar, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, (byte) 0));
                break;
            case 21:
                gl.d3(new foa((gta) obj4, tLObject, (k27) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (hq1) obj, tL_error, (byte) 4));
                break;
            case 22:
                gl.d3(new ex7(obj4, obj3, (Object) tLObject, obj2, obj, (byte) 29));
                break;
            case 23:
                wsa wsaVar = (wsa) obj4;
                wsaVar.getClass();
                gl.d3(new foa(wsaVar, tLObject, (TL_stars.TL_starGiftCollection) obj3, (xsa) obj2, (p8c) obj, tL_error, (byte) 6));
                break;
            case 24:
                o78 o78Var = (o78) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                apa apaVar = (apa) obj;
                if (tL_error != null && ab4.r(tL_error.text) && obj3 != null) {
                    ab4.n(o78Var.a).u(new Object[]{tL_messages_getAttachedStickers, apaVar}, obj3);
                    break;
                } else {
                    apaVar.run(tLObject, tL_error);
                    break;
                }
            case 25:
                gl.d3(new tsa((b1b) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj));
                break;
            default:
                f4b f4bVar = (f4b) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                wx9 wx9Var = (wx9) obj;
                if (tL_error != null && ab4.r(tL_error.text) && storyItem != null) {
                    ab4.n(f4bVar.a).u(new Object[]{tL_messages_getAttachedStickers2, wx9Var}, storyItem);
                    break;
                } else {
                    wx9Var.run(tLObject, tL_error);
                    break;
                }
        }
    }

    public /* synthetic */ rt0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ rt0(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = str;
    }

    public /* synthetic */ rt0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.e = obj2;
        this.d = obj3;
    }
}
