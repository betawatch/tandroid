package ph;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l7 extends rl0 {
    public final /* synthetic */ m7 c;

    public l7(m7 m7Var) {
        this.c = m7Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 2;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        m7 m7Var = this.c;
        int i11 = m7Var.b;
        if (l1Var.f == 2) {
            e8 e8Var = (e8) l1Var.a;
            e8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) m7Var.c.get(i10 - 2);
            boolean z10 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z10) {
                e8Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                e8Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                e8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                e8Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            e8Var.f.setVisibility(8);
            e8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = m7Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(m7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z10 ? UserConfig.getInstance(m7Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z4 = false;
                    e8Var.c(z4, false);
                    e8Var.setDivider(i10 != h() - 1);
                }
            }
            z4 = true;
            e8Var.c(z4, false);
            e8Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        m7 m7Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(m7Var.getContext());
            view2.setLayoutParams(new f2.w0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = m7Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) m7Var).resourcesProvider;
            view = new e8(context, f6Var);
        }
        return new el0(view);
    }
}
