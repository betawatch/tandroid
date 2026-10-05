package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                e01 e01Var = profileActivity.O;
                if (e01Var != null) {
                    e01Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
        }
    }
}
