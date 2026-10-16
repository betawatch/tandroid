package rg;

import org.telegram.ui.gu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu0 b;

    public /* synthetic */ m(gu0 gu0Var, int i10) {
        this.a = i10;
        this.b = gu0Var;
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
