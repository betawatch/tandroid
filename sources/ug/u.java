package ug;

import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ u(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        i0 i0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new u9.f(2, i0Var, tLObject));
                break;
            case 1:
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    i0Var.getClass();
                    break;
                } else {
                    org.telegram.messenger.g0.h3(i0Var.z2);
                    break;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        i0 i0Var2 = this.b;
                        if (i10 >= min) {
                            org.telegram.messenger.g0.h3(new pp0(i0Var2, arrayList, min, tL_messages_inactiveChats, 25));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(i0Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            String G = currentTime < 30 ? id.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? id.G(currentTime / 30, "Months", new Object[0]) : id.G(currentTime / 365, "Years", new Object[0]);
                            if (t3.n0(chat)) {
                                arrayList.add(id.a0("InactiveChatSignature", null, 2131749212, id.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (t3.T(chat)) {
                                arrayList.add(id.a0("InactiveChannelSignature", null, 2131749213, G));
                            } else {
                                arrayList.add(id.a0("InactiveChatSignature", null, 2131749212, id.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        }
                    }
                }
                break;
        }
    }
}
