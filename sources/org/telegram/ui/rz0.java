package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class rz0 extends org.telegram.ui.Components.xv0 {
    public boolean i2;
    public final /* synthetic */ ProfileActivity j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.pv0 pv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.g6 g6Var, bh.b bVar) {
        super(context, j10, pv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, g6Var, bVar);
        this.j2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.xv0
    public final void A1(boolean z10) {
        int i10;
        int i11;
        super.A1(z10);
        ProfileActivity profileActivity = this.j2;
        boolean z11 = profileActivity.u1;
        org.telegram.ui.Components.ns0 ns0Var = this.V;
        if (z11 && !profileActivity.x1 && this.I0.d(14)) {
            if (!this.i2 && (i11 = profileActivity.v1) > 0 && ns0Var != null) {
                this.i2 = true;
                ns0Var.M = i11;
                ns0Var.e();
            }
            profileActivity.x1 = true;
            b1(14);
            return;
        }
        if (!profileActivity.u1 || !profileActivity.x1 || this.i2 || (i10 = profileActivity.v1) <= 0 || ns0Var == null) {
            return;
        }
        this.i2 = true;
        ns0Var.M = i10;
        ns0Var.e();
    }

    @Override // org.telegram.ui.Components.xv0
    public final void G0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.j2;
        if (profileActivity.t1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.xv0.z0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.y5[c10].b(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void H0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.j2;
        if (!profileActivity.t1 || (frameLayout = profileActivity.v5[0]) == null || profileActivity.O == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean L0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.j2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void N0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.j2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        profileActivity.R0.setVisibility((z10 || !profileActivity.M0) ? 8 : 4);
        profileActivity.S0.setVisibility((z10 || !profileActivity.N0) ? 8 : 4);
        profileActivity.T0.setVisibility((z10 || !profileActivity.O0) ? 8 : 4);
        profileActivity.U0.setVisibility(z10 ? 8 : 4);
        profileActivity.p5(false);
    }

    @Override // org.telegram.ui.Components.xv0
    public final void O0() {
        this.j2.R();
    }

    @Override // org.telegram.ui.Components.xv0
    public final void P0(float f7) {
        H0();
        ProfileActivity profileActivity = this.j2;
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null && profileActivity.t1) {
            if (profileActivity.v5[0] != null) {
                profileActivity.v5[0].setTranslationX(rz0Var.h0(8, true));
            }
            if (profileActivity.v5[1] != null) {
                profileActivity.v5[1].setTranslationX(profileActivity.O.h0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.n6);
            profileActivity.Y4();
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.j2;
        profileActivity.o5.I(canvas, getY() + profileActivity.a.getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.xv0
    public final int Y0(int i10) {
        this.j2.getClass();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        float f7;
        int i10;
        super.e1(z10);
        ProfileActivity profileActivity = this.j2;
        if (profileActivity.t1) {
            if (z10) {
                j1(null);
            }
            this.M1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            ViewPropertyAnimator animate = profileActivity.v5[selectedTab].animate();
            if (!z10) {
                if (selectedTab == 0) {
                    i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                }
                f7 = AndroidUtilities.dp(72.0f);
                animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).setUpdateListener(new d3(this, 27)).start();
            }
            f7 = 0.0f;
            animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).setUpdateListener(new d3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean n0() {
        ProfileActivity profileActivity = this.j2;
        return profileActivity.j1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.i1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new my0(this, 3));
    }

    @Override // org.telegram.ui.Components.xv0
    public final void q0() {
        pz0 pz0Var = this.j2.o5;
        if (pz0Var != null) {
            pz0Var.L();
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean x0() {
        return this.j2.t1;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean y0() {
        return this.j2.t1;
    }
}
