package wi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ e0(t0 t0Var, Exception exc, int i7) {
        this.a = i7;
        this.b = t0Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h(this.c);
                break;
            case 1:
                this.b.h(this.c);
                break;
            case 2:
                this.b.h(this.c);
                break;
            default:
                this.b.h(this.c);
                break;
        }
    }
}
