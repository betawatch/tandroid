package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                f91 f91Var = (f91) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        f91Var.l0(new zg0(null));
                        break;
                    }
                } else {
                    f91Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((za1) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 3:
                ae1 ae1Var = (ae1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ae1.Y(ae1Var);
                        break;
                    }
                } else {
                    ae1Var.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((se1) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((jg1) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
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
            case 7:
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
            case 8:
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
            case 9:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.b;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
                    if (!kVar.s()) {
                        h1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
                        kVar2.r();
                        h1Var.v.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (e2.h) new org.telegram.ui.web.m(1));
                        break;
                    }
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((rg.x0) this.b).dismiss();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((xh.i4) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.b).finishFragment();
                    break;
                }
                break;
            default:
                zg.q qVar = (zg.q) this.b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
