package ug;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ u(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        j0 j0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(27, j0Var, tLObject));
                break;
            case 1:
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    j0Var.getClass();
                    break;
                } else {
                    org.telegram.messenger.g0.h3(j0Var.D2);
                    break;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        j0 j0Var2 = this.b;
                        if (i10 >= min) {
                            org.telegram.messenger.g0.h3(new sp0(j0Var2, arrayList, min, tL_messages_inactiveChats, 25));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(j0Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            String G = currentTime < 30 ? hd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? hd.G(currentTime / 30, "Months", new Object[0]) : hd.G(currentTime / 365, "Years", new Object[0]);
                            if (t3.n0(chat)) {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749211, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (t3.T(chat)) {
                                arrayList.add(hd.a0("InactiveChannelSignature", null, 2131749212, G));
                            } else {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749211, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        }
                    }
                }
                break;
        }
    }
}
