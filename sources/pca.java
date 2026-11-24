// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pca extends hm3 {
    public final /* synthetic */ qca n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pca(qca qcaVar, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context, true, true);
        this.n = qcaVar;
    }

    @Override // hm3, y59
    public final void t(u69 u69Var, int i) {
        TLRPC.Chat chat;
        cg5 cg5Var = (cg5) u69Var.a;
        tca tcaVar = this.n.L;
        TLRPC.User user = null;
        if (tcaVar.c2 || tcaVar.d2) {
            int i2 = cmb.dh;
            int i3 = cmb.Vg;
            anb.X(cg5Var.b, i2, null);
            cg5Var.I = i3;
            cg5Var.w.b(cmb.A5, i3, cmb.B5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hs6.d0(tcaVar.a).j1.get(i);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        if (j != 0) {
            user = oc7.r1(tcaVar.a).W1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = oc7.r1(tcaVar.a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = oc7.r1(tcaVar.a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j = 0;
                }
            }
        }
        boolean z = j == cg5Var.getDialogId();
        cg5Var.setTag(Long.valueOf(j));
        cg5Var.a(j, true, user != null ? m9c.k(user, true) : chat != null ? chat.title : "");
        boolean z2 = tcaVar.P1.h(j) >= 0;
        if (cg5Var.x) {
            cg5Var.w.a(z2, z);
        }
    }
}
