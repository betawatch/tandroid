package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b0 extends xg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, h6 h6Var) {
        super(h6Var);
        this.r = c0Var;
    }

    @Override // xg.e
    public final void E() {
        c0 c0Var = this.r;
        String str = c0Var.W1;
        new lc(c0Var.c, c0Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && c0Var.T1.to_id == -1) ? hd.N0(2131753331, null) : hd.N0(2131753330, null)).k(true);
    }

    @Override // xg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.T1;
        g2 g2Var = c0Var.s1;
        c0Var.dismiss();
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
