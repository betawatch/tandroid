// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vn8 extends nfa {
    public boolean x2;
    public final /* synthetic */ ProfileActivity y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn8(ProfileActivity profileActivity, Context context, long j, ffa ffaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, ProfileActivity profileActivity2, ProfileActivity profileActivity3, wjb wjbVar, kl0 kl0Var) {
        super(context, j, ffaVar, i, arrayList, chatFull, userFull, i2, i3, profileActivity2, profileActivity3, 1, wjbVar, kl0Var);
        this.y2 = profileActivity;
    }

    @Override // nfa
    public final void J0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c = (nfa.t0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c >= 0) {
                if (c == 0) {
                    profileActivity.J1(size);
                }
                profileActivity.C5[c].c(size, true);
            }
        }
    }

    @Override // nfa
    public final void K0() {
        FrameLayout frameLayout;
        vn8 vn8Var;
        ProfileActivity profileActivity = this.y2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.z5[0]) == null || (vn8Var = profileActivity.O) == null) {
            return;
        }
        ProfileActivity.o3(frameLayout, 1.0f - vn8Var.getBottomButtonStoriesVisibility());
    }

    @Override // nfa
    public final void N1(boolean z) {
        int i;
        int i2;
        super.N1(z);
        ProfileActivity profileActivity = this.y2;
        boolean z2 = profileActivity.t1;
        lca lcaVar = this.b0;
        if (z2 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i2 = profileActivity.u1) > 0 && lcaVar != null) {
                this.x2 = true;
                lcaVar.Q = i2;
                lcaVar.e();
            }
            profileActivity.w1 = true;
            f1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.x2 || (i = profileActivity.u1) <= 0 || lcaVar == null) {
            return;
        }
        this.x2 = true;
        lcaVar.Q = i;
        lcaVar.e();
    }

    @Override // nfa
    public final boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return this.y2.g(chatParticipant, z, false, view);
    }

    @Override // nfa
    public final void Q0() {
        RectF rectF = ProfileActivity.Z6;
        this.y2.W3(true);
    }

    @Override // nfa
    public final void R0(boolean z) {
        int i;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i = ((d) profileActivity).classGuid;
        gl.y2(parentActivity, i);
        profileActivity.a.D0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r0.getMeasuredWidth() / 2.0f);
        gl.U3(profileActivity.Z, !z, 0.95f, true, true);
        profileActivity.h4(false);
    }

    @Override // nfa
    public final void S0() {
        this.y2.V();
    }

    @Override // nfa
    public final void T0(float f) {
        K0();
        ProfileActivity profileActivity = this.y2;
        vn8 vn8Var = profileActivity.O;
        if (vn8Var == null || !profileActivity.s1) {
            return;
        }
        if (profileActivity.z5[0] != null) {
            profileActivity.z5[0].setTranslationX(vn8Var.a0(8, true));
        }
        if (profileActivity.z5[1] != null) {
            profileActivity.z5[1].setTranslationX(profileActivity.O.a0(9, false));
        }
        profileActivity.J1(profileActivity.L6);
        profileActivity.I3();
    }

    @Override // nfa
    public final int c1(int i) {
        RectF rectF = ProfileActivity.Z6;
        return i;
    }

    @Override // nfa
    public final int getInitialTab() {
        return 8;
    }

    @Override // nfa
    public final boolean h0() {
        ProfileActivity profileActivity = this.y2;
        return profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (na7.q1(r6).b5() != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    @Override // nfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(boolean z) {
        int i;
        super.l1(z);
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            if (z) {
                r1(null);
            }
            this.P1 = z;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z2 = true;
                if (selectedTab <= 1) {
                    FrameLayout frameLayout = profileActivity.z5[selectedTab];
                    if (!z) {
                        if (selectedTab == 0) {
                            i = ((d) profileActivity).currentAccount;
                        }
                        frameLayout.setVisibility(0);
                        frameLayout.animate().translationY(!z2 ? ProfileActivity.a7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(s33.h).setUpdateListener(new u28(this, (byte) 14)).withEndAction(new k08((byte) 3, (Object) frameLayout, z2)).start();
                    }
                    z2 = false;
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z2 ? ProfileActivity.a7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(s33.h).setUpdateListener(new u28(this, (byte) 14)).withEndAction(new k08((byte) 3, (Object) frameLayout, z2)).start();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.d3(new w88(this, (byte) 23));
    }

    @Override // nfa
    public final boolean r0() {
        return this.y2.s1;
    }

    @Override // nfa
    public final boolean s0() {
        return this.y2.s1;
    }
}
