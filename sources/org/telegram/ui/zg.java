package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                    org.telegram.ui.Components.yc.a0(wnVar).m(org.telegram.ui.Components.xc.r, i10, 0, 0, wnVar.ea).j();
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
