// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sv4 extends rv4 {
    public final /* synthetic */ tv4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv4(tv4 tv4Var, vnb vnbVar) {
        super(vnbVar);
        this.r = tv4Var;
    }

    @Override // rv4
    public final void E() {
        tv4 tv4Var = this.r;
        String str = tv4Var.V1;
        new d31(tv4Var.c, tv4Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && tv4Var.S1.to_id == -1) ? ob6.M0(2131753327, null) : ob6.M0(2131753326, null)).k(true);
    }

    @Override // rv4
    public final void F(TLObject tLObject) {
        tv4 tv4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = tv4Var.S1;
        e eVar = tv4Var.r1;
        tv4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            eVar.presentFragment(zu1.ha(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            eVar.presentFragment(zu1.ha(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -wf3.n(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        eVar.presentFragment(new zu1(bundle));
    }
}
