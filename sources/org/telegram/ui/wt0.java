package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ wt0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                break;
            case 1:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.K4();
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.X6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.n5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.o3(profileActivity, profileActivity.d0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)), profileActivity.w2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.m0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ci.i0(bundle));
                break;
            case 7:
                ProfileActivity.n0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.X6;
                profileActivity.m5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.X6;
                profileActivity.m5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.X6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (e2Var instanceof yw) {
                            yw ywVar = (yw) e2Var;
                            uv uvVar = ywVar.H3;
                            if (uvVar != null) {
                                org.telegram.ui.ActionBar.e2 fragment = uvVar.getFragment();
                                if ((fragment instanceof u91) && (-((u91) fragment).a) == profileActivity.a()) {
                                    ywVar.H3.a();
                                }
                            }
                        } else if (e2Var instanceof an) {
                            if (((an) e2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        } else if (e2Var instanceof u91) {
                            if ((-((u91) e2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        } else if ((e2Var instanceof ProfileActivity) && e2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) e2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = u91.r1;
                profileActivity.presentFragment(u91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.X6;
                profileActivity.J4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.X6;
                profileActivity.J4(view);
                break;
        }
    }
}
