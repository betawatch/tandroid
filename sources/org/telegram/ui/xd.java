package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ ie a;

    public /* synthetic */ xd(ie ieVar) {
        this.a = ieVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.w0.presentFragment(new vf1(6, null));
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
        ie ieVar = this.a;
        od odVar = ieVar.v1;
        int i10 = ieVar.y0;
        long j10 = ieVar.z0;
        int i11 = ((org.telegram.ui.Components.h61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                ieVar.w0.presentFragment(new gi.u3(j10));
            }
        } else {
            if (ieVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                ieVar.m1 = !ieVar.m1;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                AndroidUtilities.runOnUIThread(odVar, 1000L);
                ieVar.a1.W2.N(true);
                return;
            }
            if (ieVar.A0 == null) {
                return;
            }
            sg.k0 k0Var = new sg.k0(30, ieVar.y0, ieVar.getContext(), ieVar.w0, ieVar.x0);
            k0Var.I1(j10);
            k0Var.G1(ieVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, ieVar.A0, new org.telegram.ui.ActionBar.j3(7, ieVar, k0Var));
        }
    }
}
