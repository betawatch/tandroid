package sg;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ j0 c;

    public /* synthetic */ t(v vVar, j0 j0Var, int i7) {
        this.a = i7;
        this.b = vVar;
        this.c = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.b, this.c, 1));
                break;
            default:
                v vVar = this.b;
                vVar.getClass();
                vVar.i = this.c.a;
                break;
        }
    }
}
