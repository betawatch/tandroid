package qg;

import org.telegram.ui.st0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ st0 b;

    public /* synthetic */ m(st0 st0Var, int i10) {
        this.a = i10;
        this.b = st0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n0.Z(this.b, (Integer) obj);
                break;
            default:
                n0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
