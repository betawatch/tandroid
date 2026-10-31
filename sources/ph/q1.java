package ph;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ix0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                this.b.T4(true);
                break;
            case 1:
                this.b.T4(true);
                break;
            default:
                ProfileActivity profileActivity = this.b;
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null) {
                    ix0Var.f1(14);
                    profileActivity.T4(false);
                    break;
                }
                break;
        }
    }
}
