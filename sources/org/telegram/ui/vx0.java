package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ vx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V(profileActivity);
                break;
            case 1:
                ProfileActivity.d0(profileActivity);
                break;
            case 2:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.B4();
                    break;
                }
                break;
            case 3:
                int i11 = ProfileActivity.R6;
                profileActivity.finishPreviewFragment();
                break;
            case 4:
                int i12 = ProfileActivity.R6;
                profileActivity.c5();
                break;
            case 5:
                TLRPC.UserFull userFull = profileActivity.v2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.y2(profileActivity, profileActivity.c0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1)), profileActivity.v2.wallet_card));
                    break;
                }
                break;
            case 6:
                ProfileActivity.f0(profileActivity);
                break;
            case 7:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ai.z0(bundle));
                break;
            case 8:
                ProfileActivity.b0(profileActivity);
                break;
            case 9:
                int i14 = ProfileActivity.R6;
                profileActivity.b5();
                break;
            case 10:
                int i15 = ProfileActivity.R6;
                profileActivity.b5();
                break;
            case 11:
                int i16 = ProfileActivity.R6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i17 = 0;
                    while (i17 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) profileActivity.getParentLayout().getFragmentStack().get(i17);
                        if (r2Var instanceof cy) {
                            cy cyVar = (cy) r2Var;
                            tw twVar = cyVar.G3;
                            if (twVar != null) {
                                org.telegram.ui.ActionBar.r2 fragment = twVar.getFragment();
                                if ((fragment instanceof af1) && (-((af1) fragment).a) == profileActivity.a()) {
                                    cyVar.G3.a();
                                }
                            }
                        } else if (r2Var instanceof un) {
                            if (((un) r2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        } else if (r2Var instanceof af1) {
                            if ((-((af1) r2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        } else if ((r2Var instanceof ProfileActivity) && r2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) r2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        }
                        i17++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = af1.q1;
                profileActivity.presentFragment(af1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 12:
                int i18 = ProfileActivity.R6;
                profileActivity.A4(view);
                break;
            default:
                int i19 = ProfileActivity.R6;
                profileActivity.A4(view);
                break;
        }
    }
}
