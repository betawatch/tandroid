package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((ProxyListActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((i21) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((a31) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((i31) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.b).e(true, false);
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 7:
                f81 f81Var = (f81) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        f81Var.j0(new lg0(null));
                        break;
                    }
                } else if (!f81Var.N) {
                    f81Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", f81Var.getUserConfig().getClientUserId());
                    bundle.putBoolean("immediate", true);
                    f81Var.presentFragment(new ai.z0(bundle));
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((y91) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.e0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 10:
                ad1 ad1Var = (ad1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ad1.Z(ad1Var);
                        break;
                    }
                } else {
                    ad1Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((rd1) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((if1) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.y0();
                        break;
                    }
                }
                break;
            case 14:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.d0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 15:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.Y();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            i9Var.q0();
                            break;
                        }
                    } else {
                        Activity parentActivity = i9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                        org.telegram.ui.Wallet.m5.F0(parentActivity, i11, i9Var.getResourceProvider());
                        break;
                    }
                } else {
                    i9Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((tg.y0) this.b).dismiss();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((zh.h4) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
