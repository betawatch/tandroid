package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z extends vg.e {
    public final /* synthetic */ a0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, g6 g6Var) {
        super(g6Var);
        this.r = a0Var;
    }

    @Override // vg.e
    public final void E() {
        g6 g6Var;
        a0 a0Var = this.r;
        String str = a0Var.a0;
        String string = ((str == null || str.isEmpty()) && a0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        e3 e3Var = a0Var.container;
        g6Var = ((h3) a0Var).resourcesProvider;
        new xc(e3Var, g6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // vg.e
    public final void F(TLObject tLObject) {
        a0 a0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = a0Var.X;
        o2 o2Var = a0Var.n;
        a0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(sn.W9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(sn.W9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        o2Var.presentFragment(new sn(bundle));
    }
}
