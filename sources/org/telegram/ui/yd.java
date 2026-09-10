package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ le a;

    public /* synthetic */ yd(le leVar) {
        this.a = leVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.w0.presentFragment(new mh1(6, null));
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
        le leVar = this.a;
        pd pdVar = leVar.v1;
        int i10 = leVar.y0;
        long j3 = leVar.z0;
        int i11 = ((org.telegram.ui.Components.v51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                leVar.w0.presentFragment(new di.h4(j3));
            }
        } else {
            if (leVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                leVar.m1 = !leVar.m1;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 1000L);
                leVar.a1.Y2.N(true);
                return;
            }
            if (leVar.A0 == null) {
                return;
            }
            qg.k0 k0Var = new qg.k0(30, leVar.y0, leVar.getContext(), leVar.w0, leVar.x0);
            k0Var.H1(j3);
            k0Var.F1(leVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, leVar.A0, new m4.q0(4, leVar, k0Var));
        }
    }
}
