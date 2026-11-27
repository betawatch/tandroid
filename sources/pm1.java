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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm1 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pm1(zu1 zu1Var, cq1 cq1Var, wb2 wb2Var, String str, CharacterStyle characterStyle) {
        this.a = (byte) 1;
        this.b = zu1Var;
        this.c = cq1Var;
        this.d = wb2Var;
        this.e = str;
        this.f = characterStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z;
        long j;
        int i;
        boolean z2;
        SpannableString spannableString;
        int i2;
        int i3;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        String z5;
        String str3;
        String str4 = "NULL_ERROR";
        byte b = 15;
        byte b2 = 3;
        boolean z6 = true;
        TLRPC.User user = null;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                zu1 zu1Var = (zu1) this.b;
                boolean[] zArr = (boolean[]) this.d;
                cq1 cq1Var = (cq1) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                y6a y6aVar = (y6a) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (cq1Var != null) {
                        cq1Var.c(false);
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id != 0) {
                        user = zu1Var.getMessagesController().X1(Long.valueOf(walletuseraddress.user_id));
                    }
                    userArr[0] = user;
                    y6aVar.run();
                    break;
                }
                break;
            case 1:
                zu1 zu1Var2 = (zu1) this.b;
                cq1 cq1Var2 = (cq1) this.c;
                wb2 wb2Var = (wb2) this.d;
                String str5 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                cq1Var2.c(false);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                    z = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    j = -chat.id;
                    z = xc2.V(chat);
                    z6 = false;
                } else {
                    z = false;
                    z6 = false;
                    j = 0;
                }
                fu5 J = fu5.J(zu1Var2, wb2Var);
                mu9 mu9Var = new mu9(zu1Var2.getParentActivity(), zu1Var2.Ba);
                J.p = new dm1(mu9Var, b3);
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i4 != 0) {
                    if (z) {
                        i2 = R.drawable.msg_channel;
                        i3 = 2131743213;
                    } else {
                        i2 = R.drawable.msg_discussion;
                        i3 = 2131745329;
                    }
                    i = i4;
                    z2 = false;
                    J.b(i2, ob6.M0(i3, null), new xn0(zu1Var2, j, (byte) 4), false);
                } else {
                    i = i4;
                    z2 = false;
                }
                J.b(R.drawable.msg_copy, ob6.M0(2131746405, null), new mm1(zu1Var2, mu9Var, str5, (byte) 3), z2);
                if (bool.booleanValue()) {
                    J.b(R.drawable.outline_gram_24, ob6.M0(2131752634, null), new hl1(zu1Var2, str5, (byte) 11), z2);
                }
                J.j();
                if (i != 0) {
                    spannableString = null;
                    J.m(tLObject, ob6.M0(z6 ? 2131743198 : z ? 2131743212 : 2131743205, null), new xn0(zu1Var2, j, (byte) 5));
                } else {
                    spannableString = null;
                    J.o(13, hl.L(200.0f), ob6.M0(2131747864, null));
                }
                mu9Var.e(J);
                mu9Var.f(wb2Var, characterStyle, spannableString, false);
                zu1Var2.showDialog(mu9Var);
                break;
            case 2:
                zu1 zu1Var3 = (zu1) this.b;
                dq1 dq1Var = (dq1) this.d;
                int[] iArr = (int[]) this.c;
                wb2 wb2Var2 = (wb2) this.e;
                r47 r47Var = (r47) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (zu1Var3.pc == dq1Var) {
                    iArr[0] = 0;
                    dq1Var.c(false);
                    if (messages_messages != null) {
                        zu1Var3.getMessagesController().j4(messages_messages.users, false);
                        zu1Var3.getMessagesController().c4(messages_messages.chats, false);
                        int i5 = 0;
                        while (true) {
                            if (i5 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i5);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i5++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = r47Var.k) != null) {
                            message.rich_message = richMessage;
                            r47Var.y2 = null;
                            ju1 ju1Var = zu1Var3.kd;
                            if (ju1Var != null && wb2Var2 != null) {
                                ju1Var.f(wb2Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                c cVar = (c) this.b;
                ao1 ao1Var = (ao1) this.d;
                z25 z25Var = (z25) this.c;
                c35 c35Var = (c35) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F = c.F(updates);
                if (updates != null) {
                    Utilities.d.c(new se4(cVar, updates, b));
                }
                if (F != null) {
                    String str6 = F.msg_hash;
                    if (!TextUtils.isEmpty(str6) && c.u0(str6) != null) {
                        c.P("disable backup: transfer is sent, msg_hash=" + F.msg_hash + ", gasless=" + F.gasless);
                        a aVar = new a(cVar);
                        aVar.a = F.msg_hash;
                        aVar.c = z25Var.c;
                        aVar.b = c35Var;
                        if (F.transaction != null) {
                            aVar.a();
                        } else {
                            cVar.s.add(aVar);
                        }
                        cVar.d(wallettransaction, F);
                        break;
                    }
                }
                ao1Var.run();
                if (tL_error != null && (str = tL_error.text) != null) {
                    str4 = str;
                }
                c.m("disable backup: sendTransfer: ".concat(str4));
                break;
            case 4:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                r7a r7aVar = (r7a) this.c;
                r47 r47Var2 = (r47) this.e;
                ao1 ao1Var2 = (ao1) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F2 = c.F(updates2);
                if (tL_error2 == null && F2 != null) {
                    String str7 = F2.msg_hash;
                    if (!TextUtils.isEmpty(str7) && c.u0(str7) != null) {
                        z3 = true;
                        boolean z7 = (!wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) ? false : true;
                        if (!z3 && !z7) {
                            z6 = false;
                        }
                        r7aVar.k(r47Var2, updates2, z6);
                        if (updates2 != null) {
                            Utilities.d.c(new se4(cVar2, updates2, b));
                        }
                        if (!z3) {
                            c.P("transfer is sent, msg_hash=" + F2.msg_hash + ", gasless=" + F2.gasless);
                            Runnable runnable = (Runnable) cVar2.r.remove(wallettransaction2);
                            if (runnable != null) {
                                runnable.run();
                            }
                            cVar2.d(wallettransaction2, F2);
                            break;
                        } else {
                            ao1Var2.run();
                            if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                str4 = str2;
                            }
                            c.m("sendTransfer: ".concat(str4));
                            break;
                        }
                    }
                }
                z3 = false;
                if (!wallettransaction2.pending) {
                }
                if (!z3) {
                    z6 = false;
                }
                r7aVar.k(r47Var2, updates2, z6);
                if (updates2 != null) {
                }
                if (!z3) {
                }
                break;
            case 5:
                a55 a55Var = (a55) this.b;
                gt gtVar = (gt) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str8 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                c35 c35Var2 = (c35) obj;
                String str9 = (String) obj2;
                a55Var.getClass();
                if (str9 == null) {
                    if (c35Var2 != null) {
                        c35 b4 = c35Var2.b();
                        v35 v35Var = new v35(b4, gtVar, b2);
                        TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                        tonconnectgetnexteventid.session_id = tonconnectsession.id;
                        a55Var.f.sendRequestTyped(tonconnectgetnexteventid, new ic(b3), new a45(a55Var, v35Var, b4, tonconnectsession, str8, bArr));
                        break;
                    } else {
                        str9 = "Recovery phrase is unavailable";
                    }
                }
                gtVar.a(str9);
                break;
            default:
                a55 a55Var2 = (a55) this.b;
                pcc pccVar = (pcc) this.d;
                w45 w45Var = (w45) this.c;
                c35 c35Var3 = (c35) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z4 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TLRPC.Update update = arrayList.get(i6);
                        i6++;
                        z4 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new se4(a55Var2, updates3, (byte) 18));
                } else {
                    z4 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    a55Var2.b.J();
                }
                if (tL_error3 == null) {
                    if (z4) {
                        b3 = -1;
                        str3 = Base64.encodeToString(sendtransfer.data_normal, 2);
                        z5 = null;
                        a55Var2.y(w45Var, c35Var3, str3, b3, z5, pccVar);
                        break;
                    }
                    pccVar.a(a55.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    int i7 = tL_error3.code;
                    if (i7 >= 0 && i7 < 500) {
                        z5 = a55.z(tL_error3, "sendTransfer");
                        str3 = null;
                        a55Var2.y(w45Var, c35Var3, str3, b3, z5, pccVar);
                    }
                    pccVar.a(a55.z(tL_error3, "sendTransfer"));
                }
                break;
        }
    }

    public /* synthetic */ pm1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
