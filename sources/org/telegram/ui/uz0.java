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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uz0 extends org.telegram.ui.Components.zu0 {
    public boolean c2;
    public final /* synthetic */ ProfileActivity d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.ru0 ru0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.g6 g6Var, og.a aVar) {
        super(context, j10, ru0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, g6Var, aVar);
        this.d2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void D0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.d2;
        if (profileActivity.p1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c3 = (org.telegram.ui.Components.zu0.w0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c3 >= 0) {
                if (c3 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.t5[c3].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.d2;
        if (!profileActivity.p1 || (frameLayout = profileActivity.q5[0]) == null || profileActivity.L == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.L.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z4, View view) {
        return this.d2.h(chatParticipant, z4, false, view);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void K0(boolean z4) {
        int i10;
        ProfileActivity profileActivity = this.d2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.B0();
        profileActivity.W.setPivotY((profileActivity.V.getMeasuredHeight() / 2.0f) + profileActivity.V.getPivotY());
        profileActivity.W.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.W, !z4, 0.95f, true);
        profileActivity.N0.setVisibility((z4 || !profileActivity.I0) ? 8 : 4);
        profileActivity.O0.setVisibility((z4 || !profileActivity.J0) ? 8 : 4);
        profileActivity.P0.setVisibility((z4 || !profileActivity.K0) ? 8 : 4);
        profileActivity.Q0.setVisibility(z4 ? 8 : 4);
        profileActivity.l5(false);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void L0() {
        this.d2.R();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void M0(float f10) {
        E0();
        ProfileActivity profileActivity = this.d2;
        uz0 uz0Var = profileActivity.L;
        if (uz0Var != null && profileActivity.p1) {
            if (profileActivity.q5[0] != null) {
                profileActivity.q5[0].setTranslationX(uz0Var.f0(8, true));
            }
            if (profileActivity.q5[1] != null) {
                profileActivity.q5[1].setTranslationX(profileActivity.L.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.e6);
            profileActivity.U4();
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.d2;
        profileActivity.j5.J(canvas, getY() + profileActivity.a.getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.zu0
    public final int V0(int i10) {
        this.d2.getClass();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.zu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(boolean z4) {
        float f10;
        int i10;
        super.b1(z4);
        ProfileActivity profileActivity = this.d2;
        if (profileActivity.p1) {
            if (z4) {
                g1(null);
            }
            this.I1 = z4;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            ViewPropertyAnimator animate = profileActivity.q5[selectedTab].animate();
            if (!z4) {
                if (selectedTab == 0) {
                    i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                }
                f10 = AndroidUtilities.dp(72.0f);
                animate.translationY(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).setUpdateListener(new e3(this, 27)).start();
            }
            f10 = 0.0f;
            animate.translationY(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).setUpdateListener(new e3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean l0() {
        ProfileActivity profileActivity = this.d2;
        return profileActivity.f1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.e1;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void o0() {
        sz0 sz0Var = this.d2.j5;
        if (sz0Var != null) {
            sz0Var.M();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new xy0(this, 2));
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean u0() {
        return this.d2.p1;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean v0() {
        return this.d2.p1;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void v1(boolean z4) {
        int i10;
        int i11;
        super.v1(z4);
        ProfileActivity profileActivity = this.d2;
        boolean z10 = profileActivity.q1;
        org.telegram.ui.Components.pr0 pr0Var = this.S;
        if (z10 && !profileActivity.t1 && this.F0.d(14)) {
            if (!this.c2 && (i11 = profileActivity.r1) > 0 && pr0Var != null) {
                this.c2 = true;
                pr0Var.J = i11;
                pr0Var.e();
            }
            profileActivity.t1 = true;
            Y0(14);
            return;
        }
        if (!profileActivity.q1 || !profileActivity.t1 || this.c2 || (i10 = profileActivity.r1) <= 0 || pr0Var == null) {
            return;
        }
        this.c2 = true;
        pr0Var.J = i10;
        pr0Var.e();
    }
}
