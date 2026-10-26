package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ tg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.b0(unVar).m(org.telegram.ui.Components.vc.r, i10, 0, 0, unVar.qa).j();
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b;
                if (i10 != 0) {
                    unVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    unVar2.y6 = false;
                    unVar2.R9();
                    break;
                }
            default:
                un unVar3 = this.b;
                if (i10 != 0) {
                    unVar3.finishFragment();
                    break;
                } else {
                    unVar3.dd(true);
                    break;
                }
        }
    }
}
