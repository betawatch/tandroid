package rg;

import org.telegram.ui.hu0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;

    public /* synthetic */ m(hu0 hu0Var, int i10) {
        this.a = i10;
        this.b = hu0Var;
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
