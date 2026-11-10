package x2;

import a8.wa;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa b;
    public final /* synthetic */ t c;
    public final /* synthetic */ b0 d;

    public /* synthetic */ h0(wa waVar, t tVar, b0 b0Var, int i7) {
        this.a = i7;
        this.b = waVar;
        this.c = tVar;
        this.d = b0Var;
    }

    @Override // h2.j
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.a) {
            case 0:
                wa waVar = this.b;
                j0Var.G(waVar.b, (f0) waVar.c, this.c, this.d);
                break;
            default:
                wa waVar2 = this.b;
                j0Var.A(waVar2.b, (f0) waVar2.c, this.c, this.d);
                break;
        }
    }
}
