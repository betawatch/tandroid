package th;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;

    public /* synthetic */ u4(x4 x4Var, int i10) {
        this.a = i10;
        this.b = x4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x4 x4Var = this.b;
        switch (i10) {
            case 0:
                zs.f(x4Var.c).k(zs.x5, x4Var);
                break;
            case 1:
                x4Var.u = false;
                x4Var.w = true;
                zs.f(x4Var.c).k(zs.x5, x4Var, Boolean.FALSE);
                break;
            case 2:
                x4Var.z = false;
                break;
            default:
                x4Var.k.clear();
                x4Var.d(true);
                break;
        }
    }
}
