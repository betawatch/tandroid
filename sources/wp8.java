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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wp8 extends nha {
    public boolean x2;
    public final /* synthetic */ ProfileActivity y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp8(ProfileActivity profileActivity, Context context, long j, fha fhaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, ProfileActivity profileActivity2, ProfileActivity profileActivity3, ylb ylbVar, km0 km0Var) {
        super(context, j, fhaVar, i, arrayList, chatFull, userFull, i2, i3, profileActivity2, profileActivity3, 1, ylbVar, km0Var);
        this.y2 = profileActivity;
    }

    @Override // nha
    public final void J0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c = (nha.t0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c >= 0) {
                if (c == 0) {
                    profileActivity.L1(size);
                }
                profileActivity.H5[c].c(size, true);
            }
        }
    }

    @Override // nha
    public final void K0() {
        FrameLayout frameLayout;
        wp8 wp8Var;
        ProfileActivity profileActivity = this.y2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.E5[0]) == null || (wp8Var = profileActivity.O) == null) {
            return;
        }
        ProfileActivity.s3(frameLayout, 1.0f - wp8Var.getBottomButtonStoriesVisibility());
    }

    @Override // nha
    public final void N1(boolean z) {
        int i;
        int i2;
        super.N1(z);
        ProfileActivity profileActivity = this.y2;
        boolean z2 = profileActivity.t1;
        lea leaVar = this.b0;
        if (z2 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i2 = profileActivity.u1) > 0 && leaVar != null) {
                this.x2 = true;
                leaVar.Q = i2;
                leaVar.e();
            }
            profileActivity.w1 = true;
            f1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.x2 || (i = profileActivity.u1) <= 0 || leaVar == null) {
            return;
        }
        this.x2 = true;
        leaVar.Q = i;
        leaVar.e();
    }

    @Override // nha
    public final boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return this.y2.g(chatParticipant, z, false, view);
    }

    @Override // nha
    public final void Q0() {
        RectF rectF = ProfileActivity.e7;
        this.y2.a4(true);
    }

    @Override // nha
    public final void R0(boolean z) {
        int i;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i = ((d) profileActivity).classGuid;
        gm.y2(parentActivity, i);
        profileActivity.a.D0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r0.getMeasuredWidth() / 2.0f);
        gm.T3(profileActivity.Z, !z, 0.95f, true, true);
        profileActivity.l4(false);
    }

    @Override // nha
    public final void S0() {
        this.y2.W();
    }

    @Override // nha
    public final void T0(float f) {
        K0();
        ProfileActivity profileActivity = this.y2;
        wp8 wp8Var = profileActivity.O;
        if (wp8Var == null || !profileActivity.s1) {
            return;
        }
        if (profileActivity.E5[0] != null) {
            profileActivity.E5[0].setTranslationX(wp8Var.a0(8, true));
        }
        if (profileActivity.E5[1] != null) {
            profileActivity.E5[1].setTranslationX(profileActivity.O.a0(9, false));
        }
        profileActivity.L1(profileActivity.Q6);
        profileActivity.M3();
    }

    @Override // nha
    public final int c1(int i) {
        RectF rectF = ProfileActivity.e7;
        return i;
    }

    @Override // nha
    public final int getInitialTab() {
        return 8;
    }

    @Override // nha
    public final boolean h0() {
        ProfileActivity profileActivity = this.y2;
        return profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (oc7.r1(r6).e5() != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    @Override // nha
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
                    FrameLayout frameLayout = profileActivity.E5[selectedTab];
                    if (!z) {
                        if (selectedTab == 0) {
                            i = ((d) profileActivity).currentAccount;
                        }
                        frameLayout.setVisibility(0);
                        frameLayout.animate().translationY(!z2 ? ProfileActivity.f7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(d53.h).setUpdateListener(new fx7(this, (byte) 16)).withEndAction(new n28((byte) 3, (Object) frameLayout, z2)).start();
                    }
                    z2 = false;
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z2 ? ProfileActivity.f7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(d53.h).setUpdateListener(new fx7(this, (byte) 16)).withEndAction(new n28((byte) 3, (Object) frameLayout, z2)).start();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.c3(new pp8(this, (byte) 1));
    }

    @Override // nha
    public final boolean r0() {
        return this.y2.s1;
    }

    @Override // nha
    public final boolean s0() {
        return this.y2.s1;
    }
}
