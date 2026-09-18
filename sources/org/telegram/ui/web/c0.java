package org.telegram.ui.web;

import ai.da;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.fg1;
import org.telegram.ui.qy;
import org.telegram.ui.sj0;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements sj0, qy {
    public final /* synthetic */ d1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ da e;

    public /* synthetic */ c0(d1 d1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, da daVar) {
        this.a = d1Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = daVar;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean K(wy wyVar) {
        return false;
    }

    @Override // org.telegram.ui.sj0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        d1 d1Var = this.a;
        MessagesController.getInstance(d1Var.M);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(d1Var.U);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(d1Var.M).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(d1Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.qy
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            d1 d1Var = this.a;
            MessagesController.getInstance(d1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(d1Var.U);
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(d1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new v(d1Var, this.e, str, 1));
        }
        wyVar.finishFragment();
        return true;
    }
}
