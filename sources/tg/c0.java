package tg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c0 extends ug.e {
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, f6 f6Var) {
        super(f6Var);
        this.r = d0Var;
    }

    @Override // ug.e
    public final void E() {
        f6 f6Var;
        d0 d0Var = this.r;
        String str = d0Var.a0;
        String string = ((str == null || str.isEmpty()) && d0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        e3 e3Var = d0Var.container;
        f6Var = ((g3) d0Var).resourcesProvider;
        new vc(e3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // ug.e
    public final void F(TLObject tLObject) {
        d0 d0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = d0Var.X;
        o2 o2Var = d0Var.n;
        d0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(bo.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(bo.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        o2Var.presentFragment(new bo(bundle));
    }
}
