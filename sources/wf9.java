// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class wf9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new wf9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        r47 r47Var;
        p07 p07Var;
        xf9 xf9Var = (xf9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        ki9 ki9Var = (ki9) b8cVar.I;
        xf9Var.a = mk0Var;
        xf9Var.T = ki9Var;
        xf9Var.N = ob6.a0;
        xf9Var.c(mk0Var);
        xf9Var.G.b();
        TLRPC.Document h = xf9Var.h();
        if (xf9Var.V != h) {
            xf9Var.V = h;
            if (h == null) {
                r47Var = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(h.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i = xf9Var.n;
                long e = yac.h(i).e();
                peer.user_id = e;
                tL_peerUser.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = h;
                tL_message.flags |= 768;
                mk0 mk0Var2 = xf9Var.a;
                if (mk0Var2 != null && (p07Var = mk0Var2.g) != null && !TextUtils.isEmpty(p07Var.e)) {
                    tL_message.attachPath = xf9Var.a.g.e;
                }
                r47Var = new r47(i, tL_message, false, true);
            }
            xf9Var.U = r47Var;
        }
        xf9Var.g(h);
        xf9Var.m();
        if (xf9Var.O) {
            xf9Var.n(false);
        }
        xf9Var.requestLayout();
        xf9Var.invalidate();
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        xf9 xf9Var = new xf9(i, vnbVar, context);
        xf9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        xf9Var.a0 = true;
        return xf9Var;
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
