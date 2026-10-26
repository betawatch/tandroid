package vg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b0 extends wg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, u6 u6Var) {
        super(u6Var);
        this.r = c0Var;
    }

    @Override // wg.e
    public final void E() {
        u6 u6Var;
        c0 c0Var = this.r;
        String str = c0Var.a0;
        String string = ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        h3 h3Var = c0Var.container;
        u6Var = ((k3) c0Var).resourcesProvider;
        new wc(h3Var, u6Var).R(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // wg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        r2 r2Var = c0Var.n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            r2Var.presentFragment(un.ba(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            r2Var.presentFragment(un.ba(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        r2Var.presentFragment(new un(bundle));
    }
}
