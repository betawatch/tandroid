// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class wk3 extends n39 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final wjb h;

    public wk3(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        this.e = z;
        this.c = context;
        this.d = i;
        this.f = z2;
        this.h = wjbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return hq6.d0(this.d).j1.size();
    }

    @Override // w39
    public void t(s49 s49Var, int i) {
        TLRPC.Chat chat;
        ee5 ee5Var = (ee5) s49Var.a;
        int i2 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hq6.d0(i2).j1.get(i);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        TLRPC.User user = null;
        if (j != 0) {
            user = na7.q1(i2).V1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = na7.q1(i2).K0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = na7.q1(i2).K0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j = 0;
                    chat = null;
                }
            }
        }
        ee5Var.setTag(Long.valueOf(j));
        ee5Var.a(j, true, user != null ? l7c.k(user, true) : chat != null ? chat.monoforum ? mm4.j(i2, chat, false) : chat.title : "");
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        ee5 ee5Var = new ee5(this.h, this.c, this.e);
        if (this.f && !ee5Var.y) {
            ee5Var.y = true;
            kk7.f(ee5Var.h).h(ee5Var, kk7.j3, new hj3(ee5Var, (byte) 17));
        }
        ee5Var.setLayoutParams(new e49(gl.L(80.0f), gl.L(86.0f)));
        return new y29(ee5Var);
    }
}
