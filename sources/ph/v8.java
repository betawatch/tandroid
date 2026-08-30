package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ v8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da daVar = this.b;
                daVar.getClass();
                daVar.g(1.0f, true, new h8(daVar, 6));
                daVar.Y0.b(true, true);
                break;
            default:
                da daVar2 = this.b;
                daVar2.f(false);
                daVar2.j2 = null;
                break;
        }
    }
}
