package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements org.telegram.messenger.bs {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ sg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.bs
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
                    unVar2.k(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    unVar2.C6 = false;
                    unVar2.X9();
                    break;
                }
            default:
                un unVar3 = this.b;
                if (i10 != 0) {
                    unVar3.finishFragment();
                    break;
                } else {
                    unVar3.ld(true);
                    break;
                }
        }
    }
}
