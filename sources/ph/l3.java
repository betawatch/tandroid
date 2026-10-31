package ph;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public /* synthetic */ l3(q3 q3Var, int i10) {
        this.a = i10;
        this.b = q3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                q3 q3Var = this.b;
                q3Var.a2.O(true);
                org.telegram.messenger.i0.h3(new l3(q3Var, 0), 150L);
                break;
        }
    }
}
