package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k0 extends h51 {
    static {
        h51.setup(new k0());
    }

    public static i51 a(MessagesController.CommunityPeerDialog communityPeerDialog, i0 i0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            i51 J = i51.J(k0.class);
            long j10 = user.id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = i0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        i51 J2 = i51.J(k0.class);
        long j11 = chat != null ? -chat.id : 0L;
        J2.B = j11;
        J2.d = (int) (j11 ^ (j11 >>> 32));
        J2.G = chat;
        J2.H = i0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        q2 q2Var = (q2) view;
        q2Var.setDialogCellDelegate((m2) i51Var.H);
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            q2Var.N0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            q2Var.M0 = dialog == null;
            if (dialog != null) {
                q2Var.setCustomMessageWithoutRebuild(null);
                q2Var.X(dialog, 0, 0);
                return;
            } else {
                q2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                q2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            q2Var.N0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            q2Var.M0 = dialog2 == null;
            if (dialog2 != null) {
                q2Var.setCustomMessageWithoutRebuild(null);
                q2Var.X(dialog2, 0, 0);
            } else {
                q2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                q2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        q2 q2Var = new q2(null, context, false, i10, f6Var);
        q2Var.L0 = true;
        return q2Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }
}
