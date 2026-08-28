package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ fe a;

    public /* synthetic */ ud(fe feVar) {
        this.a = feVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.a.s0.presentFragment(new ag1(6, null));
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
        int i9 = feVar.u0;
        long j10 = feVar.v0;
        int i10 = ((org.telegram.ui.Components.l41) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                feVar.s0.presentFragment(new mh.u3(j10));
            }
        } else {
            if (feVar.x0 >= MessagesController.getInstance(i9).channelRestrictSponsoredLevelMin) {
                feVar.i1 = !feVar.i1;
                AndroidUtilities.cancelRunOnUIThread(kdVar);
                AndroidUtilities.runOnUIThread(kdVar, 1000L);
                feVar.W0.U2.N(true);
                return;
            }
            if (feVar.w0 == null) {
                return;
            }
            zf.j0 j0Var = new zf.j0(30, feVar.u0, feVar.getContext(), feVar.s0, feVar.t0);
            j0Var.H1(j10);
            j0Var.F1(feVar.w0, true);
            MessagesController.getInstance(i9).getBoostsController().userCanBoostChannel(j10, feVar.w0, new ih.a2(3, feVar, j0Var));
        }
    }
}
