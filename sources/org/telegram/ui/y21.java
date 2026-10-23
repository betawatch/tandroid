package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class y21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((a31) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.b).e(true, false);
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                x71 x71Var = (x71) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        x71Var.l0(new gg0(null));
                        break;
                    }
                } else if (!x71Var.M) {
                    x71Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", x71Var.getUserConfig().getClientUserId());
                    bundle.putBoolean("immediate", true);
                    x71Var.presentFragment(new zh.n0(bundle));
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((p91) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 7:
                oc1 oc1Var = (oc1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        oc1.Y(oc1Var);
                        break;
                    }
                } else {
                    oc1Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((gd1) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((xe1) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.x0();
                        break;
                    }
                }
                break;
            case 11:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.c0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 12:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.X();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            i9Var.o0();
                            break;
                        }
                    } else {
                        Activity parentActivity = i9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) i9Var).currentAccount;
                        org.telegram.ui.Wallet.o5.E0(parentActivity, i11, i9Var.getResourceProvider());
                        break;
                    }
                } else {
                    i9Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.b).dismiss();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
