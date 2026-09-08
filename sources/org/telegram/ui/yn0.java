package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ yn0(long j3, int i10) {
        this.a = i10;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.R9(this.b));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.R9(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(co.R9(this.b));
                    break;
                }
                break;
        }
    }
}
