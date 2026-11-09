package zh;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m1 extends no0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 R2;
    public final /* synthetic */ vp0 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(vp0 vp0Var, Context context, String str, String str2, g6 g6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.S2 = vp0Var;
        this.R2 = f2Var;
    }

    @Override // org.telegram.ui.Components.no0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        hc a02;
        if (z9 && (a02 = hc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.a).n) {
                    cc G = a02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749802, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    cc G2 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, tL_forumTopic != null ? tL_forumTopic.title : qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    cc G3 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                cc Q = a02.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                this.S2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
