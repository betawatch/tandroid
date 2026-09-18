package qg;

import org.telegram.ui.au0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ m(au0 au0Var, int i10) {
        this.a = i10;
        this.b = au0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m0.Z(this.b, (Integer) obj);
                break;
            default:
                m0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
