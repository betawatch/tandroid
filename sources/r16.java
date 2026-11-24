// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class r16 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h26 b;

    public /* synthetic */ r16(h26 h26Var, byte b) {
        this.a = b;
        this.b = h26Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        h26 h26Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                gl.c3(new kz5(h26Var, tLObject, b2));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.c3(h26Var.C2);
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
                        h26 h26Var2 = this.b;
                        if (i >= min) {
                            gl.c3(new tn6((Object) h26Var2, (Object) arrayList, min, (Object) tL_messages_inactiveChats, (byte) 29));
                            break;
                        } else {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                            int currentTime = (ConnectionsManager.getInstance(h26Var2.a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                            String G = currentTime < 30 ? k96.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? k96.G(currentTime / 30, "Months", new Object[0]) : k96.G(currentTime / 365, "Years", new Object[0]);
                            if (hc2.n0(chat)) {
                                arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (hc2.T(chat)) {
                                arrayList.add(k96.a0("InactiveChannelSignature", null, 2131749020, G));
                            } else {
                                arrayList.add(k96.a0("InactiveChatSignature", null, 2131749019, k96.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i++;
                        }
                    }
                }
                break;
        }
    }
}
