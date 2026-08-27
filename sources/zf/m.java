package zf;

import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ m(ys0 ys0Var, int i10) {
        this.a = i10;
        this.b = ys0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                l0.Z(this.b, (Integer) obj);
                break;
            default:
                l0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
