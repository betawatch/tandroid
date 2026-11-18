package org.telegram.ui.web;

import fi.f7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cx;
import org.telegram.ui.tg0;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements tg0, ww {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ f7 e;

    public /* synthetic */ y(v0 v0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, f7 f7Var) {
        this.a = v0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = f7Var;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.tg0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        v0 v0Var = this.a;
        mp.u1(v0Var.N);
        tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.a;
            mp.u1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((sr) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.e, str, 1));
        }
        cxVar.finishFragment();
        return true;
    }
}
