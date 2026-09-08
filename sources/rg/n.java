package rg;

import org.telegram.ui.zt0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ n(zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = zt0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                o0.Z(this.b, (Integer) obj);
                break;
            default:
                o0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
