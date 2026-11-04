package org.telegram.ui.web;

import ei.p7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.pr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.jg0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements jg0, nw {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ p7 e;

    public /* synthetic */ z(w0 w0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, p7 p7Var) {
        this.a = w0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = p7Var;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.jg0
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i3 = 0;
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        w0 w0Var = this.a;
        hp.s1(w0Var.N);
        tL_messages_sendBotRequestedPeer.peer = hp.n1(w0Var.V);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(hp.s1(w0Var.N).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(w0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new c3.b(1), new t(w0Var, this.e, str, 2));
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            w0 w0Var = this.a;
            hp.s1(w0Var.N);
            tL_messages_sendBotRequestedPeer.peer = hp.n1(w0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((pr) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(hp.s1(w0Var.N).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(w0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new c3.b(1), new t(w0Var, this.e, str, 1));
        }
        uwVar.finishFragment();
        return true;
    }
}
