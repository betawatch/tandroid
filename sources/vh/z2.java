package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ jg.i2 c;

    public /* synthetic */ z2(b4 b4Var, jg.i2 i2Var, int i10) {
        this.a = i10;
        this.b = b4Var;
        this.c = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0(this.c, true);
                break;
            default:
                this.b.z0(this.c);
                break;
        }
    }
}
