package ph;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s1 extends pp0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 R2;
    public final /* synthetic */ wq0 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(wq0 wq0Var, Context context, String str, String str2, p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.S2 = wq0Var;
        this.R2 = k2Var;
    }

    @Override // org.telegram.ui.Components.pp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cc a02;
        if (z10 && (a02 = cc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == e20.i(this.a).n) {
                    wb G = a02.G(R.raw.saved_messages, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749811, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    wb G2 = a02.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749815, tL_forumTopic != null ? tL_forumTopic.title : wp.r1(this.a).L0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    wb G3 = a02.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749815, wp.r1(this.a).Z1(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                wb Q = a02.Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(dd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
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
