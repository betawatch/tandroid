package qh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ j2(o3 o3Var, int i9, int i10, int i11) {
        this.a = i11;
        this.b = o3Var;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y1(this.c, this.d);
                break;
            default:
                this.b.g4(this.c, this.d);
                break;
        }
    }
}
