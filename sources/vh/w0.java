package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new w0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        MessageObject messageObject;
        t tVar;
        x0 x0Var = (x0) view;
        a aVar = (a) i51Var.G;
        n3 n3Var = (n3) i51Var.H;
        x0Var.a = aVar;
        x0Var.P = n3Var;
        x0Var.J = LocaleController.isRTL;
        x0Var.c(aVar);
        x0Var.C.b();
        TLRPC.Document i10 = x0Var.i();
        if (x0Var.R != i10) {
            x0Var.R = i10;
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
                int i11 = x0Var.n;
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
                a aVar2 = x0Var.a;
                if (aVar2 != null && (tVar = aVar2.g) != null && !TextUtils.isEmpty(tVar.e)) {
                    tL_message.attachPath = x0Var.a.g.e;
                }
                messageObject = new MessageObject(i11, tL_message, false, true);
            }
            x0Var.Q = messageObject;
        }
        x0Var.h(i10);
        x0Var.k();
        if (x0Var.K) {
            x0Var.l(false);
        }
        x0Var.requestLayout();
        x0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        x0 x0Var = new x0(context, i10, f6Var);
        x0Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return x0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
