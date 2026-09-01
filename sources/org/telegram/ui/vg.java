package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ vg(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(org.telegram.ui.Components.pc.r, i10, 0, 0, xnVar.ba).j();
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b;
                if (i10 != 0) {
                    xnVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    xnVar2.j6 = false;
                    xnVar2.H9();
                    break;
                }
            default:
                xn xnVar3 = this.b;
                if (i10 != 0) {
                    xnVar3.finishFragment();
                    break;
                } else {
                    xnVar3.Qc(true);
                    break;
                }
        }
    }
}
