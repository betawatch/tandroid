package yh;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ b2(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setReordering(true);
                break;
            case 1:
                this.b.setReordering(true);
                break;
            case 2:
                this.b.f(false);
                break;
            default:
                this.b.setReordering(true);
                break;
        }
    }
}
