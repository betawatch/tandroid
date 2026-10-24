package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ProfileActivity.c0(profileActivity);
                break;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.w4();
                    break;
                }
                break;
            case 2:
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                profileActivity.U4();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.y2(profileActivity, profileActivity.d0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1)), profileActivity.w2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.e0(profileActivity);
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.g1);
                bundle.putLong("user_id", profileActivity.f1);
                profileActivity.presentFragment(new zh.n0(bundle));
                break;
            case 7:
                ProfileActivity.f0(profileActivity);
                break;
            case 8:
                profileActivity.T4();
                break;
            case 9:
                profileActivity.T4();
                break;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (o2Var instanceof ey) {
                            ey eyVar = (ey) o2Var;
                            yw ywVar = eyVar.G3;
                            if (ywVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = ywVar.getFragment();
                                if ((fragment instanceof ye1) && (-((ye1) fragment).a) == profileActivity.a()) {
                                    eyVar.G3.a();
                                }
                            }
                        } else if (o2Var instanceof sn) {
                            if (((sn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        } else if (o2Var instanceof ye1) {
                            if ((-((ye1) o2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.r1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.K1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.g1);
                HashSet hashSet = ye1.q1;
                profileActivity.presentFragment(ye1.D0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.U(profileActivity);
                break;
            case 12:
                profileActivity.v4(view);
                break;
            default:
                profileActivity.v4(view);
                break;
        }
    }
}
