package zh;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
