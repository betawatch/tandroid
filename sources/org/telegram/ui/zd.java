package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ ke a;

    public /* synthetic */ zd(ke keVar) {
        this.a = keVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.t0.presentFragment(new qg1(6, null));
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
        pd pdVar = keVar.s1;
        int i10 = keVar.v0;
        long j10 = keVar.w0;
        int i11 = ((org.telegram.ui.Components.j51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.t0.presentFragment(new sh.d3(j10));
            }
        } else {
            if (keVar.y0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                keVar.j1 = !keVar.j1;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 1000L);
                keVar.X0.V2.N(true);
                return;
            }
            if (keVar.x0 == null) {
                return;
            }
            fg.v0 v0Var = new fg.v0(30, keVar.v0, keVar.getContext(), keVar.t0, keVar.u0);
            v0Var.H1(j10);
            v0Var.F1(keVar.x0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.x0, new oh.a2(3, keVar, v0Var));
        }
    }
}
