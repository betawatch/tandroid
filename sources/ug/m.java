package ug;

import org.telegram.ui.lp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ m(lp0 lp0Var, int i3) {
        this.a = i3;
        this.b = lp0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f0.X(this.b, (Integer) obj);
                break;
            default:
                f0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
