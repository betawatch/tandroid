package rh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class v0 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new v0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        MessageObject messageObject;
        s sVar;
        w0 w0Var = (w0) view;
        a aVar = (a) n41Var.G;
        k3 k3Var = (k3) n41Var.H;
        w0Var.a = aVar;
        w0Var.O = k3Var;
        w0Var.I = LocaleController.isRTL;
        w0Var.c(aVar);
        w0Var.B.b();
        TLRPC.Document i10 = w0Var.i();
        if (w0Var.Q != i10) {
            w0Var.Q = i10;
            if (i10 == null) {
                messageObject = null;
            } else {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = -Long.valueOf(i10.id).hashCode();
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                int i11 = w0Var.n;
                long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = i10;
                tL_message.flags |= 768;
                a aVar2 = w0Var.a;
                if (aVar2 != null && (sVar = aVar2.g) != null && !TextUtils.isEmpty(sVar.e)) {
                    tL_message.attachPath = w0Var.a.g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            w0Var.P = messageObject;
        }
        w0Var.h(i10);
        w0Var.k();
        if (w0Var.J) {
            w0Var.l(false);
        }
        w0Var.requestLayout();
        w0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        w0 w0Var = new w0(context, i10, c6Var);
        w0Var.setBackground(new u1(g6.v0(g6.d6, c6Var)));
        return w0Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
