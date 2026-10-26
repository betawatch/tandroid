package sg;

import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ nt0 b;

    public /* synthetic */ m(nt0 nt0Var, int i10) {
        this.a = i10;
        this.b = nt0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n0.X(this.b, (Integer) obj);
                break;
            default:
                n0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
