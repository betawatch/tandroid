package tg;

import org.telegram.ui.up0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ m(up0 up0Var, int i7) {
        this.a = i7;
        this.b = up0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g0.X(this.b, (Integer) obj);
                break;
            default:
                g0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
