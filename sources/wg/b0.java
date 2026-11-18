package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b0 extends xg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, i6 i6Var) {
        super(i6Var);
        this.r = c0Var;
    }

    @Override // xg.e
    public final void E() {
        c0 c0Var = this.r;
        String str = c0Var.W1;
        new lc(c0Var.c, c0Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && c0Var.T1.to_id == -1) ? gd.M0(2131753332, null) : gd.M0(2131753331, null)).k(true);
    }

    @Override // xg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.T1;
        h2 h2Var = c0Var.s1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            h2Var.presentFragment(bn.ua(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            h2Var.presentFragment(bn.ua(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -n5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        h2Var.presentFragment(new bn(bundle));
    }
}
