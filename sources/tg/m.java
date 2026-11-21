package tg;

import org.telegram.ui.vp0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp0 b;

    public /* synthetic */ m(vp0 vp0Var, int i7) {
        this.a = i7;
        this.b = vp0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                h0.X(this.b, (Integer) obj);
                break;
            default:
                h0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
