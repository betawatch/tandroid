package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ xg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.qc.a0(znVar).m(org.telegram.ui.Components.pc.r, i10, 0, 0, znVar.ba).j();
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                if (i10 != 0) {
                    znVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    znVar2.j6 = false;
                    znVar2.H9();
                    break;
                }
            default:
                zn znVar3 = this.b;
                if (i10 != 0) {
                    znVar3.finishFragment();
                    break;
                } else {
                    znVar3.Qc(true);
                    break;
                }
        }
    }
}
