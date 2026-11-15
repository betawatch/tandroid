package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z extends xg.f {
    public final /* synthetic */ a0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, e6 e6Var) {
        super(e6Var);
        this.r = a0Var;
    }

    @Override // xg.f
    public final void E() {
        a0 a0Var = this.r;
        String str = a0Var.W1;
        new cc(a0Var.c, a0Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && a0Var.T1.to_id == -1) ? hd.M0(2131753334, null) : hd.M0(2131753333, null)).k(true);
    }

    @Override // xg.f
    public final void F(TLObject tLObject) {
        a0 a0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = a0Var.T1;
        e2 e2Var = a0Var.s1;
        a0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            e2Var.presentFragment(an.ua(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            e2Var.presentFragment(an.ua(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        e2Var.presentFragment(new an(bundle));
    }
}
