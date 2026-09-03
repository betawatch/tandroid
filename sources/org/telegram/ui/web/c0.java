package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import nh.j7;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ij0;
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements ij0, ky {
    public final /* synthetic */ c1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ j7 e;

    public /* synthetic */ c0(c1 c1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, j7 j7Var) {
        this.a = c1Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = j7Var;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.ij0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        c1 c1Var = this.a;
        MessagesController.getInstance(c1Var.J);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.R);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.J).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(c1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(c1Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.ky
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.a;
            MessagesController.getInstance(c1Var.J);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.R);
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.J).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(c1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(c1Var, this.e, str, 1));
        }
        qyVar.finishFragment();
        return true;
    }
}
