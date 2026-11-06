package tg;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(g0 g0Var, boolean z9, int i7) {
        this.a = i7;
        this.b = g0Var;
        this.c = z9;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                j1 j1Var = g0Var.e1;
                if (gVar == g0Var.o1) {
                    g0Var.o1 = null;
                    if (!this.c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                g0 g0Var2 = this.b;
                d0 d0Var = g0Var2.p1;
                if (gVar == g0Var2.v1) {
                    g0Var2.v1 = null;
                    if (!this.c) {
                        d0Var.setVisibility(8);
                        sg.l0.e(g0Var2.y1).g();
                        d0Var.getAdapter().f();
                        break;
                    }
                }
                break;
        }
    }
}
