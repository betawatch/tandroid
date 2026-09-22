package qg;

import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ m(au0 au0Var, int i10) {
        this.a = i10;
        this.b = au0Var;
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
