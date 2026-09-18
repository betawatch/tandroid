package qg;

import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu0 b;

    public /* synthetic */ m(cu0 cu0Var, int i10) {
        this.a = i10;
        this.b = cu0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                p0.Z(this.b, (Integer) obj);
                break;
            default:
                p0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
