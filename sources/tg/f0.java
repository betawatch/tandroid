package tg;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ f0(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0.e0(this.b);
                break;
            default:
                h0.d0(this.b);
                break;
        }
    }
}
