package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.aj0;
import org.telegram.ui.dy;
import org.telegram.ui.we1;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements aj0, wx {
    public final /* synthetic */ y0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;

    public /* synthetic */ x(y0 y0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = y0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.aj0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i9 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        y0 y0Var = this.a;
        MessagesController.getInstance(y0Var.I);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(y0Var.Q);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(y0Var.I).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(y0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(y0Var, str, 2));
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            y0 y0Var = this.a;
            MessagesController.getInstance(y0Var.I);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(y0Var.Q);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(y0Var.I).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(y0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(y0Var, str, 1));
        }
        dyVar.finishFragment();
        return true;
    }
}
