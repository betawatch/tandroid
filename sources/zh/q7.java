package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ q7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.S = true;
                h8Var.q(null);
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                v7 v7Var = this.b.r;
                v7Var.F = false;
                v7Var.invalidate();
                break;
        }
    }
}
