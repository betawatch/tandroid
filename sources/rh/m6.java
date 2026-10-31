package rh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ m6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, int i10) {
        this.a = i10;
        this.b = z2VarArr;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ha(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new xh.i(this.c));
                    break;
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.z4(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.z4(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.z4(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(un.ha(this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = this.b[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                org.telegram.ui.ActionBar.k2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(un.ha(this.c));
                    break;
                }
                break;
        }
    }
}
