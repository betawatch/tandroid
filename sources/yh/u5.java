package yh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ u5(org.telegram.ui.ActionBar.e3[] e3VarArr, long j3, int i10) {
        this.a = i10;
        this.b = e3VarArr;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.c));
                    break;
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.R9(this.c));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.e3 e3Var = this.b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.R9(this.c));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(wn.R9(this.c));
                    break;
                }
                break;
            case 4:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new ei.l(this.c));
                    break;
                }
                break;
            case 5:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.c));
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.c));
                    break;
                }
                break;
        }
    }
}
