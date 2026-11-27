// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ot8 extends kea {
    public final /* synthetic */ e U2;
    public final /* synthetic */ cga V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot8(cga cgaVar, Context context, String str, String str2, vnb vnbVar, e eVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.V2 = cgaVar;
        this.U2 = eVar;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        d31 b0;
        if (!z || (b0 = d31.b0(this.U2)) == null) {
            return;
        }
        if (zh6Var.m() == 1) {
            long j = zh6Var.j(0);
            if (j == yac.h(this.a).n) {
                v21 G = b0.G(R.raw.saved_messages, 5000, hl.S2(ob6.a0(null, null, 2131749748, new Object[0])));
                G.s = false;
                G.j();
            } else {
                int i2 = this.a;
                if (j < 0) {
                    v21 G2 = b0.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131749752, tL_forumTopic != null ? tL_forumTopic.title : uc7.s1(i2).M0(Long.valueOf(-j)).title)));
                    G2.s = false;
                    G2.j();
                } else {
                    v21 G3 = b0.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131749752, uc7.s1(i2).X1(Long.valueOf(j)).first_name)));
                    G3.s = false;
                    G3.j();
                }
            }
        } else {
            v21 Q = b0.Q(R.raw.forward, 36, hl.S2(ob6.G(zh6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(zh6Var.m()))));
            Q.s = false;
            Q.j();
        }
        try {
            this.V2.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }
}
