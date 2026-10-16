package ri;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ c0(r0 r0Var, Exception exc, int i10) {
        this.a = i10;
        this.b = r0Var;
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
