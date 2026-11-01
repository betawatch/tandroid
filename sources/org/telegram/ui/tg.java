package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ tg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.r, i10, 0, 0, unVar.xa).j();
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b;
                if (i10 != 0) {
                    unVar2.l(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    unVar2.C6 = false;
                    unVar2.ca();
                    break;
                }
            default:
                un unVar3 = this.b;
                if (i10 != 0) {
                    unVar3.finishFragment();
                    break;
                } else {
                    unVar3.qd(true);
                    break;
                }
        }
    }
}
