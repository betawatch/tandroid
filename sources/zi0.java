// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final WeakReference b;

    public zi0(lj0 lj0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(lj0Var);
                break;
            default:
                this.b = new WeakReference(lj0Var);
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
                    ((aj0) weakReference.get()).Y();
                    break;
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).n = false;
                    break;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).o = false;
                    break;
                }
                break;
        }
    }

    public zi0(aj0 aj0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(aj0Var);
    }
}
