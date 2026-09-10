package sg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b0 extends tg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, f6 f6Var) {
        super(f6Var);
        this.r = c0Var;
    }

    @Override // tg.e
    public final void E() {
        f6 f6Var;
        c0 c0Var = this.r;
        String str = c0Var.a0;
        String string = ((str == null || str.isEmpty()) && c0Var.X.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        f3 f3Var = c0Var.container;
        f6Var = ((h3) c0Var).resourcesProvider;
        new wc(f3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // tg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.X;
        p2 p2Var = c0Var.n;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(eo.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(eo.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        p2Var.presentFragment(new eo(bundle));
    }
}
