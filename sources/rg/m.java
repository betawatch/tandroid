package rg;

import org.telegram.ui.jt0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ m(jt0 jt0Var, int i10) {
        this.a = i10;
        this.b = jt0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m0.Y(this.b, (Integer) obj);
                break;
            default:
                m0.b0(this.b, (Integer) obj);
                break;
        }
    }
}
