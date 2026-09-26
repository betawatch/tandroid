package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ zg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(wnVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, wnVar.ea).j();
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b;
                if (i10 != 0) {
                    wnVar2.F(i10, 0, 0, 0, false, true);
                    break;
                } else {
                    wnVar2.m6 = false;
                    wnVar2.H9();
                    break;
                }
            default:
                wn wnVar3 = this.b;
                if (i10 != 0) {
                    wnVar3.finishFragment();
                    break;
                } else {
                    wnVar3.Qc(true);
                    break;
                }
        }
    }
}
