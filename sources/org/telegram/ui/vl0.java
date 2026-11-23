package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fm0 b;

    public /* synthetic */ vl0(fm0 fm0Var, int i7) {
        this.a = i7;
        this.b = fm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fm0 fm0Var = this.b;
        switch (i7) {
            case 0:
                if (fm0Var.H) {
                    fm0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                fm0Var.h();
                break;
            case 2:
                int i10 = fm0.r0;
                fm0Var.h();
                break;
            default:
                int i11 = fm0.r0;
                fm0Var.h();
                break;
        }
    }
}
