package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b0 extends xg.f {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, f6 f6Var) {
        super(f6Var);
        this.r = c0Var;
    }

    @Override // xg.f
    public final void E() {
        c0 c0Var = this.r;
        String str = c0Var.S1;
        new hc(c0Var.c, c0Var.I0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && c0Var.P1.to_id == -1) ? hd.M0(2131753334, null) : hd.M0(2131753333, null)).k(true);
    }

    @Override // xg.f
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.P1;
        f2 f2Var = c0Var.o1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            f2Var.presentFragment(an.ra(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            f2Var.presentFragment(an.ra(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        f2Var.presentFragment(new an(bundle));
    }
}
