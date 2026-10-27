package sg;

import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt0 b;

    public /* synthetic */ m(pt0 pt0Var, int i10) {
        this.a = i10;
        this.b = pt0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m0.X(this.b, (Integer) obj);
                break;
            default:
                m0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
