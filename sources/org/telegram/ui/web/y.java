package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cj0;
import org.telegram.ui.gy;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements cj0, zx {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;

    public /* synthetic */ y(z0 z0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = z0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(gy gyVar) {
        return false;
    }

    @Override // org.telegram.ui.cj0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        z0 z0Var = this.a;
        MessagesController.getInstance(z0Var.I);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(z0Var.I).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new w(z0Var, str, 2));
    }

    @Override // org.telegram.ui.zx
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.a;
            MessagesController.getInstance(z0Var.I);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(z0Var.I).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new w(z0Var, str, 1));
        }
        gyVar.finishFragment();
        return true;
    }
}
