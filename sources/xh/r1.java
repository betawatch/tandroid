package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ r1(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G4(true);
                break;
            case 1:
                this.b.G4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                n01 n01Var = profileActivity.O;
                if (n01Var != null) {
                    n01Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
        }
    }
}
