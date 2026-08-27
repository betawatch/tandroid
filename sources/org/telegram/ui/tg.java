package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ tg(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                if (rnVar.getParentActivity() != null && rnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(org.telegram.ui.Components.lc.r, i10, 0, 0, rnVar.aa).j();
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.b;
                if (i10 != 0) {
                    rnVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    rnVar2.i6 = false;
                    rnVar2.H9();
                    break;
                }
            default:
                rn rnVar3 = this.b;
                if (i10 != 0) {
                    rnVar3.finishFragment();
                    break;
                } else {
                    rnVar3.Qc(true);
                    break;
                }
        }
    }
}
