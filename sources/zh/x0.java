package zh;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x0(z0 z0Var, boolean z9, int i7) {
        this.a = i7;
        this.b = z0Var;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                z0 z0Var = this.b;
                if (!z9) {
                    z0Var.G.setVisibility(8);
                    break;
                } else {
                    z0Var.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                z0 z0Var2 = this.b;
                if (!z10) {
                    z0Var2.w.setVisibility(8);
                    break;
                } else {
                    z0Var2.getClass();
                    break;
                }
        }
    }
}
