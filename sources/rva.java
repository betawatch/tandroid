// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ rva(my0[] my0VarArr, long j, byte b) {
        this.a = b;
        this.b = my0VarArr;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(yv1.ga(j));
                    break;
                }
                break;
            case 1:
                my0VarArr[0].dismiss();
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new bc(j));
                    break;
                }
                break;
            case 2:
                my0VarArr[0].dismiss();
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    S3.presentFragment(ProfileActivity.S2(j));
                    break;
                }
                break;
            case 3:
                my0VarArr[0].dismiss();
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(ProfileActivity.S2(j));
                    break;
                }
                break;
            case 4:
                my0VarArr[0].dismiss();
                d S5 = LaunchActivity.S();
                if (S5 != null) {
                    S5.presentFragment(ProfileActivity.S2(j));
                    break;
                }
                break;
            case 5:
                my0VarArr[0].dismiss();
                d S6 = LaunchActivity.S();
                if (S6 != null) {
                    S6.presentFragment(yv1.ga(j));
                    break;
                }
                break;
            default:
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                }
                d S7 = LaunchActivity.S();
                if (S7 != null) {
                    S7.presentFragment(yv1.ga(j));
                    break;
                }
                break;
        }
    }
}
