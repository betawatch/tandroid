package tg;

import org.telegram.ui.tp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ m(tp0 tp0Var, int i7) {
        this.a = i7;
        this.b = tp0Var;
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
