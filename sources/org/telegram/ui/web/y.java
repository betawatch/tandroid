package org.telegram.ui.web;

import di.o7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pg0;
import org.telegram.ui.qw;
import org.telegram.ui.v91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements pg0, qw {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ o7 e;

    public /* synthetic */ y(x0 x0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, o7 o7Var) {
        this.a = x0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = o7Var;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.ui.pg0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        x0 x0Var = this.a;
        qp.s1(x0Var.M);
        tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            x0 x0Var = this.a;
            qp.s1(x0Var.M);
            tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((xr) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.e, str, 1));
        }
        wwVar.finishFragment();
        return true;
    }
}
