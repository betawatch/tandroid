package sg;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
