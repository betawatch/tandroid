package rg;

import org.telegram.ui.it0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ m(it0 it0Var, int i10) {
        this.a = i10;
        this.b = it0Var;
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
