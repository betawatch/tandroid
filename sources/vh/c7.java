package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c7(o8 o8Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = o8Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.o0();
                break;
            default:
                o8 o8Var = this.b;
                o8Var.e(false);
                org.telegram.messenger.i0.r(o8Var.g2);
                o8Var.g2 = null;
                o8Var.S1 = false;
                this.c.run();
                break;
        }
    }
}
