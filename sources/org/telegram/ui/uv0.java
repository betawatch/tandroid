package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uv0 extends org.telegram.ui.Components.ys0 {
    public boolean x2;
    public final /* synthetic */ ProfileActivity y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.qs0 qs0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.e6 e6Var, dh.c cVar) {
        super(context, j3, qs0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, e6Var, cVar);
        this.y2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean H0() {
        return this.y2.s1;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean I0() {
        return this.y2.s1;
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.ys0.J0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.A5[c10].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final void P1(boolean z10) {
        int i7;
        int i10;
        super.P1(z10);
        ProfileActivity profileActivity = this.y2;
        boolean z11 = profileActivity.t1;
        org.telegram.ui.Components.wp0 wp0Var = this.b0;
        if (z11 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i10 = profileActivity.u1) > 0 && wp0Var != null) {
                this.x2 = true;
                wp0Var.Q = i10;
                wp0Var.e();
            }
            profileActivity.w1 = true;
            k1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.x2 || (i7 = profileActivity.u1) <= 0 || wp0Var == null) {
            return;
        }
        this.x2 = true;
        wp0Var.Q = i7;
        wp0Var.e();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Q0() {
        FrameLayout frameLayout;
        uv0 uv0Var;
        ProfileActivity profileActivity = this.y2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.x5[0]) == null || (uv0Var = profileActivity.O) == null) {
            return;
        }
        ProfileActivity.a5(frameLayout, 1.0f - uv0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.y2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.ys0
    public final void W0() {
        RectF rectF = ProfileActivity.X6;
        this.y2.E5(true);
    }

    @Override // org.telegram.ui.Components.ys0
    public final void X0(boolean z10) {
        int i7;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r1.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Y3(profileActivity.Z, !z10, 0.95f, true, true);
        profileActivity.O5(false);
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Y0() {
        this.y2.W();
    }

    @Override // org.telegram.ui.Components.ys0
    public final void Z0(float f10) {
        Q0();
        ProfileActivity profileActivity = this.y2;
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null && profileActivity.s1) {
            if (profileActivity.x5[0] != null) {
                profileActivity.x5[0].setTranslationX(uv0Var.q0(8, true));
            }
            if (profileActivity.x5[1] != null) {
                profileActivity.x5[1].setTranslationX(profileActivity.O.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.J6);
            profileActivity.r5();
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.ys0
    public final int h1(int i7) {
        RectF rectF = ProfileActivity.X6;
        this.y2.getClass();
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new pu0(this, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.np.s1(r6).X4() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.ys0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(boolean z10) {
        int i7;
        super.q1(z10);
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            if (z10) {
                v1(null);
            }
            this.P1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z11 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.x5[selectedTab];
                if (!z10) {
                    if (selectedTab == 0) {
                        i7 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z11 ? ProfileActivity.Y6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.fp0(13, frameLayout, z11)).start();
                }
                z11 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z11 ? ProfileActivity.Y6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.fp0(13, frameLayout, z11)).start();
            }
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean x0() {
        ProfileActivity profileActivity = this.y2;
        return profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1;
    }
}
