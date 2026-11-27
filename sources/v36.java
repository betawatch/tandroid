// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v36 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l46 b;

    public /* synthetic */ v36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new tg5(l46Var, tLObject, (byte) 28));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hl.c3(l46Var.C2);
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
                        l46 l46Var2 = this.b;
                        if (i >= min) {
                            hl.c3(new y36((Object) l46Var2, (Object) arrayList, min, (Object) tL_messages_inactiveChats, (byte) 0));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(l46Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            String G = currentTime < 30 ? ob6.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? ob6.G(currentTime / 30, "Months", new Object[0]) : ob6.G(currentTime / 365, "Years", new Object[0]);
                            if (xc2.n0(chat)) {
                                arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (xc2.T(chat)) {
                                arrayList.add(ob6.a0("InactiveChannelSignature", null, 2131748966, G));
                            } else {
                                arrayList.add(ob6.a0("InactiveChatSignature", null, 2131748965, ob6.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        }
                    }
                }
                break;
        }
    }
}
