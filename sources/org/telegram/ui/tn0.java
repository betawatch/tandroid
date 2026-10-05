package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ tn0(long j3, int i10) {
        this.a = i10;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(yn.Q9(this.b));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(yn.Q9(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(yn.Q9(this.b));
                    break;
                }
                break;
        }
    }
}
