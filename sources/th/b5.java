package th;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ b5(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
