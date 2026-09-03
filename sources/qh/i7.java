package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i7 extends rl0 {
    public final /* synthetic */ j7 c;

    public i7(j7 j7Var) {
        this.c = j7Var;
    }

    @Override // org.telegram.ui.Components.rl0
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
        j7 j7Var = this.c;
        int i11 = j7Var.b;
        if (m1Var.f == 2) {
            b8 b8Var = (b8) m1Var.a;
            b8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) j7Var.c.get(i10 - 2);
            boolean z10 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z10) {
                b8Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                b8Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                b8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                b8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            b8Var.f.setVisibility(8);
            b8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = j7Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(j7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z10 ? UserConfig.getInstance(j7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z4 = false;
                    b8Var.c(z4, false);
                    b8Var.setDivider(i10 != h() - 1);
                }
            }
            z4 = true;
            b8Var.c(z4, false);
            b8Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        j7 j7Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(j7Var.getContext());
            view2.setLayoutParams(new f2.x0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = j7Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) j7Var).resourcesProvider;
            view = new b8(context, g6Var);
        }
        return new el0(view);
    }
}
