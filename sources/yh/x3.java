package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ x3(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            default:
                f4 f4Var = this.b;
                f4Var.i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                break;
        }
    }
}
