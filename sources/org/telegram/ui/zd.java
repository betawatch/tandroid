package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ ke a;

    public /* synthetic */ zd(ke keVar) {
        this.a = keVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.w0.presentFragment(new xf1(6, null));
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
        qd qdVar = keVar.v1;
        int i10 = keVar.y0;
        long j10 = keVar.z0;
        int i11 = ((org.telegram.ui.Components.f61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.w0.presentFragment(new gi.u3(j10));
            }
        } else {
            if (keVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                keVar.m1 = !keVar.m1;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 1000L);
                keVar.a1.W2.N(true);
                return;
            }
            if (keVar.A0 == null) {
                return;
            }
            sg.j0 j0Var = new sg.j0(30, keVar.y0, keVar.getContext(), keVar.w0, keVar.x0);
            j0Var.I1(j10);
            j0Var.G1(keVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.A0, new org.telegram.ui.ActionBar.j3(7, keVar, j0Var));
        }
    }
}
