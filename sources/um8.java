// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class um8 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ um8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        View m;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gl.t1(profileActivity.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i == 1) {
                    gl.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.z3(m, 0.0f);
                }
                xha xhaVar = profileActivity.U0;
                if (xhaVar != null) {
                    boolean z = i != 0;
                    profileActivity.z1 = z;
                    xhaVar.setEnabled((z || profileActivity.q2) ? false : true);
                }
                vn8 vn8Var = profileActivity.O;
                boolean z2 = profileActivity.a.J1;
                vn8Var.getClass();
                break;
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                je5 je5Var = profileActivity.X;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                profileActivity.F1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.y4 - 8) {
                    profileActivity.Z1(false);
                }
                vn8 vn8Var = profileActivity.O;
                vn8Var.setPinnedToTop(vn8Var.getY() <= 0.0f);
                profileActivity.I3();
                break;
        }
    }
}
