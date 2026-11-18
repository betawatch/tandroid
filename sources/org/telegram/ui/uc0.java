package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ uc0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                gd0Var.c(true);
                gd0Var.v0.M1(0, true, null, true);
                break;
            default:
                this.b.v0.M1(0, true, null, true);
                break;
        }
    }
}
