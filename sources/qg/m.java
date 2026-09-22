package qg;

import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                n0.Z(this.b, (Integer) obj);
                break;
            default:
                n0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
