package rg;

import org.telegram.ui.it0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
