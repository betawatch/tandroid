package zh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ p1(z1 z1Var, int i7) {
        this.a = i7;
        this.b = z1Var;
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
