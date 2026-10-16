package ug;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b0 extends vg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, c6 c6Var) {
        super(c6Var);
        this.r = c0Var;
    }

    @Override // vg.e
    public final void E() {
        c6 c6Var;
        c0 c0Var = this.r;
        String str = c0Var.a0;
        String string = ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        c3 c3Var = c0Var.container;
        c6Var = ((e3) c0Var).resourcesProvider;
        new zc(c3Var, c6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // vg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        m2 m2Var = c0Var.n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            m2Var.presentFragment(fo.W9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            m2Var.presentFragment(fo.W9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        m2Var.presentFragment(new fo(bundle));
    }
}
