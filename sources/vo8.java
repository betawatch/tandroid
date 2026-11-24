// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vo8 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ vo8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        View m;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gm.t1(profileActivity.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i == 1) {
                    gm.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.D3(m, 0.0f);
                }
                zja zjaVar = profileActivity.U0;
                if (zjaVar != null) {
                    boolean z = i != 0;
                    profileActivity.z1 = z;
                    zjaVar.setEnabled((z || profileActivity.q2) ? false : true);
                }
                wp8 wp8Var = profileActivity.O;
                boolean z2 = profileActivity.a.J1;
                wp8Var.getClass();
                break;
        }
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                hg5 hg5Var = profileActivity.X;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                profileActivity.H1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.D4 - 8) {
                    profileActivity.b2(false);
                }
                wp8 wp8Var = profileActivity.O;
                wp8Var.setPinnedToTop(wp8Var.getY() <= 0.0f);
                profileActivity.M3();
                break;
        }
    }
}
