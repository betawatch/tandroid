package ph;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hx0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ q1(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U4(true);
                break;
            case 1:
                this.b.U4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null) {
                    hx0Var.g1(14);
                    profileActivity.U4(false);
                    break;
                }
                break;
        }
    }
}
