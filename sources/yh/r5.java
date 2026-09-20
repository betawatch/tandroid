package yh;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r5(t5 t5Var, long j3, int i10) {
        this.a = i10;
        this.b = t5Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.q.d0(t5Var.b, t5Var.c, this.c, true, true, t5Var.n);
                break;
            default:
                t5 t5Var2 = this.b;
                t5Var2.q.d0(t5Var2.b, t5Var2.c, this.c, true, true, t5Var2.n);
                break;
        }
    }
}
