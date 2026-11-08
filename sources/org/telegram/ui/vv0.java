package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class vv0 extends org.telegram.ui.Components.xs0 {
    public boolean w2;
    public final /* synthetic */ ProfileActivity x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.ps0 ps0Var, int i7, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.f6 f6Var, dh.c cVar) {
        super(context, j3, ps0Var, i7, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, f6Var, cVar);
        this.x2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean G0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean H0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.xs0
    public final void N1(boolean z9) {
        int i7;
        int i10;
        super.N1(z9);
        ProfileActivity profileActivity = this.x2;
        boolean z10 = profileActivity.s1;
        org.telegram.ui.Components.up0 up0Var = this.a0;
        if (z10 && !profileActivity.v1 && this.K0.d(14)) {
            if (!this.w2 && (i10 = profileActivity.t1) > 0 && up0Var != null) {
                this.w2 = true;
                up0Var.P = i10;
                up0Var.e();
            }
            profileActivity.v1 = true;
            i1(14);
            return;
        }
        if (!profileActivity.s1 || !profileActivity.v1 || this.w2 || (i7 = profileActivity.t1) <= 0 || up0Var == null) {
            return;
        }
        this.w2 = true;
        up0Var.P = i7;
        up0Var.e();
    }

    @Override // org.telegram.ui.Components.xs0
    public final void O0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.xs0.I0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.w5[c10].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xs0
    public final void P0() {
        FrameLayout frameLayout;
        vv0 vv0Var;
        ProfileActivity profileActivity = this.x2;
        if (!profileActivity.r1 || (frameLayout = profileActivity.t5[0]) == null || (vv0Var = profileActivity.N) == null) {
            return;
        }
        ProfileActivity.Y4(frameLayout, 1.0f - vv0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return this.x2.h(chatParticipant, z9, false, view);
    }

    @Override // org.telegram.ui.Components.xs0
    public final void V0(boolean z9) {
        int i7;
        ProfileActivity profileActivity = this.x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i7);
        profileActivity.a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        profileActivity.Y.setPivotX(r1.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Y, !z9, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override // org.telegram.ui.Components.xs0
    public final void W0() {
        this.x2.V();
    }

    @Override // org.telegram.ui.Components.xs0
    public final void X0(float f10) {
        P0();
        ProfileActivity profileActivity = this.x2;
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null && profileActivity.r1) {
            if (profileActivity.t5[0] != null) {
                profileActivity.t5[0].setTranslationX(vv0Var.q0(8, true));
            }
            if (profileActivity.t5[1] != null) {
                profileActivity.t5[1].setTranslationX(profileActivity.N.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.E6);
            profileActivity.p5();
        }
    }

    @Override // org.telegram.ui.Components.xs0
    public final int f1(int i7) {
        RectF rectF = ProfileActivity.S6;
        this.x2.getClass();
        return i7;
    }

    @Override // org.telegram.ui.Components.xs0
    public final int getInitialTab() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.qp.s1(r6).W4() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.xs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z9) {
        int i7;
        super.o1(z9);
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            if (z9) {
                t1(null);
            }
            this.O1 = z9;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z10 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.t5[selectedTab];
                if (!z9) {
                    if (selectedTab == 0) {
                        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z10 ? ProfileActivity.T6 : 0.0f).alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.tp0(12, frameLayout, z10)).start();
                }
                z10 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z10 ? ProfileActivity.T6 : 0.0f).alpha(z10 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new a3(this, 25)).withEndAction(new org.telegram.ui.Components.tp0(12, frameLayout, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new ru0(this, 3));
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean x0() {
        ProfileActivity profileActivity = this.x2;
        return profileActivity.h1 == profileActivity.getUserConfig().e() && !profileActivity.g1;
    }
}
