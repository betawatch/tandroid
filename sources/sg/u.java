package sg;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
