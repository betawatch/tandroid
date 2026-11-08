package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ zt0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                ProfileActivity.l0(profileActivity);
                break;
            case 1:
                if (profileActivity.s.getTag() == null) {
                    profileActivity.I4();
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.l5();
                break;
            case 4:
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.o3(profileActivity, profileActivity.c0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1)), profileActivity.u2.wallet_card));
                    break;
                }
                break;
            case 5:
                ProfileActivity.n0(profileActivity);
                break;
            case 6:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.e1);
                bundle.putLong("user_id", profileActivity.d1);
                profileActivity.presentFragment(new ai.s0(bundle));
                break;
            case 7:
                ProfileActivity.o0(profileActivity);
                break;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.k5();
                break;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.k5();
                break;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (f2Var instanceof ww) {
                            ww wwVar = (ww) f2Var;
                            sv svVar = wwVar.F3;
                            if (svVar != null) {
                                org.telegram.ui.ActionBar.f2 fragment = svVar.getFragment();
                                if ((fragment instanceof w91) && (-((w91) fragment).a) == profileActivity.a()) {
                                    wwVar.F3.a();
                                }
                            }
                        } else if (f2Var instanceof an) {
                            if (((an) f2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if (f2Var instanceof w91) {
                            if ((-((w91) f2Var).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if ((f2Var instanceof ProfileActivity) && f2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) f2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.e1);
                HashSet hashSet = w91.q1;
                profileActivity.presentFragment(w91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                ProfileActivity.a0(profileActivity);
                break;
            case 12:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.H4(view);
                break;
            default:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.H4(view);
                break;
        }
    }
}
