// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ot4 extends nt4 {
    public final /* synthetic */ pt4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot4(pt4 pt4Var, wjb wjbVar) {
        super(wjbVar);
        this.r = pt4Var;
    }

    @Override // nt4
    public final void E() {
        pt4 pt4Var = this.r;
        String str = pt4Var.V1;
        new u21(pt4Var.c, pt4Var.J0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && pt4Var.S1.to_id == -1) ? k96.M0(2131753331, null) : k96.M0(2131753330, null)).k(true);
    }

    @Override // nt4
    public final void F(TLObject tLObject) {
        pt4 pt4Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = pt4Var.S1;
        d dVar = pt4Var.r1;
        pt4Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            dVar.presentFragment(mu1.U9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            dVar.presentFragment(mu1.U9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -cf3.n(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        dVar.presentFragment(new mu1(bundle));
    }
}
