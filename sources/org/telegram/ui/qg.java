package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ qg(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                if (tnVar.getParentActivity() != null && tnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.tc.a0(tnVar).m(org.telegram.ui.Components.sc.r, i10, 0, 0, tnVar.aa).j();
                    break;
                }
                break;
            case 1:
                tn tnVar2 = this.b;
                if (i10 != 0) {
                    tnVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    tnVar2.i6 = false;
                    tnVar2.H9();
                    break;
                }
            default:
                tn tnVar3 = this.b;
                if (i10 != 0) {
                    tnVar3.finishFragment();
                    break;
                } else {
                    tnVar3.Qc(true);
                    break;
                }
        }
    }
}
