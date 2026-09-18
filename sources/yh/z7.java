package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ z7(q8 q8Var, int i10) {
        this.a = i10;
        this.b = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q8 q8Var = this.b;
                q8Var.R = true;
                q8Var.o(null);
                AndroidUtilities.runOnUIThread(new z7(q8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                e8 e8Var = this.b.r;
                e8Var.F = false;
                e8Var.invalidate();
                break;
        }
    }
}
