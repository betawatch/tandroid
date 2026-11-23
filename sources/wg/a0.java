package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a0 extends xg.e {
    public final /* synthetic */ b0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, i6 i6Var) {
        super(i6Var);
        this.r = b0Var;
    }

    @Override // xg.e
    public final void E() {
        b0 b0Var = this.r;
        String str = b0Var.W1;
        new kc(b0Var.c, b0Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && b0Var.T1.to_id == -1) ? gd.N0(2131753331, null) : gd.N0(2131753330, null)).k(true);
    }

    @Override // xg.e
    public final void F(TLObject tLObject) {
        b0 b0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = b0Var.T1;
        g2 g2Var = b0Var.s1;
        b0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            g2Var.presentFragment(bn.ua(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            g2Var.presentFragment(bn.ua(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -n5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        g2Var.presentFragment(new bn(bundle));
    }
}
