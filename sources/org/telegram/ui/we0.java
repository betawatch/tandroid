package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ we0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if0Var.c(true);
                if0Var.o0.u1(0, true, null, true);
                break;
            default:
                this.b.o0.u1(0, true, null, true);
                break;
        }
    }
}
