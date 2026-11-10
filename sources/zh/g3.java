package zh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ g3(l3 l3Var, int i7) {
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
                l3Var.d2.O(true);
                org.telegram.messenger.g0.i3(new g3(l3Var, 0), 150L);
                break;
        }
    }
}
