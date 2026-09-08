package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ ke a;

    public /* synthetic */ xd(ke keVar) {
        this.a = keVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.w0.presentFragment(new hh1(6, null));
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
        ke keVar = this.a;
        od odVar = keVar.v1;
        int i10 = keVar.y0;
        long j3 = keVar.z0;
        int i11 = ((org.telegram.ui.Components.h51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.w0.presentFragment(new fi.e4(j3));
            }
        } else {
            if (keVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                keVar.m1 = !keVar.m1;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                AndroidUtilities.runOnUIThread(odVar, 1000L);
                keVar.a1.Y2.N(true);
                return;
            }
            if (keVar.A0 == null) {
                return;
            }
            sg.k0 k0Var = new sg.k0(30, keVar.y0, keVar.getContext(), keVar.w0, keVar.x0);
            k0Var.H1(j3);
            k0Var.F1(keVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, keVar.A0, new bi.t2(5, keVar, k0Var));
        }
    }
}
