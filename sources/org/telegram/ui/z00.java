package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;

    public /* synthetic */ z00(a10 a10Var, int i10) {
        this.a = i10;
        this.b = a10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                a10 a10Var = this.b;
                a10Var.b(a10Var.y);
                break;
        }
    }
}
