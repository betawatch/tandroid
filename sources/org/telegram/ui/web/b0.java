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
import org.telegram.ui.kj0;
import org.telegram.ui.ly;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements kj0, ly {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ da e;

    public /* synthetic */ b0(b1 b1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, da daVar) {
        this.a = b1Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = daVar;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean K(ry ryVar) {
        return false;
    }

    @Override // org.telegram.ui.kj0
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
        ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new u(b1Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.ly
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
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
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new u(b1Var, this.e, str, 1));
        }
        ryVar.finishFragment();
        return true;
    }
}
