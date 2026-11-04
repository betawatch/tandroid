package xg;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 extends yg.e {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, e6 e6Var) {
        super(e6Var);
        this.r = c0Var;
    }

    @Override // yg.e
    public final void E() {
        c0 c0Var = this.r;
        String str = c0Var.T1;
        new fc(c0Var.c, c0Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && c0Var.Q1.to_id == -1) ? bd.M0(2131753334, null) : bd.M0(2131753333, null)).k(true);
    }

    @Override // yg.e
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.Q1;
        d2 d2Var = c0Var.p1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            d2Var.presentFragment(wm.ra(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            d2Var.presentFragment(wm.ra(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        d2Var.presentFragment(new wm(bundle));
    }
}
