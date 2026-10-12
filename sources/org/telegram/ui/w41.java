package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w41 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.b).e(true, false);
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((SessionsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                o91 o91Var = (o91) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        o91Var.l0(new eh0(null));
                        break;
                    }
                } else {
                    o91Var.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((hb1) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 6:
                he1 he1Var = (he1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        he1.Y(he1Var);
                        break;
                    }
                } else {
                    he1Var.finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((af1) this.b).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((rg1) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
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
            case 10:
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
            case 11:
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
            case 12:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.b;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            i8Var.o0();
                            break;
                        }
                    } else {
                        Activity parentActivity = i8Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) i8Var).currentAccount;
                        org.telegram.ui.Wallet.z4.u0(parentActivity, i11, i8Var.getResourceProvider());
                        break;
                    }
                } else {
                    i8Var.finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((sg.y0) this.b).dismiss();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((yh.g4) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((zh.g) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
