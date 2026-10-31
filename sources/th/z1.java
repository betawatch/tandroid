package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z1 extends op0 {
    public final /* synthetic */ z2 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(z2 z2Var, Context context, String str, String str2, boolean z10, org.telegram.ui.web.a0 a0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, a0Var);
        this.R2 = z2Var;
    }

    @Override // org.telegram.ui.Components.op0, org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        this.R2.I2 = null;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            z2 z2Var = this.R2;
            cc ccVar = new cc(z2Var.L0, this.I0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == d20.i(this.a).n) {
                    wb G = ccVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744489, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    wb G2 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744502, tL_forumTopic != null ? tL_forumTopic.title : vp.r1(this.a).L0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    wb G3 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744502, vp.r1(this.a).Z1(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                wb Q = ccVar.Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(cd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                z2Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.op0
    public final void S0(View view) {
        this.R2.c1();
    }
}
