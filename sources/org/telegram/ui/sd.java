package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ de a;

    public /* synthetic */ sd(de deVar) {
        this.a = deVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a.s0.presentFragment(new cg1(6, null));
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        de deVar = this.a;
        jd jdVar = deVar.r1;
        int i10 = deVar.u0;
        long j10 = deVar.v0;
        int i11 = ((org.telegram.ui.Components.w41) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                deVar.s0.presentFragment(new ph.d3(j10));
            }
        } else {
            if (deVar.x0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                deVar.i1 = !deVar.i1;
                AndroidUtilities.cancelRunOnUIThread(jdVar);
                AndroidUtilities.runOnUIThread(jdVar, 1000L);
                deVar.W0.U2.N(true);
                return;
            }
            if (deVar.w0 == null) {
                return;
            }
            cg.v0 v0Var = new cg.v0(30, deVar.u0, deVar.getContext(), deVar.s0, deVar.t0);
            v0Var.H1(j10);
            v0Var.F1(deVar.w0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, deVar.w0, new lh.y1(3, deVar, v0Var));
        }
    }
}
