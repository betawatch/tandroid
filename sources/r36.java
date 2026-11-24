// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r36 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i46 b;

    public /* synthetic */ r36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        i46 i46Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                gm.c3(new k16(i46Var, tLObject, b2));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gm.c3(i46Var.C2);
                    break;
                }
                break;
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i = 0;
                    while (true) {
                        i46 i46Var2 = this.b;
                        if (i >= min) {
                            gm.c3(new v36((Object) i46Var2, (Object) arrayList, min, (Object) tL_messages_inactiveChats, (byte) 0));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(i46Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            String G = currentTime < 30 ? jb6.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? jb6.G(currentTime / 30, "Months", new Object[0]) : jb6.G(currentTime / 365, "Years", new Object[0]);
                            if (sd2.n0(chat)) {
                                arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (sd2.T(chat)) {
                                arrayList.add(jb6.a0("InactiveChannelSignature", null, 2131748969, G));
                            } else {
                                arrayList.add(jb6.a0("InactiveChatSignature", null, 2131748968, jb6.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        }
                    }
                }
                break;
        }
    }
}
