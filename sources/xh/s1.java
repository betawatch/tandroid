package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ s1(ProfileActivity profileActivity, int i10) {
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
                c01 c01Var = profileActivity.O;
                if (c01Var != null) {
                    c01Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
        }
    }
}
