package qg;

import org.telegram.ui.vt0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt0 b;

    public /* synthetic */ m(vt0 vt0Var, int i10) {
        this.a = i10;
        this.b = vt0Var;
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
