// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zj0 implements Runnable {
    public final /* synthetic */ byte a;
    public final WeakReference b;

    public zj0(lk0 lk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(lk0Var);
                break;
            default:
                this.b = new WeakReference(lk0Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((ak0) weakReference.get()).Y();
                    break;
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).n = false;
                    break;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).o = false;
                    break;
                }
                break;
        }
    }

    public zj0(ak0 ak0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(ak0Var);
    }
}
