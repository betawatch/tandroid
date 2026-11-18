package tg;

import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                g0.X(this.b, (Integer) obj);
                break;
            default:
                g0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
