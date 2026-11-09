package wg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b0 extends xg.f {
    public final /* synthetic */ c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, g6 g6Var) {
        super(g6Var);
        this.r = c0Var;
    }

    @Override // xg.f
    public final void E() {
        c0 c0Var = this.r;
        String str = c0Var.S1;
        new hc(c0Var.c, c0Var.I0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && c0Var.P1.to_id == -1) ? id.M0(2131753334, null) : id.M0(2131753333, null)).k(true);
    }

    @Override // xg.f
    public final void F(TLObject tLObject) {
        c0 c0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = c0Var.P1;
        f2 f2Var = c0Var.o1;
        c0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            f2Var.presentFragment(cn.ta(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            f2Var.presentFragment(cn.ta(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -m5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        f2Var.presentFragment(new cn(bundle));
    }
}
