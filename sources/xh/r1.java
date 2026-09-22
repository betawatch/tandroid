package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                m01 m01Var = profileActivity.O;
                if (m01Var != null) {
                    m01Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
        }
    }
}
