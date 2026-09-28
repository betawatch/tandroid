package qg;

import org.telegram.ui.st0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ st0 b;

    public /* synthetic */ m(st0 st0Var, int i10) {
        this.a = i10;
        this.b = st0Var;
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
