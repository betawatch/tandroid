// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q12 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x12 b;
    public final /* synthetic */ uc7 c;
    public final /* synthetic */ int d;

    public /* synthetic */ q12(x12 x12Var, uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = x12Var;
        this.c = uc7Var;
        this.d = i;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        byte b = this.a;
        boolean z = false;
        int i = this.d;
        uc7 uc7Var = this.c;
        x12 x12Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                x12Var.e0 = -1;
                x12Var.n0 = false;
                if (messages_botresults != null) {
                    uc7Var.j4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i2);
                        i2++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i3 = x12Var.m0;
                                x12Var.m0 = i3 - 1;
                                tL_message.id = i3;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = yac.h(i).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                eo6 eo6Var = new eo6();
                                r47 r47Var = new r47(i, tL_message, false, true);
                                eo6Var.e = r47Var;
                                TLRPC.Document F0 = r47Var.F0();
                                if (F0 != null) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= F0.attributes.size()) {
                                            tL_documentAttributeAudio = null;
                                        } else if (F0.attributes.get(i4) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i4);
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        eo6Var.a = tL_documentAttributeAudio.performer;
                                        eo6Var.b = tL_documentAttributeAudio.title;
                                        eo6Var.c = (int) tL_documentAttributeAudio.duration;
                                        x12Var.N.add(eo6Var);
                                    }
                                }
                            }
                        }
                    }
                    x12Var.l0 = messages_botresults.next_offset;
                    x12Var.h0 = !TextUtils.isEmpty(r13);
                    x12Var.S();
                    break;
                }
                break;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ArrayList arrayList2 = x12Var.M;
                x12Var.V = -1;
                x12Var.a0 = false;
                if (messages_messages != null) {
                    uc7Var.j4(messages_messages.users, false);
                    uc7Var.c4(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        TLRPC.Message message = arrayList3.get(i5);
                        i5++;
                        eo6 eo6Var2 = new eo6();
                        r47 r47Var2 = new r47(i, message, false, true);
                        eo6Var2.e = r47Var2;
                        TLRPC.Document F02 = r47Var2.F0();
                        if (F02 != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= F02.attributes.size()) {
                                    tL_documentAttributeAudio2 = null;
                                } else if (F02.attributes.get(i6) instanceof TLRPC.TL_documentAttributeAudio) {
                                    tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                eo6Var2.a = tL_documentAttributeAudio2.performer;
                                eo6Var2.b = tL_documentAttributeAudio2.title;
                                eo6Var2.c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(eo6Var2);
                            }
                        }
                    }
                    int i7 = messages_messages.next_rate;
                    x12Var.c0 = i7;
                    if (i7 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z = true;
                    }
                    x12Var.d0 = z;
                    x12Var.S();
                    break;
                }
                break;
        }
    }
}
