package qg;

import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tt0 b;

    public /* synthetic */ m(tt0 tt0Var, int i10) {
        this.a = i10;
        this.b = tt0Var;
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
