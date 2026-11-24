// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qv4 extends pv4 {
    public final /* synthetic */ rv4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv4(rv4 rv4Var, ylb ylbVar) {
        super(ylbVar);
        this.r = rv4Var;
    }

    @Override // pv4
    public final void E() {
        rv4 rv4Var = this.r;
        String str = rv4Var.V1;
        new c41(rv4Var.c, rv4Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && rv4Var.S1.to_id == -1) ? jb6.M0(2131753299, null) : jb6.M0(2131753298, null)).k(true);
    }

    @Override // pv4
    public final void F(TLObject tLObject) {
        rv4 rv4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = rv4Var.S1;
        d dVar = rv4Var.r1;
        rv4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            dVar.presentFragment(yv1.ga(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            dVar.presentFragment(yv1.ga(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -pg3.n(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        dVar.presentFragment(new yv1(bundle));
    }
}
