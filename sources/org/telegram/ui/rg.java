package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ rg(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, snVar.qa).j();
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                if (i10 != 0) {
                    snVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    snVar2.y6 = false;
                    snVar2.M9();
                    break;
                }
            default:
                sn snVar3 = this.b;
                if (i10 != 0) {
                    snVar3.finishFragment();
                    break;
                } else {
                    snVar3.Xc(true);
                    break;
                }
        }
    }
}
