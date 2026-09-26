package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ je a;

    public /* synthetic */ wd(je jeVar) {
        this.a = jeVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a.w0.presentFragment(new zg1(6, null));
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
        je jeVar = this.a;
        nd ndVar = jeVar.v1;
        int i10 = jeVar.y0;
        long j3 = jeVar.z0;
        int i11 = ((org.telegram.ui.Components.v51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                jeVar.w0.presentFragment(new ei.e4(j3));
            }
        } else {
            if (jeVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                jeVar.m1 = !jeVar.m1;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                AndroidUtilities.runOnUIThread(ndVar, 1000L);
                jeVar.a1.Y2.N(true);
                return;
            }
            if (jeVar.A0 == null) {
                return;
            }
            rg.j0 j0Var = new rg.j0(30, jeVar.y0, jeVar.getContext(), jeVar.w0, jeVar.x0);
            j0Var.H1(j3);
            j0Var.F1(jeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, jeVar.A0, new oc(1, jeVar, j0Var));
        }
    }
}
