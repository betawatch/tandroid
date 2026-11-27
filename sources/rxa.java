// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ rxa(nx0[] nx0VarArr, long j, byte b) {
        this.a = b;
        this.b = nx0VarArr;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(zu1.ha(j));
                    break;
                }
                break;
            case 1:
                nx0VarArr[0].dismiss();
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new cc(j));
                    break;
                }
                break;
            case 2:
                nx0VarArr[0].dismiss();
                e S3 = LaunchActivity.S();
                if (S3 != null) {
                    S3.presentFragment(ProfileActivity.Q2(j));
                    break;
                }
                break;
            case 3:
                nx0VarArr[0].dismiss();
                e S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(ProfileActivity.Q2(j));
                    break;
                }
                break;
            case 4:
                nx0VarArr[0].dismiss();
                e S5 = LaunchActivity.S();
                if (S5 != null) {
                    S5.presentFragment(ProfileActivity.Q2(j));
                    break;
                }
                break;
            case 5:
                nx0VarArr[0].dismiss();
                e S6 = LaunchActivity.S();
                if (S6 != null) {
                    S6.presentFragment(zu1.ha(j));
                    break;
                }
                break;
            default:
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                }
                e S7 = LaunchActivity.S();
                if (S7 != null) {
                    S7.presentFragment(zu1.ha(j));
                    break;
                }
                break;
        }
    }
}
