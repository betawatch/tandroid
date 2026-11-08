package zh;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ f3(k3 k3Var, int i7) {
        this.a = i7;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                k3 k3Var = this.b;
                k3Var.a2.O(true);
                org.telegram.messenger.g0.i3(new f3(k3Var, 0), 150L);
                break;
        }
    }
}
