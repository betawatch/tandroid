package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r8(da daVar, boolean z4, int i10) {
        this.a = i10;
        this.b = daVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                da daVar = this.b;
                if (!this.c) {
                    daVar.G0.b(false, false);
                    break;
                } else {
                    daVar.getClass();
                    break;
                }
            default:
                da daVar2 = this.b;
                daVar2.O = null;
                daVar2.e = false;
                daVar2.q(this.c);
                break;
        }
    }
}
