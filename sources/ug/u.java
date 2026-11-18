package ug;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ u(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        l0 l0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new p4.o0(19, l0Var, tLObject));
                break;
            case 1:
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    l0Var.getClass();
                    break;
                } else {
                    org.telegram.messenger.g0.g3(l0Var.D2);
                    break;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        l0 l0Var2 = this.b;
                        if (i10 >= min) {
                            org.telegram.messenger.g0.g3(new kp0(l0Var2, arrayList, min, tL_messages_inactiveChats, 26));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(l0Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            String G = currentTime < 30 ? gd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? gd.G(currentTime / 30, "Months", new Object[0]) : gd.G(currentTime / 365, "Years", new Object[0]);
                            if (v3.n0(chat)) {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749019, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (v3.T(chat)) {
                                arrayList.add(gd.a0("InactiveChannelSignature", null, 2131749020, G));
                            } else {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749019, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        }
                    }
                }
                break;
        }
    }
}
