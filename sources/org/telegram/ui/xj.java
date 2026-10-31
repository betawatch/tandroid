package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xj extends ci.o {
    public Runnable W;
    public final /* synthetic */ un X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(un unVar, un unVar2, vj vjVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(unVar2, vjVar, p6Var);
        this.X = unVar;
    }

    @Override // s4.j
    public final void F() {
        un unVar = this.X;
        if (unVar.aa == -1) {
            unVar.aa = unVar.getNotificationCenter().q(un.gd, unVar.aa, false);
        }
    }

    @Override // ci.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        wj wjVar = new wj(this, 0);
        this.W = wjVar;
        org.telegram.messenger.i0.g3(wjVar);
    }

    @Override // ci.o
    public final void W() {
        un unVar = this.X;
        unVar.aa = unVar.getNotificationCenter().q(un.gd, unVar.aa, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("chatItemAnimator disable notifications");
        }
        mg.c2 c2Var = unVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.i0.r(c2Var);
        c2Var.run();
        org.telegram.ui.Components.ee eeVar = unVar.Z.Y3;
        org.telegram.messenger.i0.r(eeVar);
        eeVar.run();
    }

    @Override // ci.o, s4.j, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        wj wjVar = new wj(this, 1);
        this.W = wjVar;
        org.telegram.messenger.i0.g3(wjVar);
    }
}
