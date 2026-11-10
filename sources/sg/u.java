package sg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ k0 c;

    public /* synthetic */ u(w wVar, k0 k0Var, int i7) {
        this.a = i7;
        this.b = wVar;
        this.c = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new u(this.b, this.c, 1));
                break;
            default:
                w wVar = this.b;
                wVar.getClass();
                wVar.i = this.c.a;
                break;
        }
    }
}
