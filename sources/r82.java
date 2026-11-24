// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z82 b;

    public /* synthetic */ r82(z82 z82Var, byte b) {
        this.a = b;
        this.b = z82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z82 z82Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = z82Var.n;
                lka lkaVar = (lka) atomicReference.get();
                if (lkaVar != null) {
                    z82Var.removeView(lkaVar);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                AtomicReference atomicReference2 = z82Var.w;
                lka lkaVar2 = (lka) atomicReference2.get();
                if (lkaVar2 != null) {
                    z82Var.removeView(lkaVar2);
                    atomicReference2.set(null);
                    if (!z82Var.b) {
                        z82Var.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                z82Var.k0 = false;
                z82Var.i0.c(false);
                if (z82Var.a()) {
                    z82Var.f();
                    break;
                }
                break;
        }
    }
}
