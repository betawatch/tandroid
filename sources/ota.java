// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ota implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ ota(fx0[] fx0VarArr, long j, byte b) {
        this.a = b;
        this.b = fx0VarArr;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(mu1.W9(j));
                    break;
                }
                break;
            case 1:
                fx0VarArr[0].dismiss();
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new bc(j));
                    break;
                }
                break;
            case 2:
                fx0VarArr[0].dismiss();
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    S3.presentFragment(ProfileActivity.P2(j));
                    break;
                }
                break;
            case 3:
                fx0VarArr[0].dismiss();
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(ProfileActivity.P2(j));
                    break;
                }
                break;
            case 4:
                fx0VarArr[0].dismiss();
                d S5 = LaunchActivity.S();
                if (S5 != null) {
                    S5.presentFragment(ProfileActivity.P2(j));
                    break;
                }
                break;
            case 5:
                fx0VarArr[0].dismiss();
                d S6 = LaunchActivity.S();
                if (S6 != null) {
                    S6.presentFragment(mu1.W9(j));
                    break;
                }
                break;
            default:
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                }
                d S7 = LaunchActivity.S();
                if (S7 != null) {
                    S7.presentFragment(mu1.W9(j));
                    break;
                }
                break;
        }
    }
}
