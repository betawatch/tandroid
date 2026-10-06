package qg;

import org.telegram.ui.vt0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt0 b;

    public /* synthetic */ m(vt0 vt0Var, int i10) {
        this.a = i10;
        this.b = vt0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                m0.Z(this.b, (Integer) obj);
                break;
            default:
                m0.c0(this.b, (Integer) obj);
                break;
        }
    }
}
