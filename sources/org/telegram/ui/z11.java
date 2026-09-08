package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z11(d21 d21Var, int i10, int i11) {
        this.a = i11;
        this.b = d21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d21 d21Var = this.b;
                org.telegram.ui.Components.h81 h81Var = d21Var.n;
                c21 c21Var = d21Var.s;
                int i10 = this.c;
                h81Var.d(i10, c21Var.i(i10));
                break;
            default:
                d21 d21Var2 = this.b;
                org.telegram.ui.Components.h81 h81Var2 = d21Var2.n;
                c21 c21Var2 = d21Var2.s;
                int i11 = this.c;
                h81Var2.d(i11, c21Var2.i(i11));
                break;
        }
    }
}
