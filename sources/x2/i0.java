package x2;

import a8.wa;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa b;
    public final /* synthetic */ u c;
    public final /* synthetic */ c0 d;

    public /* synthetic */ i0(wa waVar, u uVar, c0 c0Var, int i7) {
        this.a = i7;
        this.b = waVar;
        this.c = uVar;
        this.d = c0Var;
    }

    @Override // h2.j
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.a) {
            case 0:
                wa waVar = this.b;
                k0Var.G(waVar.b, (g0) waVar.c, this.c, this.d);
                break;
            default:
                wa waVar2 = this.b;
                k0Var.A(waVar2.b, (g0) waVar2.c, this.c, this.d);
                break;
        }
    }
}
