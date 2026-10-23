package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp0 b;

    public /* synthetic */ vo0(fp0 fp0Var, int i10) {
        this.a = i10;
        this.b = fp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        fp0 fp0Var = this.b;
        switch (i10) {
            case 0:
                if (fp0Var.G) {
                    fp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                fp0Var.h();
                break;
            case 2:
                int i11 = fp0.q0;
                fp0Var.h();
                break;
            default:
                int i12 = fp0.q0;
                fp0Var.h();
                break;
        }
    }
}
