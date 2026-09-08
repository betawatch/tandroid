package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ w7(n8 n8Var, int i10) {
        this.a = i10;
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n8 n8Var = this.b;
                n8Var.R = true;
                n8Var.o(null);
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                b8 b8Var = this.b.r;
                b8Var.F = false;
                b8Var.invalidate();
                break;
        }
    }
}
