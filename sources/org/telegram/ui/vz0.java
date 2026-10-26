package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vz0 extends org.telegram.ui.Components.aw0 {
    public boolean r2;
    public final /* synthetic */ ProfileActivity s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.sv0 sv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(context, j10, sv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, u6Var, bVar);
        this.s2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean C0() {
        return this.s2.s1;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean D0() {
        return this.s2.s1;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void J1(boolean z10) {
        int i10;
        int i11;
        super.J1(z10);
        ProfileActivity profileActivity = this.s2;
        boolean z11 = profileActivity.t1;
        org.telegram.ui.Components.vs0 vs0Var = this.a0;
        if (z11 && !profileActivity.w1 && this.K0.d(14)) {
            if (!this.r2 && (i11 = profileActivity.u1) > 0 && vs0Var != null) {
                this.r2 = true;
                vs0Var.P = i11;
                vs0Var.e();
            }
            profileActivity.w1 = true;
            e1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.r2 || (i10 = profileActivity.u1) <= 0 || vs0Var == null) {
            return;
        }
        this.r2 = true;
        vs0Var.P = i10;
        vs0Var.e();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void K0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.s2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.aw0.E0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.H0(profileActivity, size);
                }
                profileActivity.C5[c10].b(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final void L0() {
        FrameLayout frameLayout;
        vz0 vz0Var;
        ProfileActivity profileActivity = this.s2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.z5[0]) == null || (vz0Var = profileActivity.N) == null) {
            return;
        }
        ProfileActivity.S4(frameLayout, 1.0f - vz0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean P0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.s2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.aw0
    public final void R0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.s2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        profileActivity.Y.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Y, !z10, 0.95f, true);
        profileActivity.Q0.setVisibility((z10 || !profileActivity.L0) ? 8 : 4);
        profileActivity.R0.setVisibility((z10 || !profileActivity.M0) ? 8 : 4);
        profileActivity.S0.setVisibility((z10 || !profileActivity.N0) ? 8 : 4);
        profileActivity.T0.setVisibility(z10 ? 8 : 4);
        profileActivity.x5(false);
    }

    @Override // org.telegram.ui.Components.aw0
    public final void S0() {
        this.s2.S();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void T0(float f7) {
        L0();
        ProfileActivity profileActivity = this.s2;
        vz0 vz0Var = profileActivity.N;
        if (vz0Var != null && profileActivity.s1) {
            if (profileActivity.z5[0] != null) {
                profileActivity.z5[0].setTranslationX(vz0Var.n0(8, true));
            }
            if (profileActivity.z5[1] != null) {
                profileActivity.z5[1].setTranslationX(profileActivity.N.n0(9, false));
            }
            ProfileActivity.H0(profileActivity, profileActivity.v6);
            profileActivity.g5();
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final int b1(int i10) {
        int i11 = ProfileActivity.R6;
        this.s2.getClass();
        return i10;
    }

    @Override // org.telegram.ui.Components.aw0
    public final int getInitialTab() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r6).storiesEnabled() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.aw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(boolean z10) {
        int i10;
        super.k1(z10);
        ProfileActivity profileActivity = this.s2;
        if (profileActivity.s1) {
            if (z10) {
                p1(null);
            }
            this.O1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z11 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.z5[selectedTab];
                if (!z10) {
                    if (selectedTab == 0) {
                        i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z11 ? ProfileActivity.R6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).setUpdateListener(new b3(this, 26)).withEndAction(new org.telegram.ui.Components.d60(16, frameLayout, z11)).start();
                }
                z11 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z11 ? ProfileActivity.R6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).setUpdateListener(new b3(this, 26)).withEndAction(new org.telegram.ui.Components.d60(16, frameLayout, z11)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new my0(this, 4));
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean u0() {
        ProfileActivity profileActivity = this.s2;
        return profileActivity.i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.h1;
    }
}
