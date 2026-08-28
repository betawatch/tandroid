package qh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d2(o3 o3Var, int i9, int i10) {
        this.a = i10;
        this.b = o3Var;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d4(this.c);
                break;
            case 1:
                this.b.f4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.e4(this.c);
                break;
        }
    }
}
