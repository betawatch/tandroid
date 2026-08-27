package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ fe a;

    public /* synthetic */ ud(fe feVar) {
        this.a = feVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.s0.presentFragment(new zf1(6, null));
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
        fe feVar = this.a;
        kd kdVar = feVar.r1;
        int i10 = feVar.u0;
        long j10 = feVar.v0;
        int i11 = ((org.telegram.ui.Components.n41) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                feVar.s0.presentFragment(new nh.s3(j10));
            }
        } else {
            if (feVar.x0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                feVar.i1 = !feVar.i1;
                AndroidUtilities.cancelRunOnUIThread(kdVar);
                AndroidUtilities.runOnUIThread(kdVar, 1000L);
                feVar.W0.U2.N(true);
                return;
            }
            if (feVar.w0 == null) {
                return;
            }
            ag.i1 i1Var = new ag.i1(30, feVar.u0, feVar.getContext(), feVar.s0, feVar.t0);
            i1Var.H1(j10);
            i1Var.F1(feVar.w0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, feVar.w0, new jh.y1(3, feVar, i1Var));
        }
    }
}
