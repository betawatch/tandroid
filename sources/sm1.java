// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.a;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm1 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sm1(yv1 yv1Var, br1 br1Var, rc2 rc2Var, String str, CharacterStyle characterStyle) {
        this.a = (byte) 1;
        this.b = yv1Var;
        this.c = br1Var;
        this.d = rc2Var;
        this.e = str;
        this.f = characterStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        SpannableString spannableString;
        int i;
        int i2;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        String str;
        boolean z4;
        String str2;
        boolean z5;
        String z6;
        String str3;
        String str4 = "NULL_ERROR";
        byte b = 19;
        byte b2 = 3;
        boolean z7 = true;
        TLRPC.User user = null;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                yv1 yv1Var = (yv1) this.b;
                boolean[] zArr = (boolean[]) this.d;
                br1 br1Var = (br1) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                b5a b5aVar = (b5a) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (br1Var != null) {
                        br1Var.c(false);
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id != 0) {
                        user = yv1Var.getMessagesController().W1(Long.valueOf(walletuseraddress.user_id));
                    }
                    userArr[0] = user;
                    b5aVar.run();
                    break;
                }
                break;
            case 1:
                yv1 yv1Var2 = (yv1) this.b;
                br1 br1Var2 = (br1) this.c;
                rc2 rc2Var = (rc2) this.d;
                String str5 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                br1Var2.c(false);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                    z = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    j = -chat.id;
                    z = sd2.V(chat);
                    z7 = false;
                } else {
                    z = false;
                    z7 = false;
                    j = 0;
                }
                bu5 J = bu5.J(yv1Var2, rc2Var);
                vs9 vs9Var = new vs9(yv1Var2.getParentActivity(), yv1Var2.Ba);
                J.p = new hm1(vs9Var, b3);
                if (j != 0) {
                    if (z) {
                        i = R.drawable.msg_channel;
                        i2 = 2131743245;
                    } else {
                        i = R.drawable.msg_discussion;
                        i2 = 2131745335;
                    }
                    z2 = z;
                    z3 = false;
                    J.b(i, jb6.M0(i2, null), new xo0(yv1Var2, j, (byte) 3), false);
                } else {
                    z2 = z;
                    z3 = false;
                }
                J.b(R.drawable.msg_copy, jb6.M0(2131746411, null), new nm1(yv1Var2, vs9Var, str5, (byte) 2), z3);
                if (bool.booleanValue()) {
                    J.b(R.drawable.outline_gram_24, jb6.M0(2131752606, null), new lm1(yv1Var2, str5, (byte) 11), z3);
                }
                J.j();
                if (j != 0) {
                    spannableString = null;
                    J.m(tLObject, jb6.M0(z7 ? 2131743230 : z2 ? 2131743244 : 2131743237, null), new xo0(yv1Var2, j, (byte) 4));
                } else {
                    spannableString = null;
                    J.o(13, gm.L(200.0f), jb6.M0(2131747867, null));
                }
                vs9Var.e(J);
                vs9Var.f(rc2Var, characterStyle, spannableString, false);
                yv1Var2.showDialog(vs9Var);
                break;
            case 2:
                yv1 yv1Var3 = (yv1) this.b;
                cr1 cr1Var = (cr1) this.d;
                int[] iArr = (int[]) this.c;
                rc2 rc2Var2 = (rc2) this.e;
                k47 k47Var = (k47) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (yv1Var3.oc == cr1Var) {
                    iArr[0] = 0;
                    cr1Var.c(false);
                    if (messages_messages != null) {
                        yv1Var3.getMessagesController().d4(messages_messages.users, false);
                        yv1Var3.getMessagesController().X3(messages_messages.chats, false);
                        int i3 = 0;
                        while (true) {
                            if (i3 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i3);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i3++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = k47Var.k) != null) {
                            message.rich_message = richMessage;
                            k47Var.y2 = null;
                            iv1 iv1Var = yv1Var3.hd;
                            if (iv1Var != null && rc2Var2 != null) {
                                iv1Var.g(rc2Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                c cVar = (c) this.b;
                xo1 xo1Var = (xo1) this.d;
                v25 v25Var = (v25) this.c;
                y25 y25Var = (y25) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F = c.F(updates);
                if (updates != null) {
                    Utilities.d.c(new ve4(cVar, updates, b));
                }
                if (F != null) {
                    String str6 = F.msg_hash;
                    if (!TextUtils.isEmpty(str6) && c.r0(str6) != null) {
                        c.O("disable backup: transfer is sent, msg_hash=" + F.msg_hash + ", gasless=" + F.gasless);
                        a aVar = new a(cVar);
                        aVar.a = F.msg_hash;
                        aVar.c = v25Var.c;
                        aVar.b = y25Var;
                        if (F.transaction != null) {
                            aVar.a();
                        } else {
                            cVar.s.add(aVar);
                        }
                        cVar.d(wallettransaction, F);
                        break;
                    }
                }
                xo1Var.run();
                if (tL_error != null && (str = tL_error.text) != null) {
                    str4 = str;
                }
                c.m("disable backup: sendTransfer: ".concat(str4));
                break;
            case 4:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                a6a a6aVar = (a6a) this.c;
                k47 k47Var2 = (k47) this.e;
                xo1 xo1Var2 = (xo1) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F2 = c.F(updates2);
                if (tL_error2 == null && F2 != null) {
                    String str7 = F2.msg_hash;
                    if (!TextUtils.isEmpty(str7) && c.r0(str7) != null) {
                        z4 = true;
                        boolean z8 = (!wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) ? false : true;
                        if (!z4 && !z8) {
                            z7 = false;
                        }
                        a6aVar.k(k47Var2, updates2, z7);
                        if (updates2 != null) {
                            Utilities.d.c(new ve4(cVar2, updates2, b));
                        }
                        if (!z4) {
                            c.O("transfer is sent, msg_hash=" + F2.msg_hash + ", gasless=" + F2.gasless);
                            Runnable runnable = (Runnable) cVar2.r.remove(wallettransaction2);
                            if (runnable != null) {
                                runnable.run();
                            }
                            cVar2.d(wallettransaction2, F2);
                            break;
                        } else {
                            xo1Var2.run();
                            if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                str4 = str2;
                            }
                            c.m("sendTransfer: ".concat(str4));
                            break;
                        }
                    }
                }
                z4 = false;
                if (!wallettransaction2.pending) {
                }
                if (!z4) {
                    z7 = false;
                }
                a6aVar.k(k47Var2, updates2, z7);
                if (updates2 != null) {
                }
                if (!z4) {
                }
                break;
            case 5:
                w45 w45Var = (w45) this.b;
                iu iuVar = (iu) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str8 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                y25 y25Var2 = (y25) obj;
                String str9 = (String) obj2;
                w45Var.getClass();
                if (str9 == null) {
                    if (y25Var2 != null) {
                        y25 b4 = y25Var2.b();
                        u35 u35Var = new u35(b4, iuVar, b2);
                        TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                        tonconnectgetnexteventid.session_id = tonconnectsession.id;
                        w45Var.f.sendRequestTyped(tonconnectgetnexteventid, new kc(b3), new w35(w45Var, u35Var, b4, tonconnectsession, str8, bArr));
                        break;
                    } else {
                        str9 = "Recovery phrase is unavailable";
                    }
                }
                iuVar.a(str9);
                break;
            default:
                w45 w45Var2 = (w45) this.b;
                qac qacVar = (qac) this.d;
                s45 s45Var = (s45) this.c;
                y25 y25Var3 = (y25) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z5 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TLRPC.Update update = arrayList.get(i4);
                        i4++;
                        z5 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new ve4(w45Var2, updates3, (byte) 22));
                } else {
                    z5 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    w45Var2.b.J();
                }
                if (tL_error3 == null) {
                    if (z5) {
                        b3 = -1;
                        str3 = Base64.encodeToString(sendtransfer.data_normal, 2);
                        z6 = null;
                        w45Var2.y(s45Var, y25Var3, str3, b3, z6, qacVar);
                        break;
                    }
                    qacVar.a(w45.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    int i5 = tL_error3.code;
                    if (i5 >= 0 && i5 < 500) {
                        z6 = w45.z(tL_error3, "sendTransfer");
                        str3 = null;
                        w45Var2.y(s45Var, y25Var3, str3, b3, z6, qacVar);
                    }
                    qacVar.a(w45.z(tL_error3, "sendTransfer"));
                }
                break;
        }
    }

    public /* synthetic */ sm1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
