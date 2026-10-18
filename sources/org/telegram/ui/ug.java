package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ug(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.r, i10, 0, 0, snVar.ea).j();
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                if (i10 != 0) {
                    snVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    snVar2.m6 = false;
                    snVar2.M9();
                    break;
                }
            default:
                sn snVar3 = this.b;
                if (i10 != 0) {
                    snVar3.finishFragment();
                    break;
                } else {
                    snVar3.Uc(true);
                    break;
                }
        }
    }
}
