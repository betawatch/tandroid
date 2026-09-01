package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j7 extends sl0 {
    public final /* synthetic */ k7 c;

    public j7(k7 k7Var) {
        this.c = k7Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 2;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        k7 k7Var = this.c;
        int i11 = k7Var.b;
        if (m1Var.f == 2) {
            c8 c8Var = (c8) m1Var.a;
            c8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) k7Var.c.get(i10 - 2);
            boolean z10 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z10) {
                c8Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                c8Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                c8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                c8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            c8Var.f.setVisibility(8);
            c8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = k7Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(k7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z10 ? UserConfig.getInstance(k7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z4 = false;
                    c8Var.c(z4, false);
                    c8Var.setDivider(i10 != h() - 1);
                }
            }
            z4 = true;
            c8Var.c(z4, false);
            c8Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        k7 k7Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(k7Var.getContext());
            view2.setLayoutParams(new f2.x0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = k7Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) k7Var).resourcesProvider;
            view = new c8(context, g6Var);
        }
        return new fl0(view);
    }
}
