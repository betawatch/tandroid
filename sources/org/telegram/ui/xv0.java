package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Components.zs0 {
    public boolean w2;
    public final /* synthetic */ ProfileActivity x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.rs0 rs0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.g6 g6Var, dh.c cVar) {
        super(context, j3, rs0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, g6Var, cVar);
        this.x2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean H0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean I0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.zs0
    public final void P0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.zs0.J0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.y5[c10].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zs0
    public final void P1(boolean z9) {
        int i7;
        int i10;
        super.P1(z9);
        ProfileActivity profileActivity = this.x2;
        boolean z10 = profileActivity.s1;
        org.telegram.ui.Components.vp0 vp0Var = this.a0;
        if (z10 && !profileActivity.v1 && this.K0.d(14)) {
            if (!this.w2 && (i10 = profileActivity.t1) > 0 && vp0Var != null) {
                this.w2 = true;
                vp0Var.P = i10;
                vp0Var.e();
            }
            profileActivity.v1 = true;
            k1(14);
            return;
        }
        if (!profileActivity.s1 || !profileActivity.v1 || this.w2 || (i7 = profileActivity.t1) <= 0 || vp0Var == null) {
            return;
        }
        this.w2 = true;
        vp0Var.P = i7;
        vp0Var.e();
    }

    @Override // org.telegram.ui.Components.zs0
    public final void Q0() {
        FrameLayout frameLayout;
        xv0 xv0Var;
        ProfileActivity profileActivity = this.x2;
        if (!profileActivity.r1 || (frameLayout = profileActivity.v5[0]) == null || (xv0Var = profileActivity.N) == null) {
            return;
        }
        ProfileActivity.b5(frameLayout, 1.0f - xv0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return this.x2.h(chatParticipant, z9, false, view);
    }

    @Override // org.telegram.ui.Components.zs0
    public final void W0() {
        RectF rectF = ProfileActivity.V6;
        this.x2.E5(true);
    }

    @Override // org.telegram.ui.Components.zs0
    public final void X0(boolean z9) {
        int i7;
        ProfileActivity profileActivity = this.x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        profileActivity.Y.setPivotX(r1.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Y, !z9, 0.95f, true, true);
        profileActivity.O5(false);
    }

    @Override // org.telegram.ui.Components.zs0
    public final void Y0() {
        this.x2.V();
    }

    @Override // org.telegram.ui.Components.zs0
    public final void Z0(float f10) {
        Q0();
        ProfileActivity profileActivity = this.x2;
        xv0 xv0Var = profileActivity.N;
        if (xv0Var != null && profileActivity.r1) {
            if (profileActivity.v5[0] != null) {
                profileActivity.v5[0].setTranslationX(xv0Var.q0(8, true));
            }
            if (profileActivity.v5[1] != null) {
                profileActivity.v5[1].setTranslationX(profileActivity.N.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.H6);
            profileActivity.s5();
        }
    }

    @Override // org.telegram.ui.Components.zs0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.zs0
    public final int h1(int i7) {
        RectF rectF = ProfileActivity.V6;
        this.x2.getClass();
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new tu0(this, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.qp.s1(r6).W4() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.zs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(boolean z9) {
        int i7;
        super.q1(z9);
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            if (z9) {
                v1(null);
            }
            this.O1 = z9;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z10 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.v5[selectedTab];
                if (!z9) {
                    if (selectedTab == 0) {
                        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z10 ? ProfileActivity.W6 : 0.0f).alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.up0(12, frameLayout, z10)).start();
                }
                z10 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z10 ? ProfileActivity.W6 : 0.0f).alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.up0(12, frameLayout, z10)).start();
            }
        }
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean x0() {
        ProfileActivity profileActivity = this.x2;
        return profileActivity.h1 == profileActivity.getUserConfig().e() && !profileActivity.g1;
    }
}
