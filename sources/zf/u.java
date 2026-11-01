package zf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.at;
import org.telegram.messenger.i20;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class u extends tk0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final p6 h;

    public u(int i10, Context context, p6 p6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i10;
        this.f = z11;
        this.h = p6Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return vi.b0(this.d).i1.size();
    }

    @Override // s4.g0
    public void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        q4 q4Var = (q4) c1Var.a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) vi.b0(i11).i1.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = wp.r1(i11).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = wp.r1(i11).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = wp.r1(i11).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        q4Var.setTag(Long.valueOf(j10));
        q4Var.a(j10, true, user != null ? i20.j(user, true) : chat != null ? chat.monoforum ? gg.e.i(i11, chat, false) : chat.title : "");
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        q4 q4Var = new q4(this.c, this.h, z10);
        if (this.f && !q4Var.y) {
            q4Var.y = true;
            at.f(q4Var.h).h(q4Var, at.i3, new l2(q4Var, 1));
        }
        q4Var.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(86.0f)));
        return new dk0(q4Var);
    }
}
