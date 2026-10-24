package org.telegram.ui.web;

import ci.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ej0;
import org.telegram.ui.ey;
import org.telegram.ui.xx;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements ej0, xx {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ y7 e;

    public /* synthetic */ c0(b1 b1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, y7 y7Var) {
        this.a = b1Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = y7Var;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.ej0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        b1 b1Var = this.a;
        MessagesController.getInstance(b1Var.M);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(b1Var.M).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(b1Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            b1 b1Var = this.a;
            MessagesController.getInstance(b1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(b1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(b1Var, this.e, str, 1));
        }
        eyVar.finishFragment();
        return true;
    }
}
