// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class paa extends wk3 {
    public final /* synthetic */ qaa n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paa(qaa qaaVar, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context, true, true);
        this.n = qaaVar;
    }

    @Override // wk3, w39
    public final void t(s49 s49Var, int i) {
        TLRPC.Chat chat;
        ee5 ee5Var = (ee5) s49Var.a;
        taa taaVar = this.n.L;
        TLRPC.User user = null;
        if (taaVar.c2 || taaVar.d2) {
            int i2 = bkb.dh;
            int i3 = bkb.Vg;
            zkb.X(ee5Var.b, i2, null);
            ee5Var.I = i3;
            ee5Var.w.b(bkb.A5, i3, bkb.B5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hq6.d0(taaVar.a).j1.get(i);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        if (j != 0) {
            user = na7.q1(taaVar.a).V1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = na7.q1(taaVar.a).K0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = na7.q1(taaVar.a).K0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j = 0;
                }
            }
        }
        boolean z = j == ee5Var.getDialogId();
        ee5Var.setTag(Long.valueOf(j));
        ee5Var.a(j, true, user != null ? l7c.k(user, true) : chat != null ? chat.title : "");
        boolean z2 = taaVar.P1.h(j) >= 0;
        if (ee5Var.x) {
            ee5Var.w.a(z2, z);
        }
    }
}
