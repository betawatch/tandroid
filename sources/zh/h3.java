package zh;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ h3(l3 l3Var, int i7) {
        this.a = i7;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d1();
                break;
            default:
                l3 l3Var = this.b;
                l3Var.a2.O(true);
                org.telegram.messenger.g0.i3(new h3(l3Var, 0), 150L);
                break;
        }
    }
}
