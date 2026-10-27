package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ rg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.b0(wnVar).m(org.telegram.ui.Components.vc.r, i10, 0, 0, wnVar.ua).j();
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b;
                if (i10 != 0) {
                    wnVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    wnVar2.C6 = false;
                    wnVar2.U9();
                    break;
                }
            default:
                wn wnVar3 = this.b;
                if (i10 != 0) {
                    wnVar3.finishFragment();
                    break;
                } else {
                    wnVar3.hd(true);
                    break;
                }
        }
    }
}
