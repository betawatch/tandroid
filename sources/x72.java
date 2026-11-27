// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f82 b;

    public /* synthetic */ x72(f82 f82Var, byte b) {
        this.a = b;
        this.b = f82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f82 f82Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = f82Var.n;
                ema emaVar = (ema) atomicReference.get();
                if (emaVar != null) {
                    f82Var.removeView(emaVar);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                AtomicReference atomicReference2 = f82Var.w;
                ema emaVar2 = (ema) atomicReference2.get();
                if (emaVar2 != null) {
                    f82Var.removeView(emaVar2);
                    atomicReference2.set(null);
                    if (!f82Var.b) {
                        f82Var.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                f82Var.k0 = false;
                f82Var.i0.c(false);
                if (f82Var.a()) {
                    f82Var.f();
                    break;
                }
                break;
        }
    }
}
