package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ rg(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i9 > 0) {
                    org.telegram.ui.Components.oc.a0(qnVar).m(org.telegram.ui.Components.nc.r, i9, 0, 0, qnVar.aa).j();
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b;
                if (i9 != 0) {
                    qnVar2.j(i9, 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar2.i6 = false;
                    qnVar2.H9();
                    break;
                }
            default:
                qn qnVar3 = this.b;
                if (i9 != 0) {
                    qnVar3.finishFragment();
                    break;
                } else {
                    qnVar3.Qc(true);
                    break;
                }
        }
    }
}
