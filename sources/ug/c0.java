package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c0 extends vg.e {
    public final /* synthetic */ d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, f6 f6Var) {
        super(f6Var);
        this.r = d0Var;
    }

    @Override // vg.e
    public final void E() {
        f6 f6Var;
        d0 d0Var = this.r;
        String str = d0Var.a0;
        String string = ((str == null || str.isEmpty()) && d0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        d3 d3Var = d0Var.container;
        f6Var = ((f3) d0Var).resourcesProvider;
        new yc(d3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // vg.e
    public final void F(TLObject tLObject) {
        d0 d0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = d0Var.X;
        n2 n2Var = d0Var.n;
        d0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(co.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(co.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        n2Var.presentFragment(new co(bundle));
    }
}
